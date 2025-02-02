# Use JDK 17 base image
FROM openjdk:17-jdk-slim

# Set working directory
WORKDIR /app

# Expose the application port
EXPOSE 8080

# Copy the built JAR file from the Gradle build directory
COPY build/libs/rest-api-0.0.1-SNAPSHOT.jar workshop.jar

# Run the application
ENTRYPOINT ["java", "-jar", "workshop.jar"]
