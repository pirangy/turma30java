CREATE DATABASE voo123;
USE voo123;

CREATE TABLE aviao(
    id_aviao int (11) not null,
    modelo varchar (50) not null,
	primary key (id_aviao) ) engine=InnoDB;


DESC aviao; -- visualização

SHOW tables;

CREATE TABLE tripulantes(
    id_trip int (11) not null,
    nome varchar (50) not null,
    genero char (1)  not null check (genero in ('F', 'M', 'N')),
	id_aviao int (11) not null, 
    primary key (id_trip) ) engine=InnoDB;
    
DESC tripulantes;
SHOW tables;
    
ALTER TABLE tripulantes
ADD foreign key (id_aviao) references aviao(id_aviao);

    
INSERT INTO aviao VALUES (1, 'A-380'), (2, 'Boeing'),(3, 'Excelcsior');
DESC aviao;
SELECT * FROM aviao;

INSERT INTO tripulantes VALUES (45, 'Ariel', 'N', 3),(82, 'Juliana', 'F', 3),(55, 'Bruna', 'F', 2),(44, 'Mateus', 'M', 2),(84, 'Kiara', 'N', 1),(78, 'Pedro', 'M', 1),(97, 'Kali', 'F', 1);
DESC tripulantes;
SELECT * FROM tripulantes;

SELECT * FROM tripulantes WHERE genero = 'N';
SET SQL_SAFE_UPDATES = 0;
UPDATE tripulantes SET genero = 'N' WHERE genero = 'F';

