package com.example.navigator.models;

/**
 * Представляет карточку новостей.
 */
public class NewsCard {
    int id;
    String img, title, text;

    public NewsCard(int id, String img, String title, String text) {
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

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
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
