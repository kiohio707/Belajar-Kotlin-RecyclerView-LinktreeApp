package com.example.linktreeapp.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.linktreeapp.Model.LinkModel
import com.example.linktreeapp.R

class LinkAdapter (
    val items: List<LinkModel>,
    val listener: AdapterListener
    ): RecyclerView.Adapter<LinkAdapter.ViewHolder>(){

    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        val image = itemView.findViewById<ImageView>(R.id.iv_adapter_link)
        val title = itemView.findViewById<TextView>(R.id.tv_adapter_link)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
       return ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.adapter_link, parent, false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = items[position]
        holder.image.setImageResource(item.image)
        holder.title.text = item.title

        holder.itemView.setOnClickListener {
            listener.onClick(item)
        }
    }

    override fun getItemCount(): Int {
        return items.size
    }

    interface AdapterListener {
        fun onClick(linkModel: LinkModel)
    }
}