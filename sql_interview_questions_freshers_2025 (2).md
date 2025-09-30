
SQL Interview Questions for Freshers (2025)

1. What is SQL? Explain its different types of commands (DDL, DML, DCL, TCL).
2. Write a query to fetch all records from the 'employees' table.
3. How do you select unique departments from the 'employees' table?
4. Write a query to display employees in the 'IT' department with salary greater than 50,000.
5. Explain the difference between WHERE and HAVING clauses with examples.
6. How to find the highest salary from the 'employees' table?
7. Write a query to display the top 5 highest paid employees.
8. Explain INNER JOIN, LEFT JOIN, RIGHT JOIN, and FULL OUTER JOIN with examples.
9. Write a query to find the average salary for each department.
10. How to find employees whose names start with 'A'?
11. Write a query to count the total number of employees in each department.
12. Explain the difference between UNION and UNION ALL.
13. How to update the salary of an employee named 'John' to 60000?
14. Write a query to delete all employees from the 'HR' department.
15. Explain the difference between CHAR and VARCHAR data types.
16. Write a query to create a new table 'projects' with columns: id, project_name, start_date, end_date.
17. How to add a new column 'designation' to the 'employees' table?
18. Explain what a subquery is and write an example to find employees with salary greater than the average salary.
19. How to display duplicate records from a table?
20. What is normalization? Explain its types briefly.
21. Write a query to find the second highest salary from the 'employees' table.
22. What are indexes in SQL? Why are they used?
23. Write a query using CASE to display salary grades: 'High', 'Medium', 'Low' based on salary range.
24. Explain the difference between DELETE, TRUNCATE, and DROP commands.
25. How to find employees hired between two dates?

## Solution :- 

Perfect — you’re asking for **25 SQL fresher-level interview questions (2025)** with **detailed answers + examples**. I’ll go through each one, give a **clear explanation**, and provide a **sample SQL query** where appropriate.

---

## **SQL Interview Q&A for Freshers (2025)**

---

### **1. What is SQL? Explain its different types of commands (DDL, DML, DCL, TCL).**

**Answer:**
SQL (Structured Query Language) is used to interact with relational databases. It allows creating tables, inserting data, updating, retrieving, and managing transactions.

* **DDL (Data Definition Language):** Defines database objects.
  Examples: `CREATE`, `ALTER`, `DROP`, `TRUNCATE`.
* **DML (Data Manipulation Language):** Manipulates data inside tables.
  Examples: `SELECT`, `INSERT`, `UPDATE`, `DELETE`.
* **DCL (Data Control Language):** Controls access and permissions.
  Examples: `GRANT`, `REVOKE`.
* **TCL (Transaction Control Language):** Manages transactions.
  Examples: `COMMIT`, `ROLLBACK`, `SAVEPOINT`.

---

### **2. Write a query to fetch all records from the `employees` table.**

```sql
SELECT * FROM employees;
```

This returns every column and row from the table.

---

### **3. How do you select unique departments from the `employees` table?**

```sql
SELECT DISTINCT department FROM employees;
```

`DISTINCT` removes duplicate values.

---

### **4. Write a query to display employees in the `IT` department with salary greater than 50,000.**

```sql
SELECT name, department, salary
FROM employees
WHERE department = 'IT' AND salary > 50000;
```

---

### **5. Explain the difference between WHERE and HAVING clauses with examples.**

* **WHERE** filters rows **before aggregation**.
* **HAVING** filters groups **after aggregation**.

**Example:**

```sql
-- WHERE
SELECT * FROM employees WHERE salary > 50000;

-- HAVING
SELECT department, AVG(salary) AS avg_sal
FROM employees
GROUP BY department
HAVING AVG(salary) > 50000;
```

---

### **6. How to find the highest salary from the `employees` table?**

```sql
SELECT MAX(salary) AS highest_salary FROM employees;
```

---

### **7. Write a query to display the top 5 highest paid employees.**

```sql
-- MySQL / PostgreSQL
SELECT name, salary
FROM employees
ORDER BY salary DESC
LIMIT 5;
```

---

### **8. Explain INNER JOIN, LEFT JOIN, RIGHT JOIN, and FULL OUTER JOIN with examples.**

* **INNER JOIN:** Returns rows present in both tables.
* **LEFT JOIN:** All rows from left table + matched rows from right.
* **RIGHT JOIN:** All rows from right table + matched rows from left.
* **FULL OUTER JOIN:** All rows from both tables, unmatched rows filled with NULL.

