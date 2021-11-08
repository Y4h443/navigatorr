package com.example.navigator.models;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;

public interface JsonPlaceHolderApi {

    @GET("http://10.0.2.2:8080/news")
    Call<ResponseBody> getNews();

    //    @GET("/media_resources/{imageName}")
    //    void getImage(@Path("imageName") String imageName, Callback<Response> callback);
}