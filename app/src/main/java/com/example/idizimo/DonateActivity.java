package com.example.idizimo;

import static com.example.idizimo.model.Donate.calculaTotal;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.idizimo.model.Donate;

public class DonateActivity extends AppCompatActivity {

    EditText editDonate;
    Button btnDonate;

    @SuppressLint("MissingInflatedId")
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_donate);


        goesToMain();

    }

    public void goesToMain(){
        btnDonate = findViewById(R.id.btn_donate);
        btnDonate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editDonate= findViewById(R.id.input_donate);
                String textInput = editDonate.getText().toString();
                    double cash;
                if (textInput.isEmpty()){
                     cash = 0.0;
                    calculaTotal(cash);
                }else{
                     cash = Double.parseDouble(textInput);
                    calculaTotal(cash);
                }
                Intent intent = new Intent(DonateActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }





}