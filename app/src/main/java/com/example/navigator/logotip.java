package com.example.navigator;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.example.navigator.adapter.InstituteAdapter;

public class logotip extends Activity {
    private final int SPLASH_DISPLEY_LENGHT=3000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.logotip);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(logotip.this,FacultyActivity.class);
                logotip.this.startActivity(intent);
                logotip.this.finish();
            }
        },SPLASH_DISPLEY_LENGHT);
        }
            @Override
    public void onBackPressed() {
            super.onBackPressed();
        }
    }

