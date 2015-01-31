package com.stealthmode.planb;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnLongClickListener;
import android.widget.ImageView;



class DataBlocks extends ImageView{

	
	int state;
	
	public DataBlocks(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
	
		this.setOnClickListener(new OnSingleClick());
		this.setOnLongClickListener(new OnLongClick());
		
	}

	public class OnLongClick implements OnLongClickListener{

		@Override
		public boolean onLongClick(View arg0) {
			return false;
		}
		
	}
	
	public class OnSingleClick implements OnClickListener{

		@Override
		public void onClick(View arg0) {
						
		}
		
	}
}