-- GLAB 304.5.2 Operators
-- 1) or operator examples
select customer_name, country
from customers
where country = 'USA' or country = 'France';

-- 2) AND operator 
select customer_name, country, credit_limit
from customers
where (country = 'USA' or country = 'France') and 
credit_limit > 100000;

-- 3) Between and not between
select product_name, buy_price, id
from products
where buy_price between 90 and 100;

-- can use >= and <=
select product_name, buy_price, id
from products
where buy_price >= 90 and buy_price <= 100;

-- not between 
select product_name, buy_price, id
from products
where buy_price not between 20 and 100;

-- ISNULL operator











