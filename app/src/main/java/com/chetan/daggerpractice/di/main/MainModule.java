package com.chetan.daggerpractice.di.main;

import com.chetan.daggerpractice.network.MainApi;
import com.chetan.daggerpractice.ui.main.posts.PostsRecyclerAdapter;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;

@Module
public class MainModule {

    @Provides
    static PostsRecyclerAdapter providesPostsRecyclerAdapter(){
        return new PostsRecyclerAdapter();
    }

    @Provides
    static MainApi providesMainApi(Retrofit retrofit){
        return retrofit.create(MainApi.class);
    }
}
