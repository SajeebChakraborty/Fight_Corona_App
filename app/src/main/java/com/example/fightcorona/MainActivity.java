package com.example.fightcorona;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button define,syntrome,transmission,prevention,infection;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Move to Define page

        define = (Button)findViewById(R.id.coronadefine);
        define.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                definePage();
            }
        });

        //Move to Syntrome page

        syntrome=(Button)findViewById(R.id.syntrome);
        syntrome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                syntromePage();
            }
        });

        //Move to Transmission page

        transmission = (Button)findViewById(R.id.transmission);
        transmission.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                transmissionPage();
            }
        });

        //Move to Prevention page

        prevention = (Button)findViewById(R.id.prevention);
        prevention.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                preventionPage();
            }
        });

        //Move to Infection page

        infection = (Button)findViewById(R.id.infection);
        infection.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                infectionPage();
            }
        });

    }
    // Define page function
    public void definePage(){

        Intent intent = new Intent(this,DefineCorona.class);
        startActivity(intent);

    }

    // Syntrome page function
    public void syntromePage(){

        Intent intent2 = new Intent(this,Syntrome.class);
        startActivity(intent2);

    }

    // Transmission page function
    public void transmissionPage(){

        Intent intent3 = new Intent(this,Transmission.class);
        startActivity(intent3);


    }

    // Prevention page function
    public void preventionPage(){

        Intent intent4 = new Intent(this,Prevention.class);
        startActivity(intent4);


    }

    // Infection page function
    public void infectionPage(){

        Intent intent5 = new Intent(this,Infection.class);
        startActivity(intent5);

    }


}
