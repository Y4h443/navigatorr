package com.example.navigator;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class HttpRequests {

    private static final String BASE_URL = "https://jsonplaceholder.typicode.com/";

    public static Retrofit getRetrofit() {

        return new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

}