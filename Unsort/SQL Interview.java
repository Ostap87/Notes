			========== SQL Interview ==========

>return employee record with max salary

SELECT * 
FROM employee 
WHERE salary = (SELECT MAX (salary) FROM employee);
_____________________________________________________________

>return highest salary in employee table

SELECT MAX (salary)
FROM employee;
_____________________________________________________________

>return 2nd highest salary in employee table

SELECT MAX (salary)
FROM employees
WHERE salary NOT IN (SELECT MAX (salary) FROM employees);
_____________________________________________________________

>return range of employees based on id

SELECT *
FROM employees
WHERE employee_id BETWEEN 190 AND 205;
_____________________________________________________________

>return employee name, highest salary, departament

SELECT e.first_name, e.last_name, e.salary, d.department_id
FROM employees e INNER Join departments d 
ON (e.department_id = d.department_id)
WHERE salary IN (SELECT MAX(salary) FROM employees);
_____________________________________________________________

>return highest salary, employee name, departament name for each departament

SELECT e.first_name, e.last_name, e.salary, d.department_id
FROM employees e INNER Join departments d ON (e.department_id = d.department_id)
WHERE salary IN (SELECT MAX(salary) FROM employees GROUP BY department_id);
---
SELECT MAX(salary) "Maximum"
FROM employees
WHERE salary <> (SELECT MAX(salary) FROM employees);
---
SELECT * 
FROM employees e1
WHERE 2 = (SELECT COUNT(DISTINCT salary) FROM employees e2 WHERE e1.salary <= e2.salary);
===================================================================================

Difference between INNER JOIN and UNION?
INNER JOIN is used to retrieve matching data from multiple tables
UNION => is used to retrieve data from multiple queries.
	and it removes duplicates and sorts the result.
INTERSECT => return rows returned by both the queries.
MINUS => return records from first query that is not present 
in second query.

-> it will only return values(from 1st query) that are not common in 2 queries
-> It will take results of 1st query and compare with 2nd query.
and show only records that do not appear in 2nd query.
It will help you find difference between two queries.

1) Wooden Spoon, Apples, Bananas, Cucumber, Charger
2) Plastic Spoon, Apples, Bananas, Charger

result: Wooden Spoon,Cucumber
===================================================================================
Primary Key => combinations of fields with uniquely specify a row. Can NOT be null.
Unique Key => uniquely identified each record
Foreign Key => one table which can be related to Primary Key to another table
JOIN => keyword used to query data from more tables based on relationship
INNER JOIN => return rows with at list one match of rows between tables.
RIGHT JOIN => return all rows from right side even with no matches  
LEFT JOIN => return all rows from left side even with no matches
FULL JOIN => return RIGHT & LEFT JOINs
ALIAS => short identifier of table or colomn
DICTINCT => select unique record
LIKE - used as pattern matching with % or _
===================================================================================
			DELETE & TRUNCATE
DELETE => remove rows from the table, can be RolledBack
TRUNCATE => remove All rows from the table and can NOT be RolledBack!
DROP => remove whole table from database and can NOT be RolledBack!



















