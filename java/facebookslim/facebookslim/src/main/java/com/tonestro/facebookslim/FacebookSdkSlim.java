package com.tonestro.facebookslim;

import androidx.annotation.NonNull;

import com.facebook.FacebookSdk;
import com.facebook.LoggingBehavior;

public class FacebookSdkSlim {

    private FacebookSdkSlim() {
        // nothing to do
    }

    public static void setDebugEnabled(boolean debugEnabled) {
        FacebookSdk.setIsDebugEnabled(debugEnabled);
    }

    public static boolean isDebugEnabled() {
        return FacebookSdk.isDebugEnabled();
    }

    public static void addLoggingBehavior(@NonNull String loggingBehavior) {
        FacebookSdk.addLoggingBehavior(LoggingBehavior.valueOf(loggingBehavior));
    }
}
