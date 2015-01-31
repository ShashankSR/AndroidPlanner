package com.stealthmode.planb;

import java.util.ArrayList;

import com.planB1.phase1.DragListener;
import com.planB1.phase1.R;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.ListView;

public class FragmentNavEdit extends Fragment {
	ImageView img ;
	GridView grid;
	ArrayList<String> arList = new ArrayList<String>();
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		
		return inflater.inflate(R.layout.fragment_edit, container,false);
		
	}

	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);
		grid = (GridView)getFragment().findViewById(R.id.gridView1);
		for(int i=0;i<12;i++){
			arList.add("item"+(i+1));
		}
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(),R.layout.list_row,arList);
		grid.setAdapter(adapter);
		
	}
	

}
