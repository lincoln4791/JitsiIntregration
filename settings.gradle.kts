pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        maven("https://github.com/jitsi/jitsi-maven-repository/raw/master/releases")
        maven ("https://maven.google.com")
    }
}

rootProject.name = "JitsiDemo"
include(":app")
 