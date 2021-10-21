package com.example.navigator;

public class Prepodi {

    private String name;
    private String post;
    private int flagResource;

    public Prepodi(String name, String post, int flag){

        this.name=name;
        this.post=post;
        this.flagResource=flag;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPost()
    {
        return this.post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public int getFlagResource() {
        return this.flagResource;
    }

    public void setFlagResource(int flagResource) {
        this.flagResource = flagResource;
    }
}
