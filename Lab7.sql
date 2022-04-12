/* Question 1*/
select distinct vendor_name
from vendors join invoices
on vendors.vendor_id = invoices.vendor_id
order by vendor_name;

/*Question 2*/
select payment_total, invoice_total, invoice_number
from invoices 
where payment_total > 
(select avg(payment_total)
from invoices
where payment_total > 0)
order by invoice_total desc;

/*Question 3*/
select account_number, account_description
from general_ledger_accounts
where not exists(select * from invoice_line_items
where general_ledger_accounts.account_number = invoice_line_items.account_number);

/*Question 4*/
select vendor_name, i.invoice_id, invoice_sequence, line_item_amount
from vendors v join invoices i
on v.vendor_id = i.vendor_id
join invoice_line_items li
on i.invoice_id = li.invoice_id
where i.invoice_id in
(select invoice_id
from invoice_line_items
where invoice_sequence > 1)
order by vendor_name, invoice_id, invoice_sequence;

/*Question 5*/
select vendor_id, max(invoice_total) as largest_unpaid_invoice
from invoices
where invoice_total - credit_total - payment_total > 0
group by vendor_id;





