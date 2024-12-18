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

#### Atributos
| Nombre | Tipo | Descripción |
|---|---|---|
|`imagen`|`Int`|Imagen que representa visualmente al desarrollador|
|`nombre`|`String`|Nombre del desarrollador|
|`numero`|`Int`|Número de juegos desarrollados por el desarrollador|

#### Declaración
````kotlin
data class About(val imagen: Int, val nombre: String, val numero: Int)
````
#### Uso
La clase se utiliza para crear objetos que representen desarrolladores de la aplicación, facilitando su gestión y visualización.
###### Ejemplo
````kotlin
val juanPalaciosDev = About( imagen = R.drawable.ic_juanpalacios, nombre = "Juan Palacios", numero = 25 )
````

### Clase: `AboutProvider`
La clase `AboutProvider` actúa como un proveedor de datos para la entidad `About`. Su objetivo principal es generar y proporcionar una lista de objetos `About`, que pueden ser utilizados por otras partes de la aplicación, como adaptadores o vistas, para mostrar información en la interfaz.

#### Descripción
La clase `AboutProvider` utiliza un objeto de compañero (`companion object`) en Kotlin para proporcionar una lista estática e inmutable de elementos de tipo `About`. Es una manera conveniente de almacenar datos que serán reutilizados en la aplicación. Dentro de este, se define `aboutList`, una lista inmutable creada con `listOf` que contiene instancias de la clase `About`, cada una inicializada con tres parámetros:
- Un recurso de imagen (R.drawable).
- Un nombre (String).
- Un número (Int).

### Clase: `Genero`
`Genero` es una clase de datos utilizada para representar la información del género de los videojuegos. Contiene un solo atributo:

#### Atributos
| Nombre | Tipo | Descripción |
|---|---|---|
|`nombre`|`String`|Género del videojuego|

#### Declaración
````kotlin
data class Genero(val nombre: String)
````
#### Uso
La clase se utiliza para crear objetos que representen el tipo de género de videojuego, facilitando su gestión y visualización.
###### Ejemplo
````kotlin
val aventuras = Genero( nombre = "Aventuras" )
````
### Clase: `GeneroProvider`
La clase `GeneroProvider` actúa como un proveedor de datos para la entidad `Genero`. Su objetivo principal es generar y proporcionar una lista de objetos `Genero`, que pueden ser utilizados por otras partes de la aplicación, como adaptadores o vistas, para mostrar información en la interfaz.

#### Descripción
La clase `GenerotProvider` utiliza un objeto de compañero (`companion object`) en Kotlin para proporcionar una lista estática e inmutable de elementos de tipo `Genero`. Es una manera conveniente de almacenar datos que serán reutilizados en la aplicación. Dentro de este, se define `generotList`, una lista inmutable creada con `listOf` que contiene instancias de la clase `Genero`, cada una inicializada con un parámetro:
- Un nombre (String).

## Adapters

### Clase `AboutAdapter`
La clase `AboutAdapter` es un adaptador personalizado que extiende `RecyclerView.Adapter` para manejar y mostrar una lista de objetos About en un componente `RecyclerView`. Este adaptador gestiona el ciclo de vida de las vistas y enlaza los datos de la lista con los elementos visuales.

#### Declaración de la Clase
````kotlin

class AboutAdapter(private val aboutList: List<About>) : RecyclerView.Adapter<AboutViewHolder>() {
    ...
}
````

#### Métodos Principales
##### 1. onCreateViewHolder:
- Se ejecuta cuando el adaptador necesita crear un nuevo ViewHolder.
- Infla el diseño XML about_item y lo encapsula en un AboutViewHolder.
````kotlin

override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AboutViewHolder {
    val layoutInflater = LayoutInflater.from(parent.context)
    return AboutViewHolder(layoutInflater.inflate(R.layout.about_item, parent, false))
}
````

##### 2. onBindViewHolder:
- Se ejecuta para enlazar los datos de un objeto About con su respectivo ViewHolder.
- Obtiene el objeto correspondiente según la posición y llama al método render del ViewHolder.
````kotlin
override fun onBindViewHolder(holder: AboutViewHolder, position: Int) {
    val item = aboutList[position]
    holder.render(item)
}
````
##### 3. getItemCount:
- Devuelve el número total de elementos en la lista aboutList.
````kotlin
override fun getItemCount(): Int = aboutList.size
````
    
## Flujo de Navegación
1. **Pantalla de Inicio**: El usuario abre la aplicación y se dirige a la actividad MainActivity donde puede seleccionar cualquier de las secciones de la aplicación.
2. **Selección de Juego**: Una vez creado el perfil, el usuario es dirigido a GameActivity, donde puede seleccionar un videojuego.
3. **Creación de perfil**: El usuario puede crear un perfil como jugador, introduciendo sus datos personales.
4. **Preferencias**: Desde el menú de la aplicación, el usuario puede acceder a PreferencesActivity para ajustar la configuración.
5. **Información del Proyecto**: El usuario también puede acceder a AboutActivity para conocer más sobre el proyecto y sus desarrolladores.
6. **Configuración**: El usuario puede acceder a la sección de configuración, accediendo a GeneroActivity y seleccionar las plataformas y generos que desee. 
