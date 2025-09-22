plugins {
    kotlin("jvm") version "2.1.21"
}

val buildNumber = project.findProperty("BUILD_NUMBER") ?: "SNAPSHOT"

group = "ru.hse.pipo"
version = "0.0-${buildNumber}"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(21)
}