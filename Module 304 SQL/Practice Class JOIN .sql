-- JOIN and GROUP BY
-- how many employees are in each office.... I want to see the office name and the count of the employees in that office

select * from employees;



select  firstname, count(*) from employees
group by firstname;

-- step 1 
select office_id, count(*) 
from employees
group by office_id;

-- step 2, we added on the name of the office which forced us to add another table to the from
-- and to add the where clause to link the 2 tables together
select o.city, e.office_id, count(*) 
from employees e, offices o
where e.office_id = o.id
group by office_id;

-- ############# find the employees with the most customers
-- step 1
select sales_rep_employee_id, count(*)
from customers
group by sales_rep_employee_id
order by count(*) desc;

-- step 2 : adding on the employee table to get the employee name
-- note that we lost the null from the customer table, which is okay in this case as we didint need that
select e.firstname, e.lastname, c.sales_rep_employee_id, count(*)
from customers c, employees e
where c.sales_rep_employee_id = e.id
group by sales_rep_employee_id
order by count(*) desc
limit 1;

-- to see the list of all customers for the San Francisco office
select e.firstname, e.lastname, o.city, c.customer_name, c.contact_firstname, c.contact_lastname
from  offices o, customers c, employees e
where o.id = 1
	 and e.office_id = o.id
     and c.sales_rep_employee_id = e.id;
     
     
select e.firstname, e.lastname, o.city, c.customer_name, c.contact_firstname, c.contact_lastname
from  offices o, customers c, employees e
where e.office_id = o.id
     and c.sales_rep_employee_id = e.id;
     
-- #### I want to see all of the customer that have made an order, and I want to see the customer name, the office, the employee name, the order id and the order date
select e.firstname, e.lastname, o.city, c.customer_name, c.contact_firstname, c.contact_lastname, ord.id as order_id, ord.order_date
from offices o, employees e, customers c, orders ord
where e.office_id = o.id
     and c.sales_rep_employee_id = e.id
     and ord.customer_id = c.id
 order by e.id, customer_name;
 
 -- List of all products purchased, customer name, the office, emp name orderid and the quantity ordered
 select e.firstname, e.lastname, o.city, c.customer_name, c.contact_firstname, c.contact_lastname, ord.id as order_id, ord.order_date, od.product_id, od.quantity_ordered
from offices o, employees e, customers c, orders ord, orderdetails od
where e.office_id = o.id
     and c.sales_rep_employee_id = e.id
     and ord.customer_id = c.id
     and od.order_id = ord.id
 order by e.id, customer_name, order_id;
 
 -- i want tot see everything from previous record ... now i want to add the product name
 -- 1) add the table to the from clause
 -- 2) join the tables in the where clause
 -- 3) add any columns desired to the 
  select e.firstname, e.lastname, o.city, c.customer_name, c.contact_firstname, c.contact_lastname, ord.id as order_id, ord.order_date, od.product_id, od.quantity_ordered, p.product_name
from offices o, employees e, customers c, orders ord, orderdetails od, products p
where e.office_id = o.id
     and c.sales_rep_employee_id = e.id
     and ord.customer_id = c.id
     and od.order_id = ord.id
     and od.product_id = p.id
 order by e.id, customer_name, order_id, product_name;
 
 -- I want to see all the products that have been ordered and how many times each product has been ordered 
 -- in the report I want to see the order number, the product nam,e and the number of times this product was ordered
 -- and I want to see the products that were ordered the most on the top
 -- hint 2 - the orderdetails table will contain 1 record for each time the product was ordered
 -- hint 2 - needs a group by
 
 select od.order_id as order_number, count(*), sum (quantity_ordered)
 from  order_details od
 group by od.order_id;
 
 select * from productlines;
 
 
 -- 1) i want ot see the name of the product line and all product names in that product line order by the product line name then by the product name
 -- 2) i want to see the order number, the product name and the quantity ordered,
 -- order by the order number(descending), then the product name (asce), then the quantity ordered
 -- 3) I want to see all payments made by customers. the resukt should show the customer name, the checj number, payment date, and the amount. I want the result set ordered by the customer name (asc),
 -- the payment date (desc)
 -- 4) I want to see the order s and all products in that order- order number and product name order by the order number(asc) and product name (desc)
 -- 5) I want to see then number of products in each order - I want to see the order id and the count of each product in that order... order by count(*) desc
 -- 6) I want to see the product that
 
 
 
 
     
     

