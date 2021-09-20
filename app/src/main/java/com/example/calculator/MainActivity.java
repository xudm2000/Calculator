package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void clickAdd(View view){
        EditText firstText =(EditText)findViewById(R.id.textField1);
        EditText secondText =(EditText)findViewById(R.id.textField2);
        if(firstText.getText().toString().equals("") || secondText.getText().toString().equals("")){
            Toast.makeText(MainActivity.this, "Invalid Input", Toast.LENGTH_LONG).show();
        }else {
            int firstNumber = Integer.parseInt(firstText.getText().toString());
            int secondNumber = Integer.parseInt(secondText.getText().toString());
            int result = firstNumber + secondNumber;
            goToActivity2(String.valueOf(result));
        }
    }

    public void clickSub(View view){
        EditText firstText =(EditText)findViewById(R.id.textField1);
        EditText secondText =(EditText)findViewById(R.id.textField2);
        if(firstText.getText().toString().equals("") || secondText.getText().toString().equals("")){
            Toast.makeText(MainActivity.this, "Invalid Input", Toast.LENGTH_LONG).show();
        }else {
            int firstNumber = Integer.parseInt(firstText.getText().toString());
            int secondNumber = Integer.parseInt(secondText.getText().toString());
            int result = firstNumber - secondNumber;
            goToActivity2(String.valueOf(result));
        }
    }

    public void clickMul(View view){
        EditText firstText =(EditText)findViewById(R.id.textField1);
        EditText secondText =(EditText)findViewById(R.id.textField2);
        if(firstText.getText().toString().equals("") || secondText.getText().toString().equals("")){
            Toast.makeText(MainActivity.this, "Invalid Input", Toast.LENGTH_LONG).show();
        }else {
            int firstNumber = Integer.parseInt(firstText.getText().toString());
            int secondNumber = Integer.parseInt(secondText.getText().toString());
            int result = firstNumber * secondNumber;
            goToActivity2(String.valueOf(result));
        }
    }

    public void clickDiv(View view){
        EditText firstText =(EditText)findViewById(R.id.textField1);
        EditText secondText =(EditText)findViewById(R.id.textField2);
        if(firstText.getText().toString().equals("") || secondText.getText().toString().equals("")){
            Toast.makeText(MainActivity.this, "Invalid Input", Toast.LENGTH_LONG).show();
        }else {
            double firstNumber = Double.parseDouble(firstText.getText().toString());
            double secondNumber = Double.parseDouble(secondText.getText().toString());
            if(secondNumber == 0.0){
                Toast.makeText(MainActivity.this, "Divisor cannot be 0", Toast.LENGTH_LONG).show();
            }else {
                double result = firstNumber / secondNumber;
                goToActivity2(String.valueOf(result));
            }
        }
    }

    public void goToActivity2(String number){
        Intent intent =new Intent(this, MainActivity2.class);
        intent.putExtra("message", number);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}