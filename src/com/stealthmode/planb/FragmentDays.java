package com.stealthmode.planb;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public  class FragmentDays extends Fragment {
	/**
	 * The fragment argument representing the section number for this
	 * fragment.
	 */
	public static final String ARG_SECTION_NUMBER = "section_number";


	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		
//		TextView textView = new TextView(getActivity());
//		textView.setGravity(Gravity.CENTER);
//		textView.setText(Integer.toString(getArguments().getInt(ARG_SECTION_NUMBER)));
		return inflater.inflate(R.layout.dummy,container,false);
	}
}