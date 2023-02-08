#Joseph Pobega
#Tuesday
use my_guitar_shop;

#1
SELECT c.category_name, p.product_name, p.list_price
FROM categories AS c
INNER JOIN products AS p ON c.category_id = p.category_id
ORDER BY c.category_name, p.product_name ASC; 

#2
SELECT c.first_name, c.last_name, a.line1, a.city, a.state, a.zip_code
FROM customers AS c 
INNER JOIN addresses AS a 
ON c.customer_id = a.customer_id
WHERE c.email_address = 'allan.sherwood@yahoo.com'; 

#3
SELECT c.first_name, c.last_name, a.line1, a.city, a.state, a.zip_code
FROM customers AS c
INNER JOIN addresses AS a ON c.customer_id = a.customer_id
WHERE (c.customer_id = a.customer_id)
AND (c.shipping_address_id = a.address_id);

#4
SELECT c.last_name, c.first_name, o.order_date, p.product_name, oi.item_price,
oi.discount_amount, oi.quantity
FROM customers c
INNER JOIN orders o ON c.customer_id = o.customer_id
INNER JOIN order_items oi ON o.order_id = oi.order_id
INNER JOIN products p ON oi.product_id = p.product_id
ORDER BY c.last_name , o.order_date , p.product_name;

#5
SELECT p1.product_name, p1.list_price
FROM products p1
JOIN products p2 ON p1.product_id != p2.product_id
AND p1.list_price = p2.list_price
ORDER BY p1.product_name ASC;

#6
SELECT c.category_name, p.product_id
FROM categories c 
LEFT JOIN products p ON c.category_id = p.category_id
WHERE p.product_id IS NULL;

#7
SELECT 'SHIPPED' AS 'Ship Status', order_id AS 'The order id', order_date
FROM orders
WHERE ship_date IS NOT NULL 
UNION SELECT 'NOT SHIPPED' AS 'Ship Status', order_id AS 'The order id', order_date
FROM orders
WHERE ship_date IS NULL
ORDER BY order_date;






