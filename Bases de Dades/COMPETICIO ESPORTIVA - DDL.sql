CREATE DATABASE COMPETICIO_ESPORTIVA;
USE COMPETICIO_ESPORTIVA;

CREATE TABLE PLAYERS (
    id INT NOT NULL AUTO_INCREMENT primary key ,
    name VARCHAR(50) NOT NULL,
    nickname VARCHAR(50) NOT NULL,
    age INT NOT NULL,
    date_of_birth DATE NOT NULL,
    wins INT NOT NULL,
    editions_played INT NOT NULL,
    role VARCHAR(50) NOT NULL
);

CREATE TABLE TEAMS (
    id INT NOT NULL AUTO_INCREMENT primary key ,
    name VARCHAR(50) NOT NULL,
    coach VARCHAR(50) NOT NULL,
    editions_played VARCHAR(50) NOT NULL,
    place VARCHAR(50) NOT NULL,
    players_id INT NOT NULL,
    FOREIGN KEY (players_id) REFERENCES PLAYERS(id)
);

CREATE TABLE ESDEVENIMETNS (
    id INT NOT NULL AUTO_INCREMENT primary key ,
    name VARCHAR(50) NOT NULL,
    country VARCHAR(50) NOT NULL,
    city VARCHAR(50) NOT NULL,
    date DATE NOT NULL,
    teams_id INT NOT NULL,
    FOREIGN KEY (teams_id) REFERENCES TEAMS(id)
);

CREATE TABLE EDITION (
    id INT NOT NULL AUTO_INCREMENT primary key ,
    name VARCHAR(50) NOT NULL,
    year INT NOT NULL,
    date DATE NOT NULL,
    teams_id INT NOT NULL,
    country VARCHAR(50) NOT NULL,
    FOREIGN KEY (teams_id) REFERENCES TEAMS(id)
);

CREATE TABLE EVENTS (
    id INT NOT NULL AUTO_INCREMENT primary key ,
    name VARCHAR(50) NOT NULL,
    country VARCHAR(50) NOT NULL,
    city VARCHAR(50) NOT NULL,
    date DATE NOT NULL,
    campeon VARCHAR(20) not null,
    edition_id INT NOT NULL,
    FOREIGN KEY (edition_id) REFERENCES EDITION(id)
);

CREATE TABLE ACTUAL_EVENT (
    id INT NOT NULL AUTO_INCREMENT primary key ,
    results VARCHAR(50) NOT NULL,
    phase VARCHAR(50) NOT NULL,
    event_id INT NOT NULL,
    FOREIGN KEY (event_id) REFERENCES EVENTS(id)
);