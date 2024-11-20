-- practice on subqueries
-- let's seee if there are any productlines that have never has a product ordered
SELECT * 
FROM productlines pl 
WHERE pl.id NOT IN( SELECT p.productline_id FROM products p, orderdetails od WHERE p.id = od.product_id);


select distinct p.productline_id from products p, orderdetails od where p.id = od.product_id;

INSERT INTO `classic_models`.`productlines`
(
`product_line`,
`description`)
VALUES
(
'Test Line',
'Just for this class');

-- Homework Subqueries
-- 1) I want to see all the employees that do not have any customers - subquery using not in
SELECT e.firstname AS Name FROM employees e WHERE e.id NOT IN(SELECT c.sales_rep_employee_id FROM customers c);

-- 2) I want to see all the customers that have not made an order - subquery using not in
SELECT c.customer_name AS Name, c.id FROM customers c WHERE c.id NOT IN(SELECT o.customer_id FROM orders o);

-- 3) I want to see all of the products that have never been ordered - subquery using not in
SELECT p.product_name AS Product, p.id FROM products p WHERE p.id NOT IN (SELECT od.product_id from orderdetails od);
select * from orderdetails od where od.product_id = 41; -- to verify

-- 4) I want to see all customers that have made an order that has more than 3 products in the order regardless of quantity 
--  I think this can be done using a subquery in the having
SELECT c.customer_name, od.order_id
FROM customers c


SELECT * FROM orderdetails;
-- 5) I want to see any customer that has made an order greater than $50,000 - this subquery in having
SELECT c.customer_name, order_id, SUM(od.price_each * od.quantity_ordered) AS amount
FROM customers c, orders o, orderdetails od
WHERE o.customer_id = c.id
	AND od.order_id = o.id
GROUP BY order_id 
HAVING amount > 50000;

SELECT c.customer_name, order_id, SUM(od.price_each * od.quantity_ordered) AS amount
FROM customers c, orderdetails od 
GROUP BY order_id 
HAVING amount > 50000;


-- 6) I want to see all orders and the number of products in that order 
-- and the total number of quantity ordered for that order .. 
-- HOWEVER .. I want the product count and the total quantity order done as subqueries in the select statement.    
-- Do not use a  group by in the outer query


