Spring Boot Application with Thymeleaf

Description

This is a Spring Boot application that uses Thymeleaf as the template engine for generating web views. The application also uses an H2 database in local mode for data storage.

System Requirements

Java: Version 17

Maven: Version 3.6.3

Running the Application

Step 1: Clone the Repository

Clone this repository to your local machine:

git clone <REPOSITORY_URL>
cd <PROJECT_NAME>

Step 2: Build the Application

Run the following command to compile the project:

mvn clean install

Step 3: Run the Application

Use the following command to start the application:

mvn spring-boot:run

Step 4: Access the Application

Once started, you can access the application at:

http://localhost:8080

H2 Database

The application is configured to use an H2 database in local mode. You can access the H2 web console at:

http://localhost:8080/h2-console

H2 Credentials

JDBC URL: jdbc:h2:mem:testdb

User: sa

Password: (empty)

Project Structure

src/main/java: Application source code.

src/main/resources: Configuration files and Thymeleaf templates.

templates: Thymeleaf HTML views.

application.properties: Application configurations.

Technologies Used

Spring Boot: Main framework for building the application.

Thymeleaf: Template engine for rendering views.

H2 Database: Embedded database for temporary storage.

Notes

Ensure you have Java 17 and Maven 3.6.3 properly configured in your environment.

This project is configured for local execution and does not include production environment configurations.
