CREATE DATABASE db_generation_game_online; -- cria o banco de dados
USE db_generation_game_online; -- utiliza o banco de dados para realizar as operações

-- criação da tabela "Classe"
CREATE TABLE tb_classe( 
	
    classe_id int (5) not null,
    tipo varchar (50) not null,
    raca varchar(50) not null,
    
	primary key (classe_id)) engine=InnoDB;

-- popular a tabela "Classe"
INSERT INTO tb_classe VALUES (1,"Soldado","Humano");
INSERT INTO tb_classe VALUES (2,"Arqueiro","Humano");
INSERT INTO tb_classe VALUES (3,"Mago","Humano");
INSERT INTO tb_classe VALUES (4,"Soldado","Elfo");
INSERT INTO tb_classe VALUES (5,"Arqueiro","Elfo");

-- criação da tabela "Personagem"
CREATE TABLE tb_personagem(
	
    personagem_id int (5) not null,
    nome varchar (50) not null,
    ataque int (5) not null,
    defesa int (5) not null,
    agilidade int (5) not null,
    classe_id int (5) not null,
    
	primary key (personagem_id),
    foreign key (classe_id) references tb_classe (classe_id)) engine=InnoDB;

-- popular a tabela "Personagem"
INSERT INTO tb_personagem VALUES (1,"Aragorn",10,8,12,1);
INSERT INTO tb_personagem VALUES (2,"Legolas",8,6,15,5);
INSERT INTO tb_personagem VALUES (3,"Boromir",10,10,8,1);
INSERT INTO tb_personagem VALUES (4,"Gandalf",12,8,10,3);
INSERT INTO tb_personagem VALUES (5,"Saruman",10,15,8,3);
INSERT INTO tb_personagem VALUES (6,"Arwen",8,8,15,4);
INSERT INTO tb_personagem VALUES (7,"Elrond",10,10,8,4);
INSERT INTO tb_personagem VALUES (8,"Faramir",10,10,8,2);

-- comandos de seleção originais do exercício
SELECT * FROM tb_personagem WHERE ataque > 2000; -- retornará nulo pois nenhum personagem possui ataque maior que 2000
SELECT * FROM tb_personagem WHERE defesa >= 1000 and defesa <= 2000; -- retornará nulo pois nenhum personagem possui defesa entre 1000 e 2000
SELECT * FROM tb_personagem WHERE nome LIKE "%C%"; -- retornará nulo pois nenhum personagem possui a letra C no nome

-- comandos de seleção adaptados a partir das características de tabela Personagem
SELECT * FROM tb_personagem WHERE ataque > 10; -- retornará personagens com ataque maior que 10
SELECT * FROM tb_personagem WHERE defesa >=10 AND defesa <=20; -- retornará personagens com defesa entre 10 e 20
SELECT * FROM tb_personagem WHERE nome LIKE "%R%"; -- retornará personagens que possuem a letra R no nome

-- Comando Inner Join para retornar as repetições de classe_id nas tabelas Classe e Personagem
SELECT * FROM tb_classe INNER JOIN tb_personagem ON tb_classe.classe_id = tb_personagem.classe_id;

-- Comando Inner Join para retornar os personagens do tipo Arqueiro
SELECT * FROM tb_personagem INNER JOIN tb_classe ON tb_classe.classe_id = tb_personagem.classe_id AND tb_classe.tipo="Arqueiro";


