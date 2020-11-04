package com.example.connectly;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.LinearInterpolator;

import com.agrawalsuneet.dotsloader.loaders.LazyLoader;

import java.util.Timer;
import java.util.TimerTask;


public class MainActivity extends AppCompatActivity {
    //2) define the time to wait before moving to login activity:
    Timer timer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // 1) Lazy loader icon settings and inimations:
        LazyLoader loader = findViewById(R.id.lazyLoader);
        loader.setAnimDuration(500);
        loader.setFirstDelayDuration(100);
        loader.setSecondDelayDuration(200);
        loader.setInterpolator(new LinearInterpolator());

        //3) moving to login activity after waiting a while:
        timer= new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                Intent moveToLogin = new Intent(MainActivity.this,Login.class);
                startActivity(moveToLogin);
                finish();
            }
        },4000);

        
        // go to Post Job screen
        findViewById(R.id.splashLogo).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,ViewRequsteActivity.class));
            }
        });
    }
}