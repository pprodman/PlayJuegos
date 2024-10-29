package com.example.playgames.adapter

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.playgames.About
import com.example.playgames.Genero
import com.example.playgames.R

// Clase GeneroViewHolder que extiende de RecyclerView.ViewHolder y recibe una vista como parámetro
class GeneroViewHolder (view: View) : RecyclerView.ViewHolder(view) {

    // Elementos de la vista que se van a mostrar
    val nombre = view.findViewById<TextView>(R.id.tvGenero)

    // Método para enlazar los datos del objeto Genero con los elementos de la vista
    fun render(GeneroStat: Genero){
        nombre.text = GeneroStat.nombre

        // Manejar el clic en el elemento de la vista
        itemView.setOnClickListener {
            Toast.makeText(this@GeneroViewHolder.itemView.context, GeneroStat.nombre, Toast.LENGTH_SHORT).show()
        }
    }
}