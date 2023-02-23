package com.example.codegreen.View;

import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

import com.example.codegreen.R;
import com.example.codegreen.data.Model.SearchSettings;

public class SearchActivity extends AppCompatActivity {
    Spinner spinnerAreas, spinnerProduce;
    Button searchButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        spinnerAreas=findViewById(R.id.spinnerAreas);
        spinnerProduce = findViewById(R.id.spinnerProduce);
        searchButton = findViewById(R.id.confirmSearch);

        ArrayAdapter<CharSequence>adapter= ArrayAdapter.createFromResource(this, R.array.Areas, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_item);
        spinnerAreas.setAdapter(adapter);

        adapter= ArrayAdapter.createFromResource(this, R.array.Produce, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_item);
        spinnerProduce.setAdapter(adapter);

        searchButton.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                String temp1= "", temp2="";
                for (int i = 0; i < 3; i++) {
                    temp1 = temp1 + spinnerAreas.getSelectedItem().toString().charAt(i);
                    temp2 = temp2 + spinnerProduce.getSelectedItem().toString().charAt(i);
                }
                SearchSettings parameters = new SearchSettings(true,temp2,temp1);
                startActivity(new Intent(SearchActivity.this,MapActivity.class));
                return false;
            }
        });
    }

    @Override
    public void onBackPressed() {
        moveTaskToBack(true);
        android.os.Process.killProcess(android.os.Process.myPid());
        System.exit(0);
    }
}