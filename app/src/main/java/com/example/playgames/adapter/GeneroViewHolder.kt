package com.example.playgames.adapter

import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.playgames.model.Genero
import com.example.playgames.R

/**
 * Clase GeneroViewHolder que extiende de RecyclerView.ViewHolder y recibe una vista como parámetro
 */
class GeneroViewHolder (view: View) : RecyclerView.ViewHolder(view) {

    /**
     * Elemento de la vista que se enlaza con los datos del objeto Genero
     */
    val nombre = view.findViewById<TextView>(R.id.tvGenero)

    /**
     * Método que se llama para enlazar los datos del objeto Genero con el elemento de la vista
     */
    fun render(GeneroStat: Genero){
        nombre.text = GeneroStat.nombre

        /**
         * Listener para el clic en el elemento de la vista
         */
        itemView.setOnClickListener {
            Toast.makeText(this@GeneroViewHolder.itemView.context, GeneroStat.nombre, Toast.LENGTH_SHORT).show()
        }
    }
}