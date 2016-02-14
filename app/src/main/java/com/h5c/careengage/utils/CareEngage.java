package com.h5c.careengage.utils;

import android.app.Application;

import com.clevertap.android.sdk.ActivityLifecycleCallback;
import android.support.multidex.MultiDex;

/**
 * Created by sastry on 2/10/2016.
 */
public class CareEngage extends Application {
    private static CareEngage mInstance;
    @Override
    public void onCreate() {
        ActivityLifecycleCallback.register(this);
        super.onCreate();
        MultiDex.install(this);
        /*Fabric.with(this, new Crashlytics());
        mInstance = this;
        // register with parse
        ParseUtils.registerParse(this);
        AnalyticsTrackers.initialize(this);
        AnalyticsTrackers.getInstance().get(AnalyticsTrackers.Target.APP);
        FontsOverride.setDefaultFont(this, "DEFAULT", "Verdana.ttf");
        FontsOverride.setDefaultFont(this, "MONOSPACE", "Verdana.ttf");
        FontsOverride.setDefaultFont(this, "SERIF", "Verdana.ttf");
        FontsOverride.setDefaultFont(this, "SANS_SERIF", "Verdana.ttf");*/
    }

    public static synchronized CareEngage getInstance() {
        return mInstance;
    }



}
