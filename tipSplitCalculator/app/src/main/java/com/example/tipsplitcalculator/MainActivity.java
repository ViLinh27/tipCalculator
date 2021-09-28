package com.example.tipsplitcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Button;
import android.view.View;
public class MainActivity extends AppCompatActivity {
    float billValue;
    int numPeopleValue;

    TextView tipAmount;
    TextView totalWithTip;
    TextView overage;
    TextView totalPperson;

    RadioButton tip_12;
    RadioButton tip_15;
    RadioButton tip_18;
    RadioButton tip_20;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText billInput = findViewById(R.id.billTotal_input);
        EditText numPeopleInput = findViewById(R.id.numPeople_input);
        billValue = Float.parseFloat(billInput.getText().toString());
        numPeopleValue = Integer.parseInt(numPeopleInput.getText().toString());

        tipAmount = findViewById(R.id.tipAmount_display);//show the tip amount
        totalWithTip = findViewById(R.id.totalWtip_display);//what's the total with the tip(displayed)
        totalPperson = findViewById(R.id.totalPerPerson_display);//what's the total per person(displayed)
        overage = findViewById(R.id.overage_display);//display overage

        Button goBtn = findViewById(R.id.go_btn);
        Button clearBtn = findViewById(R.id.clear_btn);

        tip_12 = findViewById(R.id.rdb_12p);
        tip_15 = findViewById(R.id.rdb_15p);
        tip_18 = findViewById(R.id.rdb_18p);
        tip_20 = findViewById(R.id.rdb_20p);
        RadioGroup tip_group = findViewById(R.id.rdbgrp_tipOptions);

    }

    public void howMuchDoWePay(View view){
        float tipToDisplay;
        float totalWtip_toDisplay;
        float totalPperson_toDisplay;
        float overageToDisplay;

        //calculate tip

        //add selected tip to billValue to put into totalWtip_toDisplay
    }

    public void clearFields(View view){
        tipAmount.setText("");
        totalWithTip.setText("");
        overage.setText("");
        totalPperson.setText("");
    }
}