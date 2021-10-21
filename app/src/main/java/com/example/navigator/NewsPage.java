package com.example.navigator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class NewsPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news_page);

        ImageView imageNews =findViewById(R.id.news_page_image);
        TextView titleNews = findViewById(R.id.news_page_title);
        TextView textNews = findViewById(R.id.news_page_text);

        imageNews.setImageResource(getIntent().getIntExtra("imageNews", 0));
        titleNews.setText(getIntent().getStringExtra("titleNews"));
        textNews.setText(getIntent().getStringExtra("textNews"));
    }
}