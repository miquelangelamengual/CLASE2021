CREATE DATABASE LLIBRES;
USE LLIBRES;

CREATE TABLE LLIBRERIA (
    id int not null auto_increment primary key ,
    profesor varchar(50) not null unique,
    asignatura varchar(50) not null,
    habilitats varchar(50) not null,
    aula varchar(50) not null,
    curs int not null,
    llibres int not null unique,
    editorial varchar(50) not null unique,
    data_prestec date not null unique,
    CHECK (llibres > 1)
);