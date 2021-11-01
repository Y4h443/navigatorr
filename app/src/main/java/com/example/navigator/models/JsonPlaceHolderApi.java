package com.example.navigator.models;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;

public interface JsonPlaceHolderApi {

    @GET("globe_emea.png")
    Call<ResponseBody> getPosts();
}