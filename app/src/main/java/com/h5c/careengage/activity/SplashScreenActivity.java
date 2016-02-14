package com.h5c.careengage.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;

import com.clevertap.android.sdk.CleverTapAPI;
import com.clevertap.android.sdk.SyncListener;
import com.clevertap.android.sdk.exceptions.CleverTapMetaDataNotFoundException;
import com.clevertap.android.sdk.exceptions.CleverTapPermissionsNotSatisfied;
import com.google.android.gms.gcm.GoogleCloudMessaging;
import com.h5c.careengage.R;

import org.json.JSONObject;

import java.io.IOException;

public class SplashScreenActivity extends Activity implements SyncListener {
    private CleverTapAPI ct = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        try {
            ct = CleverTapAPI.getInstance(this);
        } catch (CleverTapMetaDataNotFoundException e) {
            // handle appropriately
        } catch (CleverTapPermissionsNotSatisfied e) {
            // handle appropriately
        }
        GoogleCloudMessaging gcm = GoogleCloudMessaging.getInstance(this);
        String gcmRegId = null;
        try {
            gcmRegId = gcm.register("742241875469");
        } catch (IOException e) {
            e.printStackTrace();
        }
        ct.data.pushGcmRegistrationId(gcmRegId, true);
        assert ct != null;

        // Read key value pairs from an incoming notification
        try {
            Bundle extras = getIntent().getExtras();
            for (String key : extras.keySet()) {
                Log.i("StarterProject", "key = " + key + "; value = " + extras.get(key).toString());

            }
        } catch (Exception e) {
                 }
        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                startActivity(new Intent(SplashScreenActivity.this, LandingScreenActivity.class));
                finish();
            }

        }, 2000);
    }
    @Override
    protected void onPause() {
        // TODO Auto-generated method stub
        super.onPause();
        finish();
    }
       // SyncListener
       public void profileDataUpdated(JSONObject updates) {
           Log.d("PR_UPDATES", updates.toString());
       }

}

