package com.example.navigator;

import android.os.Bundle;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.navigator.adapter.ReferencesAdapter;
import com.example.navigator.models.References;

import java.util.ArrayList;

/**
 * Представляет экран полезной информации.
 */
public class ReferencesActivity extends NavigationActivity {

    ArrayList<References> list_of_references = new ArrayList<References>();

    /**
     * Инициализирует экран полезной информации.
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.references);
        // начальная инициализация списка
        setInitialData();
        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        RecyclerView myList = (RecyclerView) findViewById(R.id.references_list);
        myList.setLayoutManager(layoutManager);
        // создаем адаптер
        ReferencesAdapter adapter = new ReferencesAdapter(this, list_of_references);
        // устанавливаем для списка адаптер
        myList.setAdapter(adapter);
        setNavBar();
    }

    private void setInitialData() {
        list_of_references.add(new References("Справка"));
        list_of_references.add(new References("Справка2333"));
        list_of_references.add(new References("Справка2"));
        list_of_references.add(new References("Справка4"));
        list_of_references.add(new References("Справка5"));
    }
}