/* Question 1 */
savepoint start;
drop procedure if exists test1;
delimiter //
create procedure test1()
begin

declare sql_error tinyint default false;
declare continue handler for sql_exception
set sql_error = true;

start transaction;
update vendors
set vendor_nam e= "fedup"
where vendor_id = 125;

update invoices
set vendor_id = 123
where vendor_id = 122;

savepoint before_vendor_change;
delete from vendors where vendor_id = 123;
if sql_error = false then
commit;
select "sucess";
else
rollback to start;
select "rollback";
end if;
end //
call test1();


/* Question 2 */
use ap;
drop procedure if exists test2;
delimiter //

create procedure test2()
begin
	declare sql_error tinyint default false;
    declare continue handler for sqlexception
    set sql_error = true;
    
    start transaction;
    
    savepoint before_delete_invoice_line_items;
    