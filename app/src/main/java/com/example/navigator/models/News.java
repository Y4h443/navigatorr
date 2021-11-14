package com.example.navigator.models;

public class News {
    String img = "";
    String title = "";
    String text = "";

    public News() {
        img = "";
        title = "";
        text = "";
    }

    public News(String img, String title, String text) {
        this.img = img;
        this.title = title;
        this.text = text;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getImg() {
        return img;
    }

    public String getTitle() {
        return title;
    }

    public String getText() {
        return text;
    }
}
