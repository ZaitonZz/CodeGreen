package com.example.codegreen.View;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.codegreen.R;

import android.widget.Button;
import android.content.Intent;
import android.view.View;

public class MainScreenActivity extends AppCompatActivity {
    private Button mapButton;
    private Button searchButton;


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

        searchButton = (Button) findViewById(R.id.button);
        searchButton.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openSearch();
            }
        }));

    }

    public void openMaps() {
        Intent intent = new Intent(this, MapsActivity.class);
        startActivity(intent);
    }

    public void openSearch() {
        Intent intent = new Intent(this, SearchActivity.class);
        startActivity(intent);
    }
}