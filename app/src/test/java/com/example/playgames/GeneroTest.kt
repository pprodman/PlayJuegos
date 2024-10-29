package com.example.playgames

import org.junit.Test
import org.junit.Assert.*

class GeneroTest {

    @Test
    fun `should create a user with correct values`() {
        val genero = Genero("Aventura")
        assertEquals("Aventura", genero.nombre)
    }
}