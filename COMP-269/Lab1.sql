
-- COMP269 Lab 1 Submission

-- Two dashes in the beginning of the line signals the line is for comments
-- Note that at end of each SQL statement you must use ; to end the statement

-- set ap as the default database (the database you are currently working with)
use ap;

-- list all the tables in the database
show tables;

-- describe the table (show the columns in the table)
desc vendors;

-- show all the rows in vendors table
select * from vendors;

-- show some columns in invoice table
select vendor_name, vendor_state from vendors;

-- show all rows in invoices table
select * from invoices;

-- calculate number of invoices in the invoices table. This produces a single result
SELECT COUNT(*) AS number_of_invoices
FROM invoices;

select * from terms
