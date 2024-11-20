-- GLAB 304.5.1 Aggregate Functions

-- 1. Using MOD() function. whether the quantity of products, which customers ordered, is odd or even.
SELECT order_id, SUM(quantity_ordered) as Qty,
    IF(MOD(SUM(quantity_ordered),2),'Odd', 'Even') as oddOrEven
FROM    orderdetails
GROUP BY    order_id
ORDER BY    order_id; 

-- 2 TRUNCATE() Function
SELECT TRUNCATE(1.555,1);

-- 3. ROUND() function
SELECT product_id, 
ROUND(AVG(quantity_ordered * price_each)) as avg_order_value
FROM orderdetails
GROUP BY product_id;

-- 4.REPLACE() Function
UPDATE products 
SET product_description = REPLACE(product_description,'abuot','about');

-- 5. DATEDIFF() function
SELECT DATEDIFF('2011-08-17','2011-08-17');

-- 6. LPAD(str, len, padstr)
SELECT LPAD('hi',4,'??'); 
SELECT LPAD('hi',1,'??');










