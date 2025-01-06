# Fitness Tracker

A user-friendly fitness tracker application that allows individuals to monitor their fitness activities and progress.

## Features

- User registration and login
- Track various fitness activities (running, cycling, etc.)
- View progress through interactive charts
- Responsive design for mobile and desktop
- User-friendly interface with HTML, CSS, and JavaScript

## Technologies Used

- **Frontend**: HTML, CSS, JavaScript
- **Backend**: Java
- **Database**: MySQL for data storage
- **Frameworks**: Optional frameworks can be used for enhanced functionality (e.g., Bootstrap for styling)

## Prerequisites

- Java Development Kit (JDK) 17 or higher
- MySQL Server
- IDE (e.g., IntelliJ IDEA, Eclipse)
- Basic knowledge of HTML, CSS, and JavaScript

## Project Structure
The project is structured as follows:
- `src/main/java/com/fitnesscoach`: Contains all Java source files.
- `src/main/resources`: Contains configuration files and SQL scripts.
- `src/main/webapp`: Contains JSP files and the web.xml configuration.
- `pom.xml`: Maven configuration file.

## Setup
1. Clone the repository.
2. Create a MySQL database named `fitness_coach`.
3. Run the SQL script located in `src/main/resources/db/schema.sql` to set up the database schema.
4. Update the database connection details in `DatabaseConnection.java`.
5. Build the project using Maven: `mvn clean install`.
6. Deploy the WAR file to a servlet container (e.g., Apache Tomcat).

## Running Tests
To run the unit tests, use the following command:
```bash
mvn testryone!