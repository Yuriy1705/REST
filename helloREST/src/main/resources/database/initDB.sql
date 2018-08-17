create table if not exists customers(
id int auto_increment primary key,
first_name varchar (50) not null,
last_name varchar (100) not null,
address varchar (500) not null,
budget decimal not null
);