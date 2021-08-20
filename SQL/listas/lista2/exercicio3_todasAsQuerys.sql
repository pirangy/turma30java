CREATE DATABASE db_farmacia_do_bem; -- cria o banco de dados
USE db_farmacia_do_bem; -- utiliza o banco de dados para realizar as operações

-- criação de tabela Categoria
CREATE TABLE tb_categoria(

	categoria_id int (5) not null,
    tipo varchar (50) not null,
    receita boolean not null,

	primary key (categoria_id)
)engine=InnoDB;

-- criação de tabela Produto
CREATE TABLE tb_produto(
	
    produto_id int (5) not null,
    nome varchar (50) not null,
    marca varchar (50) not null,
    valor decimal (4,2) not null,
    categoria_id int not null,
    receita boolean not null,
	
    primary key (produto_id),
    foreign key (categoria_id) references tb_categoria(categoria_id))engine=InnoDB;
  
  
-- popular tabela Categoria
INSERT INTO tb_categoria VALUES (1,"Tarja Vermelha", false);
INSERT INTO tb_categoria VALUES (2,"Tarja Preta", true);
INSERT INTO tb_categoria VALUES (3,"Tarja Amarela",false);

-- popular tabela Produto
INSERT INTO tb_produto VALUES (45, "Frontal", "Pfizer", 75.00, 2, true);
INSERT INTO tb_produto VALUES (62, "Aspirina", "Bayer",7.99, 3, false);
INSERT INTO tb_produto VALUES (77, "Nimesulida", "EuroFarma", 12.99, 3, false);
INSERT INTO tb_produto VALUES (906, "Alprazolam", "Medley", 37.99, 2, true);
INSERT INTO tb_produto VALUES (711, "Loratadina","Cimed", 10.99, 3, false);
INSERT INTO tb_produto VALUES (444, "Simeticona","Medley", 12.99, 3, false);

-- comandos de seleção
SELECT * FROM tb_produto WHERE valor>50.00; -- seleciona produtos com valor acima de 50.00
SELECT * FROM tb_produto WHERE valor>=3 AND valor <=60;

-- comando Inner Join entre tabela Categoria e Produto
SELECT * FROM tb_categoria INNER JOIN tb_produto ON tb_categoria.categoria_id = tb_produto.categoria_id;

-- comando Inner Join para retornar produtos de uma categoria específica
SELECT * FROM tb_categoria INNER JOIN tb_produto ON tb_categoria.categoria_id = tb_produto.categoria_id AND tb_categoria.tipo = "Tarja Preta"; -- retorna produtos do tipo Tarja Preta



    
    