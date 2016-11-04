package com.example.nishanthkumarg.myapplication;

import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatDrawableManager;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (Build.VERSION.SDK_INT >= 14) {
            codeRequiresApi14();
        }

        if (Build.VERSION.SDK_INT >= 14 && Build.VERSION.SDK_INT <= 20) {
            codeRequiresApi14And20();
        }

        if (Build.VERSION.SDK_INT >= 14 && Build.VERSION.SDK_INT <= 22) {
            codeRequiresApi14And22();
        }
    }

    private void codeRequiresApi14And20() {
    }

    private void codeRequiresApi14() {
    }

    private void codeRequiresApi14And22() {
    }


}
