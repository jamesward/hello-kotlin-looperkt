plugins {
    kotlin("multiplatform") version "1.9.22"
}

repositories {
    maven("https://oss.sonatype.org/content/groups/staging")
    mavenCentral()
}

kotlin {
    @Suppress("OPT_IN_USAGE")
    wasmJs {
        binaries.executable()
        browser()
        applyBinaryen()
    }

    sourceSets {
        commonMain {
            dependencies {
                implementation("com.jamesward:looperkt:0.0.3")
            }
        }
    }
}
