CREATE DATABASE abc;
USE abc;

CREATE TABLE IF NOT EXISTS PERSONA(ID char(5) primary key , NAME varchar(50), DATE date);
CREATE TABLE IF NOT EXISTS OFICI(ID char(5) primary key , NAME varchar(25), DESCRIPTION varchar(200));
CREATE TABLE IF NOT EXISTS HOBBY(ID char(5) primary key, NAME char(20));
CREATE TABLE IF NOT EXISTS Ordinador(ID char(5) primary key, NAME char (20), O_S char(50));
CREATE TABLE IF NOT EXISTS Direccio(ID char(5) primary key, MUNICIPI varchar(30));
CREATE TABLE IF NOT EXISTS Professor(ID char(5) primary key, NAME varchar(50), EMAIL varchar(9));
CREATE TABLE IF NOT EXISTS Assignatura(ID char(5) primary key, NAME varchar(50), ID_PROFESSOR char(5))