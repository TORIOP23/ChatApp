plugins {
    java
    id("org.springframework.boot")
    id("io.spring.dependency-management")
}

group = "com.chat"
version = "0.0.1-SNAPSHOT"

repositories {
    mavenCentral()
}

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(21)
    }
}