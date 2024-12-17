package com.example.playgames

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.EditText
import android.widget.Spinner
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar

/**
 * Sección NEWPLAYER que muestra la pantalla de creación de un nuevo jugador.
 */
class NewPlayerActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.new_player)

        // Configurar la Toolbar
        val toolbar: Toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)

        // spinner telefonos
        val telefonos = arrayOf("Teléfono 1", "Teléfono 2", "Teléfono 3", "Teléfono 4", "Teléfono 5")
        val adaptador = ArrayAdapter(this, android.R.layout.simple_spinner_item, telefonos)
        val list_telefonos = findViewById(R.id.spinner) as Spinner
        val etTelefono: EditText = findViewById(R.id.phone)

        // Asignar el adaptador al spinner
        list_telefonos.adapter = adaptador
        adaptador.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)

        // Manejar la selección del spinner
        list_telefonos.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                if (parent != null) {
                    val telefonoSeleccionado = parent.getItemAtPosition(position).toString()
                    etTelefono.text.clear()
                    etTelefono.setText(telefonoSeleccionado)
                    Toast.makeText(applicationContext, telefonoSeleccionado, Toast.LENGTH_SHORT).show()
                }
            }

            // Manejar la deselección del spinner
            override fun onNothingSelected(p0: AdapterView<*>?) {
                TODO("Not yet implemented")
            }
        }
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