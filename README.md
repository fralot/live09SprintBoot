# live09 Project

## Overview
The live09 project is a Spring application that connects to an Oracle database. It is packaged as a Docker container for easy deployment and management.

## Files Description

- **src/main/resources/application.properties**: Contains configuration settings for the Spring application, including database connection details and Hibernate properties.

- **Dockerfile**: Defines the instructions to build a Docker image for the application. It uses the Eclipse Temurin base image, adds the application JAR file, exposes port 8080, and sets the entry point to run the JAR.

- **docker-compose.yaml**: Defines the services, networks, and volumes for the application. It specifies how to run the application container and includes environment variables for the Spring datasource configuration.

- **.env**: Contains environment variables used in the `docker-compose.yaml` file, specifically for the Spring datasource configuration.

## Setup Instructions

1. **Clone the Repository**
   Clone the repository to your local machine.

2. **Build the Docker Image**
   Navigate to the project directory and run the following command to build the Docker image:
   ```
   docker build -t live09 .
   ```

3. **Run the Application**
   Use Docker Compose to start the application:
   ```
   docker-compose up
   ```

4. **Access the Application**
   Once the application is running, you can access it at `http://localhost:8080`.

## Usage
Follow the setup instructions to build and run the application. Ensure that the Oracle database is accessible with the provided credentials in the `.env` file.