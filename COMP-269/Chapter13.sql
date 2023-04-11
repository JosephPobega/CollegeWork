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
