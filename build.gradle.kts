buildscript {
    dependencies {

    }
}

// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    id("com.android.application").apply(false)
    id("com.android.library").apply(false)
    kotlin("android").apply(false)
//    id("com.google.dagger.hilt.android").apply(false)
}


allprojects {
    repositories {
        google()
        mavenCentral()
        maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
        maven("https://jitpack.io")
    }
}