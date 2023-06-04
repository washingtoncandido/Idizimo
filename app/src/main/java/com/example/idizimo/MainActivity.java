package com.example.idizimo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.example.idizimo.model.Donate;

public class MainActivity extends AppCompatActivity {

    Button btnStart;
    Button btnDasboard;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        goesDonate();
        goesPainel();
    }

    private void getBtnStart(){
        btnStart = findViewById(R.id.btn_start);
    }
    private void goesDonate() {
       getBtnStart();
        btnStart.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,DonateActivity.class);
                startActivity(intent);
            }
        });
    }

    private void   goesPainel(){
        btnDasboard = findViewById(R.id.btn_dashboard);
        btnDasboard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,TotalDonateActivity.class);
                intent.putExtra("donate", Donate.calculaTotal());
                startActivity(intent);
            }
        });
    }
}