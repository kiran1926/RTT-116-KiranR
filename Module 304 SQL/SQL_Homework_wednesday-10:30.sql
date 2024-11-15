-- Homework wednesday 10/30 on classic model

-- 1) which product did we sell the most of?  
-- I would like to see the number of orders, the total amount sold, and the product name
select count(product_id) as number_of_orders,sum(price_each * quantity_ordered) as total_sale_of_product from orderdetails where product_id in (select d from products)
group by product_id
order by number_of_orders desc, total_sale_of_product desc
limit 1;

-- alternate way use 3 tables
SELECT product_name,
       COUNT(order_id) AS number_of_orders,
       SUM(price_each * quantity_ordered) AS total_sale_of_product
FROM orderdetails od, products p 
WHERE od.product_id = p.id and od.order_id IN (SELECT id FROM orders)
GROUP BY product_name
ORDER BY number_of_orders DESC, total_sale_of_product DESC
LIMIT 1;                       



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
group by year(o.order_date), p.product_name
order by year(o.order_date) desc, total_product_profit desc;

-- tony 2)
SELECT 
EXTRACT(YEAR FROM o.order_date) AS Year,
p.product_name,
SUM(od.quantity_ordered * (od.price_each - p.buy_price)) AS Profit
FROM orderdetails od
JOIN orders o ON od.order_id = o.id
JOIN products p ON od.product_id = p.id
GROUP BY
Year, p.product_name
ORDER BY 
year DESC, Profit DESC;

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
if(sum(quantity_ordered * price_each) > sum(pm.amount), (sum(quantity_ordered * price_each) - sum(pm.amount)), 'No outstanding' ) as outstanding_balance 
from customers c, payments pm, orderdetails od, orders o
where pm.customer_id = c.id
	and o.customer_id = c.id
    and od.order_id = o.id
group by c.id
order by c.id;

-- tony 4)
select
c.customer_name AS Customer, 
SUM(od.quantity_ordered * od.price_each) AS Due, 
COALESCE(SUM(p.amount), 0) AS Paid, 
SUM(od.quantity_ordered * od.price_each) - COALESCE(SUM(p.amount), 0) AS Balance
FROM customers c
JOIN orders o on c.id = o.customer_id
JOIN orderdetails od ON o.id = od.order_id
LEFT JOIN payments p ON c.id = p.customer_id
GROUP BY c.id, c.customer_name
HAVING Balance > 0
ORDER BY Balance DESC;

-- 4) mikayil
SELECT 
    c.customer_name AS Customer, 
    od.total_due AS Due, 
    COALESCE(p.total_paid, 0) AS Paid, 
    od.total_due - COALESCE(p.total_paid, 0) AS Balance
FROM customers c
JOIN (
    SELECT o.customer_id, 
           SUM(od.quantity_ordered * od.price_each) AS total_due
    FROM orders o
    JOIN orderdetails od ON o.id = od.order_id
    GROUP BY o.customer_id
) od ON c.id = od.customer_id
LEFT JOIN (
    SELECT customer_id, 
           SUM(amount) AS total_paid
    FROM payments
    GROUP BY customer_id
) p ON c.id = p.customer_id
ORDER BY Balance DESC;

-- alternate way to 4th prob
-- use query as sub table then i can reference it in query
select c.id, (select sum(pm.amount) from payments pm where pm.customer_id =c.id) as total_payment
from customers c;







