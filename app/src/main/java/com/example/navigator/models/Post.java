package com.example.navigator.models;

import com.google.gson.annotations.SerializedName;

public class Post {

    private int albumId;

    private int id;

    private String title;

    @SerializedName("url")
    private String text;

    public int getUserId() {
        return albumId;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getText() {
        return text;
    }
}