create database db_farmacia_do_bem;
use db_farmacia_do_bem;

create table tb_categoria(
	ID_categoria int auto_increment,
    Categoria varchar(25) not null,
    Qnt_Produtos bigint not null,
    PRIMARY KEY(ID_categoria)
);

insert into tb_categoria(Categoria, Qnt_Produtos) values("Genéricos", 189);
insert into tb_categoria(Categoria, Qnt_Produtos) values("Medicamento", 225);
insert into tb_categoria(Categoria, Qnt_Produtos) values("Nutrição", 46);
insert into tb_categoria(Categoria, Qnt_Produtos) values("Beleza e Higiene", 167);
insert into tb_categoria(Categoria, Qnt_Produtos) values("Maternidade", 68);

select*from tb_categoria;

create table tb_produtos(
	ID_produtos int auto_increment,
    Nome varchar(40) not null,
    Marca varchar(40) not null,
    Preco decimal(5, 2) not null,
    COD varchar(6) not null,
    Descricao int not null,
	FOREIGN KEY(Descricao) References tb_categoria (ID_categoria),
    PRIMARY KEY(ID_produtos)
);

insert into tb_produtos(Nome, Marca, Preco, COD, Descricao) 
values("Bepantriz Pomada", "CIMED", 6.68, "289000", 5);
insert into tb_produtos(Nome, Marca, Preco, COD, Descricao) 
values("Tâmisa 20", "Eurofarma", 29.52, "35106", 1);
insert into tb_produtos(Nome, Marca, Preco, COD, Descricao) 
values("Fluconazol", "CIMED", 17.10, "525529", 2);
insert into tb_produtos(Nome, Marca, Preco, COD, Descricao) 
values("Orlistate", "GERMED", 84.87, "684589", 2);
insert into tb_produtos(Nome, Marca, Preco, COD, Descricao) 
values("Facial Hidratante", "NIVEA", 22.98, "720291", 4);
insert into tb_produtos(Nome, Marca, Preco, COD, Descricao) 
values("Cotonetes", "Johnson-Johnson", 4.45, "51853", 4);
insert into tb_produtos(Nome, Marca, Preco, COD, Descricao) 
values("Vitamida D - Dprev 7000UI", "Myralis", 17.57, "523062", 3);
insert into tb_produtos(Nome, Marca, Preco, COD, Descricao) 
values("Aptamil ProFutura", "Danone", 63.95, "568503", 5);

select*from tb_produtos;

select*from tb_produtos where Preco > 50;
select*from tb_produtos where Preco between 3 and 30;
select*from tb_produtos where Nome like "F%";

select tb_produtos.Nome, tb_produtos.Marca, tb_produtos.Preco, tb_produtos.COD, tb_categoria.Categoria, tb_categoria.Qnt_Produtos
from tb_produtos inner join tb_categoria on tb_categoria.ID_categoria = tb_produtos.Descricao;

select*from tb_produtos where Marca = "CIMED";