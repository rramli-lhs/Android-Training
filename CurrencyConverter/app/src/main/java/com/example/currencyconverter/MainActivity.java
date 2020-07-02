package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void convertCurrency(View view) {

        EditText currency = (EditText) findViewById(R.id.currencyInput);
        Double d = Double.parseDouble( currency.getText().toString() );
        d = d * 1.39;

        String s = Double.toString(d);

        Toast toast = Toast.makeText(this, s + " SGD", Toast.LENGTH_LONG);
        toast.show();
    }
}
