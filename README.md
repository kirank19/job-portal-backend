# job-portal-backend
Backend for Job Portal project using Spring Boot with REST APIs and security. Spring Boot REST API for managing job posts, users, and authentication.job Portal backend with user authentication, job management, and secured APIs.

---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------


Features:

User registration and login

Job management (create, read, update, delete jobs)

Passwords hashed with BCrypt

Role-based access control (USER, ADMIN)

---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------





Technologies Used:

Java 17+

Spring Boot

Spring Security

Spring Data JPA / Hibernate

PostgreSQL

Maven

---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------





Database Setup:

Database name: Jobs

spring.datasource.url=jdbc:postgresql://localhost:5432/Jobs

spring.datasource.username=YOUR_DB_USERNAME

spring.datasource.password=YOUR_DB_PASSWORD

spring.jpa.hibernate.ddl-auto=update

spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.PostgreSQLDialect

---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------




Running the Application:

App runs at http://localhost:8080

---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------




Security:

User passwords are secured using BCrypt hashing.

Role-based access control ensures only users with the correct role can access specific endpoints (USER, ADMIN).


