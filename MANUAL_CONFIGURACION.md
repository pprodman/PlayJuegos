# Manual de Configuración del Proyecto - Play Games
Este manual detalla los pasos básicos para configurar el proyecto **Play Games** en Android Studio, incluyendo las versiones necesarias de Android, Java y Kotlin, así como las dependencias requeridas.
## Índice
1. [Requisitos Previos](#requisitos-previos)
2. [Pasos para Configurar el Proyecto](#pasos-para-configurar-el-proyecto)
3. [Dependencias requeridas](#dependencias-requeridas)

## Requisitos Previos
Asegúrate de cumplir con los siguientes requisitos antes de empezar:

#### 1. **Android Studio**
- Versión recomendada: **Arctic Fox (2020.3.1)** o superior.
- Descarga desde [aquí](https://developer.android.com/studio?hl=es-419).
#### 2. **SDK de Android**
- Versión mínima del SDK: **26** (Android 8.0, Oreo).
- Versión objetivo del SDK: **34** (Android 14).
- **Herramientas necesarias**
   - Build Tools: 33.0.0 o superior.
  - Gradle: 8.7.0 o superior.
#### 3. **Java**
- Versión recomendada: **JDK 17.**
#### 4. **Kotlin**
- Versión utilizada: **1.8.0.**

## Pasos para Configurar el Proyecto
#### 1. **Abrir el proyecto en Android Studio**
- Descarga o clona el repositorio del proyecto:
  ````bash
  git clone https://github.com/tu-usuario/play-games.git
  ````
- Abre Android Studio y selecciona **Open an Existing Project**.
- Navega hasta la carpeta donde se encuentra el proyecto clonado.

#### 2. **Configurar el SDK y JDK**
- Ve a **File > Project Structure > SDK Location** y verifica que las rutas del SDK y JDK sean correctas.
- Si es necesario, instala las herramientas desde el **SDK Manager** en Android Studio.

#### 3. **Sincronizar Gradle**
- Android Studio detectará automáticamente el archivo `build.gradle`.
- Pulsa en **Sync Now** para descargar las dependencias necesarias.

## Dependencias Requeridas
El proyecto utiliza las siguientes dependencias, que se encuentran definidas en el archivo `build.gradle`:

### Dependencias principales
````gradle
implementation 'androidx.appcompat:appcompat:1.6.1'
implementation 'com.google.android.material:material:1.9.0'
implementation 'androidx.constraintlayout:constraintlayout:2.1.4'
implementation 'androidx.lifecycle:lifecycle-viewmodel:2.6.1'
````

### Librerías adicionales
- **Retrofit (para consumir APIs)**:
````gradle
implementation 'com.squareup.retrofit2:retrofit:2.9.0'
implementation 'com.squareup.retrofit2:converter-gson:2.9.0'
````

- **Glide (para cargar imágenes)**:
````gradle
implementation 'com.github.bumptech.glide:glide:4.15.1'
annotationProcessor 'com.github.bumptech.glide:compiler:4.15.1'
````

- **JUnit y Espresso (para pruebas)**:
````gradle
testImplementation 'junit:junit:4.13.2'
androidTestImplementation 'androidx.test.ext:junit:1.1.5'
androidTestImplementation 'androidx.test.espresso:espresso-core:3.5.1'
````
