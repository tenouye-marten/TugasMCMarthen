package com.example.tugas4marthen

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyAdapter (private val namList: ArrayList<ItemData>): RecyclerView.Adapter<MyAdapter.MyViewHolder>() {

    class MyViewHolder(itemData: View) : RecyclerView.ViewHolder (itemData){

        val gambar : ImageView =itemData.findViewById(R.id.gbr)
        val jdl : TextView = itemData.findViewById(R.id.judul)
        val desk : TextView = itemData.findViewById(R.id.deskripsi)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {

        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.data_layout,parent, false)
        return MyViewHolder(itemView)


    }

    override fun getItemCount(): Int {

        return namList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {


        val currentItem: ItemData = namList[position]
        holder.gambar.setImageResource(currentItem.gambar)
        holder.jdl.text = currentItem.judul
        holder.desk.text = currentItem.deskripsi
    }


}
