package com.example.listofwebsite

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listOfView = Server.getView()
        val recycler = findViewById<RecyclerView>(R.id.rvListOfWEBSite)
        val adapter = Adapter()

        recycler.adapter = adapter
        recycler.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        adapter.setItem(listOfView)

        val listOfViewNew = Server.getView()
        adapter.setItem(listOfViewNew)
    }
}