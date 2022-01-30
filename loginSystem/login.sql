create database login;
use login;
create table user_details(
username varchar(20),
email varchar(50),
password varchar(20)
);
Insert into user_details values("Ankush","ankush@gmail.com","password");
Insert into user_details values("root","root@gmail.com","password");
select * from user_details where username="Ankush" and password="password";