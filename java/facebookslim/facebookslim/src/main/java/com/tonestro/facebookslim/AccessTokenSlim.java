package com.tonestro.facebookslim;

import androidx.annotation.NonNull;

import java.util.Date;

public interface AccessTokenSlim {
    @NonNull
    Date getExpires();

    @NonNull
    String[] getPermissions();

    @NonNull
    String[] getDeclinedPermissions();

    @NonNull
    String[] getExpiredPermissions();
    @NonNull
    String getToken();
    @NonNull
    Date getLastRefresh();
    @NonNull
    String getApplicationId();
    @NonNull
    String getUserId();
    @NonNull
    Date getDataAccessExpirationTime();
    @NonNull
    String getGraphDomain();
}
