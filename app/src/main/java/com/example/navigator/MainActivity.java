package com.example.navigator;

        import android.content.Context;
        import android.content.Intent;
        import android.os.Bundle;
        import android.util.Log;
        import android.view.View;
        import android.widget.Button;
        import android.widget.RadioButton;
        import android.widget.RadioGroup;
        import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private Button button2;
    private Button button3;
    private Button button4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //button1 - news

        button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Context context = MainActivity.this;

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
                Context context = MainActivity.this;

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
                Context context = MainActivity.this;

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
                Context context = MainActivity.this;

                Class NewwActivity = ReferencesActivity.class;
                Intent NextNewsActivity = new Intent(context, NewwActivity);
                startActivity(NextNewsActivity);
            }
        });

    }

};