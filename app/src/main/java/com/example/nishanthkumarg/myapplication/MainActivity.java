package com.example.nishanthkumarg.myapplication;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.support.annotation.Keep;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatDrawableManager;
//import android.support.v7.widget.DividerItemDecoration;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private final ImageView flipOutView = new ImageView(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        WifiManager wifi = (WifiManager)getSystemService(Context.WIFI_SERVICE);
        WifiManager wifi1 = (WifiManager)getApplicationContext().getSystemService(Context.WIFI_SERVICE);

        if (Build.VERSION.SDK_INT >= 14) {
            codeRequiresApi14();
        }

        if (Build.VERSION.SDK_INT >= 14 && Build.VERSION.SDK_INT <= 20) {
            codeRequiresApi14And20();
        }

        if (Build.VERSION.SDK_INT >= 14 && Build.VERSION.SDK_INT <= 22) {
            codeRequiresApi14And22();
        }
        animatorTest();
    }

    private void animatorTest(){
        ObjectAnimator flipOutAnimator = ObjectAnimator.ofFloat(this, "FlipOutView", 0, 90);
        ObjectAnimator flipOutAnimator1 = ObjectAnimator.ofFloat(this, "FlipOutView1", 0, 90);

    }

    public void setFlipOutView(float abc){
  //      android.support.v7.widget.DividerItemDecoration rr = new DividerItemDecoration(this, 12);
    }

    public void setFlipOutView1(float abc){

    }


    private void codeRequiresApi14And20() {
    }


    private void codeRequiresApi14() {
    }

    private void codeRequiresApi14And22() {
    }


}
