package com.example.namion_multicalc;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class BMICalculator extends AppCompatActivity implements View.OnClickListener {

        Button btn;
        TextView bmi, Weight, Height, Res, result;
        EditText weight, height;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_bmicalculator);
        }


        @Override
        public void onClick(View view) {

        }
}
