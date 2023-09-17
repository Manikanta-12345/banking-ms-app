FROM openjdk:17-jdk-slim

ARG JAR_FILE=target/*.jar

COPY ${JAR_FILE} tellicaller-app.jar

ENTRYPOINT ["java", "-jar", "/tellicaller-app.jar"]

EXPOSE 8080