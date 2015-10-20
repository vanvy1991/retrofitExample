package com.example.vynv.retrofitfinal.api.Weather;

import com.example.vynv.retrofitfinal.Model.Weather.ModelWeather;

import retrofit.Callback;
import retrofit.http.GET;
import retrofit.http.Query;

/**
 * Copyright © 2015 AsianTech inc.
 * Created by vynv on 10/20/15.
 */
public interface weather {

    @GET("/weather")
    void getAddress(@Query("q") String address,@Query("appid") String id, Callback<ModelWeather> cb);
}
