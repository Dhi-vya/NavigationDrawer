package com.dhivya.navigationdrawer

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class DataAdapter (
    private val context: Context,
    private val ImgUrls: ArrayList<String>
) :
    RecyclerView.Adapter<DataAdapter.ViewHolder>() {
    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): ViewHolder {
        val view = LayoutInflater.from(viewGroup.context)
            .inflate(R.layout.list_item, viewGroup, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(viewHolder: ViewHolder, i: Int) {
//        Log.e("URLS: ", ImgUrls[i])
        Glide.with(context).load(ImgUrls[i]).override(800, 800).into(viewHolder.img)
    }

    override fun getItemCount(): Int {
        return ImgUrls.size
    }

    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        var img: ImageView

        init {
            img =
                view.findViewById<View>(R.id.img) as ImageView
        }
    }

}
