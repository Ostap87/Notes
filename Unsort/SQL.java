					================ SQL ================

SQL:

'/* */' = '--' -> comments in Oracle SQL developer
			+++++OR+AND+++++

------------------------------------------------------------------
			+++++SORTING QUERY+++++

<ORDER BY> is used to sort results.
Query: 
return all lastname, emp ids, emails 
sorted by lastname.

SELECT last_name, employee_id, email
FROM employees
ORDER BY last_name; -> ORDER BY last_name DESC;-descending order

Task: 
display emp ids, lastname, job ids, salaries
with descending order of salary.

ORDER BY POSITION:
select employee_id, last_name, job_id, salary
from employees
order by 4 desc;
------------------------------------------------------------------
			+++++ARITHMETIC EXPRESSIONS+++++
+,-,*,/

SELECT 10 * 10 + 2000
FROM employees;

Query:
display emp last name, and annual salary
sort result by annual salary

SELECT last_name, salary * 12
FROM Employees
ORDER BY 2;

------------------------------------------------------------------
			+++++RENAMING COLUMNS+++++

COLUMN ALIAS

AS keyword or just space+".....";

SELECT last_name, salary * 12 AS Annual
FROM Employees
ORDER BY 2;

TASK: return empl lastname, job id,
hourly, daily, weekly, monthly, yearly salaries
and rename accordingly
sort by lastname

SELECT last_name, job_id, 
salary / 160 as hourly,
salary / 20 as daily,
salary / 4 as weekly,
salary as monthly,
salary * 12 as yearly 
FROM employees
ORDER BY last_name;

------------------------------------------------------------------
			+++++DISTINCT+++++ keyword removes duplicates.

SELECT DISTINCT job_id
FROM employees;

------------------------------------------------------------------
			+++++CONCATENATION operators+++++
SQL: ||

SELECT first_name || last_name || '@gmail.com' AS emails
FROM employees;
EllenAbel@gmail.com

------------------------------------------------------------------

SELECT, FROM , ORDER BY, AS, DISTINCT, ||
DESCRIBE
------------------------------------------------------------------
	=======FILTERING RESULTS IN SQL========

			+++++WHERE+++++
return last_name,salary only for people who earn
less than 5000 monthly.

SELECT last_name, salary
FROM employees
WHERE salary < 5000;

Task:
Show all IT_programmers.

SELECT *
FROM employees
WHERE job_id = 'IT_PROG';

Task:
Tell me job id and department id of David Austin.

SELECT job_id, department_id
FROM employees
WHERE first_name || last_name = 'DavidAustin';

-----
SELECT *
FROM city
WHERE populations >100000
AND countryCode = 'USA';
------------------------------------------------------------------
			+++++AND operator+++++

SELECT *
FROM employees
WHERE salary>4000 AND salary<6000; or-> salary BETWEEN 4000 AND 6000;
------------------------------------------------------------------
			+++++NOT or <>operator+++++

SELECT last_name, job_id
FROM employees
WHERE job_id<>'SA_REP';or-> NOT job_id = 'SA_REP';
------------------------------------------------------------------
			+++++BETWEEN operator+++++

SELECT *
FROM employees
WHERE hire_date BETWEEN '01-JAN-01' AND '01-JAN-04';
------------------------------------------------------------------
			+++++IN operator+++++

SELECT *
FROM employees
WHERE department_id = 60 or
department_id =  90 or department_id =  100 or department_id =  120 or department_id =  130; 
->department_id IN (60,90,100,120,130); ->job_id IN ('IT_PROG','SA_REP','AD_VP','FI_ACCOUNT');
------------------------------------------------------------------
			+++++LIKE operator+++++

% - means any or no character, = cannot use with % only LIKE
_ - underscore means one character

SELECT *
FROM employees
WHERE first_name LIKE 'N%'; ->LIKE '_N%'; ->LIKE '%a%a%';
 ->last_name LIKE '%a'; ->hire_date LIKE '%FEB%'; 
-----
SELECT *
FROM employees
WHERE hire_date LIKE '%FEB%' OR hire_date LIKE '%MAR%' OR hire_date LIKE '%APR%';
------------------------------------------------------------------
			+++++ROWNUM operator+++++

SELECT *
FROM employees
WHERE ROWNUM <=5;
-----
SELECT *
FROM employees
ORDER BY salary;	
------------------------------------------------------------------
			+++++NULL operator+++++

SELECT *
FROM employees
WHERE commission_pct IS NOT NULL;		
------------------------------------------------------------------
	============ FUNCTIONS IN SQL ===========
		in SQL all functions return value
