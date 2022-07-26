package com.erenkaradana.utilites;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.service.voice.VisibleActivityInfo;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Stopwatch extends AppCompatActivity {
        TextView textView;
        TextView textView2;
        int number;
        Handler handler;
        Runnable runnable;
        Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stopwatch);
        textView = findViewById(R.id.textView6);
        textView2 = findViewById(R.id.textView7);
        button = findViewById(R.id.button2);
        number =0;
    }

    public void start(View view){
        handler = new Handler();
        runnable = new Runnable(){

            @Override
            public void run() {
                textView.setText("Time ="+ number);
                number++;
                textView.setText("Time = "+number);
                handler.postDelayed(runnable,1000);
            }
        };
        handler.post(runnable);
        button.setEnabled(false);
    }
    public void stop(View view){
        button.setEnabled(true);
        handler.removeCallbacks(runnable);
        textView2.setText("Last Saved Time="+ number);
        number=0;
        textView.setText("Time ="+number);
    }
    public void gotom(View view){
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}