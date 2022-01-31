package com.example.linktreeapp.Activity

import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import com.example.linktreeapp.R
import com.example.linktreeapp.fragment.ImagesFragment
import com.example.linktreeapp.fragment.NumbersFragment
import com.example.linktreeapp.fragment.WordsFragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class RandomActivity : AppCompatActivity(), BottomNavigationView.OnNavigationItemSelectedListener {
    lateinit var btmNavRandom: BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_random)

        initView()

        val strings = listOf(
            "Coba1",
            "Coba2",
            "Coba3",
            "Coba4",
            "Coba5"
        )

        btmNavRandom.setOnItemSelectedListener(this)

    }

    private fun initView() {
        btmNavRandom = findViewById(R.id.btm_nav_random)

        supportFragmentManager.beginTransaction().replace(R.id.frag_container_random, WordsFragment()).commit()

    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        item.isChecked = true
        when(item.itemId) {
            R.id.menu_words -> supportFragmentManager.beginTransaction().replace(R.id.frag_container_random, WordsFragment()).commit()
            R.id.menu_numbers -> supportFragmentManager.beginTransaction().replace(R.id.frag_container_random, NumbersFragment()).commit()
            R.id.menu_images -> supportFragmentManager.beginTransaction().replace(R.id.frag_container_random, ImagesFragment()).commit()
        }

        return false
    }
}