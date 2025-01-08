A view in SQL is a virtual table that is stored in database with an associated name.

A view can be created from one or many tables. Unless indexed, a view does not exist in a database.
No physical storage location retrieves data on the fly when required.



******creating a view****

create view CustomerView AS
select customer_id, name, phone_number
FROM Customers
where status = "active";

Storing the data physically and improving the performance 
An indexed view is also called materialized view does not need to run from scratch




create view ProductsSalesView with SCHEMABINDING  (tightly coupled you cannot change the structure without dropping the view) 
AS
select product_id, SUM(sales_amount) as total_sales
FROM sales
GROUP BY product_id;

CREATE UNIQUE CLUSTERED INDEX idx_product_sales ON ProductSales(product_id);


********************************************************
Clustered index that sorts and stores data physically on the disk based on index column



********************************************************


The WITH CHECK OPTION is a CREATE VIEW statement option. The purpose of the WITH CHECK OPTION is to ensure that all UPDATE and INSERT statements satisfy the condition(s) specified by the WHERE clause.

The WITH CHECK OPTION Clause

create view my_item as
select name, age
from customers
where age >= 25
WITH CHECK OPTION;
********************************************************

UPDATE view_name
SET column1 = value1, column2 = value2...., columnN = valueN
WHERE [condition];

********************************************************
DROP VIEW CUSTOMERS_VIEW1;
DROP VIEW CUSTOMERS_VIEW2;


