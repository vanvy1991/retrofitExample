package com.example.vynv.retrofitfinal.Model.Image;

/**
 * Copyright © 2015 AsianTech inc.
 * Created by vynv on 10/16/15.
 */
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class Example {

    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("image")
    @Expose
    private String image;
    @SerializedName("rating")
    @Expose
    private Double rating;
    @SerializedName("releaseYear")
    @Expose
    private Integer releaseYear;
    @SerializedName("genre")
    @Expose
    private List<String> genre = new ArrayList<String>();

    /**
     *
     * @return
     * The title
     */
    public String getTitle() {
        return title;
    }

    /**
     *
     * @param title
     * The title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     *
     * @return
     * The image
     */
    public String getImage() {
        return image;
    }

    /**
     *
     * @param image
     * The image
     */
    public void setImage(String image) {
        this.image = image;
    }

    /**
     *
     * @return
     * The rating
     */
    public Double getRating() {
        return rating;
    }

    /**
     *
     * @param rating
     * The rating
     */
    public void setRating(Double rating) {
        this.rating = rating;
    }

    /**
     *
     * @return
     * The releaseYear
     */
    public Integer getReleaseYear() {
        return releaseYear;
    }

    /**
     *
     * @param releaseYear
     * The releaseYear
     */
    public void setReleaseYear(Integer releaseYear) {
        this.releaseYear = releaseYear;
    }

    /**
     *
     * @return
     * The genre
     */
    public List<String> getGenre() {
        return genre;
    }

    /**
     *
     * @param genre
     * The genre
     */
    public void setGenre(List<String> genre) {
        this.genre = genre;
    }

}
