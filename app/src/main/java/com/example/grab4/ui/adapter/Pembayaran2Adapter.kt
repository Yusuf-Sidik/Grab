package com.example.grab4.ui.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.grab4.R
import com.example.grab4.ui.dataclass.Pembayaran2

class Pembayaran2Adapter(private val listpembayaran2: ArrayList<Pembayaran2>): RecyclerView.Adapter<Pembayaran2Adapter.ListViewHolder>() {
    class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imgPhoto: ImageView = itemView.findViewById(R.id.imgcard)
        val tvName: TextView = itemView.findViewById(R.id.tv_add_card)
        val tvDescription: TextView = itemView.findViewById(R.id.tv_add_card_desc)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_rv2_pembayaran,parent,false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val (photo, name, description) = listpembayaran2[position]
        holder.imgPhoto.setImageResource(photo)
        holder.tvName.text = name
        holder.tvDescription.text = description
    }

    override fun getItemCount(): Int = listpembayaran2.size
}