/* Lab 4 
Joseph Pobega
*/


/* Problem 1 */
Select * From vendors v join invoices i 
ON v.vendor_id = i.vendor_id;


/* Problem 2 */
Select vendor_name, invoice_number, invoice_date, CONCAT(invoice_total - payment_total - credit_total) as balance_due
From vendors v join invoices i 
ON v.vendor_id = i.vendor_id
Where invoice_total - payment_total - credit_total != 0
order by vendor_name ASC;


/* Problem 3 */
Select vendor_name, default_account_number as default_account, account_description as description
From vendors v join general_ledger_accounts
on v.default_account_number = account_number
order by account_description, vendor_name;


/* Problem 4 */
Select vendor_name, invoice_date, invoice_number, concat(invoice_sequence) as li_sequence, concat(line_item_amount) as li_amount
from vendors v join invoices i 
on v.vendor_id = i.vendor_id
join invoice_line_items li
on i.invoice_id = li.invoice_id
order by vendor_name, invoice_date, invoice_number, invoice_sequence;


/* Problem 5 */
Select vendor_id, vendor_name, concat(vendor_contact_first_name, '' , vendor_concat_last_name) as name
from vendors
