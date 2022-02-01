package com.example.linktreeapp.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.linktreeapp.Adapter.ImagesAdapter
import com.example.linktreeapp.R

class ImagesFragment : Fragment() {
    lateinit var rootView: View
    lateinit var recyclerView: RecyclerView
    lateinit var imageAdapter:ImagesAdapter
    lateinit var listImage: MutableList<Int>

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        rootView = inflater.inflate(R.layout.fragment_images, null, false)

        initView()
        return rootView

    }

    private fun initView() {
        recyclerView = rootView.findViewById(R.id.rec_view_images)

        listImage = mutableListOf(
            R.drawable.photo1,
            R.drawable.photo2,
            R.drawable.photo3,
            R.drawable.photo4
        )

        setRecData()
    }

    private fun setRecData() {
        imageAdapter = ImagesAdapter(listImage)

        recyclerView.adapter = imageAdapter
        recyclerView.layoutManager = GridLayoutManager(rootView.context, 2)
    }
}