package com.example.navigator;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.navigator.adapter.ReferencesAdapter;
import com.example.navigator.models.References;

import java.util.ArrayList;

public class ReferencesActivity extends AppCompatActivity {

    private Button button;
    private Button button2;
    private Button button3;
    private Button button4;

    ArrayList<References> list_of_references= new ArrayList<References>();
    //ArrayList<References> list_of_references2= new ArrayList<References>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.references);
        // начальная инициализация списка
        setInitialData();
        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        RecyclerView myList = (RecyclerView) findViewById(R.id.references_list);
        //RecyclerView myList2 = (RecyclerView) findViewById(R.id.references2_list);
        myList.setLayoutManager(layoutManager);
       // myList2.setLayoutManager(layoutManager);
        // создаем адаптер
        ReferencesAdapter adapter = new ReferencesAdapter(this, list_of_references);
        //ReferencesAdapter adapter2 = new ReferencesAdapter(this,  list_of_references2);
        // устанавливаем для списка адаптер
        myList.setAdapter(adapter);
        //myList2.setAdapter(adapter2);

        //button1 - news

        button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Context context = ReferencesActivity.this;

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
                Context context = ReferencesActivity.this;

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
                Context context = ReferencesActivity.this;

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
                Context context = ReferencesActivity.this;

                Class NewwActivity = ReferencesActivity.class;
                Intent NextNewsActivity = new Intent(context, NewwActivity);
                startActivity(NextNewsActivity);
            }
        });
    }
    private void setInitialData(){

        list_of_references.add(new References ("Справка"));
        list_of_references.add(new References ("Справка2333"));
        list_of_references.add(new References ("Справка2"));
        list_of_references.add(new References ("Справка4"));
        list_of_references.add(new References ("Справка5"));
        /*list_of_references.add(new References ("Справка"));
        list_of_references2.add(new References ("Справка2"));
        list_of_references2.add(new References ("Справка2"));
        list_of_references2.add(new References ("Справка2"));
        list_of_references2.add(new References ("Справка2"));
        list_of_references2.add(new References ("Справка2"));
        list_of_references2.add(new References ("Справка2"));*/
    }




    }