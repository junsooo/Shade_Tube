package com.example.junsoo.testtesttest;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

/**
 * Created by junsoo on 2017. 4. 29..
 */

public class SplashActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        try{
            Thread.sleep(2000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }


        startActivity(new Intent(this,Main1Activity.class));
        finish();
    }
}
