package com.example.nishanthkumarg.myapplication;

import android.support.annotation.RestrictTo;

import com.example.mylibrary.LibClass;

/**
 * Created by nishanthkumarg on 11/4/16.
 */

public class ExternalClass {

    BaseClass bc = new BaseClass();
    LibClass lc = new LibClass();

    public ExternalClass() {
        bc.functionPrivate();
        lc.sampleMethod();

    }
    //This method should only access from test classes
    @RestrictTo(RestrictTo.Scope.TESTS)
    public void shouldUsedOnTestclass(){

    }
}
