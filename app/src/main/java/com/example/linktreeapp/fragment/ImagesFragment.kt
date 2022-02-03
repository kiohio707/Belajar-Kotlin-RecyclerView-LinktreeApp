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
import com.example.linktreeapp.databinding.FragmentImagesBinding

class ImagesFragment : Fragment() {
    lateinit var binding: FragmentImagesBinding
    lateinit var recyclerView: RecyclerView
    lateinit var imageAdapter:ImagesAdapter
    lateinit var listImage: MutableList<Int>

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentImagesBinding.inflate(inflater, container, false)

        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initView()
    }

    private fun initView() {
        recyclerView = binding.recViewImages

        listImage = mutableListOf(
            R.drawable.photo1,
            R.drawable.photo2,
            R.drawable.photo3,
            R.drawable.photo4
        )

        setRecData()
    }

    private fun setRecData() {
        imageAdapter = ImagesAdapter(requireContext(),listImage)

        recyclerView.adapter = imageAdapter
        recyclerView.layoutManager = GridLayoutManager(context, 2)
    }
}