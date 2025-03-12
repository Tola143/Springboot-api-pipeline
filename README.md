# Workshop2025 | Spring Boot API Pipeline

This repository contains a Spring Boot application that demonstrates a CI/CD pipeline for building, testing, and deploying a RESTful API. The project is designed to showcase best practices for automating the development and deployment process using tools like GitHub Actions and Docker.

## Table of Contents

1. [Overview](#overview)
2. [Features](#features)
3. [Technologies Used](#technologies-used)
4. [Getting Started](#getting-started)
   - [Prerequisites](#prerequisites)
   - [Installation](#installation)
5. [Running the Application](#running-the-application)
6. [CI/CD Pipeline](#cicd-pipeline)
   - [GitHub Actions](#github-actions)
   - [Docker](#docker)
7. [API Documentation](#api-documentation)
8. [Contributing](#contributing)
9. [License](#license)

---

## Overview

The **Spring Boot API Pipeline** project is a demonstration of how to build, test, and deploy a RESTful API using modern DevOps practices. The application is built with Spring Boot and includes a CI/CD pipeline powered by GitHub Actions and Docker.

---

## Features

- **RESTful API**: Exposes endpoints for managing resources (e.g., users, products).
- **CI/CD Pipeline**: Automated build, test, and deployment process using GitHub Actions.
- **Docker Support**: Containerized application for easy deployment.

---

## Technologies Used

- **Spring Boot**: Framework for building the RESTful API.
- **Gradle**: Build and dependency management.
- **GitHub Actions**: CI/CD pipeline automation.
- **Docker**: Containerization of the application.
- **Swagger**: API documentation.

---

## Getting Started

### Prerequisites

Before you begin, ensure you have the following installed:

- [Java JDK](https://openjdk.org/) (v17 or higher)
- [Gradle](https://gradle.org/) (v7.0 or higher)
- [Docker](https://www.docker.com/)
- [Git](https://git-scm.com/)

### Installation

1. Clone the repository:
   ```bash
   git clone https://github.com/Tola143/Springboot-api-pipeline.git
   cd Springboot-api-pipeline
   ```

2. Build the project using Gradle:
   ```bash
   ./gradlew build
   ```

3. Run the application locally:
   ```bash
   ./gradlew bootRun
   ```

---

## Running the Application

### Local Development

To run the application locally, use the following command:

```bash
./gradlew bootRun
```

The application will start on `http://localhost:8080`.

### Docker

To build and run the application using Docker:

1. Build the Docker image:
   ```bash
   docker build -t springboot-api-pipeline .
   ```

2. Run the Docker container:
   ```bash
   docker run -p 8080:8080 springboot-api-pipeline
   ```

The application will be accessible at `http://localhost:8080`.

---

## CI/CD Pipeline

### GitHub Actions

The CI/CD pipeline is defined in `.github/workflows/ci-cd.yml`. It includes the following steps:

1. **Build**: Compiles the application using Gradle.
2. **Test**: Runs unit tests.
3. **Docker Build**: Builds the Docker image.
4. **Docker Push**: Pushes the Docker image to a container registry (e.g., Docker Hub).

### Docker

The `Dockerfile` defines the containerization process for the application. It uses a multi-stage build to optimize the final image size.

---

## API Documentation

The API is documented using Swagger. You can access the Swagger UI at:

```
http://localhost:8080/swagger-ui.html
```

---

## Contributing

Contributions are welcome! If you'd like to contribute, please follow these steps:

1. Fork the repository.
2. Create a new branch for your feature or bugfix.
3. Commit your changes and push to the branch.
4. Submit a pull request.

---

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.
