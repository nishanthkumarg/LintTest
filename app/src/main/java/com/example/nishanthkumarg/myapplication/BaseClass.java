package com.example.nishanthkumarg.myapplication;

import android.support.annotation.RestrictTo;

/**
 * Created by nishanthkumarg on 11/4/16.
 */

public class BaseClass {

    public BaseClass() {
        restrictScopeSubClass();
    }

    @RestrictTo(RestrictTo.Scope.SUBCLASSES)
    public void restrictScopeSubClass(){

    }

    public void functionPackagePrivate(){

    }


    public void functionProtected(){

    }


    public void functionNone(){

    }
}
