package com.example.playgames.adapter

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.playgames.About
import com.example.playgames.R

// Clase AboutViewHolder que extiende de RecyclerView.ViewHolder y recibe una vista como parámetro
class AboutViewHolder (view: View) : RecyclerView.ViewHolder(view) {

    // Elementos de la vista que se van a mostrar
    val nombre = view.findViewById<TextView>(R.id.tvAboutNombre)
    val numero = view.findViewById<TextView>(R.id.tvAboutNumero)
    val imagen = view.findViewById<ImageView>(R.id.ivAbout)

    // Método para enlazar los datos del objeto About con los elementos de la vista
    fun render(AboutStat: About){
        nombre.text = AboutStat.nombre
        numero.text = AboutStat.numero.toString()
        imagen.setImageResource(AboutStat.imagen)

        // Manejar el clic en el elemento de la vista
        itemView.setOnClickListener {
            Toast.makeText(this@AboutViewHolder.itemView.context, AboutStat.nombre, Toast.LENGTH_SHORT).show()
        }

    }
}