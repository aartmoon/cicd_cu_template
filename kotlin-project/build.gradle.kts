plugins {
    kotlin("jvm") version "2.0.21"
    application
}

group = "com.demo"
version = "1.0.0"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
    testImplementation("org.junit.jupiter:junit-jupiter:5.10.2")
    testImplementation("io.mockk:mockk:1.13.10")
}

application {
    mainClass.set("com.demo.MainKt")
}

tasks.test {
    useJUnitPlatform()
    reports {
        html.required.set(true)
        junitXml.required.set(true)
    }
}

kotlin {
    jvmToolchain(21)
}
