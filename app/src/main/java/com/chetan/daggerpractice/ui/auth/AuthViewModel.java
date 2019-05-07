package com.chetan.daggerpractice.ui.auth;

import android.util.Log;

import com.chetan.daggerpractice.models.User;
import com.chetan.daggerpractice.network.auth.AuthApi;

import javax.inject.Inject;

import androidx.lifecycle.ViewModel;
import io.reactivex.Observer;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

public class AuthViewModel extends ViewModel {

    private static final String TAG = "AuthViewModel";

    private final AuthApi authApi;
    @Inject
    public AuthViewModel(AuthApi authApi) {
        this.authApi = authApi;
        Log.d(TAG, "AuthViewModel: viewmodel is working...");


        if(this.authApi == null){
            Log.d(TAG, "AuthViewModel: Auth Api is NULL.");
        }else{
            Log.d(TAG, "AuthViewModel: Auth Api is NOT NULL.");

            authApi.getUser(1)
                    .toObservable()
                    .subscribeOn(Schedulers.io())
                    .subscribe(new Observer<User>() {
                        @Override
                        public void onSubscribe(Disposable d) {
                            
                        }

                        @Override
                        public void onNext(User user) {
                            Log.d(TAG, "onNext: " + user.getEmail());
                        }

                        @Override
                        public void onError(Throwable e) {
                            Log.e(TAG, "onError: " + e );
                        }

                        @Override
                        public void onComplete() {

                        }
                    });
        }

    }
}
