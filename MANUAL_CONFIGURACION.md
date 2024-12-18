# Manual de Configuración del Proyecto - Play Games
Este manual detalla los pasos básicos para configurar el proyecto Play Games en Android Studio, incluyendo las versiones necesarias de Android, Java y Kotlin, así como las dependencias requeridas.

## Requisitos Previos
Asegúrate de cumplir con los siguientes requisitos antes de empezar:

1. **Android Studio**
  - Versión recomendada: Arctic Fox (2020.3.1) o superior.
  - Descarga desde aquí.
2. **SDK de Android**
  - Versión mínima del SDK: 21 (Android 5.0, Lollipop).
  - Versión objetivo del SDK: 33 (Android 13).
  - **Herramientas necesarias**
    - Build Tools: 33.0.0 o superior.
    - Gradle: 7.0.0 o superior.
3. **Java**
  - Versión recomendada: JDK 17.
4. **Kotlin**
  - Versión utilizada: 1.8.0.

## Pasos para Configurar el Proyecto
Abrir el proyecto en Android Studio

Descarga o clona el repositorio del proyecto:
bash
Copiar código
git clone https://github.com/tu-usuario/play-games.git
Abre Android Studio y selecciona Open an Existing Project.
Navega hasta la carpeta donde se encuentra el proyecto clonado.
Configurar el SDK y JDK

Ve a File > Project Structure > SDK Location y verifica que las rutas del SDK y JDK sean correctas.
Si es necesario, instala las herramientas desde el SDK Manager en Android Studio.
Sincronizar Gradle

Android Studio detectará automáticamente el archivo build.gradle.
Pulsa en Sync Now para descargar las dependencias necesarias.
Dependencias Requeridas
El proyecto utiliza las siguientes dependencias, que se encuentran definidas en el archivo build.gradle:

Dependencias principales
gradle
Copiar código
implementation 'androidx.appcompat:appcompat:1.6.1'
implementation 'com.google.android.material:material:1.9.0'
implementation 'androidx.constraintlayout:constraintlayout:2.1.4'
implementation 'androidx.lifecycle:lifecycle-viewmodel:2.6.1'
Librerías adicionales
Retrofit (para consumir APIs):

gradle
Copiar código
implementation 'com.squareup.retrofit2:retrofit:2.9.0'
implementation 'com.squareup.retrofit2:converter-gson:2.9.0'
Glide (para cargar imágenes):

gradle
Copiar código
implementation 'com.github.bumptech.glide:glide:4.15.1'
annotationProcessor 'com.github.bumptech.glide:compiler:4.15.1'
JUnit y Espresso (para pruebas):

gradle
Copiar código
testImplementation 'junit:junit:4.13.2'
androidTestImplementation 'androidx.test.ext:junit:1.1.5'
androidTestImplementation 'androidx.test.espresso:espresso-core:3.5.1'
