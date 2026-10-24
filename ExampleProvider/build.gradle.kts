import com.lagradost.cloudstream3.gradle.CloudstreamExtension

buildscript {
    repositories {
        google()
        mavenCentral()
    }
}

plugins {
    id("com.android.library") version "8.1.1" apply false
    id("org.jetbrains.kotlin.android") version "1.9.10" apply false
    id("com.lagradost.cloudstream3.gradle") version "0.1.0"
}

cloudstream {
    // Menghubungkan ke folder provider baru
    setDest(file("OtakudesuProvider"))
}
