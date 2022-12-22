CREATE USER IF NOT EXISTS 'prospring5'@'localhost' IDENTIFIED BY 'prospring5';

DROP DATABASE IF EXISTS BOOK_MANAGEMENT;
CREATE DATABASE BOOK_MANAGEMENT;
USE BOOK_MANAGEMENT;
GRANT ALL PRIVILEGES ON BOOK_MANAGEMENT.* TO 'prospring5'@'localhost';
FLUSH PRIVILEGES;

/*in case of java.sql.SQLException: The server timezone value 'UTC' is unrecognized or represents more than one timezone. */
SET GLOBAL time_zone = '+5:00';