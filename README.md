# Student and Subject Management System API

This project is a simple Spring Boot application that demonstrates a basic Student and Subject Management System. It includes RESTful APIs to manage students and subjects, and uses an in-memory H2 database.

# Features

- **RESTful API Endpoints** for managing students and subjects.
- **Role-Based Access Control** with roles for `student` and `admin`.
- **In-Memory Database** using H2 for quick setup and testing.
- **Spring Data JPA** for data persistence.

# Prerequisites

- Java 17 or later
- Maven 3.6 or later

# Getting Started

Follow these instructions to set up and run the project locally.

# Clone the Repository

```bash
git clone https://github.com/Shiraz31/Api.git
cd Api

# Access the application:
Open your browser and go to "http://localhost:8080/h2-console" to access the H2 database console.

# Accessing the H2 Database:
Open the H2 console: http://localhost:8080/h2-console

Use the following credentials:
JDBC URL: jdbc:h2:mem:testdb
Username: sh
Password:

Additional Sections:
Project Structure:
Provide an overview of the project's directory structure. This helps newcomers understand the layout of the project.

# Project Structure
. src/main/java: Contains the main application code.
. controller: REST controllers for handling API requests.
. service: Service layer for business logic.
. repository: JPA repositories for data access.
. model: Entity classes representing the data model.
. src/main/resources: Application configuration files.
. application.properties: Application configuration.
. src/test: Unit and integration tests.

# Testing with Postman
# Follow these steps to test the API endpoints using Postman:

Step 1: Authenticate and Obtain JWT Token
Open Postman and create a new request.

Set the request type to POST.

Enter the URL: http://localhost:8080/authenticate.

Go to the Body tab, select raw and choose JSON from the dropdown.

Enter the authentication credentials in JSON format:
{
  "username": "student",
  "password": "password"
}
Click Send to submit the request.

Copy the JWT token from the response body.

Step 2: Use JWT Token to Access Secured Endpoints
Create a Student
Create a new request in Postman.

Set the request type to POST.

Enter the URL: http://localhost:8080/api/students.

Go to the Headers tab and add a header with:

Key: Authorization
Value: Bearer your_jwt_token_here (replace your_jwt_token_here with the token you received)
Go to the Body tab, select raw and choose JSON.

Enter the student data:
{
  "name": "John Doe",
  "address": "123 Main St"
}
Click Send to submit the request.

Get List of All Students
Create a new request in Postman.
Set the request type to GET.
Enter the URL: http://localhost:8080/api/students.
Go to the Headers tab and add the Authorization header as before.
Click Send to retrieve the list of students.
Get List of All Subjects
Create a new request in Postman.
Set the request type to GET.
Enter the URL: http://localhost:8080/api/subjects.
Go to the Headers tab and add the Authorization header as before.
Click Send to retrieve the list of subjects.


