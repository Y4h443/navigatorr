package com.example.navigator;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.example.navigator.adapter.PrepodAdapter;

import java.util.ArrayList;

public class PrepodActivity extends MainActivity {
    LinearLayout dynamicContent,bottonNavBar;

    ArrayList<Prepodi> prepods = new ArrayList<Prepodi>();

    private Button button;
    private Button button2;
    private Button button3;
    private Button button4;

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

        //button1 - news

        button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Context context = PrepodActivity.this;

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
                Context context = PrepodActivity.this;

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
                Context context = PrepodActivity.this;

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
                Context context = PrepodActivity.this;

                Class NewwActivity = ReferencesActivity.class;
                Intent NextNewsActivity = new Intent(context, NewwActivity);
                startActivity(NextNewsActivity);
            }
        });
    }
    private void setInitialData(){

        prepods.add(new Prepodi("Ершов Евгений Валентинович", "зав. кафедрой", R.drawable.ersh));
        prepods.add(new Prepodi("Ганичева Оксана Георгиевна", "заместитель зав. кафедрой", R.drawable.ganya));
        prepods.add(new Prepodi("Селяничев Олег Леонидович", "доцент", R.drawable.selyan));
        prepods.add(new Prepodi("Пышницкий Константин Михайлович", "старший преподаватель", R.drawable.konstantin));
        prepods.add(new Prepodi("Виноградова Людмила Николаевна", "доцент", R.drawable.vino));
        prepods.add(new Prepodi("Юдина Ольга Вадимовна", "доцент", R.drawable.yudina));
    }

}
