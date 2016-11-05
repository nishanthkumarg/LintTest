package com.example.nishanthkumarg.myapplication;

import android.support.annotation.RestrictTo;
import android.support.annotation.VisibleForTesting;

/**
 * Created by nishanthkumarg on 11/4/16.
 */

public class BaseClass {

    public BaseClass() {
        functionPrivate();
    }

    @RestrictTo(RestrictTo.Scope.SUBCLASSES)
    public void functionPrivate(){

    }


    public void functionPackagePrivate(){

    }


    public void functionProtected(){

    }


    public void functionNone(){

    }
}
