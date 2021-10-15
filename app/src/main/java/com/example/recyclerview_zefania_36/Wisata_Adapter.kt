package com.example.recyclerview_zefania_36

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview_ryuzaalysyahputra_29.R

class Wisata_Adapter(private val context: Context, private val wisata: List<Wisata>, val listener: (Wisata) -> Unit)
    : RecyclerView.Adapter<Wisata_Adapter.AnggotaViewHolder>(){
    class AnggotaViewHolder(view: View): RecyclerView.ViewHolder (view) {

        val imgAnggota = view.findViewById<ImageView>(R.id.img_item_photo)
        val namaAnggota = view.findViewById<TextView>(R.id.tv_item_name)
        val descAnggota = view.findViewById<TextView>(R.id.tv_item_description)

        fun bindView(wisata: Wisata, listener: (Wisata) -> Unit){
            imgAnggota.setImageResource(wisata.imgAnggota)
            namaAnggota.text = wisata.namaAnggota
            descAnggota.text = wisata.descAnggota
            itemView.setOnClickListener{
                listener(wisata)
            }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AnggotaViewHolder {
        return AnggotaViewHolder(
            LayoutInflater.from(context).inflate(R.layout.card_wisata, parent, false)
        )
    }

    override fun onBindViewHolder(holder: AnggotaViewHolder, position: Int) {
        holder.bindView(wisata[position], listener)
    }

    override fun getItemCount(): Int = wisata.size
    }
