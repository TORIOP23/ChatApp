/*
 * This file was generated by the Gradle 'init' task.
 */

plugins {
    id("buildlogic.java-conventions")
}

dependencies {
    api(libs.org.springframework.cloud.spring.cloud.starter.netflix.eureka.client)
    api(libs.software.amazon.awssdk.s3)
    api(libs.com.amazonaws.aws.java.sdk.s3)
    api(libs.software.amazon.awssdk.netty.nio.client)
    api(libs.org.springframework.boot.spring.boot.starter.validation)
    api(libs.org.springframework.boot.spring.boot.starter.webflux)
    api(libs.com.fasterxml.jackson.module.jackson.module.kotlin)
    api(libs.io.projectreactor.kotlin.reactor.kotlin.myextensions.x1)
    api(libs.org.jetbrains.kotlin.kotlin.reflect)
    api(libs.org.jetbrains.kotlin.kotlin.stdlib.jdk8)
    api(libs.org.jetbrains.kotlinx.kotlinx.coroutines.reactor)
    api(project(":common"))
    api(libs.org.redisson.redisson)
    api(libs.org.springframework.boot.spring.boot.starter.data.redis.reactive)
    api(libs.org.springframework.cloud.spring.cloud.starter.zipkin)
    api(libs.org.springframework.cloud.spring.cloud.starter.sleuth)
    api(libs.org.springframework.boot.spring.boot.starter.actuator)
    api(libs.io.micrometer.micrometer.registry.prometheus)
    testImplementation(libs.org.junit.jupiter.junit.jupiter.engine)
    testImplementation(libs.io.projectreactor.reactor.test.x1)
    testImplementation(libs.org.springframework.boot.spring.boot.starter.test)
    compileOnly(libs.org.projectlombok.lombok)
}

description = "asset-service"
