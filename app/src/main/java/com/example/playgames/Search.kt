package com.example.playgames

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.chip.Chip
import com.google.android.material.chip.ChipGroup

class Search : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.search)

        val listView = findViewById<ListView>(R.id.listaGeneros)
        val generos = listOf(
            "Acción",
            "Aventura",
            "Deportes",
            "Disparos",
            "Estrategia",
            "Lucha",
            "Musical",
            "Rol",
            "Simulación"
        )

        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, generos)
        listView.adapter = adapter

        val chipGroup = findViewById<ChipGroup>(R.id.chipgroup)

        chipGroup.setOnCheckedStateChangeListener { group, checkedIds ->
            val plataformasSeleccionadas = checkedIds.mapNotNull { checkedId ->
                group.findViewById<Chip>(checkedId)?.text.toString()
            }

            // Mostrar un Toast con los géneros seleccionados
            val selectedGenresString = plataformasSeleccionadas.joinToString(", ")
            Toast.makeText(
                this,
                "Plataformas seleccionadas: $selectedGenresString",
                Toast.LENGTH_SHORT
            ).show()


            val generosSeleccionados = mutableListOf<String>()
            for (id in checkedIds) {
                val chip = group.findViewById<Chip>(id)
                if (chip != null) {
                    generosSeleccionados.add(chip.text.toString())
                }
                // Suponiendo que tienes un OnClickListener en tu ListView
                listView.setOnItemClickListener { parent, view, position, id ->
                    val selectedGenre = generos[position]
                    Toast.makeText(this, "Género seleccionado: $selectedGenre", Toast.LENGTH_SHORT)
                        .show()
                }
            }
        }
    }
}