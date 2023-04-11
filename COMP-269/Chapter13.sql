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
