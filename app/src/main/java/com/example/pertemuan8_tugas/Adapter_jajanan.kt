package com.example.pertemuan8_tugas

import android.system.Os.bind
import android.text.Layout
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.list_jajanan.view.*

class Adapter_jajanan (val ds_jajanan:List<Jajanan>, val clickListener: (Jajanan) -> Unit) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.list_jajanan, parent, false)

        return jajanan_viewholder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {

        (holder as jajanan_viewholder).bind(ds_jajanan[position], clickListener)

    }

    override fun getItemCount(): Int = ds_jajanan.size

    class jajanan_viewholder (itemView: View) : RecyclerView.ViewHolder(itemView){

        fun bind(jajanan_data: Jajanan, clickListener: (Jajanan) -> Unit){

            itemView.iv_gambarjajanan.setImageResource(jajanan_data.gambar_jajanan)
            itemView.tv_namajajanan.text = jajanan_data.nama_jajanan
            itemView.tv_hargajajanan.text = jajanan_data.harga_jajanan.toString()
            itemView.setOnClickListener{clickListener(jajanan_data)}

        }
    }

}
