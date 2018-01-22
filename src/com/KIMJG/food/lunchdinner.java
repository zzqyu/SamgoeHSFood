package com.KIMJG.food;


import java.util.*;

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
import android.os.Bundle;
import android.view.*;
import android.widget.*;


public class lunchdinner extends Activity {
private static final String LOGTAG = "BannerTypeXML1";
private AdView adView = null;

@Override
public void onCreate(Bundle savedInstanceState) {
super.onCreate(savedInstanceState);
setContentView(R.layout.lunchdinner);


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
		
		Refresh();
	    
}
    
    void Refresh() {
		StringBuilder time = new StringBuilder();

		Calendar cal = new GregorianCalendar();
		time.append("오늘은 " + String.format("%d년 %d월 %d일\n", cal.get(Calendar.YEAR), cal.get(Calendar.MONTH) + 1, cal.get(Calendar.DAY_OF_MONTH), cal.get(Calendar.HOUR_OF_DAY), cal.get(Calendar.MINUTE)));
		
		TextView result = (TextView)findViewById(R.id.getdate);
		result.setText(time.toString());
	}
	
	String UpTime(long msec) {
		long sec = msec / 1000;
		String result;
		result = String.format("%d일 %d시 %d분 %d초\n", sec / 86400, sec / 3600 % 24, 
				sec / 60 % 60, sec % 60);
		//result = DateUtils.formatElapsedTime(sec) + "\n";
		return result;
		
}



public void d1(View v) {
	Intent intent = new Intent(this, d1.class);
	startActivity(intent);
	
}

public void d2(View v) {
	Intent intent = new Intent(this, d2.class);
	startActivity(intent);
	
}

public void d3(View v) {
	Intent intent = new Intent(this, d3.class);
	startActivity(intent);
}
    
    public void d4(View v) {
		Intent intent = new Intent(this, d4.class);
		startActivity(intent);
		
}
    
    public void d5(View v) {
		Intent intent = new Intent(this, d5.class);
		startActivity(intent);
		
}
    
    public void d6(View v) {
		Intent intent = new Intent(this, d6.class);
		startActivity(intent);
		
}
    
    public void d7(View v) {
		Intent intent = new Intent(this, d7.class);
		startActivity(intent);
		
}
    
    public void d8(View v) {
		Intent intent = new Intent(this, d8.class);
		startActivity(intent);
		
}
    
    public void d9(View v) {
		Intent intent = new Intent(this, d9.class);
		startActivity(intent);
		
}
    
    public void d10(View v) {
		Intent intent = new Intent(this, d10.class);
		startActivity(intent);
		
}
    
    public void d11(View v) {
		Intent intent = new Intent(this, d11.class);
		startActivity(intent);
		
}
    
    public void d12(View v) {
		Intent intent = new Intent(this, d12.class);
		startActivity(intent);
		
}
    
    public void d13(View v) {
		Intent intent = new Intent(this, d13.class);
		startActivity(intent);
		
}
    
    public void d14(View v) {
		Intent intent = new Intent(this, d14.class);
		startActivity(intent);
		
}
    
    public void d15(View v) {
		Intent intent = new Intent(this, d15.class);
		startActivity(intent);
		
}
    
    public void d16(View v) {
		Intent intent = new Intent(this, d16.class);
		startActivity(intent);
		
}
    
    public void d17(View v) {
		Intent intent = new Intent(this, d17.class);
		startActivity(intent);
		
}
    
    public void d18(View v) {
		Intent intent = new Intent(this, d18.class);
		startActivity(intent);
		
}
    
    public void d19(View v) {
		Intent intent = new Intent(this, d19.class);
		startActivity(intent);
		
}
    
    public void d20(View v) {
		Intent intent = new Intent(this, d20.class);
		startActivity(intent);
		
}
    
    public void d21(View v) {
		Intent intent = new Intent(this, d21.class);
		startActivity(intent);
		
}
    
    public void d22(View v) {
		Intent intent = new Intent(this, d22.class);
		startActivity(intent);
		
}
    
    public void d23(View v) {
		Intent intent = new Intent(this, d23.class);
		startActivity(intent);
		
}
    
    public void d24(View v) {
		Intent intent = new Intent(this, d24.class);
		startActivity(intent);
		
}
    
    public void d25(View v) {
		Intent intent = new Intent(this, d25.class);
		startActivity(intent);
		
}
    
    public void d26(View v) {
		Intent intent = new Intent(this, d26.class);
		startActivity(intent);
		
}
    
    public void d27(View v) {
		Intent intent = new Intent(this, d27.class);
		startActivity(intent);
		
}
    
    public void d28(View v) {
		Intent intent = new Intent(this, d28.class);
		startActivity(intent);
		
}
    
    public void d29(View v) {
		Intent intent = new Intent(this, d29.class);
		startActivity(intent);
		
}
    
    public void d30(View v) {
		Intent intent = new Intent(this, d30.class);
		startActivity(intent);
		
}
    
    public void d31(View v) {
		Intent intent = new Intent(this, d31.class);
		startActivity(intent);
		
    }
		
		
		
		
	
	    // TODO Auto-generated method stub
	}
