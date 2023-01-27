plugins {
    kotlin("multiplatform")
    id("org.jetbrains.compose")
    id("com.android.library")
}


kotlin {
    android {
        publishLibraryVariants("release")
    }
    jvm("desktop") {
        compilations.all {
            kotlinOptions.jvmTarget = "1.8"
        }
    }
    js(IR) {
        browser()
        binaries.executable()
    }
    sourceSets {
        val commonMain by getting {
            dependencies {
                implementation(compose.runtime)
                implementation(compose.foundation)
                implementation(compose.ui)
                @OptIn(org.jetbrains.compose.ExperimentalComposeLibrary::class)
                implementation(compose.material3)
            }
        }
        val androidMain by getting {
            dependencies {

            }
        }
        val desktopMain by getting {
            dependencies {

            }
        }
        named("jsMain") {
            dependencies {
                api(compose.web.core)
            }
        }
    }
}

android {
    compileSdk = 33
    sourceSets["main"].manifest.srcFile("src/androidMain/AndroidManifest.xml")
    sourceSets["main"].apply {
        res.srcDir(File(buildDir, "generated/moko/androidMain/res"))
    }
    defaultConfig {
        minSdk = 21
    }
    buildTypes {
        debug {
            isMinifyEnabled = false
        }
        release {
            isMinifyEnabled = true
        }
    }
}