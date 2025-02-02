/*
 * This file was generated by the Gradle 'init' task.
 */

plugins {
    id("buildlogic.java-conventions")
}

dependencies {
    api(libs.org.springframework.retry.spring.retry)
    api(libs.org.springframework.boot.spring.boot.starter.webflux)
    api(project(":common"))
    api(libs.org.springframework.boot.spring.boot.starter.aop)
    api(libs.io.projectreactor.kafka.reactor.kafka)
    compileOnly(libs.org.projectlombok.lombok)
}

description = "kafka-admin"
