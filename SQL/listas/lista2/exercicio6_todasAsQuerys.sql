CREATE DATABASE db_cursoDaMinhaVida;
USE db_cursoDaMinhaVida;

CREATE TABLE tb_categoria (
	
    id_categoria int (5) not null,
    direito varchar (50) not null,
    administracao varchar (50) not null,
    tecnologia varchar (50) not null,
    
    primary key (id_categoria))engine=InnoDB;

CREATE TABLE tb_curso (
	
    id_curso int (5) not null,
    titulo varchar (50) not null,
    valor decimal (3,2) not null,
    duracao int (5) not null,
    nivel varchar (50) not null,
    instituicao varchar (50) not null,
	id_categoria int (5) not null,
    
    primary key (id_curso),
    foreign key (id_categoria) references tb_categoria(id_categoria))engine=InnoDB;
    

INSERT INTO tb_categoria VALUES (1,"Constitucional","Setor Privado","Back-End");
INSERT INTO tb_categoria VALUES (2,"Penal","Setor Público","Banco de Dados");
INSERT INTO tb_categoria VALUES (3,"Administrativo","MicroEmpreendedor","Front-End");
INSERT INTO tb_categoria VALUES (4,"Consumidor","Pequenas Empresas","Suporte");
INSERT INTO tb_categoria VALUES (5,"Civil","Financeira","Sistemas");

SELECT * FROM tb_categoria;

INSERT INTO tb_curso VALUES (11, "Fundamentos do Direito Constitucional", 70.00, 560, "Básico", "USP",1);
INSERT INTO tb_curso VALUES (22, "Fundamentos do Direito Penal", 70.00,560,"Básico","UnB",2);
INSERT INTO tb_curso VALUES (33, "Fundamentos do Direito Administrativo",70.00,560,"Básico","UFMG",3);
INSERT INTO tb_curso VALUES (44, "Fundamentos do Direito do Consumidor",70.00,560,"Básico","UFRS",4);
INSERT INTO tb_curso VALUES (55, "Fundamentos do Direito Civil",70.00,560,"Básico","UFMT",5);
INSERT INTO tb_curso VALUES (66, "Fundamentos da Administração Privada",70.00,560,"Básico","UFRN",1);
INSERT INTO tb_curso VALUES (77,"Fundamentos da Administração Pública",70.00,560,"Básico", "UFAM",2);
INSERT INTO tb_curso VALUES (88, "Fundamentos do Microempreendedorismo", 70.00, 560, "Básico", "UFAL",3);

SELECT * FROM tb_categoria INNER JOIN tb_curso ON tb_categoria.id_categoria = tb_curso.id_categoria;
SELECT * FROM tb_categoria INNER JOIN tb_curso ON tb_categoria.id_categoria = tb_curso.id_categoria AND tb_categoria.direito="Penal";

