package com.elitcoder.esoJaniapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import com.elitcoder.esoJaniapp.databinding.ActivitySplashBinding;

@SuppressLint("CustomSplashScreen")
public class SplashActivity extends AppCompatActivity {
    ActivitySplashBinding splashBinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        splashBinding = ActivitySplashBinding.inflate(getLayoutInflater());
        View view = splashBinding.getRoot();
        setContentView(view);

        //Animation :
        animationStart();
        //Splash handle :
        hanler();
    }

    private void hanler() {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashActivity.this,ContentActivity.class);
                startActivity(intent);
                finish();
            }
        },3000);
    }

    private void animationStart() {
        Animation animation = AnimationUtils.loadAnimation(this, R.anim.zoom_animation);
        splashBinding.appLogo.startAnimation(animation);
    }
}