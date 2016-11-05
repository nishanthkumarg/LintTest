package com.example.nishanthkumarg.myapplication;

/**
 * Created by nishanthkumarg on 11/3/16.
 */

public class WithInPackage {

    //Lint Check which are not in same package
    LintCheck lc2 = new LintCheck();

    public WithInPackage() {

        lc2.functionPrivate();
        lc2.functionProtected();
        lc2.functionPackagePrivate();
        lc2.functionNone();
    }
}
