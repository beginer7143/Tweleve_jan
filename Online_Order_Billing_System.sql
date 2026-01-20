-- =========================================
-- Coding Challenge 2
-- Online Order Billing System
-- =========================================

-- 1. Create Database
CREATE DATABASE order_billing_db;

-- 2. Use Database
USE order_billing_db;

-- 3. Create Order Table
CREATE TABLE Orders (
    order_id INT PRIMARY KEY,
    customer_name VARCHAR(50),
    order_amount FLOAT,
    tax_percentage FLOAT,
    order_date DATE
);

-- 4. Insert 3 Sample Orders
INSERT INTO Orders VALUES
(1, 'Rohit Sharma', 1200.50, 5.0, '2024-02-01'),
(2, 'Neha Verma', 2500.00, 12.0, '2024-02-02'),
(3, 'Amit Patil', 800.75, 18.0, '2024-02-03');

-- 5. Display All Orders
SELECT * FROM Orders;
