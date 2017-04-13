package com.example.nishanthkumarg.myapplication;

import android.support.annotation.RestrictTo;
import android.support.annotation.VisibleForTesting;

/**
 * Created by nishanthkumarg on 11/3/16.
 */

public class TestRestrClass {

    public TestRestrClass() {
        functionPrivate();
    }

    @VisibleForTesting(otherwise = VisibleForTesting.PACKAGE_PRIVATE)
    public void functionPrivate(){

    }

    @VisibleForTesting(otherwise = VisibleForTesting.PACKAGE_PRIVATE)
    public void functionPackagePrivate(){

    }

    @VisibleForTesting(otherwise = VisibleForTesting.PROTECTED)
    public void functionProtected(){

    }

    @VisibleForTesting(otherwise = VisibleForTesting.NONE)
    public void functionNone(){

    }
}
