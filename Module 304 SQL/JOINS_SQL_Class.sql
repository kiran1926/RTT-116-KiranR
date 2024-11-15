-- Join tables

-- ==================== LEFT JOIN ===========================
select c.id as cusotmer_id, c.customer_name, o.id, o.status
from customers c
LEFT JOIN orders o on c.id = o.customer_id;

-- theta style
select c.id as customer_id, c.customer_name, o.id, o.status
from customers c, orders o
where  c.id = o.customer_id
order by c.id;

-- ====== Inner JOIN =========
-- this is the same regular query except using MYSQL syntax
select c.id as customer_id, c.customer_name, o.id as order_id, o.status
from customers c
INNER JOIN orders o on c.id = o.customer_id
order by c.id;

-- ============ self join ===============
-- when doing a self join you use the same tabke in the from 2 times
-- self referencing table 
select e.id, e.lastname, e.firstname, e.job_title, m.id as manager_id, m.lastname as manager_lastname, m.firstname as manager_firstname
from employees e, employees m
where e.reports_to = m.id;

-- self join 
select c1.city, c1.customer_name, c2.customer_name
from customers c;

-- ======================= Union ==================
-- does get used from time to time
-- main use is in reports or very complex queryies 
-- union doesnt include duplicates - meaning after merging the result sets there are no duplicates
-- union all - includes duplicates
select * from customers where customer_name like 'A%'
union 
select * from customers where customer_name like 'B%';

select phone from customers where customer_name like 'A%'
union 
select city from customers where customer_name like 'B%';
SELECT DISTINCT customer_name FROM customers WHERE customer_name LIKE 'a%' OR customer_name LIKE 'e%' OR customer_name LIKE 'i%' OR customer_name LIKE 'o%' OR customer_name LIKE 'u%';






