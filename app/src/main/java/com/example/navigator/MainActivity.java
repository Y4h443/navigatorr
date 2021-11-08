package com.example.navigator;

import android.os.Bundle;

/**
 * Представляет главный экран.
 */
public class MainActivity extends NavigationActivity {

    /**
     * Создаёт главный экран.
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setNavBar();
    }
}