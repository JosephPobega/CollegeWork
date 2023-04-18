#Joseph Pobega
#Lab13
#Tuesday


#1
DROP PROCEDURE IF EXISTS test;
DELIMITER //
CREATE PROCEDURE test()
BEGIN

	DECLARE countOfAllRows INT;
    SELECT COUNT(*)
		INTO countOfAllRows
    FROM invoices
    WHERE (invoice_total - payment_total - credit_total) >= 5000;
    SELECT CONCAT(countOfAllRows, " Invoices exceed $5,000") AS message;
    
END//

DELIMITER ;

CALL test();


#2
DROP PROCEDURE IF EXISTS test2;
DELIMITER //
CREATE PROCEDURE test2()
BEGIN

	DECLARE invoice_count INT;
    DECLARE balance_SUM DECIMAL(9,2);
    SELECT COUNT(*),
		SUM(invoice_total - payment_total - credit_total)
		INTO invoice_count, balance_sum
        FROM invoices
        WHERE invoice_total - payment_total - credit_total > 0;
		
        IF balance_sum >= 30000 THEN
			SELECT invoice_count, balance_sum;
		ELSE 
			SELECT "Total balance due is less than $30,000" AS message;
        END IF;
    
END//

DELIMITER ;

CALL test2();


#4

call test4();
DROP PROCEDURE IF EXISTS test4;

DELIMITER //
CREATE PROCEDURE test()
BEGIN
	DECLARE row_not_found TINYINT DEFAULT FALSE;
    
    DECLARE name VARCHAR(50);
    DECLARe inv_number VARCHAR(50);
    DECLARE balance_due_var DECIMAL(9,2);
    DECLARE output_string VARCHAR(1000);
    
    DECLARE vendor_balance CURSOR FOR
    SELECT vendor_name, invoice_number,
    (invoice_total - payment_total - credit_total)
    
    FROM vendors NATURAL JOIN invoices
    WHERE invoice_total - payment_total - credit_total > 5000
    ORDER BY 3 DESC;
    
    DECLARE CONTINUE HANDLER FOR NOT FOUND
    SET row_not_found = TRUE;
    SET output_string="";
    OPEN vendor_balance;
    
    WHILE row_not_found = FALSE DO
		FETCH vendor_open
			INTO name_var, inv_number, balance_due_var;   
    
		SET output_string = CONCAT(output_string, balance_due_var, "|", inv_number, "|", name_var, "//");
            
    END WHILE;
    
    CLOSE vendor_balance;
    
    SELECT output_string AS result;
    
    
END//

DELIMITER ;

CALL test(4);
