SQL Interview Questions for Freshers (2025)

1.  What is SQL and why is it used?
2.  What are the different types of SQL statements?
3.  What is the difference between DDL, DML, DCL, and TCL?
4.  What is the difference between SQL and MySQL?
5.  What are primary keys and foreign keys?
6.  What is the difference between unique key and primary key?
7.  What are constraints in SQL?
8.  What is the difference between WHERE and HAVING clause?
9.  What is the difference between CHAR and VARCHAR data types?
10. What are indexes in SQL? Why are they used?
11. What is normalization? Explain its types.
12. What is denormalization?
13. What is the difference between INNER JOIN, LEFT JOIN, RIGHT JOIN,
    and FULL JOIN?
14. What is a self-join?
15. What is a cross join?
16. What is the difference between UNION and UNION ALL?
17. What is the difference between DELETE, TRUNCATE, and DROP commands?
18. What are views in SQL? Why are they used?
19. What is the difference between clustered and non-clustered index?
20. What are stored procedures in SQL?
21. What is the difference between function and stored procedure?
22. What are triggers in SQL?
23. What is the difference between correlated subquery and
    non-correlated subquery?
24. What is the difference between EXISTS and IN operators?
25. What is the difference between RANK(), DENSE_RANK(), and
    ROW_NUMBER() functions?
26. What is the difference between GROUP BY and ORDER BY clauses?
27. What is the difference between COUNT(*), COUNT(column), and
    COUNT(DISTINCT column)?
28. What are aggregate functions in SQL?
29. What are scalar functions in SQL?
30. What is a transaction in SQL?
31. What are ACID properties in SQL?
32. What are savepoints in SQL?
33. What is the difference between a candidate key, super key, and
    composite key?
34. What are common data types in SQL?
35. What is the difference between NVL, ISNULL, and COALESCE functions?
36. What are common string functions in SQL?
37. What are common date functions in SQL?
38. What is a cursor in SQL?
39. What are common use cases of cursors?
40. What is the difference between OLTP and OLAP databases?
41. What is a schema in SQL?
42. What are temporary tables?
43. What are common operators in SQL?
44. What is the difference between BETWEEN and IN operators?
45. What is a recursive query in SQL?
46. What is the difference between a materialized view and a normal
    view?
47. What is indexing and how does it improve performance?
48. What is query optimization?
49. What is the difference between DELETE with WHERE clause and
    TRUNCATE?
50. What are the new features in SQL (latest versions of MySQL,
    PostgreSQL, SQL Server)?

## Solution : -
Great — below are clear, exam-/interview-ready answers to all **50 SQL questions** with explanations and short examples you can run in MySQL/Postgres/SQL Server (I note variations when relevant). I’ve kept each answer focused and practical so you can memorize or paste examples into a console. If you want, I can also convert this into a printable cheat-sheet or flashcards.

---

**Quick sample tables I’ll reuse for examples (create once):**

```sql
-- Generic SQL (works with minor tweaks across RDBMS)
CREATE TABLE departments (
  dept_id   INT PRIMARY KEY,
  name      VARCHAR(100)
);

CREATE TABLE employees (
  emp_id    INT PRIMARY KEY,
  name      VARCHAR(100),
  dept_id   INT,
  salary    DECIMAL(10,2),
  manager_id INT,        -- references employees(emp_id)
  hire_date DATE
);

INSERT INTO departments VALUES (1,'HR'),(2,'Engineering'),(3,'Sales');
INSERT INTO employees VALUES
 (1,'Alice',2,90000,NULL,'2020-01-15'),
 (2,'Bob',2,80000,1,'2021-06-01'),
 (3,'Carol',1,70000,NULL,'2019-03-20'),
 (4,'Dave',3,60000,3,'2022-09-10');
```

---

### 1. What is SQL and why is it used?

**Answer:**
SQL (Structured Query Language) is a declarative language for interacting with relational databases. Use it to create and modify schema (DDL), add/change/delete rows (DML), control access (DCL), and manage transactions (TCL). It’s used because it expresses *what* you want (e.g., “give me all employees with salary > 80k”), and the DBMS figures out *how* to execute efficiently.

**Example:**

