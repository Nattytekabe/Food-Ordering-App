package com.example.megeb;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Checkout extends AppCompatActivity {
    TextView listView, priceView;
    String list_choice;
    Double price_et, price_usd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkout);
        listView = (TextView) findViewById(R.id.listView);
        priceView = (TextView) findViewById(R.id.priceView);

        //Getting passed value from MainActivity
        Bundle bundle = getIntent().getExtras();
        list_choice = bundle.getString("choices");
        price_et = bundle.getDouble("price");


        listView.setText(list_choice);
        priceView.setText(price_et.toString() + "  Ethiopian birr");
    }
}