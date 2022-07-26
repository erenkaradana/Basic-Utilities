package com.erenkaradana.utilites;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Calculator extends AppCompatActivity {
        EditText editText;
        EditText editText2;
        TextView resultText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        editText = findViewById(R.id.editTextNumber);
        editText2 = findViewById(R.id.editTextNumber2);
        resultText = findViewById(R.id.textView5);

    }
    public void sum(View view){
        if(editText.getText().toString().matches("")|| editText2.getText().toString().matches("")){
            resultText.setText("Enter Number!");
        }
        else{
            int number1 =Integer.parseInt(editText.getText().toString());
            int number2 =Integer.parseInt(editText2.getText().toString());
            int result= number1+number2;
            resultText.setText("Result = "+result);
        }

    }
    public void out(View view){
        if(editText.getText().toString().matches("")|| editText2.getText().toString().matches("")){
            resultText.setText("Enter Number!");
        }
        else{
            int number1 =Integer.parseInt(editText.getText().toString());
            int number2 =Integer.parseInt(editText2.getText().toString());
            int result= number1-number2;
            resultText.setText("Result = "+ result);
        }

    }
    public void mult(View view){
        if(editText.getText().toString().matches("")|| editText2.getText().toString().matches("")){
            resultText.setText("Enter Number!");
        }
        else{
            int number1 =Integer.parseInt(editText.getText().toString());
            int number2 =Integer.parseInt(editText2.getText().toString());
            int result= number1*number2;
            resultText.setText("Result = "+result);
        }

    }
    public void divine(View view){
        if(editText.getText().toString().matches("")|| editText2.getText().toString().matches("")){
            resultText.setText("Enter Number!");
        }
        else{
            int number1 =Integer.parseInt(editText.getText().toString());
            int number2 =Integer.parseInt(editText2.getText().toString());
            int result= number1/number2;
            resultText.setText("Result = "+result);
        }

    }
    public void gotom(View view){
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}