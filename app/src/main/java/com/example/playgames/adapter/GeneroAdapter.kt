package com.example.playgames.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.playgames.model.Genero
import com.example.playgames.R

/**
 * Clase GeneroAdapter que extiende de RecyclerView.Adapter y recibe una lista de objetos Genero como parámetro
 */
class GeneroAdapter(private val generoList:List<Genero>) : RecyclerView.Adapter<GeneroViewHolder>(){

    /**
     * Método que se llama cuando se necesita crear un nuevo ViewHolder
     */
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GeneroViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return GeneroViewHolder(layoutInflater.inflate(R.layout.genero_item, parent, false))
    }

    /**
     * Método que se llama para enlazar los datos de un objeto Genero con su correspondiente ViewHolder
     */
    override fun onBindViewHolder(holder: GeneroViewHolder, position: Int) {
        val item = generoList[position]
        holder.render(item)
    }

    /**
     * Método que devuelve el número de elementos en la lista
     */
    override fun getItemCount(): Int = generoList.size


}