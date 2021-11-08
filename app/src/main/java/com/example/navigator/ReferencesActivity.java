package com.example.navigator;

import android.os.Bundle;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.navigator.adapter.NewsCardAdapter;
import com.example.navigator.adapter.ReferencesAdapter;
import com.example.navigator.models.NewsCard;
import com.example.navigator.models.References;

import java.util.ArrayList;
import java.util.List;

/**
 * Представляет экран новостей.
 */
public class ReferencesActivity extends NavigationActivity {
    RecyclerView ReferencesRecycler;
    com.example.navigator.adapter.ReferencesAdapter ReferencesAdapter;

    /**
     * Инициализирует экран новостей.
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.references);

        List<References> cards = new ArrayList<>();
        cards.add(new References(1, "Охрана порядка", "Начальник службы комплексной безопасности – АЛЕКСАНДР АНАТОЛЬЕВИЧ ЦЕЛИКОВ, телефон: 55-92-06, адрес: ул. М. Горького, 14, ауд. 104"));
        cards.add(new References(2, "Охрана здоровья", "Заведующий студенческим медпунктом – ЕЛЕНА ВЯЧЕСЛАВОВНА ПУКЕЛО, телефон: 51-73-31, адрес: Советский пр., 8, 1-й этаж, ауд. 103"));

        setReferencesRecycler(cards);
        setNavBar();
    }

    private void setReferencesRecycler(List<References> cards) {
        LinearLayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.VERTICAL, false);
        ReferencesRecycler = findViewById(R.id.ReferencesRecycler);

        ReferencesRecycler.setLayoutManager(layoutManager);

        ReferencesAdapter = new ReferencesAdapter(this, cards);
        ReferencesRecycler.setAdapter(ReferencesAdapter);
    }
}
