FROM eclipse-temurin:21-alpine
VOLUME /tmp

ARG JAR_FILE=target/games-0.0.1-SNAPSHOT.jar
ADD ${JAR_FILE} app.jar

ENV PROFILE=prd

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "/app.jar"]