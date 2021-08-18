CREATE DATABASE db_ecommerce; -- criar banco de dados "db_ecommerce"
USE db_ecommerce; -- realizar operações no banco de dados "db_ecommerce"

-- criar tabela "tb_produtos"
CREATE TABLE tb_produtos (
    id_prod bigint(5) auto_increment, -- atributo "id_func" com auto_increment (preenchimento automático de identificação: 1, 2, 3...)
    produto varchar(20) not null, -- atributo "produto" com not null (não aceita preenchimento vazio)
    valor decimal (5, 2) not null, -- atributo "valor" com not null (não aceita preenchimento vazio)
    marca varchar (20) not null, -- atributo "marca" com not null (não aceita preenchimento vazio)
	estoque bigint (10) not null, -- atributo "estoque" como bigint
	
    primary key (id_prod) -- atributo "id_prod" estabelecido como chave primária da tabela "tb_produtos"
);

-- comandos para popular tabela com até 8 dados (sem a necessidade de setar o atributo "id_prod", pois este foi definido com auto_increment)
INSERT INTO tb_produtos (produto, valor, marca, estoque) VALUES ("Camiseta", 50.00, "Nike", 10); 
INSERT INTO tb_produtos (produto, valor, marca, estoque) VALUES ("Calça", 80.00, "Nike", 10);
INSERT INTO tb_produtos (produto, valor, marca, estoque) VALUES ("Camiseta", 30.00, "Adidas", 10);
INSERT INTO tb_produtos (produto, valor, marca, estoque) VALUES ("Calça", 40.00, "Adidas", 10);
INSERT INTO tb_produtos (produto, valor, marca, estoque) VALUES ("Tênis", 250.00, "Nike", 10);
INSERT INTO tb_produtos (produto, valor, marca, estoque) VALUES ("Tênis", 150.00, "Adidas", 10);
INSERT INTO tb_produtos (produto, valor, marca, estoque) VALUES ("Short", 50.00, "Nike", 10);
INSERT INTO tb_produtos (produto, valor, marca, estoque) VALUES ("Short", 20.00, "Adidas", 10);

-- comandos para seleção
SELECT * FROM tb_produtos WHERE valor > 500; 
SELECT * FROM tb_produtos WHERE valor < 500;

-- comandos de atualização
UPDATE tb_produtos SET valor = 550
	WHERE id_prod  = 5; -- atualiza o valor de produto de "id_prod = 5" ("Tênis", "Nike")

