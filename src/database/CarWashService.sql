CREATE DATABASE  IF NOT EXISTS carwashservice;
USE carwashservice;

DROP TABLE IF EXISTS insurance;
CREATE TABLE insurance (
  id int primary key NOT NULL,
  cost varchar(45) NOT NULL,
  exp_date varchar(45) NOT NULL
);

DROP TABLE IF EXISTS tariffs;
CREATE TABLE tariffs (
  id int primary key NOT NULL,
  description varchar(45) NOT NULL
);

DROP TABLE IF EXISTS users;
CREATE TABLE users (
  id int primary key NOT NULL,
  name varchar(45) NOT NULL,
  tariff varchar(45) DEFAULT NULL,
  foreign key(tariff) references tariffs(id) on delete cascade
);

DROP TABLE IF EXISTS cars;
CREATE TABLE cars (
  id int primary key NOT NULL,
  model varchar(45) NOT NULL,
  user int(11) DEFAULT NULL,
  insurance int(11) DEFAULT NULL,
  foreign key(user) references users(id) on delete cascade,
  foreign key(insurance) references insurance(id) on delete cascade
);