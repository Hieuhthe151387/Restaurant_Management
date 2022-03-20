--CREATE DATABASE restaurantDB

-- CREATE account table 
CREATE TABLE accountTB(
	Account VARCHAR(31) PRIMARY KEY,
	[Password] VARCHAR(31) NOT NULL,
	--Id VARCHAR(5) NOT NULL,
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

-- get infor of user.
SELECT e.EmployeeId, e.EmployeeName, e.Gender,e.Dob,e.PhoneNumber,e.[Address],e.[Role],e.Salary,e.Account,a.[Password],a.Username,a.Authority FROM EmployeesTB e, accountTB a 
WHERE e.Account = a.Account

-- get infor of employee and manager name
WITH employee as(
	SELECT e.EmployeeId,e.EmployeeName,e.Gender,e.Dob,e.PhoneNumber,e.[Address],e.[Role],e.Salary, e.Account,e.[Password],e.Username,m.EmployeeName as ManagerName
	FROM(SELECT e.EmployeeId, e.EmployeeName, e.Gender,e.Dob,e.PhoneNumber,e.[Address],e.[Role],e.Salary,e.Account,a.[Password],a.Username,a.Authority, e.ManagerID FROM EmployeesTB e LEFT JOIN accountTB a
ON e.Account = a.Account)e LEFT JOIN EmployeesTB m ON e.ManagerID = m.EmployeeId
)

SELECT e.EmployeeName,m.EmployeeName as ManagerName FROM EmployeesTB e LEFT JOIN EmployeesTB m ON e.ManagerID = m.EmployeeId;

------------------------------------------------------------------------------------------------------------------------------

SELECT * FROM EmployeesTB
SELECT * FROM CustomersTB
Select * FROM accountTB

-- Create product, order, order_detail DB

CREATE TABLE Product(
	product_id VARCHAR(5) PRIMARY KEY,
	productname NVARCHAR(100) NOT NULL,
	price MONEY not null,
	cost MONEY not null,
	quantity INT not null
);
CREATE TABLE Category(
	category_id VARCHAR(5) PRIMARY KEY,
    categoryname NVARCHAR(100) NOT NULL,
); 
CREATE TABLE Classify(
	id int Primary key identity(1,1),
	category_id VARCHAR(5),
	product_id VARCHAR(5),
	FOREIGN KEY (category_id) REFERENCES Category(category_id),
	FOREIGN KEY (product_id) REFERENCES Product(product_id)
);


CREATE TABLE [Order](
	order_id VARCHAR(5) PRIMARY KEY,
	order_date DATE,
	cust_id VARCHAR(5),
	employee_id VARCHAR(5),
	[status] int,
	FOREIGN KEY (cust_id) REFERENCES CustomersTB(CustID),
	FOREIGN KEY (employee_id) REFERENCES EmployeesTB(EmployeeID) 
);

CREATE TABLE Order_detail(
	id INT Primary key identity(1,1),
	order_id VARCHAR(5),
	product_id VARCHAR(5),
	quantity INT,
	price money,
	cost money,
	FOREIGN KEY (product_id) REFERENCES Product(product_id),
	FOREIGN KEY (order_id) REFERENCES [Order](order_id)
);
----------------------------------------------------------------------------
Select * FROM EmployeesTB
Select * FROM CustomersTB
Update CustomersTB set CustID = 'CS02' where CustID='C002'
----------------------------------------------------------------------------
Select * FROM accountTB
----------------------INSERT NEW DATA TO DATABASE---------------------------
SELECT * FROM Product
INSERT INTO Product(product_id,productname,price,cost,quantity) VALUES
('FD01',N'Lẩu cá',250000,200000,10),
('FD02',N'Gà nướng',200000,170000,10),
('FD03',N'Xôi gà',185000,150000,10),
('FD04',N'Bia Hà Nội',18500,15000,10)
-----------------------------------------------
SELECT * FROM [Order]
INSERT INTO [Order](order_id,order_date,cust_id,employee_id,[status]) 
VALUES
('OD01',GETDATE(),'CS01','EM03',2),
('OD02',GETDATE(),'CS01','EM03',2),
('OD03',GETDATE(),'CS01','EM03',2);
----------------------------------------------------
SELECT *FROM [Order_detail]
SELECT * FROM Product
INSERT Order_detail(order_id,product_id,quantity,price,cost)
VALUES 
('OD01','FD01',1,250000,200000),
('OD01','FD04',3,18500,15000);

------------------------Add short name column--------------------------------
Alter table EmployeesTB
Add Shortname NVARCHAR(20);
Select MAX(EmployeeId)as lastid from EmployeesTB

Select * FROM EmployeesTB
Delete from EmployeesTB where EmployeeId = 'EM04';
Insert into EmployeesTB values('EM04',N'Hoàng Văn Khuê',0,'2001-01-02','0123459876',N'Trạch Xá, Hoà Lâm, Ứng Hoà, Hà Nội',N'Phục vụ',6000000,null,null,N'Khuê');
UPDATE EmployeesTB SET EmployeeName = N'Nguyễn Vệ',Gender=1, Dob='1990-03-02',
PhoneNumber ='093216547',[Address]=N'Cống Khê, Hoà Lâm, Ứng Hoà, Hà Nội',[Role]=N'Bảo vệ',Salary= 500000,ManagerID=null,Account=null,
ShortName=N'Bác Vệ' WHERE EmployeeId='EM03';
UPDATE EmployeesTB SET EmployeeName = N'Hoàng Hoa Khuê' where EmployeeId='EM04';
-------------------------------create store procedure---------------------------------------------
--CREATE PROCEDURE getordertotal @id varchar(5)
--AS
--SELECT SUM(quantity*price)AS total FROM Order_detail where order_id=@id

EXEC getordertotal @id = 'OD01';--democode

--CREATE PROCEDURE getorderbenefit @id varchar(5)
--AS
--SELECT SUM(quantity*(price-cost))AS benefit FROM Order_detail where order_id=@id

EXEC getorderbenefit @id = 'OD01';--demo code

--Update EmployeesTB SET Account = 'Mod' where EmployeeId ='EM02'
--select * from EmployeesTB where Account='Mod'

SELECT * FROM CustomersTB WHERE CustID='CS01';

INSERT INTO CustomersTB(CustID,CustName,Age,Gender,[Address],Account)
VALUES ('CS03',N'Hoàng Văn Khánh',35,1,N'Cống Khê, Hoà Lâm, Ứng Hoà, Hà Nội',null);

UPDATE CustomersTB SET CustName = N'Khách lẻ', Age=null, Gender =0, [Address] = N'Cống Khê,Hoà Lâm,Ứng Hoà,Hà Nội',Shortname = null WHERE CustID ='CS01';

DELETE FROM CustomersTB WHERE CustID = 'CS03'

ALTER TABLE CustomersTB
ADD Phonenum VARCHAR(10)
SELECT * FROM EmployeesTB
DELETE FROM EmployeesTB where EmployeeId='EM04'

SELECT product_id,productname,price,cost FROM Product
INSERT INTO Product VALUES(
'FD05',N'Canh chua',35000,25000,0
);

UPDATE Product SET productname = N'Canh chua',
price = 30000, cost=20000 WHERE product_id ='FD05';

DELETE FROM Product WHERE product_id = 'FD05';

SELECT * FROM [Order] 

SELECT * FROM [Order] where [type]<>0 AND [status]=1;
SELECT order_id,[type],[status],order_date,cust_id,employee_id FROM [Order] 

INSERT INTO [Order] VALUES('OD04',GETDATE(),'CS01','EM03',4,2);

SELECT * FROM Product

UPDATE Product SET quantity = 10 WHERE product_id ='FD05';

SELECT * FROM [Order] 


SELECT * FROM (SELECT product_id,order_date FROM [Order] o, Order_detail od where o.order_id = od.order_id)

SELECT * FROM CustomersTB