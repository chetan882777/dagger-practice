package com.chetan.daggerpractice.di;

import android.app.Application;

import com.chetan.daggerpractice.BaseApplication;
import com.chetan.daggerpractice.SessionManager;


import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjector;
import dagger.android.support.AndroidSupportInjectionModule;

@Singleton
@Component(
        modules = {
                AndroidSupportInjectionModule.class,
                ActivityBuilderModule.class,
                AppModule.class,
                ViewModelFactoryModule.class,
        })
public interface AppComponent extends AndroidInjector<BaseApplication> {


    SessionManager sessionManager();

    @Component.Builder
    interface Builder{

        @BindsInstance
        Builder application(Application application);

        AppComponent build();
    }
}
