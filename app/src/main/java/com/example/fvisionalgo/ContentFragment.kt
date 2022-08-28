package com.example.fvisionalgo

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.fvisionalgo.pathfinder.TutorialActivity
import com.example.fvisionalgo.searching.SearchingActivity
import com.example.fvisionalgo.sorting.SortingActivity
import kotlinx.android.synthetic.main.fragment_content.*

class ContentFragment: Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        requireActivity().window.statusBarColor = resources.getColor(R.color.dark)
        return inflater.inflate(R.layout.fragment_content, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        sorting.setOnClickListener {
            startActivity(Intent(context, SortingActivity::class.java))
        }

        searching.setOnClickListener {
            startActivity(Intent(context, SearchingActivity::class.java))
        }

        pathfinding.setOnClickListener {
            startActivity(Intent(context, TutorialActivity::class.java))
        }

    }
}