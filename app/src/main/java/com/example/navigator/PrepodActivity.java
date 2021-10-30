package com.example.navigator;

import android.os.Bundle;
import android.widget.LinearLayout;

import androidx.recyclerview.widget.RecyclerView;

import com.example.navigator.adapter.PrepodAdapter;

import java.util.ArrayList;

/**
 * Представляет экран списка преподавателей.
 */
public class PrepodActivity extends NavigationActivity {
    LinearLayout dynamicContent, bottonNavBar;

    ArrayList<Prepodi> prepods = new ArrayList<Prepodi>();

    /**
     * Инициализирует экран с преподавателями.
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //список
        setContentView(R.layout.activity_prepod);
        // начальная инициализация списка
        setInitialData();
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.list);
        // создаем адаптер
        PrepodAdapter adapter = new PrepodAdapter(this, prepods);
        // устанавливаем для списка адаптер
        recyclerView.setAdapter(adapter);
        setNavBar();
    }

    private void setInitialData() {
        prepods.add(new Prepodi("Ершов Евгений Валентинович", "зав. кафедрой", R.drawable.ersh));
        prepods.add(new Prepodi("Ганичева Оксана Георгиевна", "заместитель зав. кафедрой", R.drawable.ganya));
        prepods.add(new Prepodi("Селяничев Олег Леонидович", "доцент", R.drawable.selyan));
        prepods.add(new Prepodi("Пышницкий Константин Михайлович", "старший преподаватель", R.drawable.konstantin));
        prepods.add(new Prepodi("Виноградова Людмила Николаевна", "доцент", R.drawable.vino));
        prepods.add(new Prepodi("Юдина Ольга Вадимовна", "доцент", R.drawable.yudina));
    }

}
