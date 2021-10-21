package com.example.navigator.models;

public class Institutes {

    private int img; // ресурс флага

    public Institutes(int Img){

        this.img=Img;
    }

    public int getFlagResource() {
        return this.img;
    }

    public void setFlagResource(int Img) {
        this.img = Img;
    }
}