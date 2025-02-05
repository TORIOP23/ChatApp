FROM eclipse-temurin:21-jre-alpine
EXPOSE 8080
WORKDIR /app
RUN addgroup -g 1000 app  \
    && adduser -u 1000 -G app -D -H app
COPY --chown=app:app ./build/libs/*.jar ./app.jar
USER app
ENTRYPOINT ["java","-jar","./app.jar"]