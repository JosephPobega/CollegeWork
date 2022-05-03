drop database if exists comp271;
create database comp271;
use comp271;


create table staff (
id	char(9) not null,
lastName varchar(15),
firstName varchar(15),
mi char(1),
address varchar(20),
city varchar(20),
state varchar(20),
telephone char(10),
email varchar(40),
primary key (id)
);

insert into staff values (
'101', 'Smith', 'Thomas', 'J', '12 main St.', 'Freehold', 'NJ', '7325551234', 'tsmith@hotmail.com'
);
insert into staff values (
'102', 'Johnson', 'Annie', 'S', '34 Oak St.', 'Red Bank', 'NJ', '7325559876', 'annie.johnson@gmail.com'
);
insert into staff values (
'103', 'Jones', 'Edward', 'R', '76 Elm St.', 'Holmdel', 'NJ', '7325557645', 'bigeddie@comcast.com'
);
insert into staff values (
'104', 'Thompson', 'Sarah', 'G', '54 Bank St.', 'Lincroft', 'NJ', '7325554309', 'sarah@yahoo.com'
);

update staff
set address = '45 Riiver Rd.', city = 'Freehold'
where id = '104';

delete from staff
where id = '103';

select * 
from staff;

select firstName, mi, lastName, email
from staff
where city = 'Freehold';