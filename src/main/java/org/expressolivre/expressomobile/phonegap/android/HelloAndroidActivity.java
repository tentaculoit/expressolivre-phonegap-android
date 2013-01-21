package org.expressolivre.expressomobile.phonegap.android;

import org.apache.cordova.DroidGap;
import android.os.Bundle;
import android.util.Log;

public class HelloAndroidActivity extends DroidGap {

    private static String TAG = "expresso-mobile";

    /**
     * Called when the activity is first created.
     * @param savedInstanceState If the activity is being re-initialized after 
     * previously being shut down then this Bundle contains the data it most 
     * recently supplied in onSaveInstanceState(Bundle). <b>Note: Otherwise it is null.</b>
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
	Log.i(TAG, "onCreate");
        super.onCreate(savedInstanceState);	
        super.loadUrl("file:///android_asset/www/index.html");
        setIntegerProperty("loadUrlTimeoutValue", 60000);
    }

}

