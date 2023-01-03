package com.example.higherorlower;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import java.util.Random;
public class MainActivity extends AppCompatActivity {
    int randomNumber;

    public void Guess(View view){
        EditText editTextNumber1=(EditText) findViewById(R.id.editTextNumber1);
        int guessInt=Integer.parseInt(editTextNumber1.getText().toString());
        if(guessInt > randomNumber){
            Toast.makeText(MainActivity.this, "Lower!", Toast.LENGTH_SHORT).show();
        }else if(guessInt < randomNumber){
            Toast.makeText(MainActivity.this, "Higher!", Toast.LENGTH_SHORT).show();
        }
        else{
            Toast.makeText(MainActivity.this, "That's right!", Toast.LENGTH_SHORT).show();
            Random rand = new Random();
            randomNumber = rand.nextInt(50)+1;
        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Random rand = new Random();
        randomNumber = rand.nextInt(50)+1;
    }
}