drop database if exists userDB;

create database userDB default CHARSET utf8;

use userDB;

create table userinfo(
	uid int not null primary key auto_increment,
	uuser varchar(20) not null,
	upassword varchar(20) not null,
	uname varchar(20) not null
)default charset utf8;

insert into  userinfo values(null,'helil','123456','贺龙');
insert into  userinfo values(null,'helil2','1234566','贺龙2');

select * from userinfo;