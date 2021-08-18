CREATE DATABASE db_ECommerce;
USE db_ECommerce;

CREATE TABLE tb_produtos (
    id_prod bigint(5) auto_increment,
    produto varchar(20) not null,
    valor decimal (5, 2) not null,
    marca varchar (20) not null,
	estoque decimal (10) not null,
	
    primary key (id_prod)
);