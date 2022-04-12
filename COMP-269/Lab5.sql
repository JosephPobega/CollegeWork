/* Joseph Pobega
COMP 269
*/

SELECT *
from invoices;

-- Problem 1 --
INSERT INTO terms Values
(6, "Net due 120 days", 120);

-- problem 2 --
UPDATE terms
SET terms_description = "Net due 120 days", terms_due_days = 125
WHERE terms_id = 6;

-- problem 3 --
DELETE from terms
WHERE terms_id = 6;

-- problem 4 --
INSERT into invoices values
(default, 32, "AX-014-027", "2014/8/1", 434.58, 0, 0, 2, "2014/8/31", null);

-- problem 5 --
INSERT INTO invoice_line_items VALUES
(115, 1, 160, 180.23, "Hard drive"), (115, 2, 527, 254.35, "Exchange Server Update");

-- problem 6 --
UPDATE invoices
Set credit_total = invoice_total * .1, payment_total = invoice_total - credit_total
WHERE invoice_id = 115;

-- problem 7--
Update vendors
SET default_account_number = 403
WHERE invoice_id = 115;

-- problem 8 --
update invoices
set terms_id = 2
where vendor_id in (select vendor_id from vendors where default_terms_id = 2);

-- problem 9 --

Delete from invoice_line_items
where invoice_id = 115;
delete from invoices
where invoice_id = 115;

