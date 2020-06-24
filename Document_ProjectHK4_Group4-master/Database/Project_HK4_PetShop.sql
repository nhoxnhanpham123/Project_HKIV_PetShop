
CREATE DATABASE Project_HK4_PetShop
GO
USE Project_HK4_PetShop
GO
CREATE TABLE admins(
      AId int primary key identity,
	  mail varchar(20),
	  [password] varchar(20)
)
GO
CREATE TABLE breeds(
	  CPId int primary key identity,
	  name varchar(20)
)
GO
CREATE TABLE animals(
	  CFId int primary key identity,
	  name varchar(20)
)
GO
CREATE TABLE foods(
	  FId varchar(10) primary key,
	  name varchar(50),
	  price int,
	  [image] varchar(250),
	  [description] varchar(200),
	  CFId int FOREIGN KEY REFERENCES animals(CFId)
)
GO
CREATE TABLE pets(
	PId varchar(10) primary key,
	pName varchar(50),
	color varchar(20),
	age varchar(50),
	gender bit,
	origin varchar(20),
	price int,
	[image] varchar(250),
	[description] varchar(250) ,
	CPId int FOREIGN KEY REFERENCES breeds(CPId),
	CFId int FOREIGN KEY REFERENCES animals(CFId)
)
GO
CREATE TABLE cateES(
	  CEId int primary key identity,
	  name varchar(50)
)
GO
CREATE TABLE accessories(
	ESId varchar(10) primary key,
	name varchar(50),
	price int,
	[description] varchar(250),
	[image] varchar(250),
	CEId int FOREIGN KEY REFERENCES cateES(CEId),
	CFId int FOREIGN KEY REFERENCES animals(CFId)
)
GO
CREATE TABLE members(
	MId int primary key identity,
	name varchar(50),
	mail varchar(50),
	[password] varchar(20),
	phone varchar(20),
	[address] varchar(50)
)
GO
CREATE TABLE feedbacks(
	  FBId int primary key identity,
	  MId int FOREIGN KEY REFERENCES members(MId),
	  content varchar(250)
)
GO
CREATE TABLE orders(
	oderId int primary key identity,
	total int,
	shipAddress varchar(50),
	oderDate varchar(50),
	paymentBy varchar(50),
	transport varchar(50),
	[status] varchar(20),
	MId int FOREIGN KEY REFERENCES members(MId)
)
go
Create table odersDetails(
	odId int primary key identity,
	productId varchar(10),
	productPrice int,
	quantity int,
	[image] varchar(50),
	oderId int FOREIGN KEY REFERENCES orders(oderId)
)
GO
CREATE TABLE pethotel(
	  PHId int identity primary key,
	  namePet varchar(50),
	  dateStart varchar(50),
	  dateEnd varchar(50),
	  price int,
	  [status] varchar(20),
	  MId int FOREIGN KEY REFERENCES members(MId)
)