package com.todobom.scanit;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_screen);
    }

    public static Intent makeIntent (Context context)
    {
        return new Intent(context, SplashScreen.class);
    }

    @Override
    public void onStart()
    {
        super.onStart();

        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                finish();
            }
        }, 3000);
    }
}
