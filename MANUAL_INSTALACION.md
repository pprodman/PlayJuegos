# Manual de Instalación - Play Games

## Índice
1. [Introducción](#introducción)
2. [Requisitos Previos](#requisitos-previos)
3. [Instalación desde APK](#instalación-desde-apk)
4. [Instalación desde Código Fuente](#instalación-desde-código-fuente)
5. [Resolución de Problemas](#resolución-de-problemas)

## Introducción
Este manual describe los pasos necesarios para instalar la aplicación Play Games en un dispositivo Android. Puedes instalar la app utilizando un archivo APK o compilándola desde el código fuente en Android Studio.

## Requisitos Previos
Antes de instalar la aplicación, asegúrate de cumplir con los siguientes requisitos:

- **Dispositivo Android** con versión 8.0 (Oreo) o superior.
- **Espacio de almacenamiento**: Al menos 50 MB libres.
- **Android Studio** (opcional, para instalación desde el código fuente).
- **Habilitar instalación desde fuentes desconocidas** (si usas un APK).

## Instalación desde APK
1. **Descargar el APK**
      - Descarga el archivo `PlayGames.apk` desde el repositorio de GitHub o la ubicación proporcionada.
3. **Permitir instalación de aplicaciones desconocidas**
      - En tu dispositivo Android, ve a Configuración > Seguridad.
      - Activa la opción Permitir instalación de aplicaciones desconocidas.
4. **Instalar el APK**
      - Abre el archivo APK descargado.
      - Sigue las instrucciones en pantalla y selecciona Instalar.
5. **Abrir la aplicación**
      - Una vez instalada, abre la aplicación desde el menú principal de tu dispositivo.

## Instalación desde Código Fuente
1. **Clonar el repositorio**
      - Descarga el código fuente desde el repositorio de GitHub:
      ```bash
      git <font color="blue">clone</font> https://github.com/tu-repositorio/play-games.git
      ```
2. **Abrir en Android Studio**
      - Abre Android Studio y selecciona **File > Open....**
      - Navega hasta la carpeta del proyecto descargado y ábrela.
  
3. **Configurar el entorno**
      - Asegúrate de que tienes las herramientas necesarias instaladas:
      - **SDK de Android 8.0 (Oreo)** o superior.
      - Gradle configurado correctamente (Android Studio lo hará automáticamente).

4. **Compilar y ejecutar**
      - Conecta tu dispositivo Android mediante USB o selecciona un emulador.
      - Haz clic en el botón **Run** (o presiona `Shift + F10`) para compilar y ejecutar la app.

5. **Instalar en el dispositivo**
      - Una vez compilada, la aplicación se instalará automáticamente en el dispositivo conectado.

## Resolución de Problemas
1. **Error de instalación del APK**
      - Asegúrate de haber habilitado la opción **Fuentes desconocidas** en la configuración del dispositivo.
      - Verifica que el archivo APK no esté corrupto descargándolo nuevamente.
2. **Problemas con Android Studio**
      - Actualiza Android Studio a la última versión disponible.
      -Asegúrate de tener instalados los paquetes necesarios desde el SDK Manager.
3. **Error de conexión con el dispositivo**
      - Activa el modo **Depuración USB** en tu dispositivo:
      - Ve a **Configuración > Opciones de desarrollador > Depuración USB**.
      - Revisa el cable USB o intenta usar otro puerto.

