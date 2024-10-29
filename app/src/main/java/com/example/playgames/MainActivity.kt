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

        // Obtener referencias a los botones
        val games = findViewById<Button>(R.id.button)
        val jugador = findViewById<Button>(R.id.button1)
        val preferencias = findViewById<Button>(R.id.button2)
        val about = findViewById<Button>(R.id.button3)

        val titulo = findViewById<TextView>(R.id.titulo)
        titulo.typeface = ResourcesCompat.getFont(this, R.font.courgette_regular)

        // Establecer el OnClickListener para cada botón
        jugador.setOnClickListener {lanzarNewPlayer()}
        preferencias.setOnClickListener {lanzarPreferencias()}
        games.setOnClickListener {lanzarGames()}
        about.setOnClickListener {lanzarAbout()}

        // Configurar la Toolbar
        val toolbar: Toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)
    }

    // Método para lanzar la actividad Games
    private fun lanzarGames() {
        // Crear un Intent para iniciar la actividad Game
        val i = Intent(this, Games::class.java)
        startActivity(i)
    }

    // Método para lanzar la actividad NewPlayer
    private fun lanzarNewPlayer() {
        // Crear un Intent para iniciar la actividad NewPlayer
        val i = Intent(this, NewPlayer::class.java)
        startActivity(i)
    }

    // Método para lanzar la actividad Preferences
    private fun lanzarPreferencias() {
        // Crear un Intent para iniciar la actividad Preferences
        val i = Intent(this, Preferences::class.java)
        startActivity(i)
    }

    // Método para lanzar la actividad About
    private fun lanzarAbout() {
        // Crear un Intent para iniciar la actividad About
        val i = Intent(this, AboutActivity::class.java)
        startActivity(i)
    }

    // Método para crear el menú de opciones
    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    // Método para manejar las acciones de los elementos del menú
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.getItemId()) {
            (R.id.action_settings) -> {return true}
            (R.id.action_add) -> {return true}
            (R.id.action_buscar) -> {
                val i = Intent(this, GenerosActivity::class.java)
                startActivity(i) ; return true
            }
            else -> return super.onOptionsItemSelected(item)
        }
    }
}