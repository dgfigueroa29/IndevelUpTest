package com.example.indeveluptest.view.main

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.view.ViewGroupCompat
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.domain.model.Result
import com.example.indeveluptest.R
import com.example.indeveluptest.core.BaseOnSelectItem

class MainAdapter(private val context: Context, private val listener: BaseOnSelectItem<Result>) :
    RecyclerView.Adapter<MainViewHolder>() {
    private var resultList = listOf<Result>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainViewHolder {
        val view = LayoutInflater.from(context).inflate(
            R.layout.list_item,
            parent,
            false
        )
        ViewGroupCompat.setTransitionGroup(view as ViewGroup, true)
        val holder = MainViewHolder(view)

        holder.itemRoot.setOnClickListener {
            listener.onSelectItem(resultList[holder.adapterPosition])
        }

        return holder
    }

    override fun onBindViewHolder(holder: MainViewHolder, position: Int) {
        val result = resultList[position]
        holder.trackNameTv.text = result.trackName
        holder.artistNameTv.text = result.artistName
        Glide.with(context).load(result.artworkUrl60).error(R.mipmap.ic_launcher)
            .placeholder(R.mipmap.ic_launcher).into(holder.trackImage)
    }

    fun setData(newList: List<Result>) {
        resultList = newList
        notifyDataSetChanged()
    }

    override fun getItemCount(): Int = resultList.size
}