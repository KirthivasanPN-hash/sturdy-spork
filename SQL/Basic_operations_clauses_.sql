DDL commands (create and modify)

1. Create
2. Alter
3. Drop
4. Truncate


DML commands
1. select
2. insert
3. update
4. delete


****INSERT****

insert into table_name(col1, col2, col3...coln)
values (val1, val2, val3..valn)

INSERT INTO CUSTOMERS VALUES
(1, 'Ramesh', 32, 'Ahmedabad', 2000.00 ),
(2, 'Khilan', 25, 'Delhi', 1500),
(3, 'kaushik', 23, 'Kota', 2000),
(4, 'Chaitali', 25, 'Mumbai', 6500),
(5, 'Hardik', 27, 'Bhopal', 8500),
(6, 'Komal', 22, 'Hyderabad', 4500),
(7, 'Muffy', 24, 'Indore', 10000);



****SELECT****

SELECT * FROM CUSTOMERS;


***UPDATE***

update table_name
set column1 = val1, col2 = val2
where cond

UPDATE CUSTOMERS SET ADDRESS = 'Pune' WHERE ID = 6;



***DELETE***

DELETE FROM table_name WHERE  {CONDITION};

**
DROP TABLE table_name;

***
ALTER TABLE table_name
{ADD| DROP | MODIFY} column_name {data_type};

***AND| OR***
SELECT column1, column2....columnN
FROM   table_name
WHERE  CONDITION-1 {AND|OR} CONDITION-2;


***IN Operator is used to check whether the data is present in the column or not, using the WHERE clause.***

select col1, col2...coln
from table_name
where column_name in (val1, val2, val3)

***LIKE***
SELECT * FROM CUSTOMERS WHERE SALARY LIKE '200%';

***ORDER BY***

SELECT column1, column2....columnN
FROM   table_name
WHERE  CONDITION
ORDER BY column_name {ASC|DESC};

**GROUP BY***

SELECT ADDRESS, AGE, SUM(SALARY) 
AS TOTAL_SALARY FROM CUSTOMERS 
GROUP BY ADDRESS, AGE;

***HAVING CLAUSE**
The HAVING clause is also used to filter a group of rows by applying a condition.

select address, age, sum(salary) as TOTAL_SALARY
AGE, HAVING TOTAL_SALARY >= 5000
ORDER BY TOTAL_SALARY DESC;


***INDEX***
CREATE INDEX sample_index on CUSTOMERS(NAME);




***INTERSECT***
SELECT column1, column2,..., columnN
FROM table1, table2,..., tableN
INTERSECT
SELECT column1, column2,..., columnN
FROM table1, table2,..., tableN


we are retrieving the records of students aged between 20 and 30 from the STUDENTS table, excluding those who are also aged between 20 and 30 from the STUDENTS_HOBBY table
**EXCEPT***


SELECT NAME, HOBBY, AGE
FROM STUDENTS
WHERE AGE BETWEEN 20 AND 30
EXCEPT 
SELECT NAME, HOBBY, AGE 
FROM STUDENTS_HOBBY
WHERE AGE BETWEEN 20 AND 30



**************SQL Operation and Clauses*********************

IS NOT NULL --> A condition in Queries (Where Clause)

select * 
from Customers
where address is not NULL



NOT NULL --> Column constraint

CREATE TABLE Customers(
    customer_id INT PRIMARY KEY
    name VARCHAR(100) NOT NULL
    phone_number VARCHAR(20)
);



SQL Aliasing

***Aliases are used to address database tables with a shorter or more meaningful name within an SQL query.*******

********************************************************

****ANY AND ALL***********

SQL ANY and ALL operators are used to perform comparison between a single value
and a range of values returned by subquery

