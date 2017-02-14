package com.example.nishanthkumarg.myapplication;

/**
 * Created by nishanthkumarg on 11/3/16.
 */

public class MyClass {

    LintCheck lc = new LintCheck();

    MyClass(){
        lc.functionNone();
        lc.functionPackagePrivate();
        lc.functionPrivate();
        lc.functionProtected();
    }
}
