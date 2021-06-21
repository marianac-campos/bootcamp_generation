create database db_generation_game_online;
use db_generation_game_online;

create table tb_classe(
	ID_classe int auto_increment,
    Classe varchar(15) not null,
    Rota varchar(15) not null,
	PRIMARY KEY(ID_classe)
);

insert into tb_classe(Classe, Rota) values("Tanque", "TOP Lane");
insert into tb_classe(Classe, Rota) values("Assassino", "MID Lane");
insert into tb_classe(Classe, Rota) values("Mago", "MID Lane");
insert into tb_classe(Classe, Rota) values("Atirador", "BOT Lane");
insert into tb_classe(Classe, Rota) values("Suporte", "BOT Lane");

select*from tb_classe;

create table tb_personagem(
	ID_champ int auto_increment,
    Nome varchar(20) not null,
    Regiao varchar(30) not null,
    PA int not null,
    PD int not null,
    Dificuldade varchar(16) not null,
	Funcao int not null,
    FOREIGN KEY(Funcao) references tb_classe(ID_classe),
    PRIMARY KEY(ID_champ)
);

insert into tb_personagem(Nome, Regiao, PA, PD, Dificuldade, Funcao) 
values("Lulu", "Bandópolis", 1250, 1600, "Moderado", 5);
insert into tb_personagem(Nome, Regiao, PA, PD, Dificuldade, Funcao) 
values("Ekko", "Zaun", 2500, 1475, "Alta", 3);
insert into tb_personagem(Nome, Regiao, PA, PD, Dificuldade, Funcao) 
values("Galio", "Demacia", 1600, 2700, "Moderado", 1);
insert into tb_personagem(Nome, Regiao, PA, PD, Dificuldade, Funcao)
values("Ashe", "Freljord", 1800, 1150, "Baixa", 4);
insert into tb_personagem(Nome, Regiao, PA, PD, Dificuldade, Funcao) 
values("Xerath", "Shurima", 2300, 1200, "Alta", 3);
insert into tb_personagem(Nome, Regiao, PA, PD, Dificuldade, Funcao) 
values("Kha'Zix", "O Vazio", 3600, 1350, "Moderado", 2);
insert into tb_personagem(Nome, Regiao, PA, PD, Dificuldade, Funcao) 
values("Lissandra", "Freljord", 2275, 1250, "Baixa", 3);
insert into tb_personagem(Nome, Regiao, PA, PD, Dificuldade, Funcao) 
values("Wukong", "Ionia", 2360, 2350, "Moderado", 1);


select*from tb_personagem;

select*from tb_personagem where PA > 2000;
select*from tb_personagem where PD between 1000 and 2000;
select*from tb_personagem where Nome like "L%";

select tb_personagem.Nome, tb_personagem.Regiao, tb_personagem.Dificuldade, tb_classe.Classe, tb_classe.Rota
from tb_personagem inner join tb_classe on tb_classe.ID_classe = tb_personagem.Funcao;

select*from tb_personagem where Dificuldade = "Alta";