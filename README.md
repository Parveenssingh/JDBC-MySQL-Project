# Hostel Management System using Java JDBC and MySQL

## Project Overview

This project is a Hostel Management System developed using Java and MySQL. It uses JDBC (Java Database Connectivity) to connect a Java application with a MySQL database.

The project helps manage hostel student records and perform database operations.

## Technologies Used

* Java
* JDBC
* MySQL
* MySQL Workbench
* IntelliJ IDEA

## Database Details

**Database Name:** hostel_db

**Table Name:** HostelStudent

### Table Structure

| Column Name  | Data Type         |
| ------------ | ----------------- |
| student_id   | INT (Primary Key) |
| student_name | VARCHAR(100)      |
| roll_number  | VARCHAR(20)       |
| hostel_name  | VARCHAR(50)       |
| room_number  | VARCHAR(20)       |
| fee          | DOUBLE            |

## Features

1. Connect Java application with MySQL database.
2. Calculate Total Hostel Fee.
3. Delete student records using Student ID.
4. Delete records only when the specified fee condition is satisfied.

## Project Structure

```text
HostelManagementJDBC/
│
├── src/
│   └── Main.java
│
├── database/
│   └── hostel_db.sql
│
└── .gitignore
```

## How to Run

1. Install Java JDK.
2. Install MySQL Server and MySQL Workbench.
3. Create the database named hostel_db.
4. Execute the SQL script provided in the database folder.
5. Add MySQL Connector/J to the Java project.
6. Configure your MySQL username and password.
7. Run Main.java using IntelliJ IDEA.

## Author

Parveen Singh

## Project Purpose

This project demonstrates Java Database Connectivity (JDBC), SQL queries, database connectivity, and CRUD-related database operations.
