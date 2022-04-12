/* Lab Chapter 3
	Joseph Pobega
*/

/* PROBLEM 6 */
SELECT vendor_contact_last_name as last_name, vendor_contact_first_name as first_name, vendor_name 
FROM vendors
ORDER BY vendor_contact_last_name ASC, vendor_contact_first_name ASC;

/* PROBLEM 7 */
SELECT CONCAT(vendor_contact_last_name, " ", vendor_contact_first_name) as fullname
FROM vendors
WHERE LEFT(vendor_contact_last_name, 1) IN ('A', 'B', 'C', 'E')
order by vendor_contact_last_name ASC;

/*	PROBLEM 8 */
SELECT invoice_due_date as DueDate, invoice_total as InvoiceTotal, invoice_total*.1 as '10%',invoice_total*1.1 as 'Plus 10%' 
FROM invoices
WHERE invoice_total between 500 and 1000
order by invoice_due_date DESC;

/* PROBLEM 9 */
SELECT invoice_number, invoice_total, (payment_total + credit_total) as 'Payment Credit Total', (invoice_total - (payment_total + credit_total)) as 'balance due'
FROM invoices
WHERE (invoice_total-(payment_total + credit_total)) > 50
order by balance_due DESC
limit 5;

/* PROBLEM 10 */
SELECT invoice_number, invoice_date, (invoice_total) - (payment_total + credit_total) as 'balance due', payment_date
FROM invoices
WHERE payment_date is null;

/* PROBLEM 11 */
SELECT CURRENT_DATE, date_format(current_date, '%m-%d-%Y') as "current_date";

/* PROBLEM 12 */
SELECT 50000 as 'starting_principal', 50000 * 0.65 as interest, 50000 + (50000 * .065) as principal_plus_interest

