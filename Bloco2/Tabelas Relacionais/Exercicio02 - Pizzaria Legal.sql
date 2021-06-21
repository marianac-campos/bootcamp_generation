create database db_pizzaria_legal;
use db_pizzaria_legal;

create table tb_categoria(
	ID_categoria int auto_increment,
    Tipo varchar(15) not null,
    Pizza varchar(15) not null,
    PRIMARY KEY(ID_categoria)
);

insert into tb_categoria(Tipo, Pizza) values("Tradicional", "Doce");
insert into tb_categoria(Tipo, Pizza) values("Tradicional", "Salgado");
insert into tb_categoria(Tipo, Pizza) values("Especial", "Doce");
insert into tb_categoria(Tipo, Pizza) values("Especial", "Salgado");
insert into tb_categoria(Tipo, Pizza) values("Outro", "Bebida");

select*from tb_categoria;

create table tb_pizza(
	ID_pizza int auto_increment,
    Produto varchar(20) not null,
    Descricao varchar(150),
    Preco decimal(5, 2) not null,
    Tamanho varchar(30) not null,
    FK_categoria int not null,
	FOREIGN KEY(FK_categoria) references tb_categoria(ID_categoria),
    PRIMARY KEY(ID_pizza) 
);

insert into tb_pizza(Produto, Descricao, Preco, Tamanho, FK_categoria) 
values("Holandesa", "Mussarela, atum, requeijão e cebola", 52, "Média", 4);
insert into tb_pizza(Produto, Descricao, Preco, Tamanho, FK_categoria)
values("Calabresa", "Mussarela e calabresa", 46, "Grande", 2);
insert into tb_pizza(Produto, Descricao, Preco, Tamanho, FK_categoria) 
values("Canadense", "Mussarela, lombo e champignon", 56, "Média", 2);
insert into tb_pizza(Produto, Descricao, Preco, Tamanho, FK_categoria) 
values("Nutella", "Nutella e leite ninho", 52, "Média", 3);
insert into tb_pizza(Produto, Descricao, Preco, Tamanho, FK_categoria) 
values("Prestígio", "Calda de beijinho com coco ralado", 29, "Média", 1);
insert into tb_pizza(Produto, Descricao, Preco, Tamanho, FK_categoria) 
values("Brócolis c/ Cheddar", "Mussarela, brócolis e cheddar", 26, "Pequena", 4);
insert into tb_pizza(Produto, Descricao, Preco, Tamanho, FK_categoria) 
values("Caipira", "Mussarela, frango, cebola e milho", 56, "Grande", 2);
insert into tb_pizza(Produto, Descricao, Preco, Tamanho, FK_categoria) 
values("Suflair", "Calda de chocolate, pedaços de suflair e castanha", 52, "Grande", 3);
insert into tb_pizza(Produto, Descricao, Preco, Tamanho, FK_categoria) 
values("Refrigerante", "Coca-Cola, Guaraná, Fanta, Sprite", 12, "2L", 5);

select*from tb_pizza;

select*from tb_pizza where Preco > 45;
select*from tb_pizza where Preco between 49 and 60;
select*from tb_pizza where Produto like "C%";

select tb_pizza.Produto, tb_pizza.Preco, tb_pizza.Tamanho, tb_categoria.Tipo, tb_categoria.Pizza
from tb_pizza inner join tb_categoria on tb_categoria.ID_categoria = tb_pizza.FK_categoria;

select*from tb_pizza where FK_categoria in (1, 3);