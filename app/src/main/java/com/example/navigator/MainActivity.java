package com.example.navigator;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

import com.example.navigator.models.JsonPlaceHolderApi;
import com.example.navigator.models.Post;

import java.io.IOException;
import java.util.List;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.internal.EverythingIsNonNull;

/**
 * Представляет главный экран.
 */
public class MainActivity extends NavigationActivity {
    private ImageView textViewResult;

    /**
     * Создаёт главный экран.
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setNavBar();

        textViewResult = findViewById(R.id.imageView2);

        JsonPlaceHolderApi jsonPlaceHolderApi = HttpRequests.getRetrofit().create(JsonPlaceHolderApi.class);

        Call<ResponseBody> call = jsonPlaceHolderApi.getPosts();

        call.enqueue(new Callback<ResponseBody>() {
            @Override
            public void onResponse(@NonNull Call<ResponseBody> call, @NonNull Response<ResponseBody> response) {
                ResponseBody body = response.body();
                byte[] bytes = new byte[0];
                try {
                    assert body != null;
                    bytes = body.bytes();
                } catch (IOException e) {
                    System.out.println(e);
                }
                Bitmap bitmap = BitmapFactory.decodeByteArray(bytes, 0, bytes.length);
                textViewResult.setImageBitmap(bitmap);
//                if (!response.isSuccessful()) {
//                    textViewResult.setText("Code: " + response.code());
//                    return;
//                }
//
//                List<Post> posts = response.body();
//                posts = posts.subList(0, 10);
//                for (Post post : posts) {
//                    String content = "";
//                    content += "ID: " + post.getId() + "\n";
//                    content += "User ID: " + post.getUserId() + "\n";
//                    content += "Title: " + post.getTitle() + "\n";
//                    content += "Text: " + post.getText() + "\n\n";
//
//                    textViewResult.append(content);
//                }
            }

            @Override
            public void onFailure(Call<ResponseBody> call, Throwable t) {
                System.out.println(t.getMessage());
//                textViewResult.setText(t.getMessage());
            }
        });
    }
}