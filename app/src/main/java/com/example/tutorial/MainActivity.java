package com.example.tutorial;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText input;
    Button btn;
    TextView result;
    int year;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        input = findViewById(R.id.input);
        btn = findViewById(R.id.button);
        result = findViewById(R.id.result);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                year = Integer.valueOf(input.getText().toString());
                Calculater calculater = new Calculater(year);
                result.setText("Your age is "+calculater.getResult()+" years old");
                Toast.makeText(MainActivity.this,"Successfully recived input...",Toast.LENGTH_LONG).show();
            }
        });


    }
}