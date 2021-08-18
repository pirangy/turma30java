CREATE DATABASE db_ecommerce;
USE db_ecommerce;

CREATE TABLE tb_produtos (
    id_prod bigint(5) auto_increment,
    produto varchar(20) not null,
    valor decimal (5, 2) not null,
    marca varchar (20) not null,
	estoque bigint (10) not null,
	
    primary key (id_prod)
);

INSERT INTO tb_produtos (produto, valor, marca, estoque) VALUES ("Camiseta", 50.00, "Nike", 10);
INSERT INTO tb_produtos (produto, valor, marca, estoque) VALUES ("Calça", 80.00, "Nike", 10);
INSERT INTO tb_produtos (produto, valor, marca, estoque) VALUES ("Camiseta", 30.00, "Adidas", 10);
INSERT INTO tb_produtos (produto, valor, marca, estoque) VALUES ("Calça", 40.00, "Adidas", 10);
INSERT INTO tb_produtos (produto, valor, marca, estoque) VALUES ("Tênis", 250.00, "Nike", 10);
INSERT INTO tb_produtos (produto, valor, marca, estoque) VALUES ("Tênis", 150.00, "Adidas", 10);
INSERT INTO tb_produtos (produto, valor, marca, estoque) VALUES ("Short", 50.00, "Nike", 10);
INSERT INTO tb_produtos (produto, valor, marca, estoque) VALUES ("Short", 20.00, "Adidas", 10);

SELECT * FROM tb_produtos WHERE valor > 500; 
SELECT * FROM tb_produtos WHERE valor < 500;

UPDATE tb_produtos SET valor = 550
	WHERE id_prod  = 5;

