package com.example.newsappinkotlin

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class NerwsAdapter(private val items:ArrayList<String>): RecyclerView.Adapter<NewsHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewsHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_news,parent,false)
        return NewsHolder(view)

    }

    override fun onBindViewHolder(holder: NewsHolder, position: Int) {

        val currentitem = items[position]
        holder.title.text = currentitem
    }

    override fun getItemCount(): Int {

        return items.size
    }

}
class NewsHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val title:TextView = itemView.findViewById(R.id.title)

}