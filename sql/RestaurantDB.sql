--CREATE DATABASE restaurantDB

-- CREATE account table 
CREATE TABLE accountTB(
	Account VARCHAR(31) PRIMARY KEY,
	[Password] VARCHAR(31) NOT NULL,
	Authority INT DEFAULT 0
);
-- ADD username columm
ALTER TABLE accountTB
ADD [Username] NVARCHAR(51);
-- ADD some record
INSERT INTO accountTB(Account,[Password],Authority,[Username])
VALUES('Admin','Admin',DEFAULT,N'Quản lý trưởng'),
	('Mod','Mod',DEFAULT,N'Quản lý'),
	('Customer1','Customer1',1,N'Khách lẻ');
