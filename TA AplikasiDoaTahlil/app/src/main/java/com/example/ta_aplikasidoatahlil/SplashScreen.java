package com.example.ta_aplikasidoatahlil;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;

public class SplashScreen extends Activity {

    ImageView GambarGif;

    //set waktu lama splash screen
    private static int splashInterval = 4000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(SplashScreen.this, dashboard.class);
                startActivity(i);
                finish();
            }
        }, splashInterval);

        GambarGif = (ImageView)findViewById(R.id.gif);
        Glide.with(SplashScreen.this).load(R.drawable.gifs).asGif().diskCacheStrategy(DiskCacheStrategy.SOURCE).into(GambarGif);
    }
}