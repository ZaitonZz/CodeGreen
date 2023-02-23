package com.example.codegreen.View;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

import com.example.codegreen.R;

public class SearchActivity extends AppCompatActivity {
    Spinner spinnerAreas, spinnerProduce;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        spinnerAreas=findViewById(R.id.spinnerAreas);
        spinnerProduce = findViewById(R.id.spinnerProduce);

        ArrayAdapter<CharSequence>adapter= ArrayAdapter.createFromResource(this, R.array.Areas, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_item);
        spinnerAreas.setAdapter(adapter);

        adapter= ArrayAdapter.createFromResource(this, R.array.Produce, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_item);
        spinnerProduce.setAdapter(adapter);
    }

    @Override
    public void onBackPressed() {
        moveTaskToBack(true);
        android.os.Process.killProcess(android.os.Process.myPid());
        System.exit(0);
    }
}