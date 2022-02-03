package com.example.linktreeapp.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.linktreeapp.databinding.AdapterImagesBinding

class ImagesAdapter(val context: Context, val listImages: MutableList<Int>) : RecyclerView.Adapter<ImagesAdapter.ViewHolder> () {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(AdapterImagesBinding.inflate(LayoutInflater.from(parent.context), null, false),
        listImages, context)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.setBindView()

    }

    override fun getItemCount(): Int {
        return listImages.size
    }

    class ViewHolder(val binding: AdapterImagesBinding, val listImages: MutableList<Int>, val context: Context) : RecyclerView.ViewHolder(binding.root) {

        fun setBindView() {
            binding.ivAdapterImages.setImageResource(listImages[position])

            binding.relLayoutImages.setOnClickListener {
                Toast.makeText(context, "${listImages[position]}", Toast.LENGTH_SHORT).show()
            }

        }
    }
}