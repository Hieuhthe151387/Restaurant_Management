--CREATE DATABASE[restaurantDB]
USE [restaurantDB]
GO
/****** Object:  Table [dbo].[Product]    Script Date: 03/23/2022 09:23:47 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Product](
	[product_id] [varchar](5) NOT NULL,
	[productname] [nvarchar](100) NOT NULL,
	[price] [money] NOT NULL,
	[cost] [money] NOT NULL,
	[quantity] [int] NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[product_id] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
INSERT [dbo].[Product] ([product_id], [productname], [price], [cost], [quantity]) VALUES (N'FD01', N'Lẩu cá', 150000.0000, 100000.0000, 10)
INSERT [dbo].[Product] ([product_id], [productname], [price], [cost], [quantity]) VALUES (N'FD02', N'Gà nướng', 200000.0000, 170000.0000, 10)
INSERT [dbo].[Product] ([product_id], [productname], [price], [cost], [quantity]) VALUES (N'FD03', N'Xôi gà', 185000.0000, 150000.0000, 10)
INSERT [dbo].[Product] ([product_id], [productname], [price], [cost], [quantity]) VALUES (N'FD04', N'Bia Hà Nội', 15000.0000, 10000.0000, 10)
INSERT [dbo].[Product] ([product_id], [productname], [price], [cost], [quantity]) VALUES (N'FD05', N'Canh chua', 15000.0000, 10000.0000, 10)
/****** Object:  Table [dbo].[Category]    Script Date: 03/23/2022 09:23:47 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Category](
	[category_id] [varchar](5) NOT NULL,
	[categoryname] [nvarchar](100) NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[category_id] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[accountTB]    Script Date: 03/23/2022 09:23:47 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[accountTB](
	[Account] [varchar](31) NOT NULL,
	[Password] [varchar](31) NOT NULL,
	[Authority] [int] NULL,
	[Username] [nvarchar](51) NULL,
PRIMARY KEY CLUSTERED 
(
	[Account] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
INSERT [dbo].[accountTB] ([Account], [Password], [Authority], [Username]) VALUES (N'Admin', N'Admin', 0, N'Quản lý trưởng')
INSERT [dbo].[accountTB] ([Account], [Password], [Authority], [Username]) VALUES (N'Customer02', N'Customer02', 1, N'Khách Hoàng')
INSERT [dbo].[accountTB] ([Account], [Password], [Authority], [Username]) VALUES (N'Customer1', N'Customer1', 1, N'Khách lẻ')
INSERT [dbo].[accountTB] ([Account], [Password], [Authority], [Username]) VALUES (N'Mod', N'Mod', 0, N'Quản lý')
/****** Object:  Table [dbo].[EmployeesTB]    Script Date: 03/23/2022 09:23:47 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[EmployeesTB](
	[EmployeeId] [varchar](5) NOT NULL,
	[EmployeeName] [nvarchar](40) NOT NULL,
	[Gender] [bit] NULL,
	[Dob] [date] NOT NULL,
	[PhoneNumber] [varchar](10) NOT NULL,
	[Address] [nvarchar](127) NOT NULL,
	[Role] [nvarchar](50) NOT NULL,
	[Salary] [money] NOT NULL,
	[ManagerID] [varchar](5) NULL,
	[Account] [varchar](31) NULL,
	[Shortname] [nvarchar](20) NULL,
PRIMARY KEY CLUSTERED 
(
	[EmployeeId] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
INSERT [dbo].[EmployeesTB] ([EmployeeId], [EmployeeName], [Gender], [Dob], [PhoneNumber], [Address], [Role], [Salary], [ManagerID], [Account], [Shortname]) VALUES (N'EM02', N'Hoàng Đại Lý', 0, CAST(0x791B0B00 AS Date), N'093214567', N'Cống Khê, Hoà Lâm, Ứng Hoà, Hà Nội', N'Quản lý', 15500000.0000, NULL, N'Mod', N'Quản Quản')
INSERT [dbo].[EmployeesTB] ([EmployeeId], [EmployeeName], [Gender], [Dob], [PhoneNumber], [Address], [Role], [Salary], [ManagerID], [Account], [Shortname]) VALUES (N'EM03', N'Nguyễn Vệ', 1, CAST(0xFF150B00 AS Date), N'093216547', N'Cống Khê, Hoà Lâm, Ứng Hoà, Hà Nội', N'Bảo vệ', 500000.0000, NULL, NULL, N'Bác Vệ')
INSERT [dbo].[EmployeesTB] ([EmployeeId], [EmployeeName], [Gender], [Dob], [PhoneNumber], [Address], [Role], [Salary], [ManagerID], [Account], [Shortname]) VALUES (N'EM04', N'Hoàng Trung Hiếu ', 1, CAST(0x1A240B00 AS Date), N'0987123654', N'Cống Khê, Hoà Lâm, Ứng Hoà, Hà Nội', N'Waiter', 1500000.0000, NULL, NULL, N'Hiếu')
/****** Object:  Table [dbo].[CustomersTB]    Script Date: 03/23/2022 09:23:47 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[CustomersTB](
	[CustID] [varchar](5) NOT NULL,
	[CustName] [nvarchar](40) NOT NULL,
	[Age] [int] NULL,
	[Gender] [bit] NULL,
	[Address] [nvarchar](100) NOT NULL,
	[Account] [varchar](31) NULL,
	[Shortname] [nvarchar](20) NULL,
	[Phonenum] [varchar](10) NULL,
PRIMARY KEY CLUSTERED 
(
	[CustID] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
INSERT [dbo].[CustomersTB] ([CustID], [CustName], [Age], [Gender], [Address], [Account], [Shortname], [Phonenum]) VALUES (N'CS01', N'Khách lẻ', NULL, 0, N'Cống Khê,Hoà Lâm,Ứng Hoà,Hà Nội', NULL, NULL, NULL)
INSERT [dbo].[CustomersTB] ([CustID], [CustName], [Age], [Gender], [Address], [Account], [Shortname], [Phonenum]) VALUES (N'CS02', N'Hoàng Văn Khánh    ', 34, 1, N'Đống Long, Hoà Lâm, Ứng Hoà, Hà Nội', N'Customer02', N'Anh Khánh', N'0912365478')
INSERT [dbo].[CustomersTB] ([CustID], [CustName], [Age], [Gender], [Address], [Account], [Shortname], [Phonenum]) VALUES (N'CS03', N'Hoàng Trung Hiếu ', 21, 1, N'Cống Khê, Hoà Lâm, Ứng Hoà, Hà Nội', NULL, N'Anh Hiếu', N'0987123654')
/****** Object:  Table [dbo].[Classify]    Script Date: 03/23/2022 09:23:47 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Classify](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[category_id] [varchar](5) NULL,
	[product_id] [varchar](5) NULL,
PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[Order]    Script Date: 03/23/2022 09:23:47 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Order](
	[order_id] [varchar](5) NOT NULL,
	[order_date] [date] NULL,
	[cust_id] [varchar](5) NULL,
	[employee_id] [varchar](5) NULL,
	[status] [int] NULL,
	[type] [int] NULL,
PRIMARY KEY CLUSTERED 
(
	[order_id] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
INSERT [dbo].[Order] ([order_id], [order_date], [cust_id], [employee_id], [status], [type]) VALUES (N'OD01', CAST(0xB0430B00 AS Date), N'CS01', N'EM03', 2, 1)
INSERT [dbo].[Order] ([order_id], [order_date], [cust_id], [employee_id], [status], [type]) VALUES (N'OD02', CAST(0xB0430B00 AS Date), N'CS01', N'EM03', 1, 0)
INSERT [dbo].[Order] ([order_id], [order_date], [cust_id], [employee_id], [status], [type]) VALUES (N'OD03', CAST(0xBA430B00 AS Date), N'CS01', N'EM02', 1, 0)
INSERT [dbo].[Order] ([order_id], [order_date], [cust_id], [employee_id], [status], [type]) VALUES (N'OD04', CAST(0xBA430B00 AS Date), N'CS01', N'EM03', 2, 0)
INSERT [dbo].[Order] ([order_id], [order_date], [cust_id], [employee_id], [status], [type]) VALUES (N'OD05', CAST(0xBA430B00 AS Date), N'CS01', N'EM02', 1, 1)
INSERT [dbo].[Order] ([order_id], [order_date], [cust_id], [employee_id], [status], [type]) VALUES (N'OD06', CAST(0xBA430B00 AS Date), N'CS01', N'EM03', 2, 0)
INSERT [dbo].[Order] ([order_id], [order_date], [cust_id], [employee_id], [status], [type]) VALUES (N'OD07', CAST(0xBA430B00 AS Date), N'CS01', N'EM02', 1, 0)
INSERT [dbo].[Order] ([order_id], [order_date], [cust_id], [employee_id], [status], [type]) VALUES (N'OD08', CAST(0xBA430B00 AS Date), N'CS01', N'EM03', 3, 0)
INSERT [dbo].[Order] ([order_id], [order_date], [cust_id], [employee_id], [status], [type]) VALUES (N'OD09', CAST(0xBA430B00 AS Date), N'CS01', N'EM02', 0, 1)
/****** Object:  Table [dbo].[Order_detail]    Script Date: 03/23/2022 09:23:47 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Order_detail](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[order_id] [varchar](5) NULL,
	[product_id] [varchar](5) NULL,
	[quantity] [int] NULL,
	[price] [money] NULL,
	[cost] [money] NULL,
PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
SET IDENTITY_INSERT [dbo].[Order_detail] ON
INSERT [dbo].[Order_detail] ([id], [order_id], [product_id], [quantity], [price], [cost]) VALUES (3, N'OD01', N'FD01', 1, 250000.0000, 200000.0000)
INSERT [dbo].[Order_detail] ([id], [order_id], [product_id], [quantity], [price], [cost]) VALUES (4, N'OD01', N'FD04', 3, 18500.0000, 15000.0000)
INSERT [dbo].[Order_detail] ([id], [order_id], [product_id], [quantity], [price], [cost]) VALUES (11, N'OD02', N'FD02', 1, 200000.0000, 170000.0000)
INSERT [dbo].[Order_detail] ([id], [order_id], [product_id], [quantity], [price], [cost]) VALUES (12, N'OD02', N'FD04', 3, 18500.0000, 15000.0000)
INSERT [dbo].[Order_detail] ([id], [order_id], [product_id], [quantity], [price], [cost]) VALUES (15, N'OD03', N'FD02', 1, 200000.0000, 170000.0000)
INSERT [dbo].[Order_detail] ([id], [order_id], [product_id], [quantity], [price], [cost]) VALUES (16, N'OD03', N'FD04', 3, 18500.0000, 15000.0000)
INSERT [dbo].[Order_detail] ([id], [order_id], [product_id], [quantity], [price], [cost]) VALUES (17, N'OD04', N'FD02', 1, 200000.0000, 170000.0000)
INSERT [dbo].[Order_detail] ([id], [order_id], [product_id], [quantity], [price], [cost]) VALUES (18, N'OD05', N'FD04', 3, 18500.0000, 15000.0000)
INSERT [dbo].[Order_detail] ([id], [order_id], [product_id], [quantity], [price], [cost]) VALUES (19, N'OD06', N'FD03', 1, 185000.0000, 150000.0000)
INSERT [dbo].[Order_detail] ([id], [order_id], [product_id], [quantity], [price], [cost]) VALUES (20, N'OD06', N'FD05', 1, 15000.0000, 10000.0000)
INSERT [dbo].[Order_detail] ([id], [order_id], [product_id], [quantity], [price], [cost]) VALUES (21, N'OD07', N'FD03', 1, 185000.0000, 150000.0000)
INSERT [dbo].[Order_detail] ([id], [order_id], [product_id], [quantity], [price], [cost]) VALUES (22, N'OD08', N'FD02', 1, 200000.0000, 170000.0000)
INSERT [dbo].[Order_detail] ([id], [order_id], [product_id], [quantity], [price], [cost]) VALUES (23, N'OD08', N'FD04', 2, 185000.0000, 150000.0000)
INSERT [dbo].[Order_detail] ([id], [order_id], [product_id], [quantity], [price], [cost]) VALUES (24, N'OD09', N'FD02', 1, 200000.0000, 170000.0000)
SET IDENTITY_INSERT [dbo].[Order_detail] OFF
/****** Object:  Default [DF__accountTB__Autho__014935CB]    Script Date: 03/23/2022 09:23:47 ******/
ALTER TABLE [dbo].[accountTB] ADD  DEFAULT ((0)) FOR [Authority]
GO
/****** Object:  ForeignKey [FK__Classify__catego__2F10007B]    Script Date: 03/23/2022 09:23:47 ******/
ALTER TABLE [dbo].[Classify]  WITH CHECK ADD FOREIGN KEY([category_id])
REFERENCES [dbo].[Category] ([category_id])
GO
/****** Object:  ForeignKey [FK__Classify__produc__300424B4]    Script Date: 03/23/2022 09:23:47 ******/
ALTER TABLE [dbo].[Classify]  WITH CHECK ADD FOREIGN KEY([product_id])
REFERENCES [dbo].[Product] ([product_id])
GO
/****** Object:  ForeignKey [fk_acc_cust]    Script Date: 03/23/2022 09:23:47 ******/
ALTER TABLE [dbo].[CustomersTB]  WITH CHECK ADD  CONSTRAINT [fk_acc_cust] FOREIGN KEY([Account])
REFERENCES [dbo].[accountTB] ([Account])
GO
ALTER TABLE [dbo].[CustomersTB] CHECK CONSTRAINT [fk_acc_cust]
GO
/****** Object:  ForeignKey [fk_acc_emloyee]    Script Date: 03/23/2022 09:23:47 ******/
ALTER TABLE [dbo].[EmployeesTB]  WITH CHECK ADD  CONSTRAINT [fk_acc_emloyee] FOREIGN KEY([Account])
REFERENCES [dbo].[accountTB] ([Account])
GO
ALTER TABLE [dbo].[EmployeesTB] CHECK CONSTRAINT [fk_acc_emloyee]
GO
/****** Object:  ForeignKey [FK_manager]    Script Date: 03/23/2022 09:23:47 ******/
ALTER TABLE [dbo].[EmployeesTB]  WITH CHECK ADD  CONSTRAINT [FK_manager] FOREIGN KEY([ManagerID])
REFERENCES [dbo].[EmployeesTB] ([EmployeeId])
GO
ALTER TABLE [dbo].[EmployeesTB] CHECK CONSTRAINT [FK_manager]
GO
/****** Object:  ForeignKey [FK__Order__cust_id__34C8D9D1]    Script Date: 03/23/2022 09:23:47 ******/
ALTER TABLE [dbo].[Order]  WITH CHECK ADD FOREIGN KEY([cust_id])
REFERENCES [dbo].[CustomersTB] ([CustID])
GO
/****** Object:  ForeignKey [FK__Order__employee___35BCFE0A]    Script Date: 03/23/2022 09:23:47 ******/
ALTER TABLE [dbo].[Order]  WITH CHECK ADD FOREIGN KEY([employee_id])
REFERENCES [dbo].[EmployeesTB] ([EmployeeId])
GO
/****** Object:  ForeignKey [FK__Order_det__order__3B75D760]    Script Date: 03/23/2022 09:23:47 ******/
ALTER TABLE [dbo].[Order_detail]  WITH CHECK ADD FOREIGN KEY([order_id])
REFERENCES [dbo].[Order] ([order_id])
GO
/****** Object:  ForeignKey [FK__Order_det__produ__3A81B327]    Script Date: 03/23/2022 09:23:47 ******/
ALTER TABLE [dbo].[Order_detail]  WITH CHECK ADD FOREIGN KEY([product_id])
REFERENCES [dbo].[Product] ([product_id])
GO