```sql
SELECT name, salary FROM employees WHERE salary > 80000;
```

---

### 2. What are the different types of SQL statements?

**Answer:**
Common categories:

* DDL (Data Definition Language): `CREATE`, `ALTER`, `DROP`
* DML (Data Manipulation Language): `SELECT`, `INSERT`, `UPDATE`, `DELETE`
* DCL (Data Control Language): `GRANT`, `REVOKE`
* TCL (Transaction Control Language): `BEGIN/START TRANSACTION`, `COMMIT`, `ROLLBACK`

---

### 3. Difference between DDL, DML, DCL, and TCL?

**Answer:**

* **DDL** modifies schema (table definitions). Changes usually auto-commit.
* **DML** manipulates data rows. Transactional (can be rolled back).
* **DCL** manages security/permissions.
* **TCL** controls transactions: begin, commit, rollback, savepoints.

**Examples:**

```sql
-- DDL
CREATE TABLE t(id INT);

-- DML
INSERT INTO t VALUES (1);

-- TCL
BEGIN;
DELETE FROM t WHERE id=1;
ROLLBACK; -- undo

-- DCL (SQL Server/MySQL/Postgres)
GRANT SELECT ON t TO some_user;
```

---

### 4. Difference between SQL and MySQL?

**Answer:**

* **SQL**: a language standard (ANSI/ISO) for relational queries.
* **MySQL**: a relational database management system (RDBMS) implementation that uses SQL (with vendor-specific extensions).

---

### 5. What are primary keys and foreign keys?

**Answer:**

* **Primary Key (PK):** Uniquely identifies each row; cannot be NULL; one per table.
* **Foreign Key (FK):** A column (or set of columns) that references a PK (or unique key) in another table to enforce referential integrity.

**Example:**

```sql
ALTER TABLE employees
ADD CONSTRAINT fk_dept FOREIGN KEY (dept_id) REFERENCES departments(dept_id);
```

---

### 6. Difference between unique key and primary key?

**Answer:**

* **Primary Key:** Unique + NOT NULL; one per table; identifies row.
* **Unique Key:** Enforces uniqueness but may allow NULLs (behavior of NULL depends on RDBMS); you can have multiple unique keys per table.

---

### 7. What are constraints in SQL?

**Answer:**
Constraints are rules enforced by the DBMS at table level:

* `PRIMARY KEY`, `UNIQUE`, `NOT NULL`, `CHECK`, `FOREIGN KEY`, `DEFAULT`.
  They protect data integrity.

**Example:**

```sql
CREATE TABLE t2 (
  id INT PRIMARY KEY,
  code VARCHAR(10) UNIQUE,
  qty INT CHECK (qty >= 0),
  status VARCHAR(10) DEFAULT 'new'
);
```

---

### 8. Difference between WHERE and HAVING clause?

**Answer:**

* `WHERE` filters rows *before* aggregation/grouping.
* `HAVING` filters *after* GROUP BY (i.e., it filters groups, can use aggregates).

**Example:**

```sql
SELECT dept_id, AVG(salary) AS avg_sal
FROM employees
WHERE hire_date >= '2020-01-01'    -- filters rows first
GROUP BY dept_id
HAVING AVG(salary) > 70000;        -- filters groups
```

---

### 9. Difference between CHAR and VARCHAR data types?

**Answer:**

* `CHAR(n)`: fixed-length; always uses n bytes (padded if shorter). Good for fixed-size codes.
* `VARCHAR(n)`: variable-length; only stores actual characters + length; more space-efficient for variable text. Behavior and max lengths differ slightly across DBs.

---

### 10. What are indexes in SQL? Why are they used?

**Answer:**
Indexes are data structures (commonly B-tree) that speed up lookups, filtering, range scans, and joins by avoiding full table scans. Trade-off: faster reads, but extra storage and overhead on writes (INSERT/UPDATE/DELETE).

**Example:**

```sql
CREATE INDEX idx_emp_dept ON employees(dept_id);
```

---

### 11. What is normalization? Explain its types.

**Answer:**
Normalization organizes tables to reduce redundancy and improve integrity. Normal forms (common ones for interviews):

