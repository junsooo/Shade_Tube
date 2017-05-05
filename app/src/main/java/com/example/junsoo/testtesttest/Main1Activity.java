package com.example.junsoo.testtesttest;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import static android.R.attr.button;

/**
 * Created by junsoo on 2017. 4. 29..
 */

public class Main1Activity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main1);



        final ImageButton button;
        final ImageButton button_1;
        final ImageButton button_a;
        button = (ImageButton)findViewById(R.id.first_real);

        button_1 = (ImageButton)findViewById(R.id.first1_real);
        button.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {
                /*Intent intent = new Intent(Main1Activity.this,MainActivity.class);
                startActivity(intent);
                //button_a.setImageResource(R.drawable.test2);
                finish();*/
                Drawable drawable = button.getDrawable();
                if (drawable instanceof BitmapDrawable) {
                    BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
                    Bitmap bitmap = bitmapDrawable.getBitmap();
                    bitmap.recycle();
                }
                button_1.setBackgroundDrawable(null);
                button_1.setImageResource(R.drawable.intro1_real);
            }

        });
        button_1.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {
                Intent intent = new Intent(Main1Activity.this,MainActivity.class);
                startActivity(intent);
                //button_a.setImageResource(R.drawable.test2);
                finish();

            }

        });

    }

}
