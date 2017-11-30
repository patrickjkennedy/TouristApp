package com.example.android.touristapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


public class OutdoorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container, new OutdoorFragment())
                .commit();
    }
}