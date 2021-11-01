package com.example.navigator;

import android.os.Bundle;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.navigator.adapter.NewsCardAdapter;
import com.example.navigator.models.NewsCard;

import java.util.ArrayList;
import java.util.List;

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

        List<NewsCard> cards = new ArrayList<>();
        cards.add(new NewsCard(1, "news_1", "В12 прямом эфире поговорили про внеучебную деятельность в Череповецком государственном университете", "На вопросы первокурсников ответила Яна Юрьевна Черняева, начальник Центра студенческой культуры и творчества. Ведущая: Полина Готовчиц."));
        cards.add(new NewsCard(2, "news_2", "«Школа старост – 2021» объявляется открытой!", "К ребятам с приветственным словом обратилась Наталья Вячеславовна Макарова, проректор по воспитательной работе. Она обратила внимание на значимость старосты в системе вуза и пожелала успехов в обучении."));

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
