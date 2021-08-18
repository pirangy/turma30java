CREATE DATABASE db_escola;
USE db_ECommerce;

CREATE TABLE tb_alunos (
    id_aluno bigint(5) auto_increment,
    nome varchar(20) not null,
    idade bigint (2) not null,
    ano bigint (1) not null,
	ativo boolean,
	
    primary key (id_aluno)
);