package com.stealthmode.planb;

import java.util.List;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
public class DaysPagerAdapter extends FragmentPagerAdapter {

	 private List<Fragment> fragments;
	 
	public DaysPagerAdapter(FragmentManager fm,List<Fragment> fragments) {
		super(fm);
		this.fragments = fragments;
	}

	@Override
	public Fragment getItem(int position) {
		
//		Fragment fragment = new DaysFragment();
		//Bundle args = new Bundle();
	//	args.putInt(DaysFragment.ARG_SECTION_NUMBER, position + 1);
//		fragment.setArguments(args);
		return this.fragments.get(position);
	}

	@Override
	public int getCount() {
		// Show 3 total pages.
		return this.fragments.size();
	}

	
	public CharSequence getPageTitle(int position) {
		switch (position) {
		case 0:
			return "Monday";
		case 1:
			return "Tuesday";
		case 2:
			return "Wednesday";
		case 3:
			return "Thursday";
		case 4:
			return "Friday";
		case 5:
			return "Saturday";
		case 6:
			return "Sunday";
		}
		return null;
	}
}