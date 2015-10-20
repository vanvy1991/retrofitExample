package com.example.vynv.retrofitfinal.Model.Actor;

import com.google.gson.annotations.Expose;

/**
 * Copyright © 2015 AsianTech inc.
 * Created by vynv on 10/19/15.
 */
public class ModelActor {
    @Expose
    private String name;

    @Expose
    private String description;

    @Expose
    private String dob;

    @Expose
    private String country;

    @Expose
    private String height;

    @Expose
    private String spouse;

    @Expose
    private String children;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getSpouse() {
        return spouse;
    }

    public void setSpouse(String spouse) {
        this.spouse = spouse;
    }

    public String getChildren() {
        return children;
    }

    public void setChildren(String children) {
        this.children = children;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Expose
    private String image;
}