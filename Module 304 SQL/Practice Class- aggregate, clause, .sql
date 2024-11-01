-- slide deck 5 
--  msrp : manufacturer's suggested retail price" and is the price a manufacturer recommends a product be sold for.
-- concate

-- lets calculate the total profit fro an order 10100
-- price each , buy_price, quantity_ordered

select p.product_name, p.buy_price, od.price_each as sale_price, od.quantity_ordered, (price_each - buy_price) as product_profit, 
quantity_ordered * (price_each - buy_price) as productline_profit
from orderdetails od, products p
where od.product_id = p.id and od.order_id = 10100;

-- lets calculate total profit fro all orderes
select od.order_id, sum(quantity_ordered * (price_each - buy_price)) as total_profit
from orderdetails od, products p
where od.product_id = p.id 
group by od.order_id;

-- profit for a month
select year(o.order_date), month (o.order_date), sum(quantity_ordered * (price_each - buy_price)) as total_profit
from orderdetails od, products p, orders o
where od.product_id = p.id and od.order_id = o.id
group by year(o.order_date), month (o.order_date);

select * from orders;

-- 13:48:43	select od.order_id, sum(quantity_ordered * (price_each - buy_price)) as total_profit from orderdetails od, products p, orders o where od.product_id = p.id and od.order_id = o.id group by year(o.order_date), month (o.order_date) LIMIT 0, 1000	Error Code: 1055. Expression #1 of SELECT list is not in GROUP BY clause and contains nonaggregated column 'classic_models.od.order_id' which is not functionally dependent on columns in GROUP BY clause; this is incompatible with sql_mode=only_full_group_by	0.0086 sec

-- date fromat
select now();
select * from orders
where order_date < current_date();

-- ifnull()
select ifnull(comments, 'Replace comment')
from orders;
-- this is a wrong query 
select * from orders where comments = null;
-- this is the right way if something is null
select * from orders where comments is null;
select * from orders where comments is not null;

-- or operator
select * from orders where id = 10101 or id = 10102;

-- SBA Question grades A,B 
SELECT product_name, buy_price, 
CASE
	WHEN buy_price > 80 AND buy_price <=  50 THEN "LOW PRICE"
	WHEN buy_price >= 50 AND buy_price <= 100 THEN "Medium Price"
	WHEN buy_price > 100 AND buy_price <= 200 THEN "high Price"
ELSE "Out of our range" END AS price_status 
FROM products 
where buy_price > 9
ORDER BY buy_price DESC;

--- in operator
-- in operates like an OR in this case will return any row matching any of the 3 cities
select * from customers where city in ('Las Vegas', 'Nantes', 'Frankfurt');

-- subquery inside In
select * from orders where customer_id in (select id from customers where id in (103, 112, 119));

select id from customers where customer_name like 'A%';
-- this is a common technoque to use an "In" statement to filter by a subquery
-- the subquery must return a single column or it won't return
select * from orders where customer_id in (select id from customers where customer_name like 'A%');

-- subquery as a table by putting subquery in 'from'
select * 
from orders o, (select id from customers where customer_name like 'A%') as c
where o.customer_id = c.id;


















