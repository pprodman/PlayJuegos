Manual de Instalación - Play Games
Índice
Introducción
Requisitos Previos
Instalación desde APK
Instalación desde Código Fuente
Resolución de Problemas
Introducción
Este manual describe los pasos necesarios para instalar la aplicación Play Games en un dispositivo Android. Puedes instalar la app utilizando un archivo APK o compilándola desde el código fuente en Android Studio.

Requisitos Previos
Antes de instalar la aplicación, asegúrate de cumplir con los siguientes requisitos:

Dispositivo Android con versión 8.0 (Oreo) o superior.
Espacio de almacenamiento: Al menos 50 MB libres.
Android Studio (opcional, para instalación desde el código fuente).
Habilitar instalación desde fuentes desconocidas (si usas un APK).
Instalación desde APK
Descargar el APK

Descarga el archivo PlayGames.apk desde el repositorio de GitHub o la ubicación proporcionada.
Permitir instalación de aplicaciones desconocidas

En tu dispositivo Android, ve a Configuración > Seguridad.
Activa la opción Permitir instalación de aplicaciones desconocidas.
Instalar el APK

Abre el archivo APK descargado.
Sigue las instrucciones en pantalla y selecciona Instalar.
Abrir la aplicación

Una vez instalada, abre la aplicación desde el menú principal de tu dispositivo.
Instalación desde Código Fuente
Clonar el repositorio

Descarga el código fuente desde el repositorio de GitHub:
bash
Copiar código
git clone https://github.com/tu-repositorio/play-games.git
Abrir en Android Studio

Abre Android Studio y selecciona File > Open....
Navega hasta la carpeta del proyecto descargado y ábrela.
Configurar el entorno

Asegúrate de que tienes las herramientas necesarias instaladas:
SDK de Android 8.0 (Oreo) o superior.
Gradle configurado correctamente (Android Studio lo hará automáticamente).
Compilar y ejecutar

Conecta tu dispositivo Android mediante USB o selecciona un emulador.
Haz clic en el botón Run (o presiona Shift + F10) para compilar y ejecutar la app.
Instalar en el dispositivo

Una vez compilada, la aplicación se instalará automáticamente en el dispositivo conectado.