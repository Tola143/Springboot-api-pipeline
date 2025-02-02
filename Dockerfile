# Use a lightweight JDK 17 image
FROM openjdk:8

# Expose application port
EXPOSE 8080

ADD target/workshop.jar workshop.jar

# Run the application
ENTRYPOINT ["java", "-jar", "workshop.jar"]
