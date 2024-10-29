package com.example.playgames

import android.os.Bundle

import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.playgames.adapter.GeneroAdapter
import com.google.android.material.chip.Chip
import com.google.android.material.chip.ChipGroup

class GenerosActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.generos)
        initRecyclerView()

        // Configurar el ChipGroup
        val chipGroup = findViewById<ChipGroup>(R.id.chipgroup)

        // Configurar el listener para el ChipGroup
        chipGroup.setOnCheckedStateChangeListener { group, checkedIds ->
            val plataformasSeleccionadas = checkedIds.mapNotNull { checkedId ->
                group.findViewById<Chip>(checkedId)?.text.toString()
            }

            // Mostrar un Toast con las plataformas seleccionados
            val selectedGenresString = plataformasSeleccionadas.joinToString(", ")
            Toast.makeText(
                this,
                "Plataformas seleccionadas: $selectedGenresString",
                Toast.LENGTH_SHORT
            ).show()
        }
    }

    // Método para inicializar el RecyclerView
    private fun initRecyclerView() {
        val manager = LinearLayoutManager(this)
        val decoration = DividerItemDecoration(this, manager.orientation)
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerGeneros)
        recyclerView.layoutManager = manager
        recyclerView.adapter = GeneroAdapter(GeneroProvider.generoList)
        recyclerView.addItemDecoration(decoration)
    }
}