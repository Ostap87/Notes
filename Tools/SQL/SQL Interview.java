			========== SQL Interview ==========

return employee record with max salary

SELECT * 
FROM employee 
WHERE salary = (SELECT MAX (salary) FROM employee);
_____________________________________________________________

select highest salary in employee table

SELECT MAX (salary)
FROM employee;
_____________________________________________________________

select 2nd highest salary in employee table

SELECT MAX (salary)
FROM employees
WHERE salary NOT IN (SELECT MAX (salary) FROM employees);
_____________________________________________________________

select range of employees based on id

SELECT *
FROM employees
WHERE employee_id BETWEEN 190 AND 205;
_____________________________________________________________

return employee name, highest salary, departament

SELECT e.first_name, e.last_name, e.salary, d.department_id
FROM employees e INNER Join departments d ON (e.department_id = d.department_id)
WHERE salary IN (SELECT MAX(salary) FROM employees);
_____________________________________________________________

return highest salary, employee name, departament name for each departament

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
UNION is used to retrieve data from multiple queries.
	and it removes duplicates and sorts the result.

MINUS
-----
-> returns records from first query that is not present 
in second query.

-> it will only return values(from 1st query) that are not common in 2 queries
-> It will take results of 1st query and compare with 2nd query.
and show only records that do not appear in 2nd query.
It will help you find difference between two queries.

1) Wooden Spoon, Apples, Bananas, Cucumber, Charger
2) Plastic Spoon, Apples, Bananas, Charger

result: Wooden Spoon,Cucumber












