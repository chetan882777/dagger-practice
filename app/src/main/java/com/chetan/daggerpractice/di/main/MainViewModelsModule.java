package com.chetan.daggerpractice.di.main;

import androidx.lifecycle.ViewModel;

import com.chetan.daggerpractice.di.ViewModelKey;
import com.chetan.daggerpractice.ui.main.profile.ProfileViewModel;

import dagger.Binds;
import dagger.Module;
import dagger.multibindings.IntoMap;

@Module
public abstract class MainViewModelsModule {

    @Binds
    @IntoMap
    @ViewModelKey(ProfileViewModel.class)
    public abstract ViewModel bindsProfileViewModel(ProfileViewModel viewModel);
}
