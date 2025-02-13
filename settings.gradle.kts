/*
 * This file was generated by the Gradle 'init' task.
 *
 * The settings file is used to specify which projects to include in your build.
 * For more detailed information on multi-project builds, please refer to https://docs.gradle.org/8.11.1/userguide/multi_project_builds.html in the Gradle documentation.
 */

rootProject.name = "ChatApp"
//include(":auth-service")
//include(":notification-db")
include(":discovery-service")
//include(":chat-service")
//include(":kafka-admin")
//include(":kafka-to-elastic-service")
//include(":rabbitmq")
//include(":search-service")
include(":gateway-service")
//include(":user-service")
//include(":asset-service")
//include(":user-db")
//include(":kafka-consumer")
include(":common")
//include(":elastic")
//include(":migrations")
//include(":kafka-model")
//include(":kafka-producer")
//include(":kafka")
//project(":notification-db").projectDir = file("migrations/notification-db")
//project(":kafka-admin").projectDir = file("kafka/kafka-admin")
//project(":user-db").projectDir = file("migrations/user-db")
//project(":kafka-consumer").projectDir = file("kafka/kafka-consumer")
//project(":kafka-model").projectDir = file("kafka/kafka-model")
//project(":kafka-producer").projectDir = file("kafka/kafka-producer")
