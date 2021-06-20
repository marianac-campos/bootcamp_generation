create database db_ecommerce;

use db_ecommerce;
create table tb_produtos(
	id bigint auto_increment,
    nome varchar(70),
    tipo varchar(50),
    marca varchar(40),
    preco decimal(6,2),
    primary key(id)
);

select * from tb_produtos;
select * from tb_produtos where preco > 15;
select * from tb_produtos where preco < 15;

insert into tb_produtos(nome, tipo, marca, preco) 
values("Lipogel", "Hidratante", "Racco", 24.31);

insert into tb_produtos(nome, tipo, marca, preco) 
values("Lily", "Hidratante", "Racco", 67);

insert into tb_produtos(nome, tipo, marca, preco) 
values("Poderosa", "Hidratante p/ Cabelos", "Skala", 11.90);

insert into tb_produtos(nome, tipo, marca, preco) 
values("Corpori", "Creme Firmador", "Abelha Rainha", 12.61);

insert into tb_produtos(nome, tipo, marca, preco) 
values("Pele de Pêssego", "Esfoliante Facial", "Dalla Makeup", 8.50);

update tb_produtos set preco = 110.23 where id=2;