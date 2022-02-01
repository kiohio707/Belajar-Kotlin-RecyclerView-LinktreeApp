package com.example.linktreeapp.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.linktreeapp.Adapter.NumbersAdapter
import com.example.linktreeapp.R


class NumbersFragment : Fragment() {
    lateinit var rootView: View
    lateinit var numberRecyclerView: RecyclerView
    lateinit var numberAdapter: NumbersAdapter
    var listNumber: MutableList<Int> = mutableListOf()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        rootView = inflater.inflate(R.layout.fragment_numbers, container, false)

        initView()
        return rootView
    }

    private fun initView() {
        numberRecyclerView = rootView.findViewById(R.id.rec_view_numbers)

        listNumber.add(1)
        listNumber.add(2)
        listNumber.add(3)
        listNumber.add(4)
        listNumber.add(5)

        setRecData()
    }

    private fun setRecData() {
        numberAdapter = NumbersAdapter(listNumber)

        numberRecyclerView.adapter = numberAdapter
        numberRecyclerView.layoutManager = LinearLayoutManager(context)
    }
}