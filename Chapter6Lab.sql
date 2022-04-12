/* problem 1 */
select vendor_id as "VENDOR ID", sum(invoice_total) as "INVOICE TOTAL"
from invoices
group by vendor_id;

/* problem 2 */
SELECT vendor_name, SUM(payment_total) AS total
FROM vendors JOIN invoices ON invoices.vendor_id = vendors.vendor_id 
GROUP BY vendor_name
ORDER BY total DESC;

/* problem 3 */
select vendor_name as "VENDOR NAME", count(invoice_id) as "INVOICE ID", sum(invoice_total) as "SUM INVOICE TOTAL"
from vendors join invoices on vendors.vendor_id = invoices.vendor_id
group by vendor_name
order by invoice_id desc;

/* problem 4 */
SELECT account_description,
COUNT(invoice_line_items.account_number = invoice_line_items.account_number),
SUM(invoice_line_items.line_item_amount)
FROM general_ledger_accounts
INNER JOIN invoice_line_items
ON general_ledger_accounts.account_number = invoice_line_items.account_number
GROUP BY account_description
HAVING COUNT(invoice_line_items.account_number = invoice_line_items.account_number) > 1;

/* problem 5 */


/* problem 6 */
SELECT account_number, SUM(line_item_amount) AS line_item_sum
FROM invoice_line_items
GROUP BY account_number with rollup;

/* problem 7 */
select vendor_name, count(distinct gl.account_number) as distinct_general_ledger_account_count
from invoices i join vendors v
on i.vendor_id = v.vendor_id
join invoice_line_items ili
on ili.invoice_id = i.invoice_id
join general_ledger_accounts gl
on gl.account_number = ili.account_number
group by vendor_name
having distinct_general_ledger_account_count > 1
order by vendor_name;