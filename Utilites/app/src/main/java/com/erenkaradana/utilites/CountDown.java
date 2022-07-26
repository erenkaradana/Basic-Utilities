package com.erenkaradana.utilites;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class CountDown extends AppCompatActivity {
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_count_down);
        textView = findViewById(R.id.textView9);
        new CountDownTimer(100000,1000){

            @Override
            public void onTick(long l) {
                textView.setText("LEFT: "+l/1000);
            }

            @Override
            public void onFinish() {
            Toast.makeText(getApplicationContext(),"Done!",Toast.LENGTH_LONG).show();
            textView.setText("Finished!");
            }
        }.start();
    }



    public void gotom(View view){
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}