package com.example.navigator;

/*import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;



import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.navigator.Institutes;
import com.example.navigator.R;
import com.example.navigator.adapter.InstituteAdapter;

import java.util.ArrayList;
import java.util.List;

public class FacultyActivity extends AppCompatActivity {
    RecyclerView institutesRecycler;
    InstituteAdapter instituteAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faculty);
        List<Institutes> institutesList = new ArrayList<>();
        institutesList.add(new Institutes(1,"humanitarian","Гуманитарный иститут"));
        institutesList.add(new Institutes(1,"business","Бизнес-школа"));
        institutesList.add(new Institutes(1,"informational","Институт информационных технологий"));
        setInstituteRecycler(institutesList);
    }
    private void setInstituteRecycler(List<Institutes> institutesList) {
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this,RecyclerView.HORIZONTAL,false);
        institutesRecycler=findViewById(R.id.institutesRecycler);
        institutesRecycler.setLayoutManager(layoutManager);
        instituteAdapter=new InstituteAdapter(this,institutesList);
        institutesRecycler.setAdapter(instituteAdapter);
    }
}*/

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;

import com.example.navigator.adapter.InstituteAdapter;

import java.util.ArrayList;

public class FacultyActivity extends AppCompatActivity {

    ArrayList<Institutes> states = new ArrayList<Institutes>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faculty);
        // начальная инициализация списка
        setInitialData();
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.list);
        // создаем адаптер
        InstituteAdapter adapter = new InstituteAdapter(this, states);
        // устанавливаем для списка адаптер
        recyclerView.setAdapter(adapter);
    }
    private void setInitialData(){

        states.add(new Institutes ("Бразилия", "Бразилиа", R.drawable.ic_business));
        states.add(new Institutes ("Аргентина", "Буэнос-Айрес", R.drawable.ic_humanitarian));
        states.add(new Institutes ("Колумбия", "Богота", R.drawable.ic_informational));
        //states.add(new Institutes ("Уругвай", "Монтевидео", R.drawable.uruguai));
        //states.add(new Institutes ("Чили", "Сантьяго", R.drawable.chile));
    }
}