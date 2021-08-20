CREATE DATABASE db_cidade_das_frutas;
USE db_cidade_das_frutas;

CREATE TABLE tb_categoria(
	
    id_categoria int(5),
    tipo varchar (50),
    origem varchar (50),
    primary key (id_categoria))engine=InnoDB;

CREATE TABLE tb_produto(

	id_produto int(5),
    fruta varchar (50),
    valor decimal (3,2),
    id_categoria int,
    primary key (id_produto),
    foreign key (id_categoria) references tb_categoria(id_categoria))engine=InnoDB;



