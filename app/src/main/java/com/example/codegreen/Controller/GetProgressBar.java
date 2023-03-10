package com.example.codegreen.Controller;

import static android.content.ContentValues.TAG;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import android.widget.TextView;

//TODO: find better design for loading screen

public class GetProgressBar extends Animation {
    private Context context;
    private TextView textView;
    private android.widget.ProgressBar progressBar;
    private float from;
    private float to;
    private Class nextActivity;
    private Intent toG;
    private boolean called = false;

    public GetProgressBar(Context context, TextView textView, android.widget.ProgressBar progressBar, float from, float to, Class nextActivity) {
        this.context = context;
        this.textView = textView;
        this.progressBar = progressBar;
        this.from = from;
        this.to = to;
        this.nextActivity = nextActivity;
    }

    @Override
    protected void applyTransformation(float interpolatedTime, Transformation t) {
        super.applyTransformation(interpolatedTime, t);
        float value = from + (to - from) * interpolatedTime;

        progressBar.setProgress((int)value);
        textView.setText((int)value+"%");

        if (value == to) {
            if (!called){
                context.startActivity(new Intent(context, this.nextActivity));
                Log.d(TAG, "kenji activated");}
            called = true;
            Log.d(TAG, "next act from prg bar activated");
        }
    }
}
