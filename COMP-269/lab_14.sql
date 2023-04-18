#Joseph Pobega
#lab 14
#Tuesday



#1
DROP PROCEDURE IF EXISTS test5;
DELIMITER //
CREATE PROCEDURE test5()

BEGIN
	DECLARE sql_error TINYINT DEFAULT FALSE;
	DECLARE CONTINUE HANDLER FOR SQLEXCEPTION
    SET sql_error = TRUE;
    
    
	START TRANSACTION;
    
    UPDATE vendors
    SET vendor_name = "FedUp"
    WHERE vendor_name = "Federal Express Coporation";
    
    UPDATE invoices
    SET vendor_id = (SELECT vendor_id FROM vendors WHERE vendor_name = "FedUp")
	WHERE vendor_id = (SELECT vendor_id FROM vendors WHERE vendor_name = "United Parcel Service");
    
    DELETE FROM vendors
    WHERE vendor_name = "United Parcel Service";
    
    IF sql_error FALSE THEN
		COMMIT;
        SELECT "Yay! You did it!";
	ELSE
		ROLLBACK;
        SELECT "Try again...learn your SQL!";
	END IF;
    
END//
DELIMITER ;
Call test5();
