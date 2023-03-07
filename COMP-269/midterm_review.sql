#Joseph Pobega
#midterm review
#Tuesday

use my_guitar_shop;


#1
select customers.first_name, customers.last_name, products.product_name, products.description
from products, customers, orders, order_items
where customers.first_name = 'David'and customers.last_name = 'Goldstein'
and order_items.order_id = orders.order_id
and order_items.product_id = products.product_id;


#2
select customers.first_name, customers.last_name, count(products.product_id) 'Number of Items Purchased'
from products, customers, orders, order_items
where order_items.order_id = orders.order_id
and order_items.product_id = products.product_id
group by customers.first_name, customers.last_name;


#3
select first_name, last_name, product_name, description
FROM customers c 
JOIN orders o ON c.customer_id = o.customer_id 
JOIN order_items oi ON o.order_id = oi.order_id 
JOIN products p ON oi.product_id = p.product_id
WHERE c.first_name = 'David' and c.last_name = 'Goldstein';

