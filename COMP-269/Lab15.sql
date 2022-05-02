CREATE OR REPLACE PROCEDURE insert_glaccount(p_acc_number NUMBER, p_acc_desc VARCHAR2) IS
BEGIN
INSERT INTO general_ledger_accounts VALUES(p_acc_number, p_acc_desc);
END;


/* Question 2 */
SET SERVEROUTPUT ON
BEGIN
insert_glaccount(101, 'something');-- should add successfully.
insert_glaccount(101, 'something'); --101 already exists, should print A DUP_VAL_ON_INDEX error occured
COMMIT;
EXCEPTION
WHEN DUP_VAL_ON_INDEX THEN
DBMS_OUTPUT.PUT_LINE('A DUP_VAL_ON_INDEX error occured');
ROLLBACK;
WHEN OTHERS THEN
DBMS_OUTPUT.PUT_LINE('An unkown exception occurs');
ROLLBACK;
END;
/

/* Question 3 */

CREATE OR REPLACE FUNCTION test_glaccounts_description( p_acc_desc VARCHAR2)
RETURN NUMBER IS
v_number general_ledger_accounts.account_number%TYPE;
BEGIN
SELECT account_number INTO v_number
FROM general_ledger_accounts
WHERE account_description = p_desc;
IF SQL%ROWCOUNT = 1 THEN
RETURN 1;
END IF;   
EXCEPTION
WHEN NO_DATA_FOUND THEN
RETURN 0;
END;