package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText etFirstvalue, etSecondvalue;
    TextView tvAnswer;
    Button add, sub, multiply, divide;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inti();

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            int firstvalue, secondvalue, Answer;

            firstvalue=Integer.parseInt(etFirstvalue.getText().toString());
            secondvalue=Integer.parseInt(etSecondvalue.getText().toString());
            Answer= firstvalue + secondvalue;

            tvAnswer.setText("Answer is =" + Answer);

            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int firstvalue, secondvalue, Answer;

                firstvalue=Integer.parseInt(etFirstvalue.getText().toString());
                secondvalue=Integer.parseInt(etSecondvalue.getText().toString());
                Answer= firstvalue - secondvalue;

                tvAnswer.setText("Answer is =" +  Answer);

            }
        });
        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int firstvalue, secondvalue, Answer;

                firstvalue=Integer.parseInt(etFirstvalue.getText().toString());
                secondvalue=Integer.parseInt(etSecondvalue.getText().toString());
                Answer= firstvalue * secondvalue;

                tvAnswer.setText("Answer is =" +  Answer);

            }
        });
        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int firstvalue, secondvalue, Answer;

                firstvalue=Integer.parseInt(etFirstvalue.getText().toString());
                secondvalue=Integer.parseInt(etSecondvalue.getText().toString());

                Answer= firstvalue / secondvalue;

                tvAnswer.setText("Answer is =" +  Answer);

            }
        });
        }

    public void inti(){
        etFirstvalue=(EditText)findViewById(R.id.etFirstValue);
        etSecondvalue=(EditText)findViewById(R.id.etSecondValue);
        tvAnswer=(TextView)findViewById(R.id.tvAnswer);
        add=(Button)findViewById(R.id.btnAdd);
        sub=(Button)findViewById(R.id.btnSubtract);
        multiply=(Button)findViewById(R.id.btnMultily);
        divide=(Button)findViewById(R.id.btnDivide);
    }
}