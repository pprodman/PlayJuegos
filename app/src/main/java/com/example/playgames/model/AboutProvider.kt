package com.example.playgames.model

import com.example.playgames.R

/**
 * Clase AboutProvider que contiene una lista de objetos About (desarrolladores)
 * @property nombre Nombre del desarrollador
 * @property numero Número de juegos desarrollados
 * @property imagen Imagen del desarrollador
 */
class AboutProvider {
    companion object{
        val aboutList = listOf<About>(
            About("María Mata",2014, R.drawable.image1),
            About("Antonio Sanz", 1890, R.drawable.image2),
            About("Carlos", 967, R.drawable.image3),
            About("Berta", 945, R.drawable.image4),
            About("Hector Campos", 879, R.drawable.image5),
            About("Ismael", 678, R.drawable.image6),
            About("Pablo", 563, R.drawable.image7),
            About("Ronaldo Nazario", 342, R.drawable.image8),
        )
    }
}