package com.example.lap1;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.widget.ImageView;

public class Home_with_navigation extends AppCompatActivity {
    AnimationDrawable animationList,wifi_small_List;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_with_navigation);
        ImageView imageview = (ImageView) findViewById(R.id.wifi_image);
        imageview.setBackgroundResource(R.drawable.sky_bright);
        animationList=(AnimationDrawable) imageview.getBackground();
//        animation small wifi animation
        ImageView imageview_wifi_small = (ImageView) findViewById(R.id.wifi_small);
        imageview_wifi_small.setBackgroundResource(R.drawable.wifi_animation);
        wifi_small_List=(AnimationDrawable) imageview_wifi_small.getBackground();
    }

    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);
        animationList.start();
        wifi_small_List.start();
    }
}