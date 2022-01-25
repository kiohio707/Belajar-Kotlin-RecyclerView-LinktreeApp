package com.example.linktreeapp.Activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.linktreeapp.Adapter.RandomAdapter
import com.example.linktreeapp.R

class RandomActivity : AppCompatActivity() {
    lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_string)

        initView()

        val strings = listOf<String>(
            "Coba1",
            "Coba2",
            "Coba3",
            "Coba4",
            "Coba5"
        )

        Log.e("RandomActivity", "size ${strings.size}")

        val randomAdapter = RandomAdapter(strings)

        recyclerView.adapter = randomAdapter
        recyclerView.layoutManager = LinearLayoutManager(this)

    }

    private fun initView() {
        recyclerView = findViewById(R.id.recycler_view_random)
    }
}