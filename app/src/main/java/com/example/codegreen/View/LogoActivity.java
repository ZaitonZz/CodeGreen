package com.example.codegreen.View;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.codegreen.Controller.getProgressBar;
import com.example.codegreen.R;
import com.example.codegreen.ui.login.LoginActivity;

public class LogoActivity extends AppCompatActivity {

    ProgressBar progressBar;
    TextView textView;
    ImageView logo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logo);
        progressBar = findViewById(R.id.pro);
        textView = findViewById(R.id.txt);
        enableFullscreen();
        logo = findViewById(R.id.imageView);
        logo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        progressBar.setMax(100);
        progressBar.setScaleY(2f);
        progressAnimation();
    }

    private void progressAnimation() {

        getProgressBar animation =  new getProgressBar(this,textView, progressBar,0f,100f, LoginActivity.class);
        animation.setDuration(8000);
        progressBar.setAnimation(animation);

    }
    private void enableFullscreen() {
        View decorView = getWindow().getDecorView();
        decorView.setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_LAYOUT_STABLE |
                        View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION |
                        View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN |
                        View.SYSTEM_UI_FLAG_FULLSCREEN |
                        View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY |
                        View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
        );
    }
}