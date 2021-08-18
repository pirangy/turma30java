CREATE DATABASE db_escola; -- criar banco de dados "db_escola"
USE db_escola; -- realizar operações no banco de dados "db_escola"

-- criar tabela "tb_alunos"
CREATE TABLE tb_alunos (
    id_aluno bigint(5) auto_increment, -- atributo "id_aluno" com auto_increment (preenchimento automático de identificação: 1, 2, 3...)
    nome varchar(20) not null, -- atributo "nome" com not null (não aceita preenchimento vazio)
    idade bigint (2) not null, -- atributo "idade" com not null (não aceita preenchimento vazio)
    nota bigint (2) not null, -- atributo "ano" com not null (não aceita preenchimento vazio)
	ativo boolean, -- atributo "ativo" como boolean (true para ativo/false para inativo)
	
    primary key (id_aluno) -- atributo "id_aluno" estabelecido como chave primária da tabela "tb_alunos"
);

-- comandos para popular tabela com até 8 dados (sem a necessidade de setar o atributo "id_alunos", pois este foi definido com auto_increment)
INSERT INTO tb_alunos (nome, idade, nota, ativo) VALUES ("Ariel", 10, 4, true); 
INSERT INTO tb_alunos (nome, idade, nota, ativo) VALUES ("Juliana", 10, 4, true);
INSERT INTO tb_alunos (nome, idade, nota, ativo) VALUES ("Cássia", 8, 10, true);
INSERT INTO tb_alunos (nome, idade, nota, ativo) VALUES ("Henrique", 8, 10, true);
INSERT INTO tb_alunos (nome, idade, nota, ativo) VALUES ("Ana Paula", 12, 10, true);
INSERT INTO tb_alunos (nome, idade, nota, ativo) VALUES ("Gabriel", 12, 8, true);
INSERT INTO tb_alunos (nome, idade, nota, ativo) VALUES ("Giovana", 14, 8, true);
INSERT INTO tb_alunos (nome, idade, nota, ativo) VALUES ("Stefani", 14, 10, true);

-- comandos para seleção
SELECT * FROM tb_alunos WHERE nota > 7; 
SELECT * FROM tb_alunos WHERE nota < 7;

-- comandos de atualização
UPDATE tb_alunos SET nota = 6
	WHERE id_aluno  = 2; -- atualiza o valor de produto de "id_aluno = 2" ("Juliana", nota = 4)