<SINGLE ROW FUNCTION: Function will run for each row and return a value for each row.
<MULTIPLE ROW FUNCTIONS: Function will run for many rows and return a single value.


				________ Single Row Function ________


	=========== CONCAT, SUBSTR, LENGTH, INSTR, TRIM, REPLACE ==========		


			+++++LOWER/UPPER/INITCAP+++++

return all first and last names in uppercases

SELECT UPPER(first_name||' '||last_name)
FROM employees;
-----
return all first names UPc, last names LOc, INcaps emails

SELECT UPPER(first_name), LOWER(last_name), INITCAP(email)
FROM employees;
------------------------------------------------------------------
			+++++LENGTH operator+++++

return all employees whose name is 6 characters

SELECT *
FROM employees
WHERE LENGTH(first_name)=6;
------
return to count the no. of characters with out considering the spaces for each name

SELECT length(TRIM(emp_name)) as pisec
FROM employees;
------------------------------------------------------------------
			+++++SUBSTR operator+++++

return password for each employee that consists of first 3 letters of
first name and last name all uppercases

SELECT UPPER (SUBSTR (first_name, 0, 3)|| SUBSTR (last_name, 0, 3)) AS "Empl password"
FROM employees;
------------------------------------------------------------------

			+++++ROUND,TRUNK,MOD+++++

ROUND -> rounds number
TRUNC -> does not round, only truncates
MOD -> returns a remainder

return all salaries and commission amount weekly 
for employees who earn commissions

SELECT last_name salary, salary * commission_pct/4
FROM employees
WHERE commission_pct IS NOT null;
------
SELECT ROUND(23.63)  =24
FROM dual;
------
SELECT TRUNC(23.598 , 2) =23.59
FROM dual;
------
return all employees whose employee id is even/odd number

SELECT *
FROM employees
WHERE MOD (employee_id,2)=0; ->NOT MOD (employee_id,2)=0;- MOD(employee_id,2)<>0;
------------------------------------------------------------------
			+++++ DATA and TIME +++++

return the employees with Hire date in the format like February 22, 1991				

SELECT emp_id, emp_name, salary, to_char(hire_date,'MONTH DD,YYYY')
FROM employees;
------
return list the employees who joined before 1991 / on 1991

SELECT * FROM employees
WHERE hire_date<('1991-1-1'); / WHERE to_char(hire_date,'YYYY') = '1991';
------
WHERE to_char(hire_date, 'mon')='jan';
------
return list the employees whose experience is more than 10 years

SELECT *
FROM employees
WHERE EXTRACT(MONTH FROM age(CURRENT_DATE, hire_date)) > 10;
------------------------------------------------------------------
				________ Single Row Function ________ 
GROUP FUNCTIONS
AGGREGATE FUNCTIONS

			+++++COUNT, MAX, MIN, AVG, SUM+++++

return number of employees in the company.

SELECT COUNT(employee_id)	->COUNT(last_name||first_name)  
FROM employees;
------
return number of employee who are IT_PROGs

SELECT COUNT(employee_id)	->COUNT(*)
FROM employees
WHERE job_id='IT_PROG';
------
return number of unique job ids

SELECT COUNT (DISTINCT job_id)
FROM employees
------
return MAX salary in company/highest employee_id

SELECT MAX(salary) ->MAX(employee_id)
FROM employees;
------
return MAX, MIN, AVG salary in company

SELECT MAX(salary), MIN(Salary) , TRUNC(AVG(salary),1)
FROM employees;
------
return company monthly payroll amount

SELECT ROUND(SUM(salary),2)
FROM employees
------------------------------------------------------------------
			+++++GROUP BY operator+++++

return department ids and count of people work for that department

SELECT department_id, COUNT(*)
FROM employees
GROUP BY department_id;
------
return job ids and count of people work for that job

SELECT job_id, COUNT(*)
FROM employees
GROUP BY job_id;
-------------------------------------------------------------------
			+++++HAVING+++++

	is used whever we need to filter/put condition
that involves a group function(min,max etc)

return department id and MIN salary
for the departments that have MIN salary less than 3500.

SELECT department_id, MIN(salary)
FROM employees
GROUP BY department_id
HAVING MIN(salary) < 3500;
------
return job ids and count of ppl for those jobs that have more than 4 ppl.

SELECT job_id, COUNT(*)
FROM employees
GROUP BY job_id
HAVING COUNT(*) > 4;
------
return department id and department name, city name
for all departments.
-------------------------------------------------------------------
			+++++INNER JOIN+++++

SELECT department_id,department_name,city
FROM departments INNER JOIN locations
ON departments.location_id = locations.location_id;
------
return all cities , country names

SELECT city, country_name
FROM locations INNER JOIN countries
ON locations.country_id=countries.country_id;
------
return country_id, country name, region id , region name

