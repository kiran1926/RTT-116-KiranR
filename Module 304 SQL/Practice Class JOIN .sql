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
     
     

