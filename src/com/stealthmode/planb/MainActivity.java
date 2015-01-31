package com.stealthmode.planb;

import java.util.List;
import java.util.Vector;

import android.app.ActionBar;
import android.app.ActionBar.Tab;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends FragmentActivity {
	List<Fragment> fragments;
	DaysPagerAdapter mDaysPagerAdapter;
	LibraryPagerAdapter mLibraryAdapter;
	ViewPager mViewPager , mDynamicViewPager;
	FragmentNavEdit fmEdit ;
	FragmentNavViewPager fmLib;
	ActionBar actionBar ;
	android.support.v4.app.FragmentManager fmManager;
	android.support.v4.app.FragmentTransaction fmTransaction;
	Menu menuBar;
	Fragment fmDay;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		 
		initializeFragments();
		mDaysPagerAdapter = new DaysPagerAdapter(getSupportFragmentManager(),fragments);
		mViewPager = (ViewPager)findViewById(R.id.pager);
		mViewPager.setAdapter(mDaysPagerAdapter);
	
		actionBar = getActionBar();

		fmEdit = new FragmentNavEdit();
		fmLib = new FragmentNavViewPager();
		fmManager=getSupportFragmentManager();
		fmTransaction=fmManager.beginTransaction();
		fmManager.addOnBackStackChangedListener(new BackListener());

		addTabToActionBar();
	}
	
	void initializeFragments(){
		 fragments = new Vector<Fragment>();
		 fragments.add(Fragment.instantiate(this, Fragment1Monday.class.getName()));
		 fragments.add(Fragment.instantiate(this, Fragment2Tuesday.class.getName()));
		 fragments.add(Fragment.instantiate(this, Fragment3Wednesday.class.getName()));
		 fragments.add(Fragment.instantiate(this, Fragment4Thursday.class.getName()));
		 fragments.add(Fragment.instantiate(this, Fragment5Friday.class.getName()));
		 fragments.add(Fragment.instantiate(this, Fragment6Saturday.class.getName()));
		 fragments.add(Fragment.instantiate(this, Fragment7Sunday.class.getName()));
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.activity_main, menu);
		menuBar=menu;
		return true;
	}
    
	public void addTabToActionBar(){

	    // Create a tab listener that is called when the user changes tabs.
	   		ActionBar.TabListener tabListener = new ActionBar.TabListener() {
	   			@Override
	   			public void onTabReselected(Tab arg0,
	   					FragmentTransaction arg1) {
				
	   			}
	   			
	   			@Override
	   			public void onTabSelected(Tab arg0,
	   					FragmentTransaction arg1) {
				
	   			}

	   			@Override
	   			public void onTabUnselected(Tab arg0,
	   					FragmentTransaction arg1) {
				
	   			}
	   		};

	    // Add 3 tabs, specifying the tab's text and TabListener
	    for (int i = 0; i < 3; i++) {
	        actionBar.addTab(actionBar.newTab().setText("Tab " + (i + 1)).setTabListener(tabListener));
	    }
	   
	}
	
    @Override
	public boolean onOptionsItemSelected(MenuItem item) {
		
    	if(item.getItemId() == R.id.action_edit){
    		
			   if(fmEdit.isVisible()==false){
				   	   
//				   	   Log.d(null, "Value of k" + k);
				   	   fmTransaction = fmManager.beginTransaction();
					   fmTransaction.add(R.id.container_top, fmEdit);
					   fmTransaction.addToBackStack("Edit");
					   fmTransaction.commit();
					   item.setIcon(R.drawable.ic_action_search);
					
			   }else{
				   	   actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
				    
				       fmTransaction = fmManager.beginTransaction();
				       fmTransaction.add(R.id.container_top2, fmLib);
				       fmTransaction.addToBackStack("Library");
				       fmTransaction.commit();
				    
				       while(fmManager.executePendingTransactions());
				   
				       mLibraryAdapter = new LibraryPagerAdapter(fmManager);
				       mDynamicViewPager = (ViewPager)findViewById(R.id.pager_normal);
				       mDynamicViewPager.setAdapter(mLibraryAdapter);
				       item.setVisible(false);
				 
			   }
			 }
			
			return super.onOptionsItemSelected(item);
	}


   public class BackListener implements FragmentManager.OnBackStackChangedListener{

	@Override
	public void onBackStackChanged() {
		if(fmLib.isVisible()==false){
			actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_STANDARD);
			menuBar.getItem(1).setVisible(true);
			if(fmEdit.isVisible()==false){
					menuBar.getItem(1).setIcon(R.drawable.ic_action_edit);
			}
		}
	}
   }
   

}