package com.example.navigator;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.navigator.adapter.NewsCardAdapter;
import com.example.navigator.models.JsonPlaceHolderApi;
import com.example.navigator.models.NewsCard;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Представляет экран новостей.
 */
public class NewsActivity extends NavigationActivity {
    RecyclerView newsCardRecycler;
    NewsCardAdapter newsCardAdapter;

    /**
     * Инициализирует экран новостей.
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news);


        textViewResult = findViewById(R.id.imageView2);

        JsonPlaceHolderApi jsonPlaceHolderApi = HttpRequests.getRetrofit().create(JsonPlaceHolderApi.class);

        Call<ResponseBody> call = jsonPlaceHolderApi.getPosts();

        call.enqueue(new Callback<ResponseBody>() {
            @Override
            public void onResponse(@NonNull Call<ResponseBody> call, @NonNull Response<ResponseBody> response) {

                if (!response.isSuccessful()) {
                    System.out.println(response.code());
//                    textViewResult.setText("Code: " + response.code());
                    return;
                }

                ResponseBody body = response.body();
                byte[] bytes = new byte[0];
                try {
                    assert body != null;
                    bytes = body.bytes();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                Bitmap bitmap = BitmapFactory.decodeByteArray(bytes, 0, bytes.length);
                textViewResult.setImageBitmap(bitmap);

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


        List<NewsCard> cards = new ArrayList<>();
        cards.add(new NewsCard(1, new String[]{"news_1"}, "В12 прямом эфире поговорили про внеучебную деятельность в Череповецком государственном университете", "На вопросы первокурсников ответила Яна Юрьевна Черняева, начальник Центра студенческой культуры и творчества. Ведущая: Полина Готовчиц."));
        cards.add(new NewsCard(2, new String[]{"news_2"}, "«Школа старост – 2021» объявляется открытой!", "К ребятам с приветственным словом обратилась Наталья Вячеславовна Макарова, проректор по воспитательной работе. Она обратила внимание на значимость старосты в системе вуза и пожелала успехов в обучении."));

        setNewsCardRecycler(cards);
        setNavBar();
    }

    private void setNewsCardRecycler(List<NewsCard> cards) {
        LinearLayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.VERTICAL, false);
        newsCardRecycler = findViewById(R.id.newsCardRecycler);

        newsCardRecycler.setLayoutManager(layoutManager);

        newsCardAdapter = new NewsCardAdapter(this, cards);
        newsCardRecycler.setAdapter(newsCardAdapter);
    }
}
