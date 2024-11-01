-- Homework wednesday 10/30 on classic model

-- 1) which product did we sell the most of?  
-- I would like to see the number of orders, the total amount sold, and the product name
select count(product_id) as number_of_orders,sum(price_each * quantity_ordered) as total_sale_of_product from orderdetails where product_id in (select id from products)
group by product_id
order by number_of_orders desc, total_sale_of_product desc;



-- 1) by joining tables
select p.product_name, count(p.id) as number_of_orders, sum(price_each * quantity_ordered) as total_sale_of_product
from orderdetails od, products p
where od.product_id = p.id
group by p.id
order by number_of_orders desc, total_sale_of_product desc
limit 1;

-- 2) which product generated the most profit by year.  
-- In the result I want to see the year, the product name, and the total profit.  
-- order by year desc, profit desc
select p.product_name, year(o.order_date), sum(quantity_ordered * (price_each - buy_price)) as total_product_profit
from orderdetails od, products p, orders o
where od.product_id = p.id
	and od.order_id = o.id
group by year(o.order_date), p.id
order by total_product_profit desc, year(o.order_date) desc;

select * from products;

-- 3) which office is the most profitable?   
-- result should show the name of the office and the total profit for that office orderd by profit descending
select o.id, o.city, sum(quantity_ordered * (price_each - buy_price)) as total_profit
from offices o, customers c, employees e, orders os, orderdetails od, products p
where e.office_id = o.id
	and c.sales_rep_employee_id = e.id
    and os.customer_id = c.id
    and od.order_id = os.id
    and od.product_id = p.id
group by o.id
order by total_profit desc
limit 1;

select * from payments;
-- 4) Show me all the customers that have an outstanding balance due... 
-- would have to sum the payments for the customer and 
-- compare the total amount paid to the total amount purchased.
select c.id, c.contact_firstname, c.contact_lastname, 
sum(quantity_ordered * price_each) as total_purchase, sum(pm.amount) as total_payment, 
if(sum(quantity_ordered * price_each) > sum(pm.amount), (sum(quantity_ordered * price_each) - sum(pm.amount)), 0 ) as outstanding_balance 
from customers c, payments pm, orderdetails od, orders o
where pm.customer_id = c.id
	and o.customer_id = c.id
    and od.order_id = o.id
group by c.id
order by c.id;

-- 01:03:51	select c.id, sum(sum(quantity_ordered * price_each) - sum(amount)) as outstanding_balance, c.contact_firstname, c.contact_lastname from customers c, payments pm, orderdetails od, orders o where pm.customer_id = c.id  and o.customer_id = c.id     and od.order_id = o.id group by c.id order by outstanding_balance desc LIMIT 0, 1000	Error Code: 1111. Invalid use of group function	0.0073 sec







