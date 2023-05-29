plugins {
    id("java-library")
    id("org.jetbrains.kotlin.jvm")
}

dependencies {
implementation ("javax.inject:javax.inject:1")
}

java {
    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = JavaVersion.VERSION_1_8
}