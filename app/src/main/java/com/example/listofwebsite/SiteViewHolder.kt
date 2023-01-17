package com.example.listofwebsite

import android.content.Intent
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class SiteViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){

    fun onBind(item: SiteData) {
        val logo = itemView.findViewById<ImageView>(R.id.rvLogoSite)
        val siteName = itemView.findViewById<TextView>(R.id.rvNameSite)
        val button = itemView.findViewById<Button>(R.id.rvButtonGoToSite)

        getLogo(item.logo,logo)
        siteName.text = item.siteName
        button.setOnClickListener {
            try {
                val intent = Intent(Intent.ACTION_VIEW, item.siteUri)
                button.context.startActivity(intent)
            }
            catch (_: Exception) {}
        }
    }

    private fun getLogo(url: String, logo: ImageView){
        Glide.with(logo)
            .load(url)
            .into(logo)
    }
}