* **1NF (First)**: Atomic values (no repeating groups).
* **2NF (Second)**: 1NF + every non-key attribute fully depends on the whole primary key (relevant for composite PKs).
* **3NF (Third)**: 2NF + no transitive dependencies (non-key attributes depend only on PK).
* **BCNF (Boyce-Codd NF)**: Stronger than 3NF—every determinant is a candidate key.

**Example (design fix):**
If a table `orders(order_id, product_id, product_name, price)` duplicates `product_name`/`price`, normalization moves product attributes to `products` and references product_id.

---

### 12. What is denormalization?

**Answer:**
Deliberately introducing redundancy (e.g., copying commonly joined columns into one table) to improve read performance for OLAP/analytic or high-read workloads. Tradeoffs: potential update anomalies and extra storage. Use carefully after measuring.

---

### 13. Difference between INNER JOIN, LEFT JOIN, RIGHT JOIN, and FULL JOIN?

**Answer:**

* **INNER JOIN**: rows matched in both tables.
* **LEFT (LEFT OUTER) JOIN**: all rows from left table; matched rows from right; NULLs when no match.
* **RIGHT (RIGHT OUTER) JOIN**: mirror of LEFT (all from right).
* **FULL (FULL OUTER) JOIN**: all rows from both tables, NULL when no match on either side (not supported in MySQL before 8.x directly).

**Example:**

```sql
-- inner
SELECT * FROM employees e INNER JOIN departments d ON e.dept_id = d.dept_id;

-- left
SELECT * FROM employees e LEFT JOIN departments d ON e.dept_id = d.dept_id;
```

---

### 14. What is a self-join?

**Answer:**
Joining a table to itself to compare rows within the same table — useful for hierarchical data (e.g., employee → manager).

**Example:**

```sql
SELECT e.name AS employee, m.name AS manager
FROM employees e
LEFT JOIN employees m ON e.manager_id = m.emp_id;
```

---

### 15. What is a cross join?

**Answer:**
A Cartesian product of two tables — every row of A paired with every row of B. Use with care.

**Example:**

```sql
SELECT e.name, d.name
FROM employees e CROSS JOIN departments d;
```

---

### 16. Difference between UNION and UNION ALL?

**Answer:**

* **UNION**: combines result sets and removes duplicate rows (may sort/aggregate).
* **UNION ALL**: combines and keeps duplicates — faster because no deduplication.

**Example:**

```sql
SELECT name FROM employees
UNION
SELECT name FROM contractors;

SELECT name FROM employees
UNION ALL
SELECT name FROM contractors;
```

---

### 17. Difference between DELETE, TRUNCATE, and DROP commands?

**Answer:**

* **DELETE FROM table WHERE ...**: removes rows matching condition; logged per-row; can be rolled back (in transactions).
* **TRUNCATE TABLE**: removes all rows quickly by deallocating pages; minimal logging in many DBs; typically cannot use WHERE; often cannot be rolled back in some DBs or requires special permissions (behavior DB-dependent). Resets identity/autoincrement in many DBs.
* **DROP TABLE**: removes table definition and data; cannot select afterwards; DDL — auto-committed.

**Example:**

```sql
DELETE FROM employees WHERE emp_id = 4;
TRUNCATE TABLE employees;
DROP TABLE employees;
```

---

### 18. What are views in SQL? Why are they used?

**Answer:**
Views are named queries (virtual tables) created with `CREATE VIEW`. They simplify complex queries, provide an abstraction layer, enforce security (limit columns/rows), and present consistent interfaces. Some DBs support updatable views.

**Example:**

```sql
CREATE VIEW v_engineering AS
SELECT emp_id, name, salary FROM employees WHERE dept_id = 2;
SELECT * FROM v_engineering;
```

---

### 19. Difference between clustered and non-clustered index?

**Answer:**

* **Clustered index**: the table data is stored in the order of the index (physically ordered). Only one per table (typical). In InnoDB (MySQL), the primary key is clustered.
* **Non-clustered index**: separate structure with pointers to table rows (heap or clustered index). Multiple non-clustered indexes allowed.

**Example:**

```sql
-- SQL Server: create clustered
CREATE CLUSTERED INDEX ci_emp_id ON employees(emp_id);

-- MySQL: PRIMARY KEY is clustered in InnoDB
```

