# 🗂️ Manual de Administración del Proyecto - Play Games
Este manual está diseñado para ayudarte a mantener y gestionar el proyecto **Play Games** de manera sencilla y efectiva durante el curso de Desarrollo de Interfaces.

## Índice
1. [Gestión de Versiones](#gestión-de-versiones)
2. [Mantenimiento de Dependencias](#mantenimiento-de-dependencias)
3. [Actualización de Android Studio y SDK](#actualización-de-android-studio-y-sdk)
4. [Supervisión de Pruebas](#supervisión-de-pruebas)
5. [Resolución de Problemas Comunes](#resolución-de-problemas-comunes)
   
## Gestión de Versiones
#### 1. Uso de Git:
- Asegúrate de usar Git para gestionar tu proyecto.
- Los comandos básicos que necesitarás son:
````bash
git init                # Inicia un repositorio
git add .               # Añade todos los archivos al repositorio
git commit -m "Mensaje" # Guarda los cambios
git push origin main    # Sube los cambios a GitHub
````

#### 2. Organización del código:
- Usa ramas para trabajar en nuevas funcionalidades o corregir errores:
````bash
git checkout -b nueva-funcionalidad
````
- Antes de subir cambios, prueba que todo funcione correctamente.

## Mantenimiento de Dependencias
#### 1. Actualizar las dependencias:
- Abre el archivo `build.gradle` y revisa las versiones de las librerías utilizadas.
- Si encuentras versiones más recientes, actualiza el número de versión y sincroniza Gradle.
#### 2. Lista de dependencias utilizadas en el proyecto:

````gradle
implementation 'androidx.appcompat:appcompat:1.6.1'
implementation 'com.google.android.material:material:1.9.0'
implementation 'androidx.constraintlayout:constraintlayout:2.1.4'
implementation 'androidx.lifecycle:lifecycle-viewmodel:2.6.1'
````

#### 3. Añadir nuevas librerías:
- Si necesitas una nueva librería, agrégala al archivo `build.gradle` en el apartado `dependencies` y sincroniza Gradle.

## Actualización de Android Studio y SDK
#### 1. Actualizar Android Studio:
- Abre **Help > Check for Updates** y sigue las instrucciones para instalar la última versión.
#### 2. Actualizar el SDK de Android:
- Ve al **SDK Manager** en Android Studio y selecciona las versiones necesarias:
   - Versión mínima: **21 (Lollipop)**.
   - Versión objetivo: **33 (Android 13)**.
#### 3. Actualizar Gradle:
- Ve al archivo `gradle-wrapper.properties` y cambia la versión de Gradle si es necesario:
````properties
distributionUrl=https\://services.gradle.org/distributions/gradle-8.0.2-all.zip
````
## Supervisión de Pruebas
#### 1. Pruebas unitarias:
- Usa las pruebas incluidas en el proyecto para comprobar que las funciones principales trabajan correctamente:
````bash
./gradlew test
````
#### 2. Pruebas de interfaz:

Si tienes pruebas de interfaz (UI), ejecútalas para verificar que la app funciona en dispositivos:
````bash
./gradlew connectedAndroidTest
````
## Resolución de Problemas Comunes
#### 1. Error al sincronizar Gradle:
- Verifica tu conexión a Internet.
- Limpia y reconstruye el proyecto:
````bash
./gradlew clean build
````
#### 2. Problemas con dependencias:
- Asegúrate de que las versiones de las librerías sean compatibles. Si hay conflictos, revisa la documentación de cada librería.

#### 3. Errores de ejecución:
- Usa el Logcat en Android Studio para revisar los errores. Busca mensajes relevantes para identificar el problema.
