# Guía de Referencia: Proyecto PlayGames
## Descripción General
El proyecto **PlayGames** es una aplicación para Android desarrollada en el marco de la asignatura Desarrollo de Interfaces del ciclo de DAM. La aplicación permite a los usuarios elegir un videojuego, crear un perfil de jugador y configurar preferencias.
<font color="blue">Este texto debería ser azul.</font>

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

## Clases Principales
#### `GameActivity.java`
- Descripción: Actividad que permite a los usuarios seleccionar un videojuego de una lista y visualizar sus detalles.
- Métodos Importantes:
  - onCreate(Bundle savedInstanceState): Inicializa la actividad, establece el layout y carga los datos del videojuego.
  - startGame(): Llama a la lógica para iniciar un nuevo juego o muestra detalles del juego seleccionado.

#### `NewPlayerActivity.java`
- Descripción: Actividad donde el usuario crea un nuevo perfil de jugador.
- Métodos Importantes:
  - onCreate(Bundle savedInstanceState): Establece el formulario para ingresar el nombre del jugador.
  - savePlayerName(String playerName): Guarda el nombre del jugador en las preferencias de la aplicación.

#### `PreferencesActivity.java`
- Descripción: Actividad para configurar las preferencias del jugador, como el tipo de juego o las configuraciones de la interfaz.
- Métodos Importantes:
  - onCreate(Bundle savedInstanceState): Muestra las opciones de configuración, como el tema y las preferencias de sonido.
  - savePreferences(): Guarda las configuraciones seleccionadas por el usuario.

#### `AboutActivity.java`
- Descripción: Muestra información sobre los desarrolladores y el proyecto.
- Métodos Importantes:
  - onCreate(Bundle savedInstanceState): Muestra los detalles del equipo de desarrollo y los objetivos del proyecto.

## Funciones Clave

#### `Utils.java`
- Descripción: Clase utilitaria con métodos generales utilizados en todo el proyecto.
- Funciones Importantes:
  - getRandomGame(): Devuelve un juego aleatorio de la lista de juegos disponibles.
  - loadImage(String imageUrl): Carga una imagen desde una URL para mostrar en las actividades.
    
## Flujo de Navegación
1. **Pantalla de Inicio**: El usuario abre la aplicación y se dirige a la actividad MainActivity donde puede seleccionar cualquier de las secciones de la aplicación.
2. **Selección de Juego**: Una vez creado el perfil, el usuario es dirigido a GameActivity, donde puede seleccionar un videojuego.
3. **Creación de perfil**: El usuario puede crear un perfil como jugador, introduciendo sus datos personales.
4. **Preferencias**: Desde el menú de la aplicación, el usuario puede acceder a PreferencesActivity para ajustar la configuración.
5. **Información del Proyecto**: El usuario también puede acceder a AboutActivity para conocer más sobre el proyecto y sus desarrolladores.
6. **Configuración**: El usuario puede acceder a la sección de configuración, accediendo a GeneroActivity y seleccionar las plataformas y generos que desee. 
