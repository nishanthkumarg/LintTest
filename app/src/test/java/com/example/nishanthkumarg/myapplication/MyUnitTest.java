package com.example.nishanthkumarg.myapplication;

import com.example.nishanthkumarg.myapplication.lintpackage.Lintcheck;

/**
 * Created by nishanthkumarg on 11/3/16.
 */

public class MyUnitTest {

    TestRestrClass  tcls = new TestRestrClass();


    MyUnitTest(){
        tcls.functionProtected();
        tcls.functionNone();
        tcls.functionPackagePrivate();
        tcls.functionPrivate();
    }
}
