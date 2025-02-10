package com.example.grab4.ui.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.grab4.R
import com.example.grab4.ui.dataclass.Menu3

class Menu3Adapter(private val listmenu3: ArrayList<Menu3>): RecyclerView.Adapter<Menu3Adapter.ListViewHolder>() {
    class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imgPhoto: ImageView = itemView.findViewById(R.id.imageView)
        val tvName: TextView = itemView.findViewById(R.id.textView6)
        val tvDiskon: TextView = itemView.findViewById(R.id.textView7)
        val tvDescription: TextView = itemView.findViewById(R.id.textView8)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_row_menu3, parent, false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val (photo, name, diskon, description) = listmenu3[position]
        holder.imgPhoto.setImageResource(photo)
        holder.tvName.text = name
        holder.tvDiskon.text = diskon
        holder.tvDescription.text = description
    }

    override fun getItemCount(): Int = listmenu3.size
}