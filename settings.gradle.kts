pluginManagement {
    repositories {
        gradlePluginPortal()
        google()
        mavenCentral()

        maven { url = uri("https://kitsu.io/api/edge") }
    }
}

dependencyResolutionManagement {

    repositoriesMode.set(RepositoriesMode.PREFER_SETTINGS)
    repositories {
        google()
        mavenCentral()
        maven("bla-bla")
        maven { url = uri("https://kitsu.io/api/edge") }
    }
}


rootProject.name = "Kitsu"
enableFeaturePreview("VERSION_CATALOGS")
include(":app")
include(":data")
include(":domain")
