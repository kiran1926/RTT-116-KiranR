select * from offices;

select * from employees where office_id = 2;

select * from customers;
-- I want to see the first and last name of all employees and the office city that they work in.
select e.firstname, e.lastname, o.city, o.id, e.office_id, e.id
from employees e, offices o
where e.office_id = o.id;

-- I want to see a list of customers for a particular employee
select * from customers where sales_rep_employee_id = 1504;

--  I want to see all customers with the first name Cassidy
select * from customers where contact_lastname = 'Cassidy';
select * from customers where country = 'Ireland';
-- credit limit less than 10 k 
select * from customers where credit_limit > 10000 and credit_limit < 50000;

-- i want to see all the customer contacts that the first name starts with J
-- in sql % as a awild card
select * from customers where contact_firstname LIKE '%K';
select * from customers where contact_firstname LIKE '%nn%';

-- practice querries from 304.2 page 12
select customer_name, contact_lastname, contact_firstname, city, state from customers;
-- practice querry page 13 :  give me everything about customers
select * from customers;
-- to get number of rows from a table; page 14
select count(*) from customers;
select count(*) from employees;
-- to retrieve specific row, page 15
select * from customers where country = 'Germany';
-- distinct clause, page 16
select distinct postal_code from customers;
-- use of alias for columns
select 
contact_firstname AS firstname,
contact_lastname AS lastname
from customers;

-- sql lecture 2 starts - Data manipulation language
-- insert statement 
select * from offices;
insert into offices (city, phone, address_line1, address_line2, state, country, postal_code, territory)
             values ('California','669-8746', '3901 lick mill blvd', 'address line 2', 'CA', 'USA', '95054', 'USA');
             
-- update  will effect the entire table if you do not use a where clause!!!!!!
update offices set city = 'Santa Clara', phone = '789-8746', address_line2 = 'update address' where id = 9;     

-- delete will effect the entire table if you do not use a where clause!!!!!!  
delete from offices where id in (8, 9,12,13);  

select count(*) from offices;    

-- transaction 
start transaction;
delete from offices where id = 8;
select * from offices;
rollback;


 





  
