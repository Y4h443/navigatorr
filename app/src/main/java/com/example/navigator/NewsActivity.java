package com.example.navigator;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.navigator.adapter.NewsCardAdapter;
import com.example.navigator.models.NewsCard;

import java.util.ArrayList;
import java.util.List;

public class NewsActivity extends AppCompatActivity {

    private Button button;
    private Button button2;
    private Button button3;
    private Button button4;
    RecyclerView newsCardRecycler;
    NewsCardAdapter newsCardAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news);

        List<NewsCard> cards = new ArrayList<>();
        cards.add(new NewsCard(1, "news_1", "В прямом эфире поговорили про внеучебную деятельность в Череповецком государственном университете", "На вопросы первокурсников ответила Яна Юрьевна Черняева, начальник Центра студенческой культуры и творчества. Ведущая: Полина Готовчиц."));
        cards.add(new NewsCard(2, "news_2", "«Школа старост – 2021» объявляется открытой!", "К ребятам с приветственным словом обратилась Наталья Вячеславовна Макарова, проректор по воспитательной работе. Она обратила внимание на значимость старосты в системе вуза и пожелала успехов в обучении."));

        setNewsCardRecycler(cards);

        //button1 - news

        button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Context context = NewsActivity.this;

                Class NewwActivity = NewsActivity.class;
                Intent NextNewsActivity = new Intent(context, NewwActivity);
                startActivity(NextNewsActivity);
            }
        });
        //button2 - news

        button2 = findViewById(R.id.button2);

        button2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Context context = NewsActivity.this;

                Class NewwActivity = MainActivity.class;
                Intent NextNewsActivity = new Intent(context, NewwActivity);
                startActivity(NextNewsActivity);
            }
        });
        //button3 - news

        button3 = findViewById(R.id.button3);

        button3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Context context = NewsActivity.this;

                Class NewwActivity = PrepodActivity.class;
                Intent NextNewsActivity = new Intent(context, NewwActivity);
                startActivity(NextNewsActivity);
            }
        });
        //button4 - news

        button4 = findViewById(R.id.button4);

        button4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Context context = NewsActivity.this;

                Class NewwActivity = ReferencesActivity.class;
                Intent NextNewsActivity = new Intent(context, NewwActivity);
                startActivity(NextNewsActivity);
            }
        });
    }

    private void setNewsCardRecycler(List<NewsCard> cards) {
        LinearLayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.VERTICAL, false);
        newsCardRecycler = findViewById(R.id.newsCardRecycler);

        newsCardRecycler.setLayoutManager(layoutManager);

        newsCardAdapter = new NewsCardAdapter(this, cards);
        newsCardRecycler.setAdapter(newsCardAdapter);
    }
}
