package com.example.playgames

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.RatingBar
import android.widget.SeekBar
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar

/**
 * Sección PREFERENCIAS que muestra las preferencias del usuario.
 */
class PreferencesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.preferences)

        // Configurar la Toolbar
        val toolbar: Toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)

        // Obtener referencias a los elementos de la interfaz
        val radioGroup = findViewById<RadioGroup>(R.id.radioGroup)
        val rb = findViewById<RatingBar>(R.id.ratingBar)
        val sb = findViewById<SeekBar>(R.id.seekBar)
        val fab = findViewById<com.google.android.material.floatingactionbutton.FloatingActionButton>(R.id.selectPreferences)


        // Listener para cambios en el RatingBar
        rb.onRatingBarChangeListener =
            RatingBar.OnRatingBarChangeListener { ratingBar, rating, fromUser ->
                if (fromUser) { // Solo si el cambio fue hecho por el usuario
                    sb.progress = rating.toInt() // Actualiza el progreso del SeekBar
                }
            }

        // Listener para cambios en el SeekBar
        sb.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar, progress: Int, fromUser: Boolean) {
                if (fromUser) { // Solo si el cambio fue hecho por el usuario
                    rb.rating = progress.toFloat() // Actualiza la calificación del RatingBar
                }
            }

            override fun onStartTrackingTouch(seekBar: SeekBar) {
            }

            override fun onStopTrackingTouch(seekBar: SeekBar) {
            }
        })

        // Listener del FAB
        fab.setOnClickListener {
            // Obtener el ID del RadioButton seleccionado
            val selectedOptionId = radioGroup.checkedRadioButtonId

            // Si no hay ninguna opción seleccionada
            if (selectedOptionId == -1) {
                Toast.makeText(
                    applicationContext,
                    "No has pulsado ninguna opción",
                    Toast.LENGTH_LONG
                ).show()
            } else {
                // Obtener el texto de la opción seleccionada
                val selectedRadioButton = findViewById<RadioButton>(selectedOptionId)
                val selectedOptionText = selectedRadioButton.text.toString()

                // Obtener la puntuación del RatingBar o SeekBar
                val rating =
                    rb.rating // O también podrías usar seekBar.progress.toFloat() si prefieres
                // Mostrar el mensaje con la opción seleccionada y la puntuación
                val message =
                    "Has seleccionado $selectedOptionText con una puntuación de $rating estrellas."
                Toast.makeText(applicationContext, message, Toast.LENGTH_LONG).show()
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

