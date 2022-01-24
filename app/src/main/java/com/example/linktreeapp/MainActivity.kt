package com.example.linktreeapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar?.hide()

        val image = findViewById<ImageView>(R.id.iv_profile_picture)
        val name = findViewById<TextView>(R.id.tv_name)
        val desc = findViewById<TextView>(R.id.tv_description)

        image.setImageResource(R.drawable.profile_picture)
    }
}