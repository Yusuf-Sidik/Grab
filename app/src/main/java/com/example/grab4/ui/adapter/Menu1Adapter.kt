package com.example.grab4.ui.adapter


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.grab4.R
import com.example.grab4.ui.dataclass.Menu1
import de.hdodenhof.circleimageview.CircleImageView

class Menu1Adapter(private val listmenu1: ArrayList<Menu1>): RecyclerView.Adapter<Menu1Adapter.ListViewHolder>() {

    private lateinit var onItemOnClickCallback: OnItemClickCallback

    interface OnItemClickCallback{
        fun onItemClicked(data: Menu1)
    }

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback){
        this.onItemOnClickCallback = onItemClickCallback
    }

    class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        //hanya binding dengan layout saja
        val imgPhoto: CircleImageView = itemView.findViewById(R.id.profile_image)
        val tvName: TextView = itemView.findViewById(R.id.text_view)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_row_menu1, parent, false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val (photo, name) = listmenu1[position]
        holder.imgPhoto.setImageResource(photo)
        holder.tvName.text = name
        holder.itemView.setOnClickListener{
            onItemOnClickCallback.onItemClicked(listmenu1[holder.adapterPosition])
        }
    }

    override fun getItemCount(): Int = listmenu1.size
}