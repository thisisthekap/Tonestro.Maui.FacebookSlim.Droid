package com.tonestro.facebookslim;

import androidx.annotation.NonNull;

class LoginResultSlimImpl implements LoginResultSlim {

    private final AccessTokenSlim accessToken;
    private final String[] recentlyGrantedPermissions;
    private final String[] recentlyDeniedPermissions;

    public LoginResultSlimImpl(@NonNull AccessTokenSlim accessToken, @NonNull String[] recentlyGrantedPermissions, @NonNull String[] recentlyDeniedPermissions) {
        this.accessToken = accessToken;
        this.recentlyGrantedPermissions = recentlyGrantedPermissions;
        this.recentlyDeniedPermissions = recentlyDeniedPermissions;
    }

    @Override
    @NonNull
    public AccessTokenSlim getAccessToken() {
        return accessToken;
    }

    @Override
    @NonNull
    public String[] getRecentlyGrantedPermissions() {
        return recentlyGrantedPermissions;
    }

    @Override
    @NonNull
    public String[] getRecentlyDeniedPermissions() {
        return recentlyDeniedPermissions;
    }
}
