plugins {
    // Support convention plugins written in Kotlin. Convention plugins are build scripts in 'src/main' that automatically become available as plugins in the main build.
    `kotlin-dsl`
}

repositories {
    mavenCentral()
    // Use the plugin portal to apply community plugins in convention plugins.
    gradlePluginPortal()
}

dependencies {
    // Add the Spring Boot and Dependency Management plugins as dependencies
    implementation("org.springframework.boot:spring-boot-gradle-plugin:3.4.2")
    implementation("io.spring.gradle:dependency-management-plugin:1.1.7")
}