---

### 20. What are stored procedures in SQL?

**Answer:**
Precompiled/saved routines on the DB server that encapsulate multiple SQL statements, optionally accept parameters, and can perform DML/DDL/business logic. Good for reusing logic, reducing client round trips, and encapsulating permissions.

**Example (MySQL style):**

```sql
CREATE PROCEDURE give_raise(emp INT, pct DECIMAL(5,2))
BEGIN
  UPDATE employees SET salary = salary * (1 + pct/100) WHERE emp_id = emp;
END;
CALL give_raise(2, 5);
```

---

### 21. Difference between function and stored procedure?

**Answer:**

* **Function**: returns a value (scalar or table depending on DB), can be used in `SELECT` or expressions; should avoid side effects (DB-dependent).
* **Stored Procedure**: executes commands, may or may not return values, typically called with `CALL`/`EXEC`; can have side effects and complex flows. Behavior differs slightly across RDBMS (e.g., Postgres functions can return setof rows).

**Example:**

```sql
-- scalar function (Postgres/MySQL)
CREATE FUNCTION get_emp_salary(eid INT) RETURNS DECIMAL(10,2)
RETURN (SELECT salary FROM employees WHERE emp_id = eid);

SELECT get_emp_salary(2);
```

---

### 22. What are triggers in SQL?

**Answer:**
Triggers are automatic routines invoked by the DB in response to events (`INSERT`, `UPDATE`, `DELETE`) on a table. They can be `BEFORE`, `AFTER`, or `INSTEAD OF` (DB-dependent). Used for auditing, enforcing complex constraints, cascading actions.

**Example (MySQL):**

```sql
CREATE TRIGGER trg_after_insert_employee
AFTER INSERT ON employees
FOR EACH ROW
BEGIN
  INSERT INTO audit_log(event_type, description) VALUES ('INSERT', CONCAT('Added emp ', NEW.emp_id));
END;
```

---

### 23. Difference between correlated subquery and non-correlated subquery?

**Answer:**

* **Non-correlated subquery**: independent query executed once; results used by outer query.
* **Correlated subquery**: references columns from the outer query and typically runs once per outer row (can be slower).

**Example non-correlated:**

```sql
SELECT name FROM employees WHERE dept_id IN (SELECT dept_id FROM departments WHERE name='HR');
```

**Example correlated:**

```sql
SELECT e1.name
FROM employees e1
WHERE salary > (SELECT AVG(salary) FROM employees e2 WHERE e2.dept_id = e1.dept_id);
```

---

### 24. Difference between EXISTS and IN operators?

**Answer:**

* **IN** compares against a list or subquery results; behaves differently with `NULL`s and has performance implications when subquery returns many rows.
* **EXISTS** returns true if subquery returns any row; often used with correlated subqueries; often faster when checking existence with correlated checks.

**Example:**

```sql
-- using IN
SELECT name FROM employees WHERE dept_id IN (SELECT dept_id FROM departments WHERE name='Engineering');

-- using EXISTS (correlated)
SELECT name FROM employees e
WHERE EXISTS (SELECT 1 FROM departments d WHERE d.dept_id = e.dept_id AND d.name='Engineering');
```

**Note on NULLs:** `IN` can be tricky if the subquery returns NULL; `EXISTS` is usually safer for existence checks.

---

### 25. Difference between RANK(), DENSE_RANK(), and ROW_NUMBER() functions?

**Answer:**
All are window functions used for ranking rows in partitions:

* **ROW_NUMBER()**: gives unique sequential numbers (1,2,3...) — ties get distinct numbers arbitrarily by order clause.
* **RANK()**: ties get same rank, but leaves gaps after ties (e.g., 1,1,3).
* **DENSE_RANK()**: ties get same rank but no gaps (e.g., 1,1,2).

**Example:**

```sql
SELECT name, salary,
  ROW_NUMBER() OVER (ORDER BY salary DESC) rn,
  RANK() OVER (ORDER BY salary DESC) rnk,
  DENSE_RANK() OVER (ORDER BY salary DESC) dr
FROM employees;
```

---

### 26. Difference between GROUP BY and ORDER BY clauses?

**Answer:**

