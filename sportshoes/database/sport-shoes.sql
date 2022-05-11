create table products (code int NOT NULL auto_increment,
name char(50),company char(30),price double,
category char(30),image varchar(100),primary key(code));

create table users(username varchar(30),password varchar(30),
email varchar(40),mobile varchar(10),age int,gender char,
primary key(username,password));

create table orders(orderid int auto_increment,pcode int,
username varchar(30),email varchar(40),mobile varchar(10),
price double,location varchar(40),date date,category char(10),
primary key(orderid));

create table cart (cartid int auto_increment,code int ,
name char(50),company char(30),price double,category char(30),
image varchar(40),primary key(cartid));


insert into products (code,name,company,price,category,image) values
(101,"Titanium Lace-Up Sports Shoes","Campus",1299,"men","/resources/images/men/1.png"),
(102,"Syrus Panelled Lace-UP Running Shoes","Campus",1199,"men","/resources/images/men/2.png"),
(103,"Vacum Lace-Up Running Shoes","Campus",1199,"men","/resources/images/men/3.png"),
(104,"Europa Lace-UP Running Shoes","Campus",1104,"men","/resources/images/men/4.png"),
(105,"Wynk Textured Low-Top Lace-UP Running Shoes","Campus",1039,"men","/resources/images/men/5.png"),
(106,"Court vision Lace-Up sneakers","Nike",4995,"men","/resources/images/men/6.png"),
(107,"Textured Lace-Up sneakers","Lebis",1679,"men","/resources/images/men/7.png"),
(108,"Barely Lace-Up Running Shoes","Campus",1299,"men","/resources/images/men/8.png");

insert into products (code,name,company,price,category,image) values
(111,"Fire Run Lace-Up Running Shoes","Puma",1829,"women","/resources/images/women/1.png"),
(112,"Lace-Up Running Shoes","Campus",1385,"women","/resources/images/women/2.png"),
(113,"Alice Low-Top Lace-Up Running Shoes","Campus",935,"women","/resources/images/women/3.png"),
(114,"Go Run Textured Lace-up Sports shoes","Skechers",3359,"women","/resources/images/women/4.png"),
(115,"Alice Lace-Up Running Shoes","Campus",1000,"women","/resources/images/women/5.png"),
(116,"Low-Top Lace-Up Sports Shoes","Red Tape",1568,"women","/resources/images/women/6.png"),
(117,"Colorblock Lace-Up SportShoes","Performax",2499,"women","/resources/images/women/7.png"),
(118,"Solar Fuse Lace-Up Sport Shoes","Skechers",4379,"women","/resources/images/women/8.png"),
(119,"Claire Lace-Up Running Shoes","Campus",857,"women","/resources/images/women/9.png"),
(120,"Logo Print Lace-Up Running Shoes","Performax",1399,"women","/resources/images/women/10.png");


insert into users (username,password,email,mobile,age,gender) values
("SaiMohan","saimohan","saimohan@gmail.com","8236928360",27,"M"),
("Gayatri","gayatri","gai@gmail.com","9354670186","26","F"),
("VeenaNaidu","veenanaidu","nveena@gmail.com","9937462822",25,"F"),
("Praveen","praveen","praveen@gmail.com","8567098123",24,"M"),
("Sundeep","sundeep","sundeep@gmail.com","924890112",22,"M"),
("Varsha","varsha","nvarsha@gmail.com","9918815460",16,"F"),
("Purvansh","purvansh","purvansh@gmail.com","6278490134",16,"M"),
("Anil","anil","anil@gmail.com","8234987603",29,"M"),
("Vasu","vasu","vasu@gmail.com","835670092",29,"M"),
("Praneetha","admin","adminp@gmail.com","6453998018",39,"F");
