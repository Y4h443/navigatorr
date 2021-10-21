package com.example.navigator;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.navigator.adapter.InstituteAdapter;
import com.example.navigator.models.Institutes;

import java.util.ArrayList;

public class FacultyActivity extends AppCompatActivity {

    private Button button1;

    ArrayList<Institutes> list_of_institutes = new ArrayList<Institutes>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        //FullScreen
        //requestWindowFeature(Window.FEATURE_NO_TITLE);
        //getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_faculty);
        // начальная инициализация списка
        setInitialData();
        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        RecyclerView myList = (RecyclerView) findViewById(R.id.list);
        myList.setLayoutManager(layoutManager);
        // создаем адаптер
        InstituteAdapter adapter = new InstituteAdapter(this,  list_of_institutes);
        // устанавливаем для списка адаптер
        myList.setAdapter(adapter);

       //button1

        button1 = findViewById(R.id.button1);

        button1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Context context = FacultyActivity.this;

                Class NextActivity = PrepodActivity.class;
                Intent dropActivity = new Intent(context, NextActivity);
                startActivity(dropActivity);
            }
        });


    }

    private void setInitialData(){

        list_of_institutes.add(new Institutes (R.drawable.iit));
        list_of_institutes.add(new Institutes (R.drawable.pip));
        list_of_institutes.add(new Institutes (R.drawable.iti));
        list_of_institutes.add(new Institutes (R.drawable.fbzch));
        list_of_institutes.add(new Institutes (R.drawable.bsh));
        list_of_institutes.add(new Institutes (R.drawable.gi));
    }


};

