-- ====== PA 304.4.1 =========

-- 1) Display the name, product line, and buy price of all products. 
-- The output columns should display as: “Name,” “Product Line,” and “Buy Price.” 
-- The output should display the most expensive items first.

SELECT p.product_name AS Name, p.buy_price AS 'Buy Price', pl.product_line AS 'Product Line'
FROM products p, productlines pl WHERE p.productline_id IN (SELECT pl.id from productlines)     -- by using subquery
ORDER BY buy_price desc;

-- Display the first name, last name, and city name of all customers from Germany. 
-- The output columns should display as: “First Name,” “Last Name,” and “City.” 
-- The output should be sorted by “Last Name” (ascending).
SELECT c.contact_firstname AS 'First Name', c.contact_lastname AS 'Last Name', c.city AS City FROM customers c
WHERE c.country = 'Germany' 
ORDER BY c.contact_lastname asc;
select * from productlines;

-- Display each of the unique values of the status field in the orders table.
-- The output should be sorted alphabetically, ascending.
SELECT DISTINCT status FROM orders ORDER BY status asc;

-- Display all fields from the payments table for payments made on or after January 1, 2005. 
-- The output should be sorted by the payment date from highest to lowest.
SELECT * FROM payments p
WHERE p.payment_date 
BETWEEN '2005-01-01' AND CURDATE()
ORDER BY p.payment_date desc;

-- Display the last Name, first Name, email address, and job title of all employees working out of the San Francisco office.
-- The output should be sorted by “Last Name.”
SELECT e.firstname AS 'First Name', e.lastname AS 'Last Name', e.email, e.job_title
FROM employees e WHERE e.office_id IN(SELECT o.id FROM offices o WHERE city = 'San Francisco')
ORDER BY e.lastname asc;

-- Display the name, product line, scale, and vendor of all of the car products 
-- both classic and vintage. The output should display all vintage cars first 
-- (sorted alphabetically by name), and all classic cars last (also sorted alphabetically by name).
SELECT p.product_name AS Name, pl.product_line AS 'Product Line', p.product_vendor AS Vendor
FROM products p, productlines pl 
WHERE p.productline_id = pl.id 
	AND pl.product_line IN ('Vintage Cars', 'Classic Cars')
ORDER BY pl.product_line desc;

 
 
 
 







