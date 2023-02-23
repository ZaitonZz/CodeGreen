package com.example.codegreen.View;

import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.codegreen.R;
import com.example.codegreen.data.Model.CurrentUser;

public class MainScreenActivity extends AppCompatActivity {

    TextView welcomeMessage;
    Button searchButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_screen);

        searchButton = findViewById(R.id.buttonSearch);
        welcomeMessage = findViewById(R.id.welcomeText);
        String s = "dsa";
        welcomeMessage.setText("Welcome "+CurrentUser.getUsername() +"!");

        searchButton.setOnTouchListener((view, motionEvent) -> {
            startActivity(new Intent(MainScreenActivity.this, SearchActivity.class));
            return false;
        });
    }
    @Override
    public void onBackPressed() {
        moveTaskToBack(true);
        android.os.Process.killProcess(android.os.Process.myPid());
        System.exit(0);
    }
}