package com.example.nishanthkumarg.myapplication;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.AppCompatDrawableManager;
import android.widget.ImageView;

import com.example.mylibrary.LibraryClass;
import com.example.mylibrary.LibraryGroupClass;


public class MainActivity extends AppCompatActivity {
    private final ImageView flipOutView = new ImageView(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        AppCompatDrawableManager.get().getDrawable(this,R.mipmap.ic_launcher);
        LibraryGroupClass groupclass = new LibraryGroupClass();
        LibraryClass lc = new LibraryClass();
        lc.sampleMethod();
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
}
