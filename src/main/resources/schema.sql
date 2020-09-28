DROP TABLE book; 
DROP TABLE category; 

CREATE TABLE category
(id BIGINT NOT NULL AUTO_INCREMENT PRIMARY KEY
,name VARCHAR(50) NOT NULL);

CREATE TABLE book (
id BIGINT NOT NULL AUTO_INCREMENT PRIMARY KEY,
title VARCHAR(50) NOT NULL,
author VARCHAR(50) NOT NULL,
year INT,
isbn VARCHAR(25),
price BIGINT,
categoryid BIGINT);

INSERT INTO category (name) VALUES ('Romaani'), ('Historiallinen romaani'), ('Kaunokirjallisuus');

INSERT INTO book (title, author, year, price, categoryid) 
VALUES ('Kekkosen salaiset päiväkirjat', 'Timo J. Tuikka', 2020, 21.90, 2), 
('Kissani Jugoslavia','Pajtim Statovci', 2015, 7.70, 3);

SELECT * FROM book;
SELECT * FROM category;