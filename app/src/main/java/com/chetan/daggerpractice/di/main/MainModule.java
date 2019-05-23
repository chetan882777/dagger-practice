package com.chetan.daggerpractice.di.main;

import com.chetan.daggerpractice.network.MainApi;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;

@Module
public class MainModule {

    @Provides
    static MainApi providesMainApi(Retrofit retrofit){
        return retrofit.create(MainApi.class);
    }
}
