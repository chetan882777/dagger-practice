package com.chetan.daggerpractice.di;

import com.chetan.daggerpractice.di.auth.AuthModule;
import com.chetan.daggerpractice.di.auth.AuthScope;
import com.chetan.daggerpractice.di.auth.AuthViewModelsModule;
import com.chetan.daggerpractice.di.main.MainFragmentBuildersModule;
import com.chetan.daggerpractice.di.main.MainModule;
import com.chetan.daggerpractice.di.main.MainScope;
import com.chetan.daggerpractice.di.main.MainViewModelsModule;
import com.chetan.daggerpractice.ui.auth.AuthActivity;
import com.chetan.daggerpractice.ui.main.MainActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;


@Module
public abstract class ActivityBuilderModule {

    @AuthScope
    @ContributesAndroidInjector(
            modules = {
                    AuthViewModelsModule.class,
                    AuthModule.class,
            }
    )
    abstract AuthActivity contributeAuthActivity();


    @MainScope
    @ContributesAndroidInjector(
            modules = {
                    MainFragmentBuildersModule.class,
                    MainViewModelsModule.class,
                    MainModule.class
            }
    )
    abstract MainActivity contributeMainActivity();

}
