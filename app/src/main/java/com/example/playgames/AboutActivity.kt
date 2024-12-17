package com.example.playgames

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.playgames.adapter.AboutAdapter
import com.example.playgames.model.AboutProvider

/**
 * Sección ABOUT, que muestra información sobre la aplicación y el desarrollador.
 */
class AboutActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.about_activity)
        initRecyclerView()

        }

    /**
     * Inicializa el RecyclerView con el adaptador AboutAdapter.
     */
    private fun initRecyclerView() {
        val manager = LinearLayoutManager(this)
        val decoration = DividerItemDecoration(this, manager.orientation)
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerAbout)
        recyclerView.layoutManager = manager
        recyclerView.adapter = AboutAdapter(AboutProvider.aboutList)
        recyclerView.addItemDecoration(decoration)
    }
}