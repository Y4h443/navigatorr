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
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.example.navigator.adapter.InstituteAdapter;
import java.util.ArrayList;

public class FacultyActivity extends AppCompatActivity {

    private Button button1;

    ArrayList<Institutes> list_of_institutes = new ArrayList<Institutes>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
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
    }
    private void setInitialData(){

        list_of_institutes.add(new Institutes (R.drawable.iit));
        list_of_institutes.add(new Institutes (R.drawable.pip));
        list_of_institutes.add(new Institutes (R.drawable.iti));
        list_of_institutes.add(new Institutes (R.drawable.fbzch));
        list_of_institutes.add(new Institutes (R.drawable.bsh));
        list_of_institutes.add(new Institutes (R.drawable.gi));
    }

}
