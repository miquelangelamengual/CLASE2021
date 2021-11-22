## Create databse named "Residus Toxics"
CREATE DATABASE IF NOT EXISTS residus_toxics;
use residus_toxics;

## Create table named "residus"
CREATE TABLE IF NOT EXISTS residus (
  id INT NOT NULL AUTO_INCREMENT,
  name VARCHAR(255) NOT NULL,
  description TEXT NOT NULL,
  PRIMARY KEY (id)
);

## Create table named "empresa productora"
CREATE TABLE IF NOT EXISTS empresa_productora (
  id INT NOT NULL AUTO_INCREMENT,
  name VARCHAR(255) NOT NULL,
  description TEXT NOT NULL,
  PRIMARY KEY (id)
);
## Create table named "empresa transportista"
CREATE TABLE IF NOT EXISTS empresa_transportista (
  id INT NOT NULL AUTO_INCREMENT,
  name VARCHAR(255) NOT NULL,
  description TEXT NOT NULL,
  km INT NOT NULL,
  mitja_transport VARCHAR(255) NOT NULL,
  price INT NOT NULL,
  PRIMARY KEY (id)
);

## Create table named "empresa destino"
CREATE TABLE IF NOT EXISTS empresa_destino (
  id INT NOT NULL AUTO_INCREMENT,
  name VARCHAR(255) NOT NULL,
  date_arribada DATE NOT NULL,
  description TEXT NOT NULL,
  PRIMARY KEY (id)
);

## Create table named "trasllat"
CREATE TABLE IF NOT EXISTS trasllat (
  id INT NOT NULL AUTO_INCREMENT,
  residus_id INT NOT NULL,
  empresa_productora_id INT NOT NULL,
  empresa_transportista_id INT NOT NULL,
  empresa_destino_id INT NOT NULL,
  date_trasllat DATE NOT NULL,
  price INT NOT NULL,
  PRIMARY KEY (id)
);


