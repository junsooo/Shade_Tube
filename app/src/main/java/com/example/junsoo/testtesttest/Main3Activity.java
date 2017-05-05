package com.example.junsoo.testtesttest;

import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import static android.R.attr.button;

/**
 * Created by junsoo on 2017. 4. 29..
 */

public class Main3Activity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main3);

        ImageButton button;
        final ImageButton button_1;
        final ImageButton button_a;
        button = (ImageButton)findViewById(R.id.third_real);

        button_1 = (ImageButton)findViewById(R.id.fourth_real);
        button.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {
                /*Intent intent = new Intent(Main1Activity.this,MainActivity.class);
                startActivity(intent);
                //button_a.setImageResource(R.drawable.test2);
                finish();*/
                button_1.setBackgroundDrawable(null);
                button_1.setImageResource(R.drawable.eye_02);
            }

        });
        button_1.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {
                Intent intent = new Intent(Main3Activity.this,Main2Activity.class);
                startActivity(intent);
                //button_a.setImageResource(R.drawable.test2);
                finish();

            }

        });

    }

}
