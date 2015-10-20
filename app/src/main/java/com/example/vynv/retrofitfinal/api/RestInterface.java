package com.example.vynv.retrofitfinal.api;

import com.example.vynv.retrofitfinal.Model.Image.Model;

import java.util.List;

import retrofit.Callback;
import retrofit.http.GET;

/**
 * Copyright © 2015 AsianTech inc.
 * Created by vynv on 10/16/15.
 */
public interface RestInterface {
    @GET("/movies.json")
    void getImage(Callback<List<Model>> cb);
}
