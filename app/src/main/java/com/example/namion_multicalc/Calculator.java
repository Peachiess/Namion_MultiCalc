package com.example.namion_multicalc;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Calculator extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        Button btnAdd, btnSub, btnMulti, btnDiv, btnMod;

        btnAdd = findViewById(R.id.btnAdd);
        btnSub = findViewById(R.id.btnSub);
        btnMulti = findViewById(R.id.btnMulti);
        btnDiv = findViewById(R.id.btnDiv);
        btnMod = findViewById(R.id.btnMod);

        btnAdd.setOnClickListener(this);
        btnSub.setOnClickListener(this);
        btnMulti.setOnClickListener(this);
        btnDiv.setOnClickListener(this);
        btnMod.setOnClickListener(this);
    }
    @Override
    public void onClick(View v){
        EditText txtOperand1, txtOperand2;
        TextView txtAnswer;

        txtOperand1 = findViewById(R.id.operand1);
        txtOperand2 = findViewById(R.id.operand2);
        txtAnswer = findViewById(R.id.txtAnswer);

        Double op1 = 0.0;
        Double op2 = 0.0;
        Double answer = 0.0;

        op1 = Double.parseDouble(txtOperand1.getText().toString());
        op2 = Double.parseDouble(txtOperand2.getText().toString());

        switch (v.getId()) {
            case R.id.btnAdd:
                answer = op1 + op2;
                txtAnswer.setText(Double.toString(answer));
                break;
            case R.id.btnSub:
                answer = op1 - op2;
                txtAnswer.setText(Double.toString(answer));
                break;
            case R.id.btnMulti:
                answer = op1 * op2;
                txtAnswer.setText(Double.toString(answer));
                break;
            case R.id.btnDiv:
                answer = op1 / op2;
                txtAnswer.setText(Double.toString(answer));
                break;
            case R.id.btnMod:
                answer = op1 % op2;
                txtAnswer.setText(Double.toString(answer));
                break;
        }
    }
}
