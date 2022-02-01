package com.example.linktreeapp.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.RelativeLayout
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.linktreeapp.R

class ImagesAdapter(val listImages: MutableList<Int>) : RecyclerView.Adapter<ImagesAdapter.ViewHolder> () {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.adapter_images, null, false),
        listImages)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.setBindView()
    }

    override fun getItemCount(): Int {
        return listImages.size
    }

    class ViewHolder(val view : View, val listImages: MutableList<Int>) : RecyclerView.ViewHolder(view) {
        val ivImages = view.findViewById<ImageView>(R.id.iv_adapter_images)
        val relLayoutImages = view.findViewById<RelativeLayout>(R.id.rel_layout_images)

        fun setBindView() {
            ivImages.setImageResource(listImages[position])

            relLayoutImages.setOnClickListener {
                Toast.makeText(view.context, "${listImages[position]}", Toast.LENGTH_SHORT).show()
            }

        }
    }
}