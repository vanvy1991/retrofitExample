package com.example.vynv.retrofitfinal.Model.Actor;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

/**
 * Copyright © 2015 AsianTech inc.
 * Created by vynv on 10/19/15.
 */
public class ModelActors {

    @SerializedName("actors")
    @Expose
    private List<Actor> actors = new ArrayList<Actor>();



    /**
     *
     * @return
     * The actors
     */
    public List<Actor> getActors() {
        return actors;
    }

    /**
     *
     * @param actors
     * The actors
     */
    public void setActors(List<Actor> actors) {
        this.actors = actors;
    }

}
