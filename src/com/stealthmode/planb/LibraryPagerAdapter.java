package com.stealthmode.planb;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class LibraryPagerAdapter extends FragmentPagerAdapter{

	public LibraryPagerAdapter(FragmentManager fm) {
		super(fm);
	}

	@Override
	public Fragment getItem(int arg0) {
		return new FragmentLibrary();
	}

	@Override
	public int getCount() {
		return 3;
	}

}
