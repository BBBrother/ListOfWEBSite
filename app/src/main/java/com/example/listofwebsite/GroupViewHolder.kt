package com.example.listofwebsite

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class GroupViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {

    fun onBind(item: GroupData){
        val name = itemView.findViewById<TextView>(R.id.rvNameOfGroup)

        name.text = item.groupName
    }
}