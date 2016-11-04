package com.example.nishanthkumarg.myapplication;

import android.support.annotation.RestrictTo;
import android.support.annotation.VisibleForTesting;

/**
 * Created by nishanthkumarg on 11/3/16.
 */

public class TestRestrClass {

    @VisibleForTesting(otherwise = VisibleForTesting.PRIVATE)
    public void sampleFunction(){

    }
}
