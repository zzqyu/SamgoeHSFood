package com.KIMJG.food;

import android.app.*;
import android.os.*;

public class splash extends Activity {

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
setContentView(R.layout.splash);
        
        Handler handler = new Handler () {
            @Override
            public void handleMessage(Message msg)
            {
                // TODO Auto-generated method stub
                super.handleMessage(msg);
                finish();
            }
        };
        handler.sendEmptyMessageDelayed(0, 1500);

	
	    // TODO Auto-generated method stub
	}

}
