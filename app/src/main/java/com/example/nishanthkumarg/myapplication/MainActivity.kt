package com.example.nishanthkumarg.myapplication

import android.animation.ObjectAnimator
import android.content.Context
import android.net.wifi.WifiManager
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.AppCompatDrawableManager
import android.widget.ImageView

import com.example.mylibrary.LibraryClass
import com.example.mylibrary.LibraryGroupClass


class MainActivity : AppCompatActivity() {
    private var flipOutView: ImageView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
        flipOutView = ImageView(this)
        AppCompatDrawableManager.get().getDrawable(this, R.mipmap.ic_launcher)
        val groupclass = LibraryGroupClass()
        val lc = LibraryClass()
        lc.sampleMethod()
    }

    private fun animatorTest() {
        //ObjectAnimator flipOutAnimator = ObjectAnimator.ofFloat(this, "FlipOutView", 0, 90);
        // ObjectAnimator flipOutAnimator1 = ObjectAnimator.ofFloat(this, "FlipOutView1", 0, 90);

    }

    fun setFlipOutView(abc: Float) {
        //      android.support.v7.widget.DividerItemDecoration rr = new DividerItemDecoration(this, 12);
    }

    fun setFlipOutView1(abc: Float) {

    }
}
