package com.tonestro.facebookslim;

import androidx.annotation.NonNull;

public interface LoginResultListener {
    void onSuccess(@NonNull LoginResultSlim loginResult);
    void onCanceled();
    void onError(@NonNull Exception exception);
}
