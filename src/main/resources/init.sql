CREATE TABLE IF NOT EXISTS users (
    id INT PRIMARY KEY AUTO_INCREMENT NOT NULL ,
    email varchar(250) not null ,
    password varchar(250) not null
);

CREATE TABLE IF NOT EXISTS role (
    id INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
    role varchar(250) not null
);