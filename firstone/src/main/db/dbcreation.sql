
Create user IF NOT EXISTS 'firstone@localhost' identified by 'firstone';

grant all privileges on *.* to firstone@'%';

CREATE DATABASE IF NOT EXISTS firstone default charset utf8 COLLATE utf8_general_ci;

use firstone;

create table user
(
  id int UNSIGNED AUTO_INCREMENT,
  name varchar(20) not null,
  phone varchar(20) not null,
  passwd varchar(20) not null,
  PRIMARY KEY ( `id` )
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

create table product
(
  id INT UNSIGNED AUTO_INCREMENT,
  price INT NOT null,
  duration INT NOT null,
  PRIMARY KEY ( `id` )
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

create table purchase
(
  id int UNSIGNED AUTO_INCREMENT,
  create_date DATE NOT NULL ,
  product_id INT NOT NULL,
  user_id INT NOT NULL,
  PRIMARY KEY ( `id` )
)ENGINE=InnoDB DEFAULT CHARSET=utf8;