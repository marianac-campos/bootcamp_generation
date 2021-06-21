use db_rh;
create table tb_funcionarios(
	id bigint auto_increment,
    nome varchar(200) not null,
    nascimento date,
    salario decimal(6,2) not null,
    funcao varchar(50) not null,
    primary key(id)
);
select * from tb_funcionarios;
select * from tb_funcionarios where salario > 2000;
select * from tb_funcionarios where salario < 2000;

insert into tb_funcionarios(nome, salario, funcao) 
values("José Eduardo Silva Costa", 2378, "Marketing");

insert into tb_funcionarios(nome, salario, funcao) 
values("Janaina Cristina Souza", 2400, "Marketing");

insert into tb_funcionarios(nome, salario, funcao) 
values("Larissa Eduarda Borges", 1200, "Estagiária");

insert into tb_funcionarios(nome, salario, funcao) 
values("Nathan Donizete Junior", 768, "Aprendiz");

insert into tb_funcionarios(nome, salario, funcao) 
values("Giovanna Aparecida Barros", 1768, "T.I");

update tb_funcionarios set salario = 1982.58 where id=6;