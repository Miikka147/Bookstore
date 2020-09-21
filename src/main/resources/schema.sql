DROP TABLE category;
DROP TABLE book;

CREATE TABLE category(
id BIGINT NOT NULL AUTO_INCREMENT PRIMARY KEY,
name VARCHAR(50)
) ;

CREATE TABLE book(
id BIGINT NOT NULL AUTO_INCREMENT PRIMARY KEY,
title VARCHAR(50),
author VARCHAR(50),
isbn VARCHAR(50),
year INT,
price BIGINT,
categoryid BIGINT
) ;
    
INSERT INTO category (name) VALUES ('Horror'), ('FANTASY');

INSERT INTO book (title, author, isbn, year, price, categoryid)
VALUES ('Harry Potter', 'J.K Rowling','8181818', 1998,13,1),
('Harry Potter2', 'J.K Rowling','8232818', 1999,23,2);

SELECT * FROM book;
SELECT * FROM category;