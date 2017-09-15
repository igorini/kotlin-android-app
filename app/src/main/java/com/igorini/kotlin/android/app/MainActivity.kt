package com.igorini.kotlin.android.app

import android.os.Bundle
import android.support.v7.app.AppCompatActivity

/** Represents a main activity*/
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
