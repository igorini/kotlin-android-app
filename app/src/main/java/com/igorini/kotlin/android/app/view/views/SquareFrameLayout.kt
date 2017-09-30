package com.igorini.kotlin.android.app.view.views

import android.util.AttributeSet
import android.widget.FrameLayout
import android.content.Context

/** Represents a layout of a square shape */
class SquareFrameLayout @JvmOverloads constructor(
        context: Context,
        attrs: AttributeSet? = null,
        defStyleAttr: Int = 0
) : FrameLayout(context, attrs, defStyleAttr) {
    override fun onMeasure(widthMeasureSpec: Int,
                           heightMeasureSpec: Int) {
        super.onMeasure(widthMeasureSpec, widthMeasureSpec)
    }
}