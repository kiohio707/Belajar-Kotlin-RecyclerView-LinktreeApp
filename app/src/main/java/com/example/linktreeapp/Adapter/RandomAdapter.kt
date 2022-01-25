package com.example.linktreeapp.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.linktreeapp.R

class RandomAdapter(
    val listString: List<String>
) : RecyclerView.Adapter<RandomAdapter.ViewHolder>() {

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val textView = itemView.findViewById<TextView>(R.id.tv_adapter_random)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = ViewHolder(
        LayoutInflater.from(parent.context).inflate(R.layout.adapter_random, parent, false)
    )

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.textView.text = listString[position]
    }

    override fun getItemCount(): Int = listString.size
}