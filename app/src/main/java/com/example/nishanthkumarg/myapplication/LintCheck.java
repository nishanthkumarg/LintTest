package com.example.nishanthkumarg.myapplication;

import android.support.annotation.VisibleForTesting;

/**
 * Created by nishanthkumarg on 11/4/16.
 */

public class LintCheck {

    public LintCheck() {
        functionPrivate();
    }

    @VisibleForTesting(otherwise = VisibleForTesting.PRIVATE)
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
