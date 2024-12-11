package com.tonestro.facebookslim;

import androidx.annotation.NonNull;

public class LoginManagerSlimFactory {
    private LoginManagerSlimFactory() {
    }

    @NonNull
    public static LoginManagerSlim createInstance() {
        return new LoginManagerSlimImpl();
    }
}
