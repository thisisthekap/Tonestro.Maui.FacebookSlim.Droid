package com.tonestro.facebookslim;

import androidx.annotation.NonNull;

public interface LoginResultSlim {
    @NonNull
    AccessTokenSlim getAccessToken();

    @NonNull
    String[] getRecentlyGrantedPermissions();

    @NonNull
    String[] getRecentlyDeniedPermissions();
}
