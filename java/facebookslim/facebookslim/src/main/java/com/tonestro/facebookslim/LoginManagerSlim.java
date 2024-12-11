package com.tonestro.facebookslim;

import android.app.Activity;
import android.content.Intent;

import androidx.annotation.NonNull;

public interface LoginManagerSlim {
    void login(@NonNull Activity activity, @NonNull String[] permissions, @NonNull LoginResultListener loginResultListener);

    void logout();

    boolean onActivityResult(int requestCode, int resultCode, Intent data);
}
