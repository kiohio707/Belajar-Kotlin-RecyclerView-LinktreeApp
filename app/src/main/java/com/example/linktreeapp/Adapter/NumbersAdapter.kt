package com.example.linktreeapp.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RelativeLayout
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.linktreeapp.R

class NumbersAdapter(val listNumber: MutableList<Int>) : RecyclerView.Adapter<NumbersAdapter.ViewHolder> () {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.adapter_numbers, null, false),
        listNumber)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.setBindView()
    }

    override fun getItemCount(): Int {
        return listNumber.size
    }

    class ViewHolder(val view : View, val listNumber: MutableList<Int>) : RecyclerView.ViewHolder(view) {
        val tvNumbers = view.findViewById<TextView>(R.id.tv_adapter_number)
        val relLayoutNumber = view.findViewById<RelativeLayout>(R.id.rel_layout_numbers)

        fun setBindView() {
            tvNumbers.text = listNumber[position].toString()

            relLayoutNumber.setOnClickListener {
                Toast.makeText(view.context, "${listNumber[position]}", Toast.LENGTH_SHORT).show()
            }

        }
    }
}