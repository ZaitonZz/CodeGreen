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

import android.widget.Button;
import android.content.Intent;
import android.view.View;

public class MainScreenActivity extends AppCompatActivity {
    private Button mapButton;
    private Button searchButton;


    TextView welcomeMessage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_screen);
        mapButton = (Button) findViewById(R.id.button2);
        mapButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                openMaps();
            }
        });

        searchButton = (Button) findViewById(R.id.buttonSearch);
        searchButton.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openSearch();
            }
        }));

    }

    public void openMaps() {
        Intent intent = new Intent(this, MapActivity.class);
        startActivity(intent);
    }

    public void openSearch() {
        Intent intent = new Intent(this, SearchActivity.class);
        startActivity(intent);
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