show databases;
create database MS_AU19;
show databases;
use ms_au19;

show tables;

create table passenger(
passenger_id int primary key,
passenger_name varchar(20) NOT NULL,
mobile_no int unique not null,
email_id varchar(20),
city varchar(20));
show tables;
desc passenger;

insert into passenger values(1,"Akshay",123,"abc","akola");
insert into passenger values(2,"rishabh",456,"efg","ncr"),
(3,"shikhar", 231,"gjn","noida"),
(4,"aman",876,"hbv","up"),
(5,"vedant", 654,"jnm","nagpur"),
(6,"manoj",999,"kkk","shimla"),
(7,"kirti",666,"287","bihar");
insert into passenger values(8,"vimal",555,"uyt","pok");

select *from passenger;
insert into passenger values(9,"raj",000,"uyt","");
insert into passenger values(10,"pk",089,"","");

select passenger_id,passenger_name from Passenger where passenger_id>4;
insert into passenger values(11,"sudshanshu",777,"nnen","akola");
insert into passenger values(12,"dewashish",67890,"asd","akola");



select passenger_id, passenger_name from passenger where passenger_name like 'a%';

select passenger_id, passenger_name from passenger order by passenger_name asc;
create view view1 as select passenger_id, passenger_name, city from passenger where city="akola";

select* from view1;

insert into passenger values(13,"aakash",12321,"","pune");
insert into passenger values(14,"kaustubh",5656,"","akola");

select* from view1;

create table employee(
employee_id int primary key,
employee_name varchar(20) not null,
department_id int not null);

desc employee;

create table department(
department_id int auto_increment primary key,
department_name varchar(20) not null,
department_head varchar(20));
desc department;

insert into department(department_name,department_head) values('IT','Akshay'),('CE','Paras'),('ECE','Abhishek'),('ME','pranav');

select * from department;

insert into employee values(1,'alex',1),(2,'anand',3),(3,'alok',2),(4,'ashish',1),(5,'raj',2),(6,'pankaj',4),(7,'raj',3);

select * from employee;

alter table employee modify department_id int ;

desc employee;

insert into employee(employee_id,employee_name) values(8,'prasad');

drop table employee;

create table employee(
employee_id int primary key,
employee_name varchar(20) not null,
department_id int);



create table employee_audit(
emp_id int primary key,
emp_name varchar(50),
action varchar(50),
changedat date );

desc employee_audit;


drop trigger before_employee_update;

delimiter $$
create trigger before_employee_update
before update on employee
for each row
begin
insert into employee_audit(emp_id,emp_name,action,changedat)
values(old.employee_id,old.employee_name,'Update',now());
end $$
delimiter ;

update employee
set employee_name='loki' where employee_id=2;

select * from employee;

update employee
set employee_name='thor' where employee_id=4;

truncate table employee_audit;


select * from employee_audit;

delimiter $$
create trigger after_employee_update
after update on employee
for each row
begin
insert into employee_audit(emp_id,emp_name,action,changedat)
values(new.employee_id,new.employee_name,'AfterUpdate',now());
end $$
delimiter ;

select * from employee;

update employee
set employee_name='asmita' where employee_id=1;

update employee
set employee_name='ashish' where employee_id=5;



drop table employee_audit;
show triggers;





alter table employee_audit 
MODIFY emp_id int(20) NOT NULL;

create table employee_audit(
emp_id int(20),
emp_name varchar(50),
action varchar(50),
changedat date );

select * from employee;
select * from employee_audit;

desc employee;
desc employee_audit;

update employee
set department_id=4 where employee_id=1;

update employee
set department_id=3 where employee_id=2;
update employee
set department_id=2 where employee_id=1;
update employee
set employee_name="anil" where employee_id=2;
update employee
set employee_name="sunil" where employee_id=7;

delimiter $$
create trigger before_employee_insert
before insert on employee
for each row
begin
insert into employee_audit(emp_id,emp_name,action,changedat)
values(new.employee_id,new.employee_name,'BeforeInsert',now());
end $$
delimiter ;

delimiter $$
create trigger after_employee_insert
after insert on employee
for each row
begin
insert into employee_audit(emp_id,emp_name,action,changedat)
values(new.employee_id,new.employee_name,'AfterInsert',now());
end $$
delimiter ;

delimiter $$
create trigger after_employee_delete
after delete on employee
for each row
begin
insert into employee_audit(emp_id,emp_name,action,changedat)
values(old.employee_id,old.employee_name,'AfterDelete',now());
end $$
delimiter ;

delimiter $$
create trigger before_employee_delete
before delete on employee
for each row
begin
insert into employee_audit(emp_id,emp_name,action,changedat)
values(old.employee_id,old.employee_name,'BeforeDelete',now());
end $$
delimiter ;

drop trigger before_employee_delete;
drop trigger after_employee_delete;
drop trigger before_employee_insert;
drop trigger after_employee_insert;


delete from employee where employee_id=1;
delete from employee where employee_id=5;
desc employee;
insert into employee values(9,"gambhir",2);





