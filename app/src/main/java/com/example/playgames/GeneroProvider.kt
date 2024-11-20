package com.example.playgames

/**
 * Clase GeneroProvider que contiene una lista de objetos Genero (generos de juego)
 * @property nombre Nombre del desarrollador
 */
class GeneroProvider {
    companion object{
        val generoList = listOf<Genero>(
            Genero("Acción"),
            Genero("Aventura"),
            Genero("Deportes"),
            Genero("Disparos"),
            Genero("Estrategia"),
            Genero("Lucha"),
            Genero("Musical"),
            Genero("Rol"),
            Genero("Simulación")
        )
    }
}