package com.example.navigator.models;

import com.google.android.gms.maps.model.LatLng;

public class Place{
    private LatLng cord;
    private String name;

    public Place(LatLng cord, String name){
        this.cord = cord;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LatLng getCord() {
        return cord;
    }

    public void setCord(LatLng cord) {
        this.cord = cord;
    }
}