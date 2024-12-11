package com.tonestro.facebookslim;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;

import com.facebook.appevents.AppEventsLogger;

public class AppEventsLoggerSlim {
    private final AppEventsLogger logger;

    private AppEventsLoggerSlim(@NonNull Context context) {
        logger = AppEventsLogger.newLogger(context);
    }

    @NonNull
    public static AppEventsLoggerSlim newLogger(@NonNull Context context) {
        return new AppEventsLoggerSlim(context);
    }

    public void logEvent(@NonNull String eventName, Bundle parameters) {
        logger.logEvent(eventName, parameters);
    }
}
