package com.erenkaradana.utilites;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class RegisterScree extends AppCompatActivity {
    EditText editText;
    String username;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_scree);
        editText=findViewById(R.id.editText);
        username="";

    }
    public void gotomenu(View view){
        username = editText.getText().toString();
        Intent intent = new Intent(this,MainActivity.class);
        intent.putExtra("userInput",username);

        startActivity(intent);

    }
}