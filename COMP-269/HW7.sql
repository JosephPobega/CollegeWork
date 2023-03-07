#Joseph Pobega
#HW7
#Tuesday


use my_guitar_shop;


#1
SELECT DISTINCT category_name FROM Categories
WHERE category_id IN (SELECT category_id FROM Products)
ORDER BY category_name;


#2
SELECT product_name, list_price
FROM products
WHERE list_price > (SELECT AVG(list_price) FROM products)
ORDER BY list_price DESC;


#3
SELECT category_name
FROM categories c
WHERE NOT EXISTS( SELECT * FROM products p WHERE p.category_id = c.category_id);


#4
SELECT OrdTot.email_address, order_id, max_order_total
FROM (SELECT email_address, o.order_id, SUM((item_price - discount_amount) * quantity) AS order_total
FROM customers c
JOIN orders o ON c.customer_id = o.customer_id
JOIN order_items oi ON o.order_id = oi.order_id
GROUP BY email_address , order_id) OrdTot
JOIN (SELECT email_address, MAX(order_total) AS max_order_total 
FROM (SELECT email_address, o.order_id, SUM((item_price - discount_amount) * quantity) AS order_total
FROM customers c
JOIN orders o ON c.customer_id = o.customer_id
JOIN order_items oi ON o.order_id = oi.order_id
GROUP BY email_address , order_id) OrdTotCopy
GROUP BY email_address) MaxOrdTot ON OrdTot.email_address = MaxOrdTot.email_address
AND OrdTot.order_total = MaxOrdTot.max_order_total;


#5
SELECT product_name, discount_percent
FROM products
WHERE discount_percent NOT IN (SELECT discount_percent
FROM products
GROUP BY discount_percent
HAVING COUNT(discount_percent) > 1)
ORDER BY product_name;


#7
SELECT email_address, order_id, order_date
FROM customers c
JOIN orders o ON c.customer_id = o.customer_id
WHERE order_date = (SELECT MIN(order_date)
FROM orders
WHERE customer_id = o.customer_id);

