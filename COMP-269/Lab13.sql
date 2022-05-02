USE ap;


DROP PROCEDURE IF EXISTS test1;
DELIMITER //
CREATE PROCEDURE test1()
BEGIN
  DECLARE invoice_count   INT;
  SELECT COUNT(*)
  INTO invoice_count
  FROM invoices
  WHERE invoice_total - payment_total - credit_total >= 5000;
  
  SELECT CONCAT(invoice_count, ' invoices exceed $5000.') AS message;
END//
DELIMITER ;
CALL test1();


DROP PROCEDURE IF EXISTS test2;
DELIMITER //
CREATE PROCEDURE test2()
BEGIN
  DECLARE count_balance_due   INT;
  DECLARE total_balance_due   DECIMAL(9,2);
  SELECT COUNT(*), SUM(invoice_total - payment_total - credit_total)
  INTO count_balance_due, total_balance_due
  FROM invoices
  WHERE invoice_total - payment_total - credit_total > 0;
  IF total_balance_due >= 30000 THEN
    SELECT count_balance_due AS count_balance_due, 
           total_balance_due AS total_balance_due;
  ELSE
    SELECT 'Total balance due is less than $30,000.' AS message;
  END IF;
END//


DELIMITER ;
CALL test2();
DROP PROCEDURE IF EXISTS test4;
DELIMITER //
CREATE PROCEDURE test4()
BEGIN
  DECLARE vendor_name_var     VARCHAR(50);
  DECLARE invoice_number_var  VARCHAR(50);
  DECLARE balance_due_var     DECIMAL(9,2);
  DECLARE s                   VARCHAR(400)   DEFAULT '';
  DECLARE row_not_found INT DEFAULT FALSE;
  DECLARE invoices_cursor CURSOR FOR
    SELECT vendor_name, invoice_number,
      invoice_total - payment_total - credit_total AS balance_due
    FROM vendors v JOIN invoices i
      ON v.vendor_id = i.vendor_id
    WHERE invoice_total - payment_total - credit_total >= 5000
    ORDER BY balance_due DESC;
  BEGIN
    DECLARE EXIT HANDLER FOR NOT FOUND
      SET row_not_found = TRUE;
    OPEN invoices_cursor;
    
    WHILE row_not_found = FALSE DO
      FETCH invoices_cursor 
      INTO vendor_name_var, invoice_number_var, balance_due_var;
      SET s = CONCAT(s, balance_due_var, '|', invoice_number_var, '|', vendor_name_var, '//');
    END WHILE;
  END;
  CLOSE invoices_cursor;    
  SELECT s AS message;
END//


DELIMITER ;
CALL test4();
DROP PROCEDURE IF EXISTS test5;
DELIMITER //
CREATE PROCEDURE test5()
BEGIN
  DECLARE column_cannot_be_null TINYINT DEFAULT FALSE;
  DECLARE CONTINUE HANDLER FOR 1048
    SET column_cannot_be_null = TRUE;
  UPDATE invoices
  SET invoice_due_date = NULL
  WHERE invoice_number = '989319-457';
  
  IF column_cannot_be_null = TRUE THEN
    SELECT 'Row was not updated - column cannot be null.' AS message;
  ELSE
    SELECT '1 row was updated.' AS message;    
  END IF;
END//
DELIMITER ;
CALL test5();