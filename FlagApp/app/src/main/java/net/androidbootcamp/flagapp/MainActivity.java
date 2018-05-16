package net.androidbootcamp.flagapp;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        final AnimationDrawable flagsAnimation;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView imgFrame = (ImageView)findViewById(R.id.imgFlags);

        imgFrame.setBackgroundResource(R.drawable.animation);
        flagsAnimation = (AnimationDrawable)imgFrame.getBackground();

        Button button1 = (Button)findViewById(R.id.btnStart);
        Button button2 = (Button)findViewById(R.id.btnStop);

            button1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    flagsAnimation.start();
                }
            });
            button2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    flagsAnimation.stop();
                    startActivity(new Intent(MainActivity.this, Tween.class));
                }
           });
    }
}
