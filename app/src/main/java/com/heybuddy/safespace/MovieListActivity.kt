package com.heybuddy.safespace

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.heybuddy.safespace.databinding.ActivityMainBinding
import com.heybuddy.safespace.databinding.ActivityMovieListBinding

class MovieListActivity : AppCompatActivity(){
    lateinit var movieArrList: ArrayList<String>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val bind = ActivityMovieListBinding.inflate(layoutInflater)
        setContentView(bind.root)

        movieArrList = arrayListOf()
        for(i in 1..10)
            movieArrList.add("Title" + i)

        val listView = bind.moiveListView
        listView.adapter = ListViewAdapter(this, movieArrList)

    }
}