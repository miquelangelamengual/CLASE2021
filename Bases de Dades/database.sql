CREATE DATABASE PERSONES;
USE PERSONES;

CREATE TABLE PEOPLE (
    ID int(3) auto_increment primary key ,
    NAME varchar(10) not null,
    SURNAME varchar(20) not null ,
    HOOBIES varchar(30) null ,
    JOB VARCHAR(10) null
);

INSERT INTO PEOPLE (NAME, SURNAME, HOOBIES, JOB) VALUES ('M. Angel', 'Amengual Sastre', 'Jugar videojocs', null);

SELECT * FROM PEOPLE;