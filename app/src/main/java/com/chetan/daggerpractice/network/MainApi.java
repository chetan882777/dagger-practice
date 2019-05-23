package com.chetan.daggerpractice.network;

import com.chetan.daggerpractice.models.Post;

import java.util.List;

import io.reactivex.Flowable;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface MainApi {

    //  /posts?userId=1
    @GET("posts")
    Flowable<List<Post>> getpostsFromUser(
            @Query("userId") int id
    );

}
