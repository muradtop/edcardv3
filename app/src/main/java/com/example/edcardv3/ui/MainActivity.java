package com.example.edcardv3.ui;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.edcardv3.R;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(R.style.Theme_edcardv3);
        setContentView(R.layout.activity_main);
    }
}