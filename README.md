# Welcome to the cinema application
Cinema App is a web-based application that allows you to order cinema tickets. Here is a list of what you can do with it:
- Log in and registration.
- Add new cinema hall.
- Get the list of all cinema halls.
- Add a new movie.
- Get the list of all movies.
- Add a new movie session.
- Get available movie sessions.
- Update movie sessions.
- Delete movie sessions.
- Place an order on the user's shopping cart.
- Get all orders by the user.
- Add movie session in shopping cart user.
- Get a shopping cart by the user.
- Get user by email.
---
## This application has a three-tier architecture.
- Dao - work with a database using CRUD commands at Hibernate framework.
- Service - business logic, working with data before and after adding to the database.
- Controller - it's a layer application that realized all requests from users.
---
## Technologies

- Java 11
- Tomcat - version 9.0.50
- Apache Maven
- MySQL
- Spring MVC
- Spring Core
- Spring Security
- Hibernate framework

## How to run "cinema_app"
First of all, you need to have installed IntelliJ IDEA, MySQL, and Tomcat version 9. Also, you can install Postman to do POST requests but this is optional.

1. Clone this repository.
2. Connect Tomcat to IntelliJ IDEA.
3. Fill variables **JDBC_DRIVER**, **URL**, **USER**, and **PASSWORD** in [db.properties](src/main/resources/db.properties) to connect application to database.
4. But For correct work with all kinds of commands recommended to using Postman.
5. Now you can run "cinema_app"