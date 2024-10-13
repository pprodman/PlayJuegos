package com.example.playgames

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.widget.Toolbar
import androidx.core.content.res.ResourcesCompat
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val games = findViewById<Button>(R.id.button)
        val jugador = findViewById<Button>(R.id.button1)
        val preferencias = findViewById<Button>(R.id.button2)


        val titulo = findViewById<TextView>(R.id.titulo)
        titulo.typeface = ResourcesCompat.getFont(this, R.font.courgette_regular)

        jugador.setOnClickListener {lanzarNewPlayer()}
        preferencias.setOnClickListener {lanzarPreferencias()}
        games.setOnClickListener {lanzarGames()}


        val toolbar: Toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)

    }

    private fun lanzarGames() {
        // Crear un Intent para iniciar la actividad Game
        val i = Intent(this, Games::class.java)
        startActivity(i)
    }

    private fun lanzarNewPlayer() {
        // Crear un Intent para iniciar la actividad NewPlayer
        val i = Intent(this, NewPlayer::class.java)
        startActivity(i)
    }

    private fun lanzarPreferencias() {
        // Crear un Intent para iniciar la actividad Preferences
        val i = Intent(this, Preferences::class.java)
        startActivity(i)
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.getItemId()) {
            (R.id.action_settings) -> {return true}
            (R.id.action_add) -> {return true}
            (R.id.action_buscar) -> {
                val i = Intent(this, Search::class.java)
                startActivity(i) ; return true
            }
            else -> return super.onOptionsItemSelected(item)
        }
    }
}