/* Question 1 */
CREATE or replace VIEW open_items 
as
select vendor_name, invoice_number, invoice_total,
invoice_total - payment_total - credit_total as balance_due
from vendors join invoices
on vendors.vendor_id = invoices.vendor_id
where invoice_total - payment_total - credit_total > 0
order by vendor_name;



/* Question 2 */
SELECT DISTINCT * FROM OPEN_ITEMS WHERE BALANCE_DUE >=1000;

/* Question 3 */
create or replace view open_items_summary
as select vendor_name, count(*) as open_item_count, sum(invoice_total - payment_total - credit_total) as open_item_total_sum
from vendors
join invoices
on vendors.vendor_id = invoices.vendor_id;

/* Question 4 */
select * from open_items_summary where rownum<6;


/* Question 5 */
CREATE VIEW VendorAddress
AS
SELECT VendorID, VendorAddress1, VendorAddress2, VendorState, VendorZip, VendorCity
FROM VendorTable;



/* Question 6 */

UPDATE VendorAddress
SET VendorAddress2 = 'Ste 260',
VendorAddress1 = REPLACE(VendorAddress1,'Ste 260','')
WHERE VendorAddress1 LIKE '% Ste 260 %';
SELECT * FROM sys.foreign_keys