* **GROUP BY** groups rows to compute aggregates (SUM, COUNT, AVG).
* **ORDER BY** sorts result rows. You can `GROUP BY` and then `ORDER BY` aggregated results.

---

### 27. Difference between COUNT(*), COUNT(column), and COUNT(DISTINCT column)?

**Answer:**

* `COUNT(*)`: counts rows (including those with NULLs).
* `COUNT(column)`: counts non-NULL values in that column.
* `COUNT(DISTINCT column)`: counts unique non-NULL values.

**Example:**

```sql
SELECT COUNT(*) AS total_rows,
       COUNT(manager_id) AS have_manager,
       COUNT(DISTINCT dept_id) AS unique_depts
FROM employees;
```

---

### 28. What are aggregate functions in SQL?

**Answer:**
Functions that compute a single result from multiple input rows: `SUM()`, `AVG()`, `MIN()`, `MAX()`, `COUNT()`, `GROUP_CONCAT()`/`STRING_AGG()` (string aggregation).

**Example:**

```sql
SELECT dept_id, SUM(salary) AS total_pay FROM employees GROUP BY dept_id;
```

---

### 29. What are scalar functions in SQL?

**Answer:**
Functions that operate on single values and return a single value: `UPPER()`, `LOWER()`, `SUBSTRING()`, `LENGTH()`, `COALESCE()`, `ROUND()`, etc.

**Example:**

```sql
SELECT UPPER(name), SUBSTRING(name,1,3) FROM employees;
```

---

### 30. What is a transaction in SQL?

**Answer:**
A transaction is a logical unit of work that is atomic: either fully applied or fully rolled back. Typical commands: `BEGIN`, `COMMIT`, `ROLLBACK`.

**Example:**

```sql
BEGIN;
UPDATE accounts SET balance = balance - 100 WHERE id = 1;
UPDATE accounts SET balance = balance + 100 WHERE id = 2;
COMMIT;
```

---

### 31. What are ACID properties in SQL?

**Answer:**

* **Atomicity**: all-or-nothing.
* **Consistency**: DB moves from one valid state to another (constraints).
* **Isolation**: concurrent transactions don’t interfere (isolation levels).
* **Durability**: once committed, effects persist (even after crashes).

---

### 32. What are savepoints in SQL?

**Answer:**
A savepoint marks a point within a transaction to which you can roll back without rolling back the whole transaction.

**Example:**

```sql
BEGIN;
UPDATE t1 ...;
SAVEPOINT sp1;
UPDATE t2 ...;
ROLLBACK TO sp1;   -- undo t2 update only
COMMIT;
```

---

### 33. Difference between candidate key, super key, and composite key?

**Answer:**

* **Super Key**: any set of columns that uniquely identifies a row.
* **Candidate Key**: a minimal super key (no subset also uniquely identifies).
* **Composite Key**: candidate key consisting of multiple columns.

**Example:** In table `(a,b,c)`, if `(a,b)` and `(a)` both uniquely identify rows, `(a)` is candidate key; `(a,b)` is a super key but not minimal.

---

### 34. What are common data types in SQL?

**Answer:**
Numeric: `INT`, `BIGINT`, `SMALLINT`, `DECIMAL/NUMERIC`, `FLOAT`.
Text: `CHAR`, `VARCHAR`, `TEXT`.
Date/time: `DATE`, `TIME`, `DATETIME`, `TIMESTAMP`.
Boolean: `BOOLEAN`/`TINYINT(1)`.
Binary: `BLOB`, `BYTEA` (Postgres). JSON: `JSON`, `JSONB` (Postgres), `JSON` (MySQL). Exact names vary by DB.

---

### 35. Difference between NVL, ISNULL, and COALESCE functions?

**Answer:**

* **NVL(expr1, expr2)**: Oracle — returns `expr2` if `expr1` is NULL.
* **ISNULL(expr, repl)**: SQL Server (also MySQL has `IFNULL`) — similar to NVL.
* **COALESCE(expr1, expr2, ...)**: ANSI SQL standard — returns first non-NULL argument; can accept multiple args and has deterministic type precedence behavior. Prefer `COALESCE` for portability.

**Example:**

```sql
SELECT COALESCE(NULL, NULL, 'fallback'); -- returns 'fallback'
```

