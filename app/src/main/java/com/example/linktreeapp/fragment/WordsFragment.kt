package com.example.linktreeapp.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.linktreeapp.Adapter.WordsAdapter
import com.example.linktreeapp.R

class WordsFragment : Fragment() {
    lateinit var rootView: View
    lateinit var recyclerViewWord: RecyclerView
    lateinit var wordsAdapter: WordsAdapter
    lateinit var listWord: MutableList<String>

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        rootView = inflater.inflate(R.layout.fragment_words, null, false)

        initView()


        return rootView
    }

    private fun initView() {
        recyclerViewWord = rootView.findViewById(R.id.rec_view_words)
        listWord = mutableListOf()

        listWord.add("Kata 1")
        listWord.add("Kata 2")
        listWord.add("Kata 3")
        listWord.add("Kata 4")

        setRecAdapter()
    }

    private fun setRecAdapter() {
        wordsAdapter = WordsAdapter(listWord)

        recyclerViewWord.adapter = wordsAdapter
        recyclerViewWord.layoutManager = LinearLayoutManager(context)
    }
}