package com.stealthmode.planb;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;



	public class LibraryTab extends Activity {

		@Override
		protected void onCreate(Bundle savedInstanceState) {
			
			super.onCreate(savedInstanceState);
			super.setContentView(R.layout.library);
			TabHost tbHost = (TabHost)findViewById(R.id.tabhost);
			tbHost.setup();
			TabSpec specs = tbHost.newTabSpec("tag1");
			specs.setContent(R.id.tab1);
			specs.setIndicator("ABC char");
			tbHost.addTab(specs);
			specs = tbHost.newTabSpec("tag2");
			specs.setContent(R.id.tab2);
			specs.setIndicator("ABC char 2.0");
			tbHost.addTab(specs);
			specs = tbHost.newTabSpec("tag3");
			specs.setContent(R.id.tab3);
			specs.setIndicator("ABC char 3.0");
			tbHost.addTab(specs);
			
		}
		
	
}
