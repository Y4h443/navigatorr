package com.example.navigator.models;

public class References {

    int id;
    private String name; // название
    private String text; // название


    public References(int id, String name, String text){
        this.id = id;
        this.name=name;
        this.text = text;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public String getText() {
        return this.text;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setText(String text) {
        this.text = text;
    }


}
