create database db_construindo_a_nossa_vida;
use db_construindo_a_nossa_vida;

create table tb_categoria(
	ID_categoria int auto_increment,
    Categoria varchar(25) not null,
    Qnt_Produtos int not null,
    PRIMARY KEY(ID_categoria)
);

insert into tb_categoria(Categoria, Qnt_Produtos) values("Material de Construção", 234);
insert into tb_categoria(Categoria, Qnt_Produtos) values("Hidráulica", 64);
insert into tb_categoria(Categoria, Qnt_Produtos) values("Elétrica", 107);
insert into tb_categoria(Categoria, Qnt_Produtos) values("Ferramentas", 99);
insert into tb_categoria(Categoria, Qnt_Produtos) values("Outros", 117);

select*from tb_categoria;

create table tb_produtos(
	ID_produtos int auto_increment,
    Produto varchar(40) not null,
    Marca varchar (40) not null,
    Tamanho varchar(40),
    Preco decimal(5, 2) not null,
    Categoria int not null,
	FOREIGN KEY(Categoria) references tb_categoria (ID_categoria),
    PRIMARY KEY(ID_produtos)
);

insert into tb_produtos(Produto, Marca, Tamanho, Preco, Categoria) 
values ("Tubo Esgoto", "Amanco", "100mm", 14.32, 2);
insert into tb_produtos(Produto, Marca, Tamanho, Preco, Categoria) 
values ("Cap Soldável", "Amanco", "20mm", 0.86, 2);
insert into tb_produtos(Produto, Marca, Tamanho, Preco, Categoria) 
values ("Tijolo Baiano Igaratinga", "Dalila", "09x19x24cm", 1.18, 1);
insert into tb_produtos(Produto, Marca, Tamanho, Preco, Categoria) 
values ("Rejunte Acrilico", "Bostik", "1Kg", 29.97, 1);
insert into tb_produtos(Produto, Marca, Tamanho, Preco, Categoria) 
values ("Cabo Flexível", "Cobrecom", "1.5mm - 100m", 176.85, 3);
insert into tb_produtos(Produto, Marca, Tamanho, Preco, Categoria) 
values ("Trena Emborrachada", "Mega", "5m", 20.50, 4);
insert into tb_produtos(Produto, Marca, Tamanho, Preco, Categoria) 
values ("Chave de Fenda", "Tramontina", "5/16x6", 15.40, 4);
insert into tb_produtos(Produto, Marca, Tamanho, Preco, Categoria) 
values ("Massa Adesiva Durepoxi", "Loctite", "100gr", 8.95, 5);

select*from tb_produtos;

select*from tb_produtos where Preco > 50;
select*from tb_produtos where Preco between 10 and 20;
select*from tb_produtos where Produto like "C%";

select tb_produtos.Produto, tb_produtos.Marca, tb_produtos.Preco, tb_categoria.Categoria, tb_categoria.Qnt_Produtos
from tb_produtos inner join tb_categoria on tb_categoria.ID_categoria = tb_produtos.Categoria;

select*from tb_produtos where Marca in("Dalila", "Amanco");