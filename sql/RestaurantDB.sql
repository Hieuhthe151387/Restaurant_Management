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
--CREATE EmployeeTB
SELECT * FROM accountTB
CREATE TABLE EmployeesTB(
	EmployeeId VARCHAR(5) PRIMARY KEY,
	EmployeeName NVARCHAR(40) NOT NULL,
	Gender BIT,
	Dob DATE NOT NULL,
	PhoneNumber VARCHAR(10) NOT NULL,
	[Address] NVARCHAR(127) NOT NULL,
	[Role] NVARCHAR(50) NOT NULL,
	Salary MONEY NOT NULL,
	Account VARCHAR(31),
	ManagerID VARCHAR(5),
	FOREIGN KEY (Account) REFERENCES accountTB(Account),
	--FOREIGN KEY (ManagerID) REFERENCES Employees(EmployeeId)
);
--CREATE self FOREIGN KEY in EmployeesTB
ALTER TABLE EmployeesTB
ADD CONSTRAINT FK_manager
FOREIGN KEY (ManagerID) REFERENCES EmployeesTB(EmployeeID);

-- ADD some record into EmployeesTB
INSERT INTO EmployeesTB
(EmployeeId,EmployeeName,Gender,Dob,PhoneNumber,[Address],[Role],Salary,Account,ManagerID)
VALUES
--('EM01',N'Nguyễn Văn Chủ',1,'01/01/1996','0123456789',N'thôn Cống Khê,xã Hoà Lâm,huyện Ứng Hoà,thành phố Hà Nội',N'Chủ nhà hàng',null,null,null),
('EM02',N'Nghiêm Thị Quản',0,'01/01/1998','0123456798',N'thôn Cống Khê,xã Hoà Lâm,huyện Ứng Hoà,thành phố Hà Nội',N'Quản lý trưởng',15000000,'Admin',null),
('EM03',N'Chu Văn Tiếp',1,'01/01/2000','0123456978',N'thôn Cống Khê,xã Hoà Lâm,huyện Ứng Hoà,thành phố Hà Nội',N'Bồi bàn',6000000,null,'EM02');
SELECT * FROM EmployeesTB
-- CREATE CustomersTB 
CREATE TABLE CustomersTB(
	CustID VARCHAR(5) PRIMARY KEY,
	CustName NVARCHAR(40) NOT NULL,
	AgeRange BIT NOT NULL,--set 3 status bit reperent to <18,18-30,30>...
	Gender BIT,--Range of bit data type 1-64 
	[Address] NVARCHAR(100) NOT NULL,
	Account VARCHAR(31),
	FOREIGN KEY (Account) REFERENCES accountTB(Account)
);
-- alter datatype of customer age range
ALTER TABLE CustomersTB
ALTER COLUMN AgeRange INT
-- ADD some record into CustomersTB
--INSERT INTO accountTB(Account,[Password],Authority,[Username])
--VALUES('Customer02','Customer02',1,N'Khách Hoàng');
INSERT INTO CustomersTB(CustID,CustName,AgeRange,Gender,[Address],Account)
VALUES ('C001',N'Khách lẻ',1,1,N'thôn Cống Khê',null),
('C002',N'Hoàng Văn Thượng Đế',2,1,N'thôn Cống Khê,xã Hoà Lâm,huyện Ứng Hoà, thành phố Hà Nội.','Customer02');
