package com.example.nishanthkumarg.myapplication;

/**
 * Created by nishanthkumarg on 11/3/16.
 */

public class MyUnitTest {

    WithInPackage tcls = new WithInPackage();


    MyUnitTest(){
        tcls.functionProtected();
        tcls.functionNone();
        tcls.functionPackagePrivate();
        tcls.functionPrivate();
    }
}
