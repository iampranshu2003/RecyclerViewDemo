package com.example.recyclerviewdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    val fruitsList = listOf<Fruit>(
        Fruit("Mango", "Mango Supplier"),
        Fruit("Banana", "Banana Supplier"),
        Fruit("Apple", "Apple Supplier"),
        Fruit("Orange", "Orange Supplier"),
        Fruit("Grapes", "Grapes Supplier"),
        Fruit("Pineapple", "Pineapple Supplier")
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val recyclerView = findViewById<RecyclerView>(R.id.myRecyclerView)
        recyclerView.setBackgroundColor(resources.getColor(R.color.teal_200))
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = myRecyclerViewAdapter(fruitsList)
    }
}