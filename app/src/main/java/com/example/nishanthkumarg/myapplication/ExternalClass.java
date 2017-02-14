package com.example.nishanthkumarg.myapplication;

import android.support.annotation.RestrictTo;


/**
 * Created by nishanthkumarg on 11/4/16.
 */

public class ExternalClass {

    BaseClass bc = new BaseClass();


    public ExternalClass() {
        bc.restrictScopeSubClass();
    }

    //This method should only access from test classes
    @RestrictTo(RestrictTo.Scope.TESTS)
    public void shouldUsedOnTestclass(){

    }
}
