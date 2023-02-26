package com.example.codegreen.View;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.codegreen.R;

public class BirdsEyeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_birds_eye);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }
}