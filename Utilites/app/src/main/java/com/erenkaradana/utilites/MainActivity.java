package com.erenkaradana.utilites;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    String userName;
    SharedPreferences sharedPreferences;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView= findViewById(R.id.textView2);
        Intent intent = getIntent();
        userName = intent.getStringExtra("userInput");
        textView.setText("Welcome "+ userName +"!");
    }
    public void gotoct(View view){
        Intent intent = new Intent(this,CountDown.class);
        startActivity(intent);
    }
    public void gotost(View view){
        Intent intent = new Intent(this,Stopwatch.class);
        startActivity(intent);
    }
    public void gotohp(View view){
        Intent intent = new Intent(this,Calculator.class);
        startActivity(intent);
    }
}