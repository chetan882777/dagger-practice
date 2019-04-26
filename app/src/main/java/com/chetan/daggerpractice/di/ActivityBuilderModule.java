package com.chetan.daggerpractice.di;

import com.chetan.daggerpractice.AuthActivity;
import dagger.Module;
import dagger.Provides;
import dagger.android.ContributesAndroidInjector;


@Module
public abstract class ActivityBuilderModule {

    @ContributesAndroidInjector
    abstract AuthActivity contributeAuthActivity();

}
