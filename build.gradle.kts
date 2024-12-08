plugins {
    kotlin("jvm") version "2.0.21"
}

val javaVersion = 22

kotlin {
    jvmToolchain(javaVersion)
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}