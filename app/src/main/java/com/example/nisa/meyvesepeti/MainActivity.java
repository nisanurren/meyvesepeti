package com.example.nisa.meyvesepeti;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Random;


public class MainActivity extends AppCompatActivity {
    ImageView apple,orange,pear;
    Button apple_up , apple_down , orange_up , orange_down , pear_up , pear_down ,goster;
    TextView textView;
    Basket basket;


    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        apple_up = findViewById(R.id.apple_up);
        apple_down = findViewById(R.id.apple_down);
        orange_up = findViewById(R.id.orange_up);
        orange_down = findViewById(R.id.orange_down);
        pear_up = findViewById( R.id.pear_up);
        pear_down = findViewById(R.id.pear_down);
        Button goster = findViewById(R.id.goster);

        final TextView textView = findViewById(R.id.textView);

        basket = new Basket();

        apple_up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Apple elma = new Apple();
                basket.sepet.add(elma);

            }
        });
        orange_up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Orange portakal = new Orange();
                basket.sepet.add(portakal);

            }
        });
        pear_up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Pear armut = new Pear();
              basket.sepet.add(armut);

            }
        });
        apple_down.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                boolean isAppleExist = false;

                for (Fruit fruit : basket.sepet) {
                    if (fruit instanceof Apple) {
                        basket.sepet.remove(fruit);
                        isAppleExist = true;
                        break;
                    }
                }

                if (isAppleExist) {

                }
                else{
                    Toast.makeText(getApplicationContext(), "There is no apple", Toast.LENGTH_LONG ).show();
                }
            }
        });

        pear_down.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean isPearExist = false;

                for (Fruit fruit : basket.sepet) {
                    if (fruit instanceof Pear){
                        basket.sepet.remove(fruit);
                        isPearExist = true;
                        break;
                    }
                }
                if (isPearExist){

                }
                else {
                    Toast.makeText(getApplicationContext(), "There is no pear", Toast.LENGTH_LONG).show();
                }

            }
        });
        orange_down.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               boolean isOrangeExist = false;

               for(Fruit fruit : basket.sepet){
                   if (fruit instanceof Orange) {
                       basket.sepet.remove(fruit);
                       isOrangeExist = true;
                       break;

                   }
               }
               if (isOrangeExist){

               }
               else{
                   Toast.makeText(getApplicationContext(), "There is no orange", Toast.LENGTH_LONG).show();
               }

            }
        });

goster.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        textView.setText( "" + basket.sepet.size());
    }
});

    }
}

