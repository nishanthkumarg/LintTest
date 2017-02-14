package com.example.nishanthkumarg.myapplication.com.example.nishanthkumarg.newpackage;

import com.example.nishanthkumarg.myapplication.LintCheck;
import com.example.nishanthkumarg.myapplication.WithInPackage;

/**
 * Created by nishanthkumarg on 2/14/17.
 */

public class ExternalClass {

    LintCheck lc = new LintCheck();

    ExternalClass(){
        lc.functionNone();
        lc.functionPackagePrivate();
        lc.functionPrivate();
        lc.functionProtected();

    }
}
