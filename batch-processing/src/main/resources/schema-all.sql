DROP TABLE people IF EXISTS;

CREATE TABLE PEOPLE (
  IDPERSON BIGINT IDENTITY NOT NULL PRIMARY KEY,
  FIRSTNAME VARCHAR(20),
  LASTNAME VARCHAR(20)
);