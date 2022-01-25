package com.example.linktreeapp.Activity

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.linktreeapp.Adapter.LinkAdapter
import com.example.linktreeapp.Model.LinkModel
import com.example.linktreeapp.R
import com.google.android.material.button.MaterialButton

const val TAG: String = "MainActivity"

class MainActivity : AppCompatActivity() {

    lateinit var ivProfile: ImageView
    lateinit var tvName: TextView
    lateinit var tvDesc: TextView
    lateinit var recyclerView: RecyclerView
    lateinit var mbtnNext: MaterialButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar?.hide()

        initView()

        ivProfile.setImageResource(R.drawable.profile_picture)
        tvName.setText("Fernata Firdaus Purba")
        tvDesc.setText("Mobile Developer")

        recyclerView.adapter = linkTree

        mbtnNext.setOnClickListener {
            startActivity(Intent(this, RandomActivity::class.java))
        }


    }

    fun initView() {
        ivProfile = findViewById<ImageView>(R.id.iv_profile_picture_main)
        tvName = findViewById<TextView>(R.id.tv_name_main)
        tvDesc = findViewById<TextView>(R.id.tv_description_main)
        recyclerView = findViewById<RecyclerView>(R.id.recycler_view_main)
        mbtnNext = findViewById<MaterialButton>(R.id.mbtn_next_main)
    }

    val linkTree by lazy {
        val items = listOf<LinkModel>(
            LinkModel("fernata707@gmail.com", R.drawable.ic_gmail, "https://mail.google.com/mail/?view=cm&fs=1&to=fernata707@gmail.com"),
            LinkModel("Fernata Firdaus Purba", R.drawable.ic_linkedin, "https://www.linkedin.com/in/fernatafirdaus/"),
            LinkModel("kiohio707#2819", R.drawable.ic_discord, "https://discordapp.com/users/343322265024200705/"),
            LinkModel("kiohio707", R.drawable.ic_steam, "https://steamcommunity.com/id/kiohio707/")
        )
        LinkAdapter(items, object : LinkAdapter.AdapterListener {
            override fun onClick(linkModel: LinkModel) {
                openURL(linkModel.link)
            }
        })
    }

    fun openURL(url: String) {
        val openURL = Intent(Intent.ACTION_VIEW)
        openURL.data = Uri.parse(url)
        startActivity(openURL)
    }

}