---

### 36. Common string functions in SQL?

**Answer:**
`CONCAT`, `SUBSTRING`/`SUBSTR`, `LENGTH`/`CHAR_LENGTH`, `UPPER`/`LOWER`, `TRIM`, `REPLACE`, `LEFT`/`RIGHT`, `POSITION`/`INSTR`.

**Example:**

```sql
SELECT CONCAT(LEFT(name,3), '_', dept_id) FROM employees;
```

---

### 37. Common date functions in SQL?

**Answer:**
`CURRENT_DATE`, `CURRENT_TIMESTAMP`, `DATEADD`/`INTERVAL` (add intervals), `DATEDIFF` (diff days), `EXTRACT` (year/month/day), `TO_CHAR`/`FORMAT` for formatting, `DATE_TRUNC` (Postgres).

**Example (Postgres):**

```sql
SELECT hire_date, CURRENT_DATE - hire_date AS days_with_company FROM employees;
```

---

### 38. What is a cursor in SQL?

**Answer:**
A cursor provides row-by-row processing of result sets in procedural SQL (e.g., PL/pgSQL, T-SQL). Cursors are imperative and slower than set-based operations; use sparingly.

**Example (pseudo-SQL Server):**

```sql
DECLARE emp_cursor CURSOR FOR SELECT emp_id FROM employees;
OPEN emp_cursor;
FETCH NEXT FROM emp_cursor INTO @eid;
WHILE @@FETCH_STATUS = 0
BEGIN
  -- process @eid
  FETCH NEXT FROM emp_cursor INTO @eid;
END
CLOSE emp_cursor;
DEALLOCATE emp_cursor;
```

---

### 39. Common use cases of cursors?

**Answer:**
When you must perform row-by-row operations that can’t be expressed in set operations, e.g., complex procedural business logic, iterative calculations, or calling external procedures per row. But prefer set-based solutions for performance.

---

### 40. Difference between OLTP and OLAP databases?

**Answer:**

* **OLTP (Online Transaction Processing)**: many short transactions, normalized schema, fast inserts/updates (e.g., banking).
* **OLAP (Online Analytical Processing)**: complex read-heavy analytical queries, denormalized/star schemas, columnar stores, aggregate queries.

---

### 41. What is a schema in SQL?

**Answer:**
A namespace/container for database objects (tables, views, functions). In Postgres/SQL Server, `schema.table`. In MySQL, the database itself often maps to a schema. Schemas help organize and permit object-level access control.

---

### 42. What are temporary tables?

**Answer:**
Session- or transaction-scoped tables used to store intermediate results. Syntax differs:

* MySQL/Postgres: `CREATE TEMPORARY TABLE tmp (...)`
* SQL Server: `CREATE TABLE #tmp (...)` (local) or `##tmp` (global).

**Example:**

```sql
CREATE TEMPORARY TABLE tmp_emp AS SELECT * FROM employees WHERE salary > 70000;
SELECT * FROM tmp_emp; -- within same session
```

---

### 43. What are common operators in SQL?

**Answer:**
Arithmetic: `+ - * /`
Comparison: `= <> != < > <= >=`
Logical: `AND`, `OR`, `NOT`
Set/others: `IN`, `BETWEEN`, `LIKE`, `IS NULL`, `EXISTS`, `ANY`, `ALL`

---

### 44. Difference between BETWEEN and IN operators?

**Answer:**

* `BETWEEN a AND b` checks value in continuous range (inclusive).
* `IN (x,y,z)` checks membership in discrete set. `IN` with subqueries checks membership in returned set.

**Example:**

```sql
SELECT * FROM employees WHERE salary BETWEEN 60000 AND 90000;
SELECT * FROM employees WHERE dept_id IN (1,2,3);
```

---

### 45. What is a recursive query in SQL?

**Answer:**
A query that references itself, typically implemented with a recursive Common Table Expression (CTE) `WITH RECURSIVE` to handle hierarchical data (e.g., org charts).

**Example (find managers chain):**

