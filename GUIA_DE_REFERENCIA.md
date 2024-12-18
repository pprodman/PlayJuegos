# Guía de Referencia: Proyecto PlayGames
## Descripción General
El proyecto **PlayGames** es una aplicación para Android desarrollada en el marco de la asignatura Desarrollo de Interfaces del ciclo de DAM. La aplicación permite a los usuarios elegir un videojuego, crear un perfil de jugador y configurar preferencias.

## Estructura del Proyecto
El proyecto se organiza en las siguientes carpetas y archivos clave:

````css
PlayGames/
├── app/
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/
│   │   │   │   └── com.example.playgames/
│   │   │   │       │   ├── MainActivity.kt
│   │   │   │       │   ├── GameActivity.kt
│   │   │   │       │   ├── NewPlayerActivity.kt
│   │   │   │       │   ├── PreferencesActivity.kt
│   │   │   │       │   ├── AboutActivity.kt
│   │   │   │       │   └── GeneroActivity.kt
│   │   │   │       ├── model/
│   │   │   │       │   ├── About.kt
│   │   │   │       │   ├── AboutProvider.kt
│   │   │   │       │   ├── Genero.kt
│   │   │   │       │   └── GeneroProvider.kt
│   │   │   │       ├── adapter/
│   │   │   │       │   ├── AboutAdapter.kt
│   │   │   │       │   ├── AboutViewHolder.kt
│   │   │   │       │   ├── GeneroAdapter.kt
│   │   │   │       │   └── GeneroViewHolder.kt
│   │   │   ├── res/
│   │   │   │   ├── layout/
│   │   │   │   ├── drawable/
│   │   │   │   ├── values/
│   │   │   │   └── mipmap/
│   │   ├── build.gradle
│   ├── build.gradle
│   └── AndroidManifest.xml
└── README.md
````

## Actividades

| Nombre | Descripción | 
|---|---|
| [`MainActivity`](https://github.com/pprodman/PlayJuegos/blob/master/app/docs/app/com.example.playgames/-main-activity/index.md)| Pantalla principal de la aplicación, donde se muestra el acceso al resto de secciones |
| [`GameActivity`](https://github.com/pprodman/PlayJuegos/blob/master/app/docs/app/com.example.playgames/-games-activity/index.md)| Permite a los usuarios seleccionar un videojuego de una lista y visualizar sus detalles| 
| [`NewPlayerActivity`](https://github.com/pprodman/PlayJuegos/blob/master/app/docs/app/com.example.playgames/-new-player-activity/index.md)| Permite al usuario crea un nuevo perfil de jugador| 
| [`PreferencesActivity`](https://github.com/pprodman/PlayJuegos/blob/master/app/docs/app/com.example.playgames/-preferences-activity/index.md)| Permite configurar las preferencias del jugador, como el tipo de juego o las configuraciones de la interfaz| 
| [`AboutActivity`](https://github.com/pprodman/PlayJuegos/blob/master/app/docs/app/com.example.playgames/-about-activity/index.md)| Muestra información sobre los desarrolladores y el proyecto| 
| [`GeneroActivity`](https://github.com/pprodman/PlayJuegos/blob/master/app/docs/app/com.example.playgames/-generos-activity/index.md)| Permite filtrar a los usuarios el videojuego en función de la plataforma y el género | 

## Modelos

### Clase: `About`
`About` es una clase de datos utilizada para representar la información de los desarrolladores. Contiene tres atributos:

### Atributos
| Nombre | Tipo | Descripción |
|---|---|---|
|`imagen`|`Int`|Imagen que representa visualmente al desarrollador|
|`nombre`|`String`|Nombre del desarrollador|
|`numero`|`Int`|Número de juegos desarrollados por el desarrollador|

### Declaración
````bash
data class About(val imagen: Int, val nombre: String, val numero: Int)








### Clase: `Genero`
`Genero` es una clase de datos utilizada para representar la información del género de los videojuegos. Contiene un solo atributo:

### Atributos
| Nombre | Tipo | Descripción |
|---|---|---|
|`nombre`|`String`|Género del videojuego|



 
## Adapters
    
## Flujo de Navegación
1. **Pantalla de Inicio**: El usuario abre la aplicación y se dirige a la actividad MainActivity donde puede seleccionar cualquier de las secciones de la aplicación.
2. **Selección de Juego**: Una vez creado el perfil, el usuario es dirigido a GameActivity, donde puede seleccionar un videojuego.
3. **Creación de perfil**: El usuario puede crear un perfil como jugador, introduciendo sus datos personales.
4. **Preferencias**: Desde el menú de la aplicación, el usuario puede acceder a PreferencesActivity para ajustar la configuración.
5. **Información del Proyecto**: El usuario también puede acceder a AboutActivity para conocer más sobre el proyecto y sus desarrolladores.
6. **Configuración**: El usuario puede acceder a la sección de configuración, accediendo a GeneroActivity y seleccionar las plataformas y generos que desee. 
