-- Monday Homework for : Join tables \

-- 1) I want to see the name of the product line and all product names in that product line
-- order by the product line name then by the product name
select * from productlines;
select pl.product_line, p.product_name
from productlines pl, products p
where p.productline_id = pl.id
order by pl.product_line, p.product_name;

-- 2) I want to see the order number, the product name, and the quantity ordered
-- order by the order number (descending), then the product name (ascending) , then the quantity ordered ( fewest first)
select * from orderdetails;
select od.order_id as order_number, p.product_name, od.quantity_ordered
from orderdetails od, products p
where od.product_id = p.id
order by od.order_id desc, p.product_name asc, od.quantity_ordered asc;

-- 3) I want to see all payments made by customers.
-- The result should show the customer name, the check number, payment date, and the amount.   
-- I want the result set ordered by the customer name (ascending), the payment date ( descending  newest first)
select c.customer_name, p.check_number, p.payment_date, p.amount
from customers c, payments p
where p.customer_id = c.id
order by c.customer_name asc, p.payment_date desc;

-- 4) I want to see the orders and all products in that order - order number and product name
-- order by the order number ascending and the product name descending.
select od.order_id as order_number, p.product_name
from orderdetails od, products p
where od.product_id = p.id
order by od.order_id asc, p.product_name desc;

select * from orderdetails;
-- 5) I want to see the number of products in each order -  
-- I want to see the order id and the count of each product in that order ... order by count(*) desc
select od.order_id, p.product_name, od.product_id, od.quantity_ordered
from orderdetails od, products p, orders o
where od.product_id = p.id
    and od.order_id = o.id
order by quantity_ordered desc;

select * from payments;
-- 6) I want to see the customer that has made most payments (group by customer_id)
select c.customer_name, count(*)
from customers c, payments p 
where p.customer_id = c.id
group by customer_id
order by count(*) desc
limit 1;

-- 7) I want to see the office that has has the most orders (group by office_id)
select e.office_id, o.city, o.country, count(*) as total_orders
from offices o, employees e, customers c, orders os
where e.office_id = o.id
	and c.sales_rep_employee_id = e.id
    and os.customer_id = c.id
group by office_id
order by count(*) desc
limit 1;
  

 -- 20:27:14	select e.office_id, o.city, o.country, od.order_id, count(*) from offices o, employees e, customers c, orders os, orderdetails od where e.office_id = o.id  and c.sales_rep_employee_id = e.id     and os.customer_id = c.id     and od.order_id = os.id group by office_id order by count(*) desc limit 1	Error Code: 1055. Expression #4 of SELECT list is not in GROUP BY clause and contains nonaggregated column 'classic_models.od.order_id' which is not functionally dependent on columns in GROUP BY clause; this is incompatible with sql_mode=only_full_group_by	0.0016 sec
-- 8) I want to see the order that has the most products ( group by order_id)
select od.order_id, count(*) as products_ordered
from orders o, orderdetails od, products p
where od.order_id = o.id
	and od.product_id = p.id
group by order_id
order by count(*) desc
limit 1;

-- 9) BONUS .... I want to see the total quantity ordered for each order ... we have not learned this yet .. but it group by the order_id and sum(quanity_ordered)
select * from orderdetails;
select od.order_id, count(*) as number_of_products, sum(od.quantity_ordered) as total_quantity_ordered
from orders o, orderdetails od
where od.order_id = o.id
group by od.order_id
order by total_quantity_ordered desc;

-- 10) I want to see the employee first name and last name and the customer name ordered by the customer name
select e.firstname as employee_firstname, e.lastname as employee_lastname, c.customer_name
from employees e, customers c
where c.sales_rep_employee_id = e.id
order by c.customer_name;

-- 11) I want to see the count of all orders by office 
select e.office_id, o.city, o.country, count(order_id) 
from offices o, employees e, customers c, orders os, orderdetails od
where e.office_id = o.id
	and c.sales_rep_employee_id = e.id
    and os.customer_id = c.id
    and od.order_id = os.id
group by office_id
order by office_id asc;


