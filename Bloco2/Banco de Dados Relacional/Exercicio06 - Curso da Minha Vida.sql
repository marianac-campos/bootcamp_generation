create database db_cursoDaMinhaVida;
use db_cursoDaMinhaVida;

create table tb_categoria(
	ID_categoria int auto_increment,
    Categoria varchar(25) not null,
    Disponivel boolean,
    PRIMARY KEY(ID_categoria)
);

insert into tb_categoria(Categoria, Disponivel) values("Saúde", 1);
insert into tb_categoria(Categoria, Disponivel) values("Espiritual", 1);
insert into tb_categoria(Categoria, Disponivel) values("Gastronomia", 0);
insert into tb_categoria(Categoria, Disponivel) values("Tecnologia", 1);
insert into tb_categoria(Categoria, Disponivel) values("Imersão", 0);

select*from tb_categoria;

create table tb_cursos(
	ID_curso int auto_increment,
    Curso varchar(40) not null,
    Educador varchar(40) not null,
    Valor decimal(5, 2) not null,
    Modalidade varchar(10) not null,
    Especificacoes int not null,
	FOREIGN KEY(Especificacoes) References tb_categoria (ID_categoria),
    PRIMARY KEY(ID_curso)
);

insert into tb_cursos(Curso, Educador, Valor, Modalidade, Especificacoes) 
values("Reiki", "Isabella Lopez", 150.75, "EAD", 2);
insert into tb_cursos(Curso, Educador, Valor, Modalidade, Especificacoes) 
values("Confeitaria", "José Barros", 362.98, "Presencial", 3);
insert into tb_cursos(Curso, Educador, Valor, Modalidade, Especificacoes) 
values("Excel Avançado", "Juliana Muniz", 68.99, "EAD", 4);
insert into tb_cursos(Curso, Educador, Valor, Modalidade, Especificacoes) 
values("UI e UX", "Vinicius Silva", 00.00, "EAD", 5);
insert into tb_cursos(Curso, Educador, Valor, Modalidade, Especificacoes) 
values("Introdução a Chakras", "Isabella Lopez", 270.85, "EAD", 2);
insert into tb_cursos(Curso, Educador, Valor, Modalidade, Especificacoes) 
values("Primeiros Socorros", "Reinaldo Campos", 35.50, "Presencial", 1);
insert into tb_cursos(Curso, Educador, Valor, Modalidade, Especificacoes) 
values("Photoshop para Iniciantes", "Gustavo Guanabara", 74.60, "EAD", 4);
insert into tb_cursos(Curso, Educador, Valor, Modalidade, Especificacoes) 
values("Comida Oriental", "Viviane Nakaoi", 281.89, "Presencial", 3);

select*from tb_cursos;

select*from tb_cursos where Valor > 50;
select*from tb_cursos where Valor between 30 and 60;
select*from tb_cursos where Curso like "P%";

select tb_cursos.Curso, tb_cursos.Valor, tb_cursos.Modalidade, tb_categoria.Categoria, tb_categoria.Disponivel
from tb_cursos inner join tb_categoria on tb_categoria.ID_categoria = tb_cursos.Especificacoes;

select*from tb_cursos where Educador in ("Isabella Lopez")