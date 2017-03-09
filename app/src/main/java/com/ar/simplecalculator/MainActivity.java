package com.ar.simplecalculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.input1) EditText input1;
    @BindView(R.id.input2) EditText input2;
    @BindView(R.id.btnTotal) Button btnTotal;
    @BindView(R.id.result) TextView result;

    private int valueInput1, valueInput2, valueResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btnTotal)
    protected void hitungTotal(){
        //convert text input (String) menjadi int
        valueInput1 = Integer.parseInt(input1.getText().toString());
        valueInput2 = Integer.parseInt(input2.getText().toString());

        //menjumlahkan input 1 dan input 2
        valueResult = valueInput1 + valueInput2;

        //tampilkan hasil perhitungan
        result.setText(input1.getText().toString() + " + " + input2.getText().toString() + " = " + valueResult);

        //reset input 1 dan input 2
        input1.setText("");
        input2.setText("");

    }

}
