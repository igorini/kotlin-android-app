package com.igorini.kotlin.android.app.view.common

import android.support.v7.widget.RecyclerView
import android.support.annotation.LayoutRes
import android.view.View

/** Represents an item adapter */
abstract class ItemAdapter<T : RecyclerView.ViewHolder>(@LayoutRes open val layoutId: Int) {
    abstract fun onCreateViewHolder(itemView: View): T

    @Suppress("UNCHECKED_CAST")
    fun bindViewHolder(holder: RecyclerView.ViewHolder) = (holder as T).onBindViewHolder()

    abstract fun T.onBindViewHolder()
}