package com.mustunal.moviedetails.domain;

public class MovieDetail {

    private long id;
    private String story;
    private float rating;

    public MovieDetail() {
    }

    public MovieDetail(long id, String story, float rating) {
        this.id = id;
        this.story = story;
        this.rating = rating;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getStory() {
        return story;
    }

    public void setStory(String story) {
        this.story = story;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }
}
