## Create database named "Hotel" to work on
CREATE DATABASE IF NOT EXISTS Hotel;
USE Hotel;

## Create table named "Room" to work on
CREATE TABLE IF NOT EXISTS Room (
  room_id INT NOT NULL AUTO_INCREMENT,
  room_number INT NOT NULL,
  room_type VARCHAR(255) NOT NULL,
  room_price INT NOT NULL,
  room_status VARCHAR(255) NOT NULL,
  PRIMARY KEY (room_id)
);

## Create table named "Customer" to work on
CREATE TABLE IF NOT EXISTS Customer (
  customer_id INT NOT NULL AUTO_INCREMENT,
  customer_name VARCHAR(255) NOT NULL,
  customer_email VARCHAR(255) NOT NULL,
  customer_phone INT NOT NULL,
  customer_address VARCHAR(255) NOT NULL,
  PRIMARY KEY (customer_id)
);

## Create table named "Booking" to work on
CREATE TABLE IF NOT EXISTS Booking (
  booking_id INT NOT NULL AUTO_INCREMENT,
  customer_id INT NOT NULL,
  room_id INT NOT NULL,
  booking_date DATE NOT NULL,
  booking_checkin DATE NOT NULL,
  booking_checkout DATE NOT NULL,
  booking_status VARCHAR(255) NOT NULL,
  PRIMARY KEY (booking_id),
  FOREIGN KEY (customer_id) REFERENCES Customer(customer_id),
  FOREIGN KEY (room_id) REFERENCES Room(room_id)
);

## Create table named "Billing" to work on
CREATE TABLE IF NOT EXISTS Billing (
  billing_id INT NOT NULL AUTO_INCREMENT,
  booking_id INT NOT NULL,
  billing_date DATE NOT NULL,
  billing_total INT NOT NULL,
  PRIMARY KEY (billing_id),
  FOREIGN KEY (booking_id) REFERENCES Booking(booking_id)
);