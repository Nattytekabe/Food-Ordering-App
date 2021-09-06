package com.example.megeb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TabHost;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button pizzaButton, BurgerButton,placeorder,CokeButton,SpriteButton;
    TabHost TbHost;
    String choice = " ";
    Double price = 0.00;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TabHost tabhost = (TabHost) findViewById(R.id.tbh);
        CokeButton = (Button) findViewById(R.id.dr1btn);
        SpriteButton = (Button) findViewById(R.id.dr2btn);
        BurgerButton = (Button) findViewById(R.id.burbtn);
        pizzaButton = (Button) findViewById(R.id.pizbtn);
        placeorder = (Button) findViewById(R.id.place);
        tabhost.setup();
        TabHost.TabSpec spec = tabhost.newTabSpec("Food");

        spec.setContent(R.id.Food);

        spec.setIndicator("Food");

// adding the tab to tabhost

        tabhost.addTab(spec);
        spec = tabhost.newTabSpec("Drinks");
        spec.setContent(R.id.Drink);
        spec.setIndicator("Drinks");
        tabhost.addTab(spec);
        CokeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                choice = choice + "Coke" + "\n";
                price = price + 20;
                Toast toast=Toast. makeText(getApplicationContext(),"price = "+price,Toast. LENGTH_SHORT);
                toast. show();
            }
        });
        SpriteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                choice = choice + "Sprite" + "\n";
                price = price + 20;
                Toast toast=Toast. makeText(getApplicationContext(),"price = "+price,Toast. LENGTH_SHORT);
                toast. show();
            }
        });
        pizzaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                choice = choice + "Pizza" + "\n";
                price = price + 150;
                Toast toast=Toast. makeText(getApplicationContext(),"price = "+price,Toast. LENGTH_SHORT);
                toast. show();
            }
        });
        BurgerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                choice = choice + "Burger" + "\n";
                price = price + 120;
                Toast toast=Toast. makeText(getApplicationContext(),"price = "+price,Toast. LENGTH_SHORT);
                toast. show();
            }
        });
        placeorder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, Checkout.class);
                Bundle bundle = new Bundle();
                bundle.putString("choices",choice);
                bundle.putDouble("price",price);
                i.putExtras(bundle);
                startActivity(i);
                Toast toast=Toast. makeText(getApplicationContext(),"price = "+price,Toast. LENGTH_SHORT);
                toast. show();
            }
        });


    }
}