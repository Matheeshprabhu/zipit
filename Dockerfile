FROM openjdk:17-jdk-slim

WORKDIR /app

COPY target/zipit-1.0.0.jar zipit.jar

EXPOSE 8080

CMD ["java", "-jar", "zipit.jar"]
