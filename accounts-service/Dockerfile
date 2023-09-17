FROM openjdk:17-jdk-slim

ARG JAR_FILE=target/*.jar

COPY ${JAR_FILE} accounts-service.jar

ENTRYPOINT ["java", "-jar", "/accounts-service.jar"]

EXPOSE 8080