package com.igorini.kotlin.android.app.view.main

import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import com.igorini.kotlin.android.app.R
import com.igorini.kotlin.android.app.model.Cat
import com.igorini.kotlin.android.app.view.common.ItemAdapter
import com.igorini.kotlin.android.app.view.common.bindView
import com.igorini.kotlin.android.app.view.common.loadImage

/** Represents an item adapter for a cat icon */
class CatItemAdapter(
        val character: Cat
) : ItemAdapter<CatItemAdapter.ViewHolder>(R.layout.icon) {

    override fun onCreateViewHolder(itemView: View) = ViewHolder(itemView)

    override fun ViewHolder.onBindViewHolder() {
        textView.text = character.name
        imageView.loadImage(character.imageUrl)
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val textView by bindView<TextView>(R.id.textView)
        val imageView by bindView<ImageView>(R.id.imageView)
    }
}