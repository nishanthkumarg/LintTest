package com.example.nishanthkumarg.myapplication;

import android.content.Context;
import android.hardware.fingerprint.FingerprintManager;
import android.location.LocationManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.widget.AbsoluteLayout;
import android.widget.ImageView;

//import android.support.v7.widget.DividerItemDecoration;

public class MainActivity extends AppCompatActivity {
    private final ImageView flipOutView = new ImageView(this);

    private final Handler mLeakyHandler = new Handler(){
        @Override
        public void handleMessage(Message msg) {

        }
    };



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        android.widget.AbsoluteLayout la = new AbsoluteLayout(this);
        FingerprintManager fingerprintManager = getSystemService(FingerprintManager.class);
        ((LocationManager)getSystemService(Context.LOCATION_SERVICE)).getLastKnownLocation("test");


    }
}
