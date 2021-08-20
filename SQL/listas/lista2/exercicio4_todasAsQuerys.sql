CREATE DATABASE db_cidade_das_frutas; -- cria o banco de dados
USE db_cidade_das_frutas; -- utiliza o banco de dados criado

-- criação de tabela Categoria
CREATE TABLE tb_categoria(
	
    id_categoria int(5) not null,
    tipo varchar (50) not null,
    origem varchar (50) not null,
    primary key (id_categoria))engine=InnoDB;

-- criação de tabela Produto
CREATE TABLE tb_produto(

	id_produto int(5) not null,
    fruta varchar (50) not null,
    valor decimal (3,2) not null,
    id_categoria int not null,
    primary key (id_produto),
    foreign key (id_categoria) references tb_categoria(id_categoria))engine=InnoDB;

-- popular tabela Categoria
INSERT INTO tb_categoria VALUES (1, "Ácida", "SP");
INSERT INTO tb_categoria VALUES (2,"Semiácida","SP");
INSERT INTO tb_categoria VALUES (3,"Doce","SP");
INSERT INTO tb_categoria VALUES (4,"Hiper-hídrica","SP");
INSERT INTO tb_categoria VALUES (5,"Oleaginosa","SP");

-- popular tabela Produto
INSERT INTO tb_produto VALUES (44, "Abacate", 8.00,5);
INSERT INTO tb_produto VALUES (28, "Melão",3.99,4);
INSERT INTO tb_produto VALUES (36,"Banana",2.99,3);
INSERT INTO tb_produto VALUES (75, "Manga",4.50,2);
INSERT INTO tb_produto VALUES (11, "Abacaxi",6.99,1);
INSERT INTO tb_produto VALUES (13,"Morango", 5.99,1);
INSERT INTO tb_produto VALUES (93,"Mamão", 4.50, 3);
INSERT INTO tb_produto VALUES (62,"Amêndoa",7.99,5);

-- comandos de seleção
SELECT * FROM tb_produto WHERE valor>50;
SELECT * FROM tb_produto WHERE valor>=3 AND valor<=60;
SELECT * FROM tb_produto WHERE fruta LIKE "%C%";

-- comandos inner join
SELECT * FROM tb_categoria INNER JOIN tb_produto ON tb_categoria.id_categoria = tb_produto.id_categoria;
SELECT * FROM tb_categoria INNER JOIN tb_produto ON tb_categoria.id_categoria = tb_produto.id_categoria AND tb_categoria.tipo="Doce";







