package com.example.tipcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    float amount_bill;
    float tip_percent;

    EditText txt_bill;
    EditText txt_tip;

    TextView label_Atip;
    TextView label_Atotal;

    Button btn_cal;
    Button btn_reset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt_bill = (EditText) findViewById(R.id.txt_bill);
        txt_tip = (EditText) findViewById(R.id.txt_tip);

        label_Atip = (TextView) findViewById(R.id.label_Atip);
        label_Atotal = (TextView) findViewById(R.id.label_Atotal);

        btn_cal = (Button) findViewById(R.id.btn_cal);
        btn_reset = (Button) findViewById(R.id.btn_reset);

        btn_cal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                amount_bill = Float.parseFloat(txt_bill.getText().toString());
                tip_percent = Float.parseFloat(txt_tip.getText().toString());
                TipCalculator obj = new TipCalculator(tip_percent,amount_bill);

                String TipAmount =  String.valueOf(obj.tipAmount());
                String TotalAmount = String.valueOf(obj.totalAmount());

                label_Atip.setText(TipAmount);
                label_Atotal.setText(TotalAmount);
            }
        });

        btn_reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt_bill.setText("");
                txt_tip.setText("");
                label_Atip.setText("");
                label_Atotal.setText("");
            }
        });

    }
}