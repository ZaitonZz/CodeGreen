package com.example.codegreen.View;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.codegreen.R;

public class LoadingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loading);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }
}