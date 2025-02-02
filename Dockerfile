# Use a lightweight JDK 17 image
FROM openjdk:17-jdk-slim

# Set working directory
WORKDIR /app

# Expose application port
EXPOSE 8080

# Copy the built JAR file into the container
COPY build/libs/workshop.jar workshop.jar

# Run the application
ENTRYPOINT ["java", "-jar", "workshop.jar"]
