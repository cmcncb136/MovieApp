package com.heybuddy.safespace

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.Button
import android.widget.TextView

class ListViewAdapter(val context: Context, val movieArrList:ArrayList<String>): BaseAdapter() {
    override fun getCount(): Int {
        return movieArrList.size
    }

    override fun getItem(position: Int): Any {
        return movieArrList.get(position)
    }

    override fun getItemId(position: Int): Long {
        return 0;
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val view = LayoutInflater.from(context).inflate(R.layout.movie_list_view, null)
        val titleTv = view.findViewById<TextView>(R.id.movieTitle)
        val contentTv = view.findViewById<TextView>(R.id.movieExp)
        titleTv.text = movieArrList[position]
        contentTv.text = "Content" + (position + 1)


        return view;
    }
}