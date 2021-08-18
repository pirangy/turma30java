CREATE DATABASE db_rh; -- criar banco de dados "db_rh"
USE db_RH;  -- realizar operações no banco de dados "db_rh"

-- criar table "tb_funcionaries"
CREATE TABLE tb_funcionaries ( 
    id_func bigint(5) auto_increment, -- atributo "id_func" com auto_increment (preenchimento automático de identificação: 1, 2, 3...)
    nome varchar(20) not null, -- atributo "nome" com not null (não aceita preenchimento vazio)
    cargo varchar(20) not null, -- atributo "cargo" com not null (não aceita preenchimento vazio)
    departamento varchar (20) not null, -- atributo "departamento" com not null (não aceita preenchimento vazio)
    salario bigint (5), -- atributo "salario" como bigint
    
    primary key  (id_func) -- atributo "id_func" estabelecido como chave primária da tabela "tb_funcionaries"
);

-- comandos para popular tabela com até 5 dados (sem a necessidade de setar o atributo "id_func", pois este foi definido com auto_increment)
INSERT INTO tb_funcionaries (nome, cargo, departamento, salario) VALUES ("Ariel", "UX Designer", "T.I.", 4000);
INSERT INTO tb_funcionaries (nome, cargo, departamento, salario) VALUES ("Débora", "UI Designer", "T.I.", 4000);
INSERT INTO tb_funcionaries (nome, cargo, departamento, salario) VALUES ("Juliana", "Front-End Dev", "T.I.", 5000);
INSERT INTO tb_funcionaries (nome, cargo, departamento, salario) VALUES ("Márcio", "Back-End Dev", "T.I.", 5000);
INSERT INTO tb_funcionaries (nome, cargo, departamento, salario) VALUES ("Arthur", "Scrum Master", "T.I.", 5500);

-- comandos para seleção
SELECT * FROM tb_funcionaries WHERE salario > 2000; -- seleciona os funcionáries que recebem mais de 2000
SELECT * FROM tb_funcionaries WHERE salario < 2000; -- seleciona os funcionáries que recebem menos de 2000

-- comandos de atualização
UPDATE tb_funcionaries SET salario = 4500
	WHERE id_func = 1; -- atualiza o salario de funcionárie de "id_func = 1" (Ariel)
UPDATE tb_funcionaries SET salario = 4500
	WHERE id_func = 2; -- atualiza o salário de funcionárie de "id_func = 2" (Débora)