```sql
WITH RECURSIVE mgr_chain(emp_id, name, manager_id, lvl) AS (
  SELECT emp_id, name, manager_id, 1 FROM employees WHERE emp_id = 2
  UNION ALL
  SELECT e.emp_id, e.name, e.manager_id, mc.lvl+1
  FROM employees e JOIN mgr_chain mc ON e.emp_id = mc.manager_id
)
SELECT * FROM mgr_chain;
```

---

### 46. Difference between materialized view and a normal view?

**Answer:**

* **Normal view:** virtual; runs underlying query every time; no stored data.
* **Materialized view:** stores query results physically; faster reads but must be refreshed (`REFRESH MATERIALIZED VIEW` in Postgres). Not all DBs implement materialized views (Postgres does; MySQL has no built-in materialized views, but you can emulate with tables + refresh jobs).

**Example (Postgres):**

```sql
CREATE MATERIALIZED VIEW mv_dept_salary AS
SELECT dept_id, SUM(salary) AS total_salary FROM employees GROUP BY dept_id;
-- to refresh:
REFRESH MATERIALIZED VIEW mv_dept_salary;
```

---

### 47. What is indexing and how does it improve performance?

**Answer:**
Indexing creates a search structure (e.g., B-tree) that lets the DB quickly find rows matching predicates rather than scanning the whole table. Improves SELECT/WHERE/join performance; slows down write operations and uses storage.

**Best practices:** index columns used in JOINs, WHERE, ORDER BY; consider composite/covering indexes.

**Example:**

```sql
CREATE INDEX idx_emp_salary ON employees(salary);
-- covering index (if you often query salary and name)
CREATE INDEX idx_salary_name ON employees(salary, name);
```

---

### 48. What is query optimization?

**Answer:**
Process by which the DBMS analyzes SQL and chooses an efficient execution plan (join order, index usage, scan vs seek). Tools/techniques for developers: `EXPLAIN`/`EXPLAIN ANALYZE`, adding/removing indexes, rewriting queries, updating statistics, avoiding unnecessary `SELECT *`, using appropriate joins, and partitioning large tables.

**Example:**

```sql
EXPLAIN SELECT * FROM employees WHERE dept_id = 2;
```

---

### 49. Difference between DELETE with WHERE clause and TRUNCATE?

**Answer:**

* `DELETE FROM table WHERE ...` removes specified rows; fully logged per row; can be rolled back (transactional).
* `TRUNCATE TABLE` removes all rows faster by deallocating data pages; minimal logging in many DBs; usually can’t specify WHERE; may reset identity counters; may require special privileges; behavior for rollback varies.

---

### 50. What are the new features in SQL (latest versions of MySQL, PostgreSQL, SQL Server)? *(2025 summary)*

Below I summarize **key recent features** in the most recent major releases as of **September 7, 2025**. (I checked the official release notes and vendor pages for accuracy.)

**MySQL (8.1+):**

* MySQL 8.1 introduced incremental features on top of 8.0 — enhancements to JSON support, optimizer improvements, new functions and syntax improvements, and bug/security fixes. See MySQL 8.1 release notes for details. ([MySQL Developer Zone][1], [MySQL Community Downloads][2])

**PostgreSQL (v17):**

* PostgreSQL 17 (released Sep 26, 2024) added significant improvements: a new memory structure for `VACUUM` (dramatically reduced memory use and improved vacuum performance), enhanced SQL/JSON capabilities like `JSON_TABLE()` and JSON constructors/identity functions, better logical replication features, and various performance and monitoring improvements. Official release notes summarize and document these features. ([PostgreSQL][3])

**Microsoft SQL Server (2022 and 2025 preview):**

* **SQL Server 2022** brought features like tighter Azure integration (Azure Synapse Link for near real-time analytics), ledger features, performance and security improvements, and enhancements to availability and disaster recovery. ([Microsoft Learn][4])
* **SQL Server 2025 (preview/announced at Ignite 2024)**: Microsoft announced a preview emphasizing AI integration, bringing Azure SQL features on-premises, and introducing a native `JSON` datatype + native JSON indexing across platforms, plus more language and data type support and platform flexibility (preview documentation and coverage at Microsoft). See Microsoft’s “What’s new in SQL Server 2025 (preview)” and expert coverage for feature highlights. ([Microsoft Learn][5], [Redmondmag][6])

---
