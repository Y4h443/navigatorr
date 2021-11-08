package com.example.navigator.models;

import android.graphics.Bitmap;

import java.util.List;

/**
 * Представляет карточку новостей.
 */
public class NewsCard {
    int id;
    String title, text;
    List<Bitmap> img;

    public NewsCard(int id, List<Bitmap>  img, String title, String text) {
        this.id = id;
        this.img = img;
        this.title = title;
        this.text = text;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Bitmap>  getImg() {
        return img;
    }

    public void setImg(List<Bitmap> img) {
        this.img = img;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
