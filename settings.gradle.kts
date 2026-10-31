pluginManagement {
    repositories {
        maven {
            name = "WagYourMaven"
            url = uri("https://maven.wagyourtail.xyz/releases")
        }
        maven {
            name = "ForgeMaven"
            url = uri("https://maven.minecraftforge.net/")
        }
        maven {
            name = "FabricMaven"
            url = uri("https://maven.fabricmc.net/")
        }
        maven {
            name = "Ornithe Releases"
            url = uri("https://maven.ornithemc.net/releases")
        }
        mavenCentral()
        gradlePluginPortal()
    }
}

plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "1.0.0"
}

include("common")
include("network-api:common")

if (System.getenv("JITPACK") == null) {
    include("fabric-26.3")
}