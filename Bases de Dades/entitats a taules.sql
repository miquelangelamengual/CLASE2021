## First of all we have to create a database to work on
CREATE DATABASE MYOWNEXERCISES;
## Using the command use MYOWNEXERCISES; we can now work on the database we have previously created
USE MYOWNEXERCISES;

## Now we create a table to store CARS into it
CREATE TABLE CAR (
    id int auto_increment not null,
    model varchar(255) not null,
    year int not null,
    PRIMARY KEY (id)
);

## We make the table to store wheels from CARS thats why we made the reference
CREATE TABLE WHEEL (
    id int auto_increment not null,
    diameter int not null,
    car_id int not null,
    PRIMARY KEY (id),
    FOREIGN KEY (car_id) REFERENCES CAR(id)
);

## Now we create another table for TVs
CREATE TABLE TV (
    id int auto_increment not null,
    model varchar(255) not null,
    year int not null,
    PRIMARY KEY (id)
);

## Now we have to make a table to make a reference from TV and a controller
CREATE TABLE CONTROLLER (
    id int auto_increment not null,
    name varchar(25) not null,
    tv_id int not null,
    PRIMARY KEY (id),
    FOREIGN KEY (tv_id) REFERENCES TV(id)
);


## Now we have to create a table to store data about freezers
CREATE TABLE FREEZER (
    id int auto_increment not null,
    model varchar(255) not null,
    year int not null,
    PRIMARY KEY (id)
);

## Now we have to make a table to make a reference from FREEZER and a kitchen
CREATE TABLE KITCHEN (
    id int auto_increment not null,
    name varchar(25) not null,
    freezer_id int not null,
    PRIMARY KEY (id),
    FOREIGN KEY (freezer_id) REFERENCES FREEZER(id)
);

## Now we have to create a table to make reference from KITCHEN and a FLOOR ("pis")
CREATE TABLE FLOOR (
    id int auto_increment not null,
    name varchar(25) not null,
    kitchen_id int not null,
    PRIMARY KEY (id),
    FOREIGN KEY (kitchen_id) REFERENCES KITCHEN(id)
);

## Now we have to create a table named "QUARTERADA"
CREATE TABLE QUARTERADA (
    id int auto_increment not null,
    name varchar(255) not null,
    dimensions int not null,
    PRIMARY KEY (id)
);

## Table to make reference from Quarterada and Garrovers
CREATE TABLE GARROVER (
    id int auto_increment not null,
    name varchar(255) not null,
    quarterada_id int not null,
    PRIMARY KEY (id),
    FOREIGN KEY (quarterada_id) REFERENCES QUARTERADA(id)
);

## Here, we have to make a table named "Sac de Garroves" and make a refrence from "GARROVER"
CREATE TABLE SAC_GARROVES (
    id int auto_increment not null,
    name varchar(255) not null,
    garrover_id int not null,
    PRIMARY KEY (id),
    FOREIGN KEY (garrover_id) REFERENCES GARROVER(id)
);

## Now we make a table named "M-ER" as a signifier for "Model Entitat Relacio"
CREATE TABLE M_ER (
    id int auto_increment not null,
    name varchar(255) not null,
    PRIMARY KEY (id)
);

## Now we have to make a table named "BBDD" referencing the M-ER table
CREATE TABLE BBDD (
    id int auto_increment not null,
    name varchar(255) not null,
    m_er_id int not null,
    PRIMARY KEY (id),
    FOREIGN KEY (m_er_id) REFERENCES M_ER(id)
);

## Now we have to make a table named "DAW" referencing the BBDD table
CREATE TABLE DAW (
    id int auto_increment not null,
    name varchar(255) not null,
    bbdd_id int not null,
    PRIMARY KEY (id),
    FOREIGN KEY (bbdd_id) REFERENCES BBDD(id)
);