# context is the parent directory of project
FROM gradle:jdk21 AS builder

WORKDIR /builder/
COPY ./buildSrc ./buildSrc
COPY ./gradle/libs.versions.toml ./gradle/
COPY ./common/build.gradle.kts ./common/
COPY ./common/src ./common/src
COPY ./gateway-service/build.gradle.kts ./gateway-service/
COPY ./gateway-service/src ./gateway-service/src
RUN echo 'rootProject.name = "ChatApp"' > settings.gradle && \
    echo 'include(":gateway-service")' >> settings.gradle && \
    echo 'include(":common")' >> settings.gradle
RUN gradle build

FROM eclipse-temurin:21-jre-alpine
EXPOSE 8080
WORKDIR /app
RUN addgroup -g 1000 app  \
    && adduser -u 1000 -G app -D -H app
COPY --from=builder --chown=app:app /builder/gateway-service/build/libs/*.jar ./app.jar
USER app
ENTRYPOINT ["java","-jar","./app.jar"]