-- ================================
-- Coding Challenge 1
-- Employee Attendance Tracking System
-- ================================

-- 1. Create Database
CREATE DATABASE attendance_db;

-- 2. Use Database
USE attendance_db;

-- 3. Create Employee Table
CREATE TABLE Employee (
    emp_id INT PRIMARY KEY,
    emp_name VARCHAR(50),
    department VARCHAR(30)
);

-- 4. Create Attendance Table
CREATE TABLE Attendance (
    attendance_id INT PRIMARY KEY,
    emp_id INT,
    attendance_date DATE,
    is_present BOOLEAN,
    UNIQUE (emp_id, attendance_date),   -- one attendance per employee per day
    FOREIGN KEY (emp_id) REFERENCES Employee(emp_id)
);

-- 5. Insert 2 Employees
INSERT INTO Employee VALUES
(1, 'Amit Sharma', 'IT'),
(2, 'Neha Patil', 'HR');

-- 6. Insert Attendance Records for Today
INSERT INTO Attendance VALUES
(101, 1, CURDATE(), TRUE),   -- Present
(102, 2, CURDATE(), FALSE); -- Absent

-- 7. Display All Attendance Records
SELECT * FROM Attendance;
