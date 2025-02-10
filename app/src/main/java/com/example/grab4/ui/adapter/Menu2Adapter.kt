package com.example.grab4.ui.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.grab4.R
import com.example.grab4.ui.dataclass.Menu2

class Menu2Adapter(private val listmenu2: ArrayList<Menu2>): RecyclerView.Adapter<Menu2Adapter.ListViewHolder>() {
    class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imgPhoto: ImageView = itemView.findViewById(R.id.img_rv2)
        val tvName: TextView = itemView.findViewById(R.id.textView2)
        val tvDescription: TextView = itemView.findViewById(R.id.textView3)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_row_menu2, parent, false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val (photo, name, description) = listmenu2[position]
        holder.imgPhoto.setImageResource(photo)
        holder.tvName.text = name
        holder.tvDescription.text = description
    }

    override fun getItemCount(): Int = listmenu2.size
}