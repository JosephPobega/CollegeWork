#Joseph Pobega
#Lab Chapter 6
#Tuesday



#1
SELECT vendor_id, SUM(invoice_total)
FROM invoices
GROUP BY vendor_id;


#2
SELECT vendor_name, SUM(payment_total)
as payment_total_sum
from vendors NATURAL JOIN invoices
GROUP BY 1
ORDER BY payment_total_sum DESC;


#3
SELECT vendor_name, COUNT(*) AS invoice_count, SUM(invoice_total) AS total
FROM vendors JOIN invoices USING(vendor_id)
GROUP BY vendor_name
ORDER BY invoice_count DESC;


#4
SELECT account_description, COUNT(*) AS line_item_count, SUM(line_item_amount) as total
FROM general_ledger_accounts GLA JOIN invoice_line_items LI
ON GlA.account_number = LI.account_number
GROUP BY account_description
HAVING line_items_count > 1
ORDER BY total;


#5
SELECT account_description, COUNT(*) AS line_item_count, SUM(line_item_amount) as total
FROM general_ledger_accounts GLA JOIN invoice_line_items LI
ON GlA.account_number = LI.account_number
JOIN invoices I
ON I.invoice_id = LI.invoice_id
WHERE invoice_date BETWEEN '2014-04-01' AND '2014-06-30'
GROUP BY account_description
HAVING line_items_count > 1
ORDER BY total;


#6
SELECT account_number, SUM(line_item_amount) as li_total
FROM invoice_line_items
GROUP BY account_number WITH ROLLUP;


#7
SELECT vendor_state, vendor_city, COUNT(*) as vendor_count
FROM vendors
GROUP BY vendor_state, vendor_city WITH ROLLUP
