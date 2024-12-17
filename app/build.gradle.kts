plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    id("org.jetbrains.dokka") version "1.9.10"
}

tasks.dokkaGfm {
    outputDirectory.set(file("docs")) // Directorio de salida
    dokkaSourceSets {
        configureEach {
            // Filtra clases y métodos automáticos
            suppressGeneratedFiles.set(true) // Excluye código generado automáticamente
            skipDeprecated.set(true) // Omite elementos marcados como @Deprecated
            reportUndocumented.set(true) // Documenta solo elementos con KDoc
            includeNonPublic.set(false) // Excluye miembros no públicos
            suppressInheritedMembers.set(true) // Omite miembros heredados

            // Filtra archivos específicos o paquetes
            perPackageOption {
                matchingRegex.set(".*\\.internal.*") // Excluye paquetes internos
                suppress.set(true)
            }
        }
    }
}


subprojects {
    apply(plugin = "org.jetbrains.dokka")
}

android {
    namespace = "com.example.playgames"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.playgames"
        minSdk = 26
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.5.1"
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {

    testImplementation (libs.junit)
    testImplementation (libs.mockito.core)
    testImplementation (libs.androidx.core.testing)
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.lifecycle.runtime.ktx)
    implementation(libs.androidx.activity.compose)
    implementation(platform(libs.androidx.compose.bom))
    implementation(libs.androidx.ui)
    implementation(libs.androidx.ui.graphics)
    implementation(libs.androidx.ui.tooling.preview)
    implementation(libs.androidx.material3)
    implementation(libs.androidx.constraintlayout)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    androidTestImplementation(platform(libs.androidx.compose.bom))
    androidTestImplementation(libs.androidx.ui.test.junit4)
    debugImplementation(libs.androidx.ui.tooling)
    debugImplementation(libs.androidx.ui.test.manifest)

}
