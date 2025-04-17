# live09 Project

## Overview
The live09 project is a Spring application that connects to an Oracle database. It is packaged as a Docker container for easy deployment and management.

## Files Description

- **src/main/resources/application.properties**: Contains configuration settings for the Spring application, including database connection details and Hibernate properties.

- **Dockerfile**: Defines the instructions to build a Docker image for the application. It uses the Eclipse Temurin base image, adds the application JAR file, exposes port 8080, and sets the entry point to run the JAR.

- **docker-compose.yaml**: Defines the services, networks, and volumes for the application. It specifies how to run the application container and includes environment variables for the Spring datasource configuration.

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

## API Endpoints

### QualidadeArController

Este controlador gestiona las operaciones relacionadas con la calidad del aire.

#### Endpoints

1. **Obtener todos los registros de calidad del aire**
   - **URL**: `/qualidade-ar`
   - **Método**: `GET`
   - **Respuesta**: Lista de objetos `QualidadeAr`.
   - **Códigos de estado**:
     - `200 OK`: Si se encuentran registros.
     - `404 Not Found`: Si no hay registros disponibles.

2. **Obtener un registro de calidad del aire por ID**
   - **URL**: `/qualidade-ar/{id}`
   - **Método**: `GET`
   - **Parámetros**:
     - `id` (Path Variable): ID del registro.
   - **Respuesta**: Objeto `QualidadeAr`.
   - **Códigos de estado**:
     - `200 OK`: Si el registro es encontrado.
     - `404 Not Found`: Si el registro no existe.

3. **Crear un nuevo registro de calidad del aire**
   - **URL**: `/qualidade-ar`
   - **Método**: `POST`
   - **Cuerpo de la solicitud**: Objeto JSON con los datos de `QualidadeAr`.
   - **Respuesta**: Mensaje de éxito con detalles del registro creado.
   - **Códigos de estado**:
     - `201 Created`: Si el registro es creado exitosamente.

4. **Actualizar un registro de calidad del aire**
   - **URL**: `/qualidade-ar/{id}`
   - **Método**: `PUT`
   - **Parámetros**:
     - `id` (Path Variable): ID del registro a actualizar.
   - **Cuerpo de la solicitud**: Objeto JSON con los datos actualizados de `QualidadeAr`.
   - **Respuesta**: Mensaje de éxito con detalles del registro actualizado.
   - **Códigos de estado**:
     - `200 OK`: Si el registro es actualizado exitosamente.
     - `404 Not Found`: Si el registro no existe.

5. **Eliminar un registro de calidad del aire**
   - **URL**: `/qualidade-ar/{id}`
   - **Método**: `DELETE`
   - **Parámetros**:
     - `id` (Path Variable): ID del registro a eliminar.
   - **Respuesta**: Mensaje de éxito indicando que el registro fue eliminado.
   - **Códigos de estado**:
     - `204 No Content`: Si el registro es eliminado exitosamente.
     - `404 Not Found`: Si el registro no existe.

---

### AuthController

Este controlador gestiona la autenticación y el registro de usuarios.

#### Endpoints

1. **Iniciar sesión**
   - **URL**: `/auth/login`
   - **Método**: `POST`
   - **Cuerpo de la solicitud**: Objeto JSON con las credenciales del usuario:
     ```json
     {
       "email": "usuario@example.com",
       "password": "contraseña"
     }
     ```
   - **Respuesta**: Token de autenticación.
   - **Códigos de estado**:
     - `200 OK`: Si las credenciales son válidas.
     - `401 Unauthorized`: Si las credenciales son incorrectas.

2. **Registrar un nuevo usuario**
   - **URL**: `/auth/register`
   - **Método**: `POST`
   - **Cuerpo de la solicitud**: Objeto JSON con los datos del usuario:
     ```json
     {
       "email": "usuario@example.com",
       "password": "contraseña",
       "nombre": "Nombre del Usuario"
     }
     ```
   - **Respuesta**: Objeto JSON con los datos del usuario registrado.
   - **Códigos de estado**:
     - `201 Created`: Si el usuario es registrado exitosamente.
     - `400 Bad Request`: Si los datos proporcionados son inválidos.

---