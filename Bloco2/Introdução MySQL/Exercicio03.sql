create database db_secretaria;
use db_secretaria;
create table tb_alunos(
	id bigint auto_increment,
    nome varchar(100),
    turma varchar(5),
    periodo varchar(10),
    media decimal(2,1),
    primary key(id)
);

select * from tb_alunos;
select * from tb_alunos where media > 7;
select * from tb_alunos where media < 7;

insert into tb_alunos(nome, turma, periodo, media)
values("Emanoela Silva Oliveira", "3ºB", "Manhã", 9.5); 

insert into tb_alunos(nome, turma, periodo, media)
values("André Manoel Reis", "3ºB", "Manhã", 8); 

insert into tb_alunos(nome, turma, periodo, media)
values("Júlia Silva Villar", "6ºA", "Tarde", 8); 

insert into tb_alunos(nome, turma, periodo, media)
values("Henrique Borges Silveira", "2ºD", "Noite", 6.3); 

insert into tb_alunos(nome, turma, periodo, media)
values("Brenda Palhares", "3ºC", "Noite", 7.7);

insert into tb_alunos(nome, turma, periodo, media)
values("Matheus Montagnini Oliveira", "5ºA", "Manhã", 8); 

insert into tb_alunos(nome, turma, periodo, media)
values("Vinicius Pereira Perez", "9ºB", "Manhã", 9.8); 

insert into tb_alunos(nome, turma, periodo, media)
values("Ana Julia Barcelos Reis", "6ºA", "Tarde", 8.7); 

update tb_alunos set turma = "3ºD", periodo = "Noite" where id=1;