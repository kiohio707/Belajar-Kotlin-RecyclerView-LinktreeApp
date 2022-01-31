package com.example.linktreeapp.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RelativeLayout
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.linktreeapp.R

class WordsAdapter(private val listWords : MutableList<String>) : RecyclerView.Adapter<WordsAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.adapter_words, null, false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.setDataToView(listWords)

    }

    override fun getItemCount(): Int {
        return listWords.size
    }

    class ViewHolder (val view: View) : RecyclerView.ViewHolder(view) {
        val tvWords = view.findViewById<TextView>(R.id.tv_adapter_words)
        val relativeLayout = view.findViewById<RelativeLayout>(R.id.rel_layout_words)


        fun setDataToView(listWords: MutableList<String>) {
            tvWords.text = listWords[position]
            
            relativeLayout.setOnClickListener {
                Toast.makeText(view.context, listWords[position], Toast.LENGTH_SHORT).show()
            }
        }
    }
}
