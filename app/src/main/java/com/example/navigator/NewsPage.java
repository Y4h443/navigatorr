package com.example.navigator;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class NewsPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news_page);

        ImageView imageNews = findViewById(R.id.news_page_image);
        TextView titleNews = findViewById(R.id.news_page_title);
        TextView textNews = findViewById(R.id.news_page_text);

        Bitmap image = BitmapFactory.decodeByteArray(
                getIntent().getByteArrayExtra("imageNews"), 0, getIntent().getByteArrayExtra("imageNews").length);
        imageNews.setImageBitmap(image);

        titleNews.setText(getIntent().getStringExtra("titleNews"));
        textNews.setText(getIntent().getStringExtra("textNews"));
    }
}