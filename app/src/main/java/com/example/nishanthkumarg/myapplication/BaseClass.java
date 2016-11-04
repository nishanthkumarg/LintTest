package com.example.nishanthkumarg.myapplication;

import android.support.annotation.RestrictTo;

import com.example.nishanthkumarg.myapplication.lintpackage.Lintcheck;

import static android.support.annotation.RestrictTo.Scope.GROUP_ID;

/**
 * Created by nishanthkumarg on 11/2/16.
 */

public class BaseClass {

    @RestrictTo(RestrictTo.Scope.SUBCLASSES)
    public void baseFunction(){

    }
}
