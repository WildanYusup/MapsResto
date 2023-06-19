package com.example.mapsresto;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.airbnb.lottie.LottieAnimationView;


//NIM   ; 10120048
//NAMA  ; WILDAN YUSUP
//KELAS ; IF-2

public class splash extends AppCompatActivity {

    LottieAnimationView lottieAnimationView;
    ImageView sd,splashimg;


    @Override
    protected void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_splash);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        sd = findViewById(R.id.sd);
        splashimg = findViewById(R.id.img);
        lottieAnimationView = findViewById(R.id.lottie);


        splashimg.animate().translationY(-2500).setDuration(1000).setStartDelay(5000);
        sd.animate().translationY(2500).setDuration(1000).setStartDelay(5000);
        lottieAnimationView.animate().translationY(1500).setDuration(1000).setStartDelay(5000);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                startActivity(new Intent(splash.this, ViewPager.class));

            }
        },6000);

    }
}
