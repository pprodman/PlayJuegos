package com.example.playgames

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.CheckBox
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import com.google.android.material.floatingactionbutton.FloatingActionButton

/**
 * Sección PLAY que muestra la pantalla de juegos disponibles.
 */
class Games : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.games)

        val toolbar: Toolbar = findViewById(R.id.toolbarGames)
        setSupportActionBar(toolbar)

        // Inicialización de los checkboxes
        val airControlCheckBox = findViewById<CheckBox>(R.id.checkboxAirControl)
        val angryBirdsCheckBox = findViewById<CheckBox>(R.id.checkboxAngryBirds)
        val dragonFlyCheckBox = findViewById<CheckBox>(R.id.checkboxDragonFly)
        val hillClimbingRacingCheckBox = findViewById<CheckBox>(R.id.checkboxHillClimbingRacing)
        val radiantDefenseCheckBox = findViewById<CheckBox>(R.id.checkboxRadiantDefense)
        val pocketSoccerCheckBox = findViewById<CheckBox>(R.id.checkboxPocketSoccer)
        val ninjaJumpCheckBox = findViewById<CheckBox>(R.id.checkboxNinjaJump)

        // Floating Action Button (FAB)
        val fab = findViewById<FloatingActionButton>(R.id.selectGames)

        fab.setOnClickListener {
            // Lista para almacenar las opciones seleccionadas
            val selectedGames = mutableListOf<String>()

            // Agregar a la lista los juegos seleccionados
            if (airControlCheckBox.isChecked) selectedGames.add("Air Control")
            if (angryBirdsCheckBox.isChecked) selectedGames.add("Angry Birds")
            if (dragonFlyCheckBox.isChecked) selectedGames.add("Dragon Fly")
            if (hillClimbingRacingCheckBox.isChecked) selectedGames.add("Hill Climbing Racing")
            if (radiantDefenseCheckBox.isChecked) selectedGames.add("Radiant Defense")
            if (pocketSoccerCheckBox.isChecked) selectedGames.add("Pocket Soccer")
            if (ninjaJumpCheckBox.isChecked) selectedGames.add("Ninja Jump")

            // Verificar si hay selecciones y mostrar un Toast
            if (selectedGames.isNotEmpty()) {
                // Mostrar los juegos seleccionados
                val message = "Has elegido: ${selectedGames.joinToString(", ")}"
                Toast.makeText(this, message, Toast.LENGTH_LONG).show()
            } else {
                // Mostrar un mensaje indicando que no hay ninguna opción seleccionada
                Toast.makeText(this, "No has elegido ninguna opción", Toast.LENGTH_SHORT).show()
            }
        }
    }

    /**
     * Método que se llama cuando se crea el menú de opciones.
     */
    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    /**
     * Método que se llama cuando se selecciona un elemento del menú.
     */
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


