plugins {
    kotlin("multiplatform") version "1.9.22"
}

repositories {
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
                implementation("com.jamesward:looperkt:0.0.4")
            }
        }
    }
}
