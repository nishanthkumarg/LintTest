package com.example.nishanthkumarg.myapplication.lintpackage;

import android.support.annotation.RestrictTo;
import android.support.annotation.VisibleForTesting;

/**
 * Created by nishanthkumarg on 11/3/16.
 */

public class Lintcheck {

    Lintcheck(){

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
