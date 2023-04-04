#Joseph Pobega
#Tuesday
#Lab11


#1
USE ap;

CREATE INDEX vendors_vendor_zip_code_ix
ON vendors(vendor_zip_code);


#2
DROP DATABASE IF EXISTS my_lab_db;
CREATE DATABASE IF NOT EXISTS my_lab_db CHARSET utf8;

USE my_lab_db;

DROP TABLE IF EXISTS members;
CREATE TABLE members (
	member_id INT PRIMARY KEY AUTO_INCREMENT,
    first_name VARCHAR(45) NOT NULL,
    last_name VARCHAR(45) NOT NULL,
    address VARCHAR(45) NOT NULL,
    city VARCHAR(45) NOT NULL,
    state VARCHAR(45) NOT NULL,
    phone VARCHAR(15) NOT NULL
) ENGINE = InnoDB;

DROP TABLE IF EXISTS groups;
CREATE TABLE groups (
	group_id INT PRIMARY KEY AUTO_INCREMENT,
    group_name VARCHAR(45) NOT NULL
);

DROP TABLE IF EXISTS members_groups;
CREATE TABLE members_groups (
	group_id INT REFERENCES groups(group_id),
    member_id INT,
    CONSTRAINT member_groups_fk_members
	FOREIGN KEY member_groups(member_id)
    REFERENCES members(member_id)
);


#3
INSERT INTO members 
VALUES
	(DEFAULT,'Joseph', 'Pobega', '10 Scott Drive', 'Hazlet', 'NJ', '9086709609'),
	(DEFAULT,'Bob', 'Pobega', '11 Scott Drive', 'Hazlet', 'NJ', '9086709609');

INSERT INTO groups 
VALUES
	(DEFAULT,'GROUP1'),
    (DEFAULT,'GROUP2');

INSERT INTO members_groups 
VALUES
	(1,2), (2,1), (2,2);

SELECT group_name, last_name, first_name
FROM members NATURAL JOIN members_groups NATURL JOIN groups
ORDER BY 1, 2, 3;


#4
ALTER TABLE members
ADD annual_dues DECIMAL(5,2) DEFAULT 52.50,
ADD payment_date DATE;


#5
ALTER TABLE groups
MODIFY group_name VARCHAR(45) NOT NULL UNIQUE;

INSERT INTO groups VALUES (DEFAULT, 'GROUP2')




































