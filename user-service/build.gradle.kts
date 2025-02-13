/*
 * This file was generated by the Gradle 'init' task.
 */

plugins {
    id("buildlogic.java-conventions")
}

dependencies {
    api(libs.org.springframework.boot.spring.boot.starter.amqp)
    api(libs.com.fasterxml.jackson.datatype.jackson.datatype.jsr310)
    api(libs.org.springframework.cloud.spring.cloud.starter.netflix.eureka.client)
    api(libs.org.springframework.boot.spring.boot.starter.security)
    api(libs.org.springframework.boot.spring.boot.starter.webflux)
    api(libs.org.postgresql.postgresql)
    api(libs.org.springframework.boot.spring.boot.starter.data.r2dbc)
    api(project(":kafka-model"))
    api(project(":kafka-admin"))
    api(project(":rabbitmq"))
    api(libs.org.springframework.kafka.spring.kafka)
    api(libs.io.confluent.kafka.avro.serializer)
    api(libs.io.projectreactor.kafka.reactor.kafka)
    api(libs.org.springframework.retry.spring.retry)
    api(libs.org.redisson.redisson.spring.boot.starter)
    api(libs.org.redisson.redisson)
    api(libs.org.springframework.cloud.spring.cloud.starter.zipkin)
    api(libs.org.springframework.cloud.spring.cloud.starter.sleuth)
    api(libs.org.springframework.boot.spring.boot.starter.actuator)
    api(libs.io.micrometer.micrometer.registry.prometheus)
    api(libs.com.github.ben.manes.caffeine.caffeine)
    api(libs.ch.qos.logback.logback.core)
    api(libs.jakarta.validation.jakarta.validation.api)
    runtimeOnly(libs.org.postgresql.r2dbc.postgresql)
    testImplementation(libs.org.mockito.mockito.junit.jupiter)
    testImplementation(libs.com.h2database.h2)
    testImplementation(libs.org.springframework.amqp.spring.rabbit.test)
    testImplementation(libs.org.springframework.boot.spring.boot.starter.test)
    testImplementation(libs.org.junit.jupiter.junit.jupiter.engine)
    testImplementation(libs.io.projectreactor.reactor.test)
    compileOnly(libs.org.projectlombok.lombok)
}

description = "user-service"
