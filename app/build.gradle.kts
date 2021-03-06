import org.jetbrains.kotlin.cli.jvm.main

plugins {

    // Application
    id(libs.plugins.agp.application.get().pluginId)

    // Kotlin
    id("kotlin-android")

    // Kapt
    id("kotlin-kapt")

    // Navigation SafeArgs
    id(libs.plugins.navigation.safeArgs.get().pluginId)

    // Hilt
    id(libs.plugins.hilt.android.get().pluginId)

}

android {
    compileSdk = libs.versions.compileSdk.get().toInt()

    defaultConfig {
        applicationId = "com.example.kitsu"
        minSdk = libs.versions.minSdk.get().toInt()
        targetSdk = libs.versions.targetSdk.get().toInt()
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "11"
    }

    //ViewBinding
    buildFeatures.viewBinding = true
}

dependencies {

    implementation(project(":domain"))
    implementation(project(":data"))


    // UI Components
    implementation(libs.bundles.uiComponents)

    // Core
    implementation(libs.android.core)

    // Coroutines
    implementation(libs.coroutines.android)

    // Lifecycle
    implementation(libs.bundles.lifecycle)
    // Paging
    implementation(libs.paging.paging)


    // Navigation
    implementation(libs.bundles.navigation)
    //CoordinatorLayout
    implementation("androidx.coordinatorlayout:coordinatorlayout:1.2.0")

    // Hilt
    implementation(libs.hilt.android)
    implementation("androidx.legacy:legacy-support-v4:1.0.0")
    kapt(libs.hilt.compiler)

}