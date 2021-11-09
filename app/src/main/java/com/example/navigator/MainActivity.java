package com.example.navigator;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

/**
 * Представляет главный экран.
 */
public class MainActivity extends AppCompatActivity implements OnMapReadyCallback{
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setNavBar();
        context = MainActivity.this;

        // Get a handle to the fragment and register the callback.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        googleMap.addMarker(new MarkerOptions()
                .position(new LatLng(0, 0))
                .title("Marker"));
    }

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

