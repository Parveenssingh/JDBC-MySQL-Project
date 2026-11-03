CREATE DATABASE hostel_db;

USE hostel_db;

CREATE TABLE HostelStudent (
    student_id INT PRIMARY KEY,
    student_name VARCHAR(100),
    roll_number VARCHAR(20),
    hostel_name VARCHAR(50),
    room_number VARCHAR(20),
    fee DOUBLE
);

USE hostel_db;

SELECT * FROM HostelStudent;