package com.example.grab4.ui.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.grab4.R
import com.example.grab4.ui.dataclass.Pembayaran1

class Pembayaran1Adapter(private val listpembayaran1: ArrayList<Pembayaran1>) : RecyclerView.Adapter<Pembayaran1Adapter.ListViewHolder>(){
    class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val tvName: TextView = itemView.findViewById(R.id.textView25)
        val tvAktifkan: TextView = itemView.findViewById(R.id.textView24)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_rv1_pembayaran, parent, false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val (aktifkan, nama) = listpembayaran1[position]
        holder.tvName.text = nama
        holder.tvAktifkan.text = aktifkan
    }

    override fun getItemCount(): Int = listpembayaran1.size

}