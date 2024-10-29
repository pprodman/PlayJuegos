package com.example.playgames


// Clase GeneroProvider que contiene una lista de objetos Genero
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