**Example:**

```sql
-- INNER JOIN
SELECT e.name, d.dept_name
FROM employees e
INNER JOIN departments d ON e.dept_id = d.dept_id;

-- LEFT JOIN
SELECT e.name, d.dept_name
FROM employees e
LEFT JOIN departments d ON e.dept_id = d.dept_id;
```

---

### **9. Write a query to find the average salary for each department.**

```sql
SELECT department, AVG(salary) AS avg_salary
FROM employees
GROUP BY department;
```

---

### **10. How to find employees whose names start with 'A'?**

```sql
SELECT * FROM employees WHERE name LIKE 'A%';
```

---

### **11. Write a query to count the total number of employees in each department.**

```sql
SELECT department, COUNT(*) AS emp_count
FROM employees
GROUP BY department;
```

---

### **12. Explain the difference between UNION and UNION ALL.**

* **UNION:** Combines results from two queries, removes duplicates.
* **UNION ALL:** Combines results and keeps duplicates.

**Example:**

```sql
SELECT name FROM employees
UNION
SELECT name FROM interns;

SELECT name FROM employees
UNION ALL
SELECT name FROM interns;
```

---

### **13. How to update the salary of an employee named 'John' to 60000?**

```sql
UPDATE employees
SET salary = 60000
WHERE name = 'John';
```

---

### **14. Write a query to delete all employees from the `HR` department.**

```sql
DELETE FROM employees WHERE department = 'HR';
```

---

### **15. Explain the difference between CHAR and VARCHAR data types.**

* **CHAR(n):** Fixed-length storage (always uses `n` characters, padded with spaces). Good for fixed-size data (e.g., country codes).
* **VARCHAR(n):** Variable-length storage (stores only actual characters). Better for variable-size strings like names.

---

### **16. Write a query to create a new table `projects` with columns: id, project_name, start_date, end_date.**

```sql
CREATE TABLE projects (
    id INT PRIMARY KEY,
    project_name VARCHAR(100),
    start_date DATE,
    end_date DATE
);
```

---

### **17. How to add a new column `designation` to the `employees` table?**

```sql
ALTER TABLE employees ADD designation VARCHAR(50);
```

---

### **18. Explain what a subquery is and write an example to find employees with salary greater than the average salary.**

**Answer:**
A subquery is a query inside another query. It provides intermediate results for the outer query.

**Example:**

```sql
SELECT name, salary
FROM employees
WHERE salary > (SELECT AVG(salary) FROM employees);
```

---

### **19. How to display duplicate records from a table?**

```sql
SELECT name, COUNT(*) AS cnt
FROM employees
GROUP BY name
HAVING COUNT(*) > 1;
```

---

### **20. What is normalization? Explain its types briefly.**

**Answer:**
Normalization organizes data to reduce redundancy.

* **1NF:** Atomic values, no repeating groups.
* **2NF:** 1NF + full dependency on primary key.
* **3NF:** 2NF + no transitive dependencies.
* **BCNF:** Every determinant is a candidate key.

---

### **21. Write a query to find the second highest salary from the `employees` table.**

```sql
-- MySQL / PostgreSQL
SELECT MAX(salary) AS second_highest
FROM employees
WHERE salary < (SELECT MAX(salary) FROM employees);
```

---

### **22. What are indexes in SQL? Why are they used?**

**Answer:**
Indexes are special data structures (like B-trees) that speed up search and filtering.

* Pros: Faster `SELECT`, efficient joins.
* Cons: Extra storage, slower `INSERT`/`UPDATE`.

**Example:**

```sql
CREATE INDEX idx_salary ON employees(salary);
```

---

### **23. Write a query using CASE to display salary grades: 'High', 'Medium', 'Low' based on salary range.**

```sql
SELECT name, salary,
  CASE
    WHEN salary > 80000 THEN 'High'
    WHEN salary BETWEEN 50000 AND 80000 THEN 'Medium'
    ELSE 'Low'
  END AS salary_grade
FROM employees;
```

---

### **24. Explain the difference between DELETE, TRUNCATE, and DROP commands.**

* **DELETE:** Removes specific rows with `WHERE`; can rollback.
* **TRUNCATE:** Removes all rows; faster; usually resets identity.
* **DROP:** Deletes entire table structure and data.

---

### **25. How to find employees hired between two dates?**

```sql
SELECT name, hire_date
FROM employees
WHERE hire_date BETWEEN '2022-01-01' AND '2023-01-01';
```

---
