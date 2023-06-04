package com.example.idizimo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.idizimo.model.Donate;

public class TotalDonateActivity extends AppCompatActivity {

    TextView inputTotalDonate;
    Button button;
    double total;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_total_donate);

        inputTotalDonate = findViewById(R.id.input_total_donate);
        button = findViewById(R.id.btn_restart);


            inputTotalDonate.setText(String.valueOf(Donate.calculaTotal()));

       reStart();
    }

   private void reStart(){
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputTotalDonate.setText(String.valueOf(Donate.zeradoTotal()));
                Intent intent = new Intent(TotalDonateActivity.this,MainActivity.class);
                intent.putExtra("donate", Donate.zeradoTotal());
                startActivity(intent);
            }
        });
    }

//    public double getTotal(){
//        return total ;
//    }

}