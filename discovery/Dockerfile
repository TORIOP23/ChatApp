# context is the parent directory of project
FROM gradle:jdk21 AS builder
WORKDIR /builder
COPY ./buildSrc ./buildSrc
COPY ./gradle/libs.versions.toml ./gradle/
COPY ./discovery/build.gradle.kts ./
COPY ./discovery/src ./src
RUN gradle build

FROM eclipse-temurin:21-jre-alpine
EXPOSE 8080
WORKDIR /app
RUN addgroup -g 1000 discovery  \
    && adduser -u 1000 -G discovery -D -H discovery
COPY --from=builder --chown=discovery:discovery /builder/build/libs/*.jar ./discovery.jar
USER discovery
ENTRYPOINT ["java","-jar","./discovery.jar"]