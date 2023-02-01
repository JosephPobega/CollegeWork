#Joseph Pobega
#Tuesday
USE my_guitar_shop;


#1
SELECT product_code, product_name, list_price, discount_percent
FROM Products;
SELECT product_code, product_name, list_price, discount_percent
FROM Products
ORDER BY list_price DESC;


#2
SELECT CONCAT(last_name, ', ', first_name) AS full_name
FROM customers
WHERE last_name REGEXP '^[M-Z]'
ORDER BY last_name ASC;


#3
SELECT product_name, list_price, date_added
from Products
Where (list_price > 500) AND (list_price < 2000)
ORDER BY date_added DESC;


#4
SELECT product_name, list_price, discount_percent,
ROUND (list_price * (discount_percent / 100), 2),
ROUND (list_price - list_price * (discount_percent / 100),2)
FROM Products
ORDER BY (list_price - list_price * (discount_percent / 100)) DESC
LIMIT 5;


#5
SELECT item_id,item_price,discount_amount,quantity, 
(item_price * quantity), (discount_amount * quantity),
((item_price - discount_amount) * quantity)
FROM order_items
WHERE ((item_price - discount_amount) * quantity) > 500
ORDER BY ((item_price - discount_amount) * quantity) DESC;


#6
SELECT order_id, order_date,ship_date
FROM orders
WHERE ship_date IS NULL;
