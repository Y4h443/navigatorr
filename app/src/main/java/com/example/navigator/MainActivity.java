package com.example.navigator;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.navigator.models.Place;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import java.util.ArrayList;
import java.util.List;

/**
 * Представляет главный экран.
 */
public class MainActivity extends AppCompatActivity implements OnMapReadyCallback{
    Context context;
    private List<Place> places = new ArrayList<>();

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

    private void SetMarkers(GoogleMap googleMap){
       /* places.add(new Place(new LatLng(59.12055738079308, 37.932), "Название1")); // todo Тут будут координаты
       places.add(new Place(new LatLng(59.12055738079308, 37.933), "Название2"));
        places.add(new Place(new LatLng(59.12055738079308, 37.934), "Название3"));
        places.add(new Place(new LatLng(59.12055738079308, 37.935), "Название4"));*/

        MarkerOptions[] markers = new MarkerOptions[places.size()];
        for (int i = 0; i < places.size(); i++) {
            markers[i] = new MarkerOptions()
                    .position(places.get(i).getCord())
                    .title(places.get(i).getName());
            googleMap.addMarker(markers[i]);
        }
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        SetMarkers(googleMap);

        LatLng chsu = new LatLng(59.12055738079308, 37.931014203439666);
        googleMap.addMarker(new MarkerOptions().position(chsu).title("ЧГУ"));
        googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(chsu, 15f));
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

