plugins {
    id("org.jetbrains.dokka") version "2.0.0"
}

repositories {
    mavenCentral()
}

allprojects {
    group = "com.openai"
    version = "0.13.0" // x-release-please-version
}

subprojects {
    apply(plugin = "org.jetbrains.dokka")
}
