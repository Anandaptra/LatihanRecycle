package com.example.latihanrecycle

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class NewsAdapter (var listNews : ArrayList<ListNews>) : RecyclerView.Adapter<NewsAdapter.ViewHolder>(){

    class ViewHolder (view : View) : RecyclerView.ViewHolder(view) {
        var judul = view.findViewById<TextView>(R.id.txtJudul)
        var tanggal = view.findViewById<TextView>(R.id.txtTanggal)
        var kategr = view.findViewById<TextView>(R.id.txtKategori)
        var gmbr = view.findViewById<ImageView>(R.id.imgNews)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.item_news, parent, false)
        return ViewHolder(view)
    }


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.judul.text = listNews[position].judulNews
        holder.tanggal.text = listNews[position].tanggalNews
        holder.kategr.text = listNews[position].Kategori
        holder.gmbr.setImageResource(listNews[position].img)
    }

    override fun getItemCount(): Int {
        return listNews.size
    }


}