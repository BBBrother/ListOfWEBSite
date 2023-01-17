package com.example.listofwebsite

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder

class Adapter: RecyclerView.Adapter<ViewHolder>() {

    private val list: MutableList<Any> = mutableListOf()

    companion object {
        private const val GROUP_TYPE = 1
        private const val SITE_TYPE = 2
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder = when(viewType) {
        SITE_TYPE -> {
            val view = LayoutInflater.from(parent.context).inflate(R.layout.rv_item_site, parent, false)
            SiteViewHolder(view)
        }
        GROUP_TYPE -> {
            val view = LayoutInflater.from(parent.context).inflate(R.layout.rv_item_group, parent, false)
            GroupViewHolder(view)
        }
        else -> throw Exception()
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        when(holder) {
         is SiteViewHolder -> holder.onBind(list[position] as SiteData)
         is GroupViewHolder -> holder.onBind(list[position] as GroupData)
        }
    }

    fun setItem(list: List<Any>){
        this.list.clear()
        this.list.addAll(list)
        notifyDataSetChanged()
    }

    override fun getItemCount(): Int = list.size

    override fun getItemViewType(position: Int): Int = when(list[position]) {
        is SiteData -> SITE_TYPE
        is GroupData -> GROUP_TYPE
        else -> throw Exception()
    }
}