FROM openjdk:17-jdk-slim

ARG JAR_FILE=target/*.jar

COPY ${JAR_FILE} cards-service.jar

ENTRYPOINT ["java", "-jar", "/cards-service.jar"]

EXPOSE 8080