package com.chetan.daggerpractice.di;

import com.chetan.daggerpractice.di.auth.AuthViewModelsModule;
import com.chetan.daggerpractice.ui.auth.AuthActivity;
import dagger.Module;
import dagger.android.ContributesAndroidInjector;


@Module
public abstract class ActivityBuilderModule {

    @ContributesAndroidInjector(
            modules = {AuthViewModelsModule.class}
    )
    abstract AuthActivity contributeAuthActivity();

}
