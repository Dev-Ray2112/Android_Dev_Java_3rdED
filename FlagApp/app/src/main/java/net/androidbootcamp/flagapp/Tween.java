package net.androidbootcamp.flagapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import java.util.Timer;
import java.util.TimerTask;

public class Tween extends AppCompatActivity {
    //int timeInMilliSec = 10000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tween);
        ImageView imgFade = (ImageView)findViewById(R.id.imgTween);
        imgFade.startAnimation(AnimationUtils.loadAnimation(Tween.this,
                        R.anim.fade));
        // fade timer set
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                finish();
                startActivity(new Intent(Tween.this, Tween.class));
            }
        };
        Timer opening = new Timer();
        opening.schedule(task, 10000);
    }
}

