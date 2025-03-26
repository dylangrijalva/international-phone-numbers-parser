plugins {
    kotlin("jvm") version "2.0.20"
}

group = "dev.dagn"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
    implementation("com.googlecode.libphonenumber:libphonenumber:9.0.1")
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(17)
}
