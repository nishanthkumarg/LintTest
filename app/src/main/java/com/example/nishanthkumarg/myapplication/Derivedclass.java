package com.example.nishanthkumarg.myapplication;


import com.example.mylibrary.LibClass;
import com.example.nishanthkumarg.myapplication.lintpackage.Lintcheck;

/**
 * Created by nishanthkumarg on 11/2/16.
 */

public class Derivedclass extends BaseClass{

    BaseClass bc = new BaseClass();
    LibClass lb = new LibClass();
    TestRestrClass tcls = new TestRestrClass();

    Derivedclass(){
        bc.baseFunction();
        lb.function();
    }
}
