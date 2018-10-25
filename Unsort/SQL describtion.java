					=========== SQL describtion ===========

SQL -> structured query language

Query to show all countries:
 SELECT * FROM countries;

Database:

*relational databases:
	Oracle 11g, 12 / MySQL / MS SQL Server / IBM DB2 / Sybase
*non-relational databases:
	MongoDb / Apache / CouchDB / ArangoDB / BaseX / Clusterpoint /
	Couchbase / Cosmos DB / IBM Domino / MarkLogic / MongoDB / 
	OrientDB / Qizx / RethinkDB.

Every application has a database.
Database is a place where data is stored in an organized manner.
Security, performance.

Every table in database has columns.

Every table in database has a unique column.
Unique -> does not contain duplicates
Primary Key -> is a unique column in a database table.


			<DATA TYPES IN SQL.>

Columns in SQL can accept only specific data type
Number -> whole numbers
number(9) -> can accept numbers up to 9 digits.
number(5,3) ->

char -> characters/ strings
varchar2 -> also characters. used for varying length data.
if you put less than 50 characters ,database will only take that length memory.


NULL -> inserting data into this column is optional
NOT NULL -> mandatory to enter data to this column

Describle departments;
--------------- -------- ------------ 
DEPARTMENT_ID NOT NULL NUMBER(4) 
DEPARTMENT_NAME NOT NULL VARCHAR2(30) 
MANAGER_ID NUMBER(6) 
LOCATION_ID NUMBER(4)


Describe locations;
-------------- -------- ------------ 
LOCATION_ID NOT NULL NUMBER(4) 
STREET_ADDRESS VARCHAR2(40) 
POSTAL_CODE VARCHAR2(12) 
CITY NOT NULL VARCHAR2(30) 
STATE_PROVINCE VARCHAR2(25) 
COUNTRY_ID CHAR(2)

PRIMARY KEY
-> every table has a primary key, unique

FOREIGH KEY
-> when a column is used and that is primary key in another table

When a column is a foreign key, only data from primary key table can be used.

RDBMS:
RELATIONAL DATABASE MANAGEMENT SYSTEM
-------------------------------------

We call them relational because tables in that database are
related using primary and foreign key relationship.
Oracle, MySql

AMAZON EC2 SERVER AND INSTALLED ORACLE RDBMS.
We are connecting to that database using SQL developer
-----------------------

DATABASE SCHEMA -> is a chart that shows all tables and how they are related to one another.
One to Many relation -> One Department -> Many employees
many to many relation -> 
=================================================================
Difference between GROUP BY and ORDER BY?

GROUP BY is used whenever we use Multiple Row functions
And it creates sub groups from larger group.

ORDER BY sorts the results either in asc or desc manner.
=================================================================
HAVING VS WHERE?

We use HAVING when our condition includes a GROUP function.
We use WHERE when our condition DOES NOT include a GROUP function. 
=================================================================
Someone gave access to database. There is no schema.

1) Display all tables.

MySQL: show tables;
Oracle: Select table_name from user_tables;
Sybase
IBM DB2
MS SQL server

2) Describe command to see columns and relations.

Database is a storage for data
In Database we have tables
tables have columns and rows

tables are related to one another using primary and foreign keys.

Each table column can accept only pre-defined data types.

------------------------------------------------------------
AWS: EC2-> cloud machine.
Amazon RDS -> for databases.
------------------------------------------------------------



------------------------------------------------------------
How do i know what data types are in my table?
describe table_name;
describe countries;
------------------------------------------------------------
Query to view all data in Employees table:
SELECT * FROM employees;
------------------------------------------------------------
Query to show all countries:
Select * From countries;
------------------------------------------------------------

SUMMARY:
- comparison operators
- BETWEEN AND
- IN
- LIKE
- ROWNUM
- FUNCTIONS:
-> single row
-> aggregate:
-> GROUP BY
-> HAVING

		
		=========== TYPES OF JOINS IN SQL: ===========

1) INNER JOIN -> is used to display data from multiple tables and it returns 
					only matching records according to joining condition.
2) OUTER JOIN
OUTER JOINS.

3 types of outer joins:
1) Right outer join
2) Left outer join
3) Full outer join

Right outer join-> is used to display data from multiple tables, 
and it returns matching recording as well as NON matching records 
from RIGHT hand side table.

Left outer join-> is used to display data from multiple tables, 
and it returns matching recording as well as NON matching records 
from LEFT hand side table.

FULL outer join-> is used to display data from multiple tables, 
and it returns matching recording as well as NON matching records 
from LEFT AND RIGHT hand side table.

		=========== SET operators: ===========

SET operators: UNION, UNION ALL, MINUS, INTERSECT
For SET operators to work:
-> you need 2 independent queries
-> same number of columns in Select statement
-> same data type in same order

SUBQUERY: nested query
Summary of SET operators:

UNION -> combines, removes duplicates, sorts
UNION ALL-> combines,does not remove duplicates,does not sort
MINUS -> show records from query1 that are not present in query2
INTERSECT -> show common records from 2 queries
-------------------------------------------------------------------
Difference between INNER JOIN and UNION?
INNER JOIN is used to retrieve matching data from multiple tables
UNION is used to retrieve data from multiple queries.
	And it removes duplicates and sorts the result.
-------------------------------------------------------------------
UNION ALL -> returns combined rows from 2 independent queries and does not 
removes duplicates and does not sort them.
-------------------------------------------------------------------
INTERSECT -> returns records that are present/common/appear in both query results.
 It will sort and remove duplicates.
-------------------------------------------------------------------
'
Do you have experiece with SQL?

Yes, I have worked with relational databases and i am very comfortable with DDL and DML commands.

DDL:
CREATE
DROP
TRUNCATE
ALTER

DML:
SELECT
INSERT
UPDATE
DELETE

CREATE TABLE Students
(
Student_id number(4) primary key,
last_name varchar2(30) NOT NULL,
course_id number(4) null

)

INSERT INTO Students Values(200,'Jones',101);
INSERT INTO Students Values(201,'Smith',101);
INSERT INTO Students Values(202,'Siddiqui',102);
INSERT INTO Students Values(203,'Kim',104);
INSERT INTO Students Values(204,'Lee',103);
----------

UPDATE command is used to update records . values in database table.

UPDATE Students SET course_id = 102 
WHERE last_name = 'Jones';
-----------
DELETE command is used to delete data from database table.

DELETE FROM students 
WHERE student_id = 204;
=================

DROP vs TRUNCATE

Both are Data Definition language commands
Drop removes data and table as well
Truncate will remove all data but keeps the empty table.

Neither of them can be rolled back.

TRUNCATE table Students;

















