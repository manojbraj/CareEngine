package com.h5c.careengage.utils;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.content.WakefulBroadcastReceiver;

import com.clevertap.android.sdk.CleverTapAPI;
import com.google.android.gms.gcm.GoogleCloudMessaging;

/**
 * Created by midhun on 1/18/2016.
 */
public class MyCustomGcmBroadcastReceiver extends WakefulBroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        CleverTapAPI.createNotification(context, intent.getExtras());
        new com.clevertap.android.sdk.GcmBroadcastReceiver().onReceive(context, intent);
        Bundle extras = intent.getExtras();
        GoogleCloudMessaging gcm = GoogleCloudMessaging.getInstance(context);
        String messageType = gcm.getMessageType(intent);
        if (GoogleCloudMessaging. MESSAGE_TYPE_MESSAGE.equals(messageType)) {
            CleverTapAPI.createNotification(context, extras);
        }

    }
}