package com.igorini.kotlin.android.app.view.common

import android.app.Activity
import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.ImageView
import com.bumptech.glide.Glide

fun <T : View> Activity.bindView(viewId: Int) = lazy { findViewById<T>(viewId) }

fun <T : View> RecyclerView.ViewHolder.bindView(viewId: Int) = lazy { itemView.findViewById<T>(viewId) }

fun ImageView.loadImage(photoUrl: String) = Glide.with(context).load(photoUrl).into(this)
