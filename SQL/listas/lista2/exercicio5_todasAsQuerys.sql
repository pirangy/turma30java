CREATE DATABASE db_construindo_a_nossa_vida;
USE db_construindo_a_nossa_vida;

CREATE TABLE tb_categoria(
	
    id_categoria int (5) not null,
    banheiro varchar (50) not null,
    cozinha varchar (50) not null,
    sala varchar (50) not null,
	
    primary key(id_categoria))engine=InnoDB;
    
CREATE TABLE tb_produto(
	
    id_produto int (5) not null,
    azulejos varchar (50) not null,
    itens_variados varchar (50) not null,
    moveis varchar (50) not null,
    iluminacao varchar (50) not null,
    eletronicos varchar (50) not null,
    id_categoria int (5) not null,
	
    primary key(id_produto),
    foreign key(id_categoria)references tb_categoria(id_categoria))engine=InnoDB;

-- popular tabela Categoria
INSERT INTO tb_categoria VALUES(1,"Simples","Simples","Simples");
INSERT INTO tb_categoria VALUES(2,"Mediano","Mediano","Mediano");
INSERT INTO tb_categoria VALUES(3,"Gourmet","Gourmet","Gourmet");
INSERT INTO tb_categoria VALUES(4,"Refinado","Refinado","Refinado");
INSERT INTO tb_categoria VALUES(5,"Mansão","Mansão","Mansão");

-- popular tabela Produto
INSERT INTO tb_produto VALUES(52,"Grego","Alexa","Escrivaninha","Lâmpada LED","Massageador",3);
INSERT INTO tb_produto VALUES(64,"Holandês","iPod","Sofá","Luminária Gastrix","Aspirador de Pó",2);
INSERT INTO tb_produto VALUES(33,"Peruano","iMac","Cama","Luzes atmosféricas","Robô Interativo",5);
INSERT INTO tb_produto VALUES(44,"Mexicano","XBOX","Divã","Luz Negra","Webcam",4);
INSERT INTO tb_produto VALUES(78,"Alemão","Playstation","Puff","Luz Vermelha","HD Externo",3);
INSERT INTO tb_produto VALUES(65,"Britânico","iPad","Mesa","Poste de Jardim","Blu-Ray",2);
INSERT INTO tb_produto VALUES(25,"Australiano","Vaper","Bancos","Abajour","Roteador",1);
INSERT INTO tb_produto VALUES(22,"Espanhol","TV UltraHD","Mesa de centro","Lanterna","Balança",3);

SELECT * FROM tb_categoria INNER JOIN tb_produto ON tb_categoria.id_categoria = tb_produto.id_categoria;
SELECT * FROM tb_produto INNER JOIN tb_categoria ON tb_produto.id_categoria = tb_categoria.id_categoria AND tb_categoria.banheiro="Gourmet";



