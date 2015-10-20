package com.example.vynv.retrofitfinal.api.Actor;

import com.example.vynv.retrofitfinal.Model.Actor.ModelActors;

import retrofit.Callback;
import retrofit.http.GET;

/**
 * Copyright © 2015 AsianTech inc.
 * Created by vynv on 10/19/15.
 */
public interface ApiActor {
    @GET("/jsonActors")
    void getActor(Callback<ModelActors> callback);

}
