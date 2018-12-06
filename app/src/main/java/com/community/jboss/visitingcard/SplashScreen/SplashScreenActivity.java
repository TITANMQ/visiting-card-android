package com.community.jboss.visitingcard.SplashScreen;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import com.community.jboss.visitingcard.IntroScreens.SliderActivity;
import com.community.jboss.visitingcard.R;

public class SplashScreenActivity extends AppCompatActivity {
    private static int SPLASH_TIME = 6000;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_screen_activity);

        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
        fade();
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent sliderIntent = new Intent(SplashScreenActivity.this, SliderActivity.class);
                startActivity(sliderIntent);
                finish();

            }
        }, SPLASH_TIME);


    }

    private void fade() {
        ImageView image = (ImageView) findViewById(R.id.logo);
        Animation fade = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade);
        image.startAnimation(fade);
    }
}
