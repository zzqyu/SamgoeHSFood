package com.KIMJG.food;

import net.daum.adam.publisher.AdView;
import net.daum.adam.publisher.AdView.OnAdClickedListener;
import net.daum.adam.publisher.AdView.OnAdClosedListener;
import net.daum.adam.publisher.AdView.OnAdFailedListener;
import net.daum.adam.publisher.AdView.OnAdLoadedListener;
import net.daum.adam.publisher.AdView.OnAdWillLoadListener;
import net.daum.adam.publisher.impl.AdError;
import net.daum.adam.publisher.AdView.AnimationType;
import com.KIMJG.food.R;
import android.util.Log;
import android.app.*;
import android.content.*;
import android.graphics.drawable.*;
import android.net.*;
import android.os.Bundle;
import android.view.*;
import android.widget.*;

public class MainActivity extends Activity {
	AnimationDrawable mAni;
private static final String LOGTAG = "BannerTypeXML1";
private AdView adView = null;



@Override
public void onCreate(Bundle savedInstanceState) {
super.onCreate(savedInstanceState);
setContentView(R.layout.activity_main);
startActivity(new Intent(this, splash.class));

ImageView img = (ImageView)findViewById(R.id.info);
mAni = (AnimationDrawable)img.getBackground();

img.post(new Runnable() {
	public void run() {
		mAni.start();
	}
});

initAdam();
}
@Override
public void onDestroy() {
super.onDestroy();
if (adView != null) {
adView.destroy();
adView = null;
}
}
private void initAdam() {

// Ad@m sdk 초기화 시작
adView = (AdView) findViewById(R.id.adview);
adView.setRequestInterval(5);
// 광고 리스너 설정
// 1. 광고 클릭시 실행할 리스너
adView.setOnAdClickedListener(new OnAdClickedListener() {

public void OnAdClicked() {
Log.i(LOGTAG, "광고를 클릭했습니다.");
}
});
// 2. 광고 내려받기 실패했을 경우에 실행할 리스너
adView.setOnAdFailedListener(new OnAdFailedListener() {

public void OnAdFailed(AdError error, String message) {
Log.w(LOGTAG, message);
}
});
// 3. 광고를 정상적으로 내려받았을 경우에 실행할 리스너
adView.setOnAdLoadedListener(new OnAdLoadedListener() {

public void OnAdLoaded() {
Log.i(LOGTAG, "광고가 정상적으로 로딩되었습니다.");
}
});
// 4. 광고를 불러올때 실행할 리스너
adView.setOnAdWillLoadListener(new OnAdWillLoadListener() {

public void OnAdWillLoad(String url) {
Log.i(LOGTAG, "광고를 불러옵니다. : " + url);
}
});
// 5. 젂면형 광고를 닫았을때 실행할 리스너
adView.setOnAdClosedListener(new OnAdClosedListener() {

public void OnAdClosed() {
Log.i(LOGTAG, "광고를 닫았습니다.");
}
});
//할당 받은 clientId 설정
		adView.setClientId("3a53Z22T139c4d07d81");

		adView.setRequestInterval(12);

		// Animation 효과 : 기본 값은 AnimationType.NONE
		adView.setAnimationType(AnimationType.FLIP_HORIZONTAL);

		adView.setVisibility(View.VISIBLE);
		
		
	    
	    
    }
	    
	    public void lunchdinner(View v) {
			Intent intent = new Intent(this, lunchdinner.class);
			startActivity(intent);
			
	    }
		 public void josik(View v) {
			Intent intent = new Intent(Intent.ACTION_VIEW,Uri.parse("http://samgoe.hs.kr/?act=lunch.main&month=12/01/2012&mcode="));
			startActivity(intent);
			
}
	    
	    public void info(View v) {
			Intent intent = new Intent(this, setting.class);
			startActivity(intent);
			
	    }
		 public void infoani(View v) {
			Intent intent = new Intent(Intent.ACTION_VIEW,Uri.parse("http://m.blog.naver.com/wjdrb0626/150153007060"));
			startActivity(intent);
			
	    

			

			
	    }
			

	

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
    }

