package com.example.guessthenumber;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.lang.Math;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    int randomNumber;
    public void clickFunction(View view) {
        EditText number = (EditText) findViewById(R.id.editText);
        String guessedNumber = number.getText().toString();
        int finalNumber = Integer.parseInt(guessedNumber);
        String message;
        if (finalNumber > randomNumber) {
            message = "Guess Lower!";
        }
        else if (finalNumber < randomNumber) {
            message = "Guess Higher!";
        }
        else {
            message= "Perfect Guess!";
        }
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
        Log.i("info","Button pressed!");
        Log.i("number",number.getText().toString());
        Log.i("random number",String.valueOf(randomNumber));


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Random rand = new Random();
        randomNumber = rand.nextInt(20)+1;
    }
}