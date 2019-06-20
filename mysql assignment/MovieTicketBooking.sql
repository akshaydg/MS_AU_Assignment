show databases;
create database movieTicket;
drop database movieTicket;
create database movieticket;
use movieTicket;
show tables;
create table shows (
showid int primary key ,
time1 int not null
);

create table users(
userid int primary key auto_increment,
username varchar(50));

create table movies(
movieid int primary key auto_increment,
moviename varchar(50)
);

create table theatre(
theatreid int primary key auto_increment,
movieid int,
showid int,
foreign key (movieid) references movies(movieid),
foreign key (showid) references shows(showid)) ;


create table seats(
seatid int primary key auto_increment,
theatreid int,
foreign key(theatreid) references theatre(theatreid));

create table booking(
bookingid int primary key auto_increment,
userid int ,
movieid int ,
theatreid int,
showid int,
foreign key(userid) references users(userid),
foreign key(movieid) references movies(movieid),
foreign key(theatreid) references theatre(theatreid),
foreign key(showid) references shows(showid),
dates date);

-- drop table shows;
-- drop table users;
-- drop table theatre;
-- drop table movies;
-- drop table seats;
-- drop table booking;

insert into shows values(1,9),(2,12),(3,3),(4,6),(5,9),(6,12);
insert into users(username) values("Akshay"),("Rishav"),("Kanchan"),("Shipra"),("Mia"),("Shikhar");

insert into movies(moviename) values("deewar"),("race"),("golmaal"),("baadshah");
select * from users;
select * from shows;
select * from movies;
insert into seats(theatreid) values(2),(3),(5),(1),(3),(4),(5);


insert into theatre(theatreid,movieid,showid) values(1,4,3),(2,3,6),(3,2,3),(4,1,5),(5,3,5),(6,4,5);
desc seats;
select * from theatre;

desc booking;
insert into booking(userid,movieid,theatreid,showid,dates) values(3,3,4,1,'1997-03-07'),(2,4,5,4,'1957-03-30'),(5,3,7,2,'1957-11-20'),(2,3,7,1,'2000-03-30'),(3,4,7,5,'2012-05-23');

delimiter //
create procedure doBooking(in userid1 int, in movieid1 int, in theatreid1 int, in showid1 int, in date1 date)
begin
insert into booking(userid,movieid,theatreid,showid,dates) values(userid1,movieid1,theatreid1,showid1,date1);
end //
delimiter ;

call doBooking(6,4,10,6,'2018-09-11');
call doBooking(5,3,12,5,'2018-05-13');
call doBooking(4,4,11,6,'2002-07-27');

delimiter //
create procedure getBookingDetails()
begin
select users.username,movies.moviename,dates,shows.time1 from (((booking inner join shows on booking.showid=shows.showid) inner join movies on booking.movieid=movies.movieid) inner join users on booking.userid=users.userid) where booking.userid<5;
end //
delimiter ;

call getBookingDetails();

delimiter //
create procedure getDetailsForUser(in userid1 int)
begin
select users.username,movies.moviename,dates,shows.time1 from (((booking inner join shows on booking.showid=shows.showid) inner join movies on booking.movieid=movies.movieid) inner join users on booking.userid=users.userid) where booking.userid<userid1;
end //
delimiter ;

call getDetailsForUser(2);
 