SELECT country_id, country_name,c.region_id, region_name
FROM countries c INNER JOIN regions r
ON c.region_id=r.region_id;

TABLE ALIAS. -> renaming/nickname for table.
-----
return employee id, lasdtname, department id, departement name,
location id, city, country name.

SELECT employee_id,last_name,e.department_id,department_name,
d.location_id, city, country_name
FROM employees e JOIN departments d
ON e.department_id=d.department_id
JOIN locations l
ON d.location_id = l.location_id
JOIN countries c
ON l.country_id=c.country_id;
-------------------------------------------------------------------

			+++++RIGHT,LEFT<FULL+++++

return employee lastname, department id, department name
for department that have employees and that does not have.

SELECT last_name, d.department_id, department_name
FROM employees e RIGHT OUTER JOIN departments d
ON e.department_id=d.department_id;

SELECT last_name, d.department_id, department_name
FROM employees e LEFT OUTER JOIN departments d
ON e.department_id=d.department_id;

SELECT last_name, d.department_id, department_name
FROM employees e FULL OUTER JOIN departments d
ON e.department_id=d.department_id;
-------------------------------------------------------------------

			+++++SELF JOIN+++++ -> when you join a table to itself.

return employee lastname, manager id, managers last name

SELECT e1.last_name, e1.manager_id, e2.last_name
FROM employees e1 JOIN employees e2
ON e1.manager_id=e2.employee_id;
'
					
					SUBQUERIES:

Subquery is a nested query.

return first name, last name , salary , job id 
of the lowest salaried employees

Manually:
1) look at salaries and find the lowest one. 2345
2) look at each employees salary and check if it matches the lowest salary.

SELECT first_name, last_name, salary, job_id
FROM employees
WHERE salary = (SELECT MIN(salary) FROM employees);
---
2) Highest paid employee.

SELECT first_name, last_name, salary, job_id
FROM employees
WHERE salary = (SELECT MAX(salary) FROM employees);
------
return list employee_id, job_ids, department_id for employees who are not managers.

1) FIND UNIQUE manager ids
2) FIND employees who do not have those ids as employee ids

SELECT employee_id,last_name,job_id,department_id
FROM employees
WHERE NOT employee_id IN 
(SELECT DISTINCT manager_id FROM employees WHERE manager_id is not null);
------
HOW TO FIND SECOND LOWEST SALARY.
We need to use correlated subquery.

SELECT * FROM employees e1
WHERE 2 = (SELECT COUNT(DISTINCT(salary)) FROM employees e2
WHERE e1.salary <= e2.salary);

'

SET OPERATORS: UNION, UNION ALL, MINUS, INTERSECT
For SET operators to work:
-> you need 2 independent queries
-> same number of columns in Select statement
-> same data type in same order
========================================================================			
			+++++UNION+++++

UNION -> returns combined rows from 2 independent queries and 
removes duplicates and sorts them.
ex. query1 A,A,B,C UNION query2 A,D,E = A,B,C,D,E
------
/* USING UNION AND UNION ALL TO GET 
COMBINED RESULT OF (SALARY IN RANGE OF ---> 3000---10000) 
AND (SALARY IN RANGE OF ---> 9000---20000)
*/
SELECT salary FROM employees WHERE salary BETWEEN 3000 AND 10000
UNION
SELECT salary FROM employees WHERE salary BETWEEN 9000 AND 20000;
------
(SELECT employee_id, last_name, salary, department_id 
	FROM employees WHERE department_id = 100)
UNION
(SELECT employee_id, last_name, salary, department_id 
	FROM employees WHERE department_id = 10);

			+++++UNION ALL+++++

UNION ALL -> returns combined rows from 2 independent queries and does not 
removes duplicates and does not sort them.
ex. query1 A,A,B,C UNION ALL query2 A,D,E = A,A,B,C,A,D,E
			
			+++++MINUS+++++

MINUS -> returns records from 1st query that is not present in 2nd query
ex. query1 A,A,B,C MINUS query2 A,D,E = B,C
------
(SELECT employee_id, last_name FROM employees
WHERE employee_id IN (100,104,105,106))
MINUS
(SELECT employee_id, last_name FROM employees
WHERE employee_id IN (100,104,110,120));
result = 105,106
------
return employee_id, department_id, dep names
for all employees and departments
MINUS
return employee_id, department_id, dep names
for all employees and departments
only for departments that have employees
			
			+++++INTERSECT+++++

INTERSECT -> returns records that are present/common/appear in both
	 query results. It will sort and remove duplicates.
ex. query1 A,A,B,C INTERSECT query2 A,D,E = A













