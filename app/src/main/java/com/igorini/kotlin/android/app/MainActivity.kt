package com.igorini.kotlin.android.app

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.Window
import android.widget.Button
import android.widget.EditText
import org.jetbrains.anko.*

/** Represents a main activity */
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestWindowFeature(Window.FEATURE_NO_TITLE)
        setContentView(R.layout.activity_main)
    }
}

/** Represents a main activity UI */
/*class MainActivityUi : AnkoComponent<MainActivity> {
    private val customStyle = { v: Any ->
        when (v) {
            is Button -> v.textSize = 26f
            is EditText -> v.textSize = 24f
        }
    }

    override fun createView(ui: AnkoContext<MainActivity>) = with(ui) {
        verticalLayout {
            padding = dip(32)
        }.applyRecursively(customStyle)
    }
}*/
