package com.example.playgames.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.playgames.About
import com.example.playgames.R

// Clase AboutAdapter que extiende de RecyclerView.Adapter y recibe una lista de objetos About como parámetro
class AboutAdapter(private val aboutList:List<About>) : RecyclerView.Adapter<AboutViewHolder>(){

    // Método que se llama cuando se necesita crear un nuevo ViewHolder
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AboutViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return AboutViewHolder(layoutInflater.inflate(R.layout.about_item, parent, false))
    }

    // Método para enlazar cada elemento de la lista con su ViewHolder correspondiente
    override fun onBindViewHolder(holder: AboutViewHolder, position: Int) {
        val item = aboutList[position]
        holder.render(item)
    }

    // Método que devuelve el número de elementos en la lista
    override fun getItemCount(): Int = aboutList.size
}