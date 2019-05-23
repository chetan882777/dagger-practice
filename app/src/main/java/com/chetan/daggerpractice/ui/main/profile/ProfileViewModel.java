package com.chetan.daggerpractice.ui.main.profile;

import android.util.Log;

import androidx.lifecycle.ViewModel;

import javax.inject.Inject;

public class ProfileViewModel extends ViewModel {

    private static final String TAG = "ProfileViewModel";

    @Inject
    public ProfileViewModel(){
        Log.d(TAG, "ProfileViewModel: view model is ready...");
    }
}
