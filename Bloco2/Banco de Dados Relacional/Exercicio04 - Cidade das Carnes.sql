create database db_cidade_das_carnes;
use db_cidade_das_carnes;

create table tb_categoria(
	id int auto_increment,
	descricao varchar(255) not null,
	ativo boolean not null,
	PRIMARY KEY(id)
);

insert into tb_categoria (descricao, ativo) values ("Bovino", true);
insert into tb_categoria (descricao, ativo) values ("Suino", true);
insert into tb_categoria (descricao, ativo) values ("Aves", true);
insert into tb_categoria (descricao, ativo) values ("Imbutidos", true);
insert into tb_categoria (descricao, ativo) values ("Outros", true);

select*from tb_categoria;

create table tb_produtos (
	id int auto_increment,
	nome varchar (255) not null,
	preco decimal(6,2) not null,
	qtproduto int not null,
	categoria_id int,
	FOREIGN KEY(categoria_id) references tb_categoria(id),
    PRIMARY KEY(id)
);

insert into tb_produtos (nome, preco, qtProduto, categoria_id) values ("Picanha",20.00, 30, 1);
insert into tb_produtos (nome, preco, qtProduto, categoria_id) values ("Coxa de frango", 20.00, 30, 3);
insert into tb_produtos (nome, preco, qtProduto, categoria_id) values ("Bacon", 30.00, 30, 2);
insert into tb_produtos (nome, preco, qtProduto, categoria_id) values ("Hamburguer", 60.00, 30, 4);
insert into tb_produtos (nome, preco, qtProduto, categoria_id) values ("Peito de frango", 25.00, 30, 3);
insert into tb_produtos (nome, preco, qtProduto, categoria_id) values ("Salame", 18.00, 30, 4);
insert into tb_produtos (nome, preco, qtProduto, categoria_id) values ("Avental", 20.00, 12, 5);
insert into tb_produtos (nome, preco, qtProduto, categoria_id) values ("Soprador de churrasqueira", 35.00, 5, 5);

select*from tb_produtos;

select*from tb_produtos where preco > 30;
select*from tb_produtos where preco between 14 and 27;
select*from tb_produtos where nome like "%C%";

select tb_produtos.nome, tb_produtos.preco, tb_categoria.descricao, tb_categoria.ativo
from tb_produtos inner join tb_categoria on tb_categoria.id = tb_produtos.categoria_id;

select*from tb_produtos where categoria_id in (1, 2);