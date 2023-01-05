package com.dhivya.navigationdrawer

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RecyclerAdapter(
    private var ItemList: List<Travel>
) : RecyclerView.Adapter<RecyclerAdapter.ViewHolder>() {
    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val itemTitle: TextView = itemView.findViewById(R.id.tvName)
        val itemDetail: TextView = itemView.findViewById(R.id.tvDescription)
        val itemPicture: ImageView = itemView.findViewById(R.id.ivThumbnail)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v: View = LayoutInflater.from(parent.context).inflate(
            R.layout.item_list,
            parent,
            false
        )
        return ViewHolder(v)
    }

    override fun getItemCount(): Int {
        return ItemList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item: Travel = ItemList.get(position)
        holder.itemTitle.text = item.name
        holder.itemDetail.text = item.description
        holder.itemPicture.setImageResource(item.image)
    }
}
