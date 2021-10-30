package com.example.navigator;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

/**
 * Определяет кнопки переходов между экранами.
 */
public class NavigationActivity extends AppCompatActivity {
    Context context;

    /**
     * Создаёт экран.
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        context = NavigationActivity.this;
    }

    /**
     * Устанавливает кнопки для навигации.
     */
    public void setNavBar() {
        //buttonNews - Новости

        Button buttonNews = findViewById(R.id.button);
        buttonNews.setOnClickListener(view -> {
            Class<NewsActivity> NewActivity = NewsActivity.class;
            Intent NextNewsActivity = new Intent(context, NewActivity);
            startActivity(NextNewsActivity);
        });

        //buttonMap - Главный экран todo но будет карта

        Button buttonMap = findViewById(R.id.button2);

        buttonMap.setOnClickListener(view -> {
            Class<MainActivity> NewActivity = MainActivity.class;
            Intent NextNewsActivity = new Intent(context, NewActivity);
            startActivity(NextNewsActivity);
        });

        //buttonPrepod - Преподаватели

        Button buttonPrepod = findViewById(R.id.button3);

        buttonPrepod.setOnClickListener(view -> {
            Class<PrepodActivity> NewActivity = PrepodActivity.class;
            Intent NextNewsActivity = new Intent(context, NewActivity);
            startActivity(NextNewsActivity);
        });

        //buttonReferences - Полезная информация

        Button buttonReferences = findViewById(R.id.button4);
        buttonReferences.setOnClickListener(view -> {
            Class<ReferencesActivity> NewActivity = ReferencesActivity.class;
            Intent NextNewsActivity = new Intent(context, NewActivity);
            startActivity(NextNewsActivity);
        });
    }
}