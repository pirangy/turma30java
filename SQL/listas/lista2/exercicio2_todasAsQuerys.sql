CREATE DATABASE db_pizzaria_legal; -- cria o banco de dados
USE db_pizzaria_legal; -- utiliza o banco de dados que foi criado

-- criação de tabela Categoria
CREATE TABLE tb_categoria(
	
    categoria_id int (5) not null,
    tipo varchar (50) not null,
    forma varchar (50) not null,
    
    primary key (categoria_id)) engine=InnoDB;

-- criação de tabela Pizza
CREATE TABLE tb_pizza (

	pizza_id int(5) not null,
    sabor varchar (50) not null,
	valor int (50) not null,
    borda varchar (50) not null,
    categoria_id int (5) not null,

primary key (pizza_id),
foreign key (categoria_id) references tb_categoria (categoria_id)) engine=InnoDB;

-- popular tabela Categoria
INSERT INTO tb_categoria VALUES (1,"Salgada", "Normal");
INSERT INTO tb_categoria VALUES (2,"Salgada", "Quadrada");
INSERT INTO tb_categoria VALUES (3,"Doce", "Normal");
INSERT INTO tb_categoria VALUES (4,"Doce", "Quadrada");

-- popular tabela Pizza
INSERT INTO tb_pizza VALUES (1, "Portuguesa", 29, "Simples",1);
INSERT INTO tb_pizza VALUES (2, "Portuguesa", 45, "Catupiry",2);
INSERT INTO tb_pizza VALUES (3, "Calabresa", 29, "Simples",1);
INSERT INTO tb_pizza VALUES (4, "Calabresa", 45, "Catupiry",2);
INSERT INTO tb_pizza VALUES (5, "Banana",35, "Simples", 3);
INSERT INTO tb_pizza VALUES (6, "Banana",55,"Doce de Leite",4);

-- comandos de seleção	
SELECT * FROM tb_pizza WHERE valor > 45; -- seleciona as pizzas com valor acima de 45
SELECT * FROM tb_pizza WHERE valor>=29 AND valor<=60; -- seleciona as pizzas com valor entre 29 e 60
SELECT * FROM tb_pizza WHERE sabor LIKE "%C%"; -- seleciona as pizzas que possuem a letra C no sabor


-- comando Inner Join para retornar as repetições de categoria_id nas tabelas Categoria e Pizza
SELECT * FROM tb_categoria INNER JOIN tb_pizza ON tb_categoria.categoria_id = tb_pizza.categoria_id;

-- comando Inner Join para retornar as pizzas do tipo Doce
SELECT * FROM tb_categoria INNER JOIN tb_pizza ON tb_categoria.categoria_id = tb_pizza.categoria_id AND tb_categoria.tipo="Doce";




