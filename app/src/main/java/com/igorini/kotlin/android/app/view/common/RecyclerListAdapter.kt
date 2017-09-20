package com.igorini.kotlin.android.app.view.common

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup

/** Represents an a recycler list adapter */
open class RecyclerListAdapter(
        var items: List<AnyItemAdapter> = emptyList()
) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override final fun getItemCount() = items.size

    override final fun getItemViewType(position: Int) = items[position].layoutId

    override final fun onCreateViewHolder(parent: ViewGroup, layoutId: Int) =
            items.first { it.layoutId == layoutId }.onCreateViewHolder(LayoutInflater.from(parent.context).inflate(layoutId, parent, false))

    override final fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) = items[position].bindViewHolder(holder)
}

typealias AnyItemAdapter = ItemAdapter<out RecyclerView.ViewHolder>