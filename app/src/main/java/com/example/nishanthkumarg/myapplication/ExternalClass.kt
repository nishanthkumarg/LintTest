package com.example.nishanthkumarg.myapplication

import android.support.annotation.RestrictTo


/**
 * Created by nishanthkumarg on 11/4/16.
 */

class ExternalClass {

    internal var bc = BaseClass()

    init {
        bc.restrictScopeSubClass()
    }

    //This method should only access from test classes
    @RestrictTo(RestrictTo.Scope.TESTS)
    fun shouldUsedOnTestclass() {

    }
}
