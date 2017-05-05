package com.example.junsoo.testtesttest;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageButton;

import static android.R.attr.button;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);
        ImageButton button;

        final ImageButton button_a;
        final ImageButton button_b,button_c;
        button = (ImageButton)findViewById(R.id.first_real);
        button_a = (ImageButton)findViewById(R.id.second_real);
        button_b = (ImageButton)findViewById(R.id.third_real);
        button_c = (ImageButton)findViewById(R.id.fourth_real);
        button.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {
                //Intent intent = new Intent(MainActivity.this,Main2Activity.class);
                //startActivity(intent);
                button_a.setImageResource(R.drawable.main_02);
            }

        });

        button_a.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Main3Activity.class);
                startActivity(intent);
                //button_b.setImageResource(R.drawable.eye_01);
            }

        });/*
        button_b.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {
                //Intent intent = new Intent(MainActivity.this,Main2Activity.class);
                //startActivity(intent);
                button_c.setImageResource(R.drawable.eye_02);
            }

        });
    */
    }


}
