package com.example.namion_multicalc;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button btnCalculator, btnWageCalculator, btnBMICalculator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnCalculator = findViewById(R.id.btnCalculator);
        btnWageCalculator = findViewById(R.id.btnWageCalculator);
        btnBMICalculator = findViewById(R.id.btnBMICalculator);

        btnCalculator.setOnClickListener(this);
        btnWageCalculator.setOnClickListener(this);
        btnBMICalculator.setOnClickListener(this);


    }

    @Override
    public void onClick(View v){
        switch (v.getId()) {

            case R.id.btnCalculator:
                Intent intent = new Intent(this,Calculator.class);
                startActivity(intent);
                break;
            case R.id.btnWageCalculator:
                Intent intent1 = new Intent(this,WageCalculator.class);
                startActivity(intent1);
                break;
            case R.id.btnBMICalculator:
                Intent intent2 = new Intent(this,BMICalculator.class);
                startActivity(intent2);
                break;

        }
    }
}