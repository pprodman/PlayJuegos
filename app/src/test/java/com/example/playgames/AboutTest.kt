package com.example.playgames

import org.junit.Test
import org.junit.Assert.*

class AboutTest {

    @Test
    fun `should create a user with correct values`() {
        val about = About("Maria Mata",2014, R.drawable.image1)
        assertEquals("Maria Mata", about.nombre)
        assertEquals(2014, about.numero)
        assertEquals(R.drawable.image1, about.imagen)
    }
}