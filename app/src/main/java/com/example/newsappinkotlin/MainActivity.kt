package com.example.newsappinkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity(), NewsItemClicked {
    lateinit var  recyclerviewView: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recyclerviewView = findViewById(R.id.rv_news)
        recyclerviewView.layoutManager = LinearLayoutManager(this)
        val items = fetchdata()
        val adapter = NerwsAdapter(items,this)
        recyclerviewView.adapter =adapter
    }
    private fun fetchdata():ArrayList<String>{
        val list = ArrayList<String>()
        for (i in 0 until 100){
            list.add("Item $i")
        }
        return  list
    }

    override fun onItemClicked(item: String) {
        Toast.makeText(this,"hello $item",Toast.LENGTH_LONG).show()
    }
}