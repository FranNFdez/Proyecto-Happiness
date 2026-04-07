create user cpr2 identified by cpr2;
grant connect, resource to cpr2;
 
create table alumnos(
    numMat varchar2(5),
    nombre varchar2(20),
    apellidos varchar2(40),
    cp varchar2(5),
    constraint pk_alumnos primary key (numMat)
);
 
create table modulos(
    cod varchar2(5),
    nombre varchar2(20),
    ciclo varchar2(10),
    curso number(1),
    horas number(2),
    familia varchar2(20),
    constraint pk_modulos primary key (cod)
);
 
create table matricular(
    codAlum varchar2(5),
    codMod varchar2(5),
    nota number(5,2),
    convocatorias number(1),
    constraint pk_matricular primary key (codAlum,codMod),
    constraint fk_matAlum foreign key(codAlum) references alumnos(numMat),
    constraint fk_matMot foreign key(codMod) references modulos(cod)
);
 
insert into alumnos values ('25001','Luis','Sánchez Suárez','33204');
insert into alumnos values ('25002','Laura','Sanz López','33204');
insert into alumnos values ('25003','Gonzalo','Díaz Fernandez','33208');
 
insert into modulos values ('PROGR','Programación','DAW',1,7,'Inormática');
insert into modulos values ('BADAT','Bases de datos','DAW',1,6,'Informática');
insert into modulos values ('SISIN','Sistemas','DAM',1,5,'Informática');
insert into modulos values ('ICE','Sistemas','DAM',1,5,'Informática');
insert into modulos values ('IC','Investigación','MKT',2,4,'Marketing');
 
insert into matricular values ('25001','PROGR',6,1);
insert into matricular values ('25001','BADAT',7,2);
insert into matricular values ('25002','PROGR',8,2);
insert into matricular values ('25003','IC',6,1);
 
 
select * from modulos;
select * from alumnos;
select * from matricular;
 
select alumnos.numMat,alumnos.nombre
from alumnos
where cp='33204';
 
select apellidos, nombre
from alumnos
order by 1 desc;
 
select codAlum, nota*0.6 'porcentaje examen'
from matricular;
 
/*Mostrar nombre y apellidos de los alumnos cuyo nombre empieza por L*/
select nombre, apellidos
from alumnos
where nombre like 'L%';
 
/*Nombres modulos acaban s*/
select nombre
from modulos
where nombre like '%s';
 
/*Excluir empezar por L*/
select alumnos.nombre
from alumnos
where nombre not like 'L%';
 
/*mostrar nombres alumnos notas son notable*/
select alumnos.nombre
from alumnos, matricular
where (alumnos.numMat = matricular.codAlum) and (matricular.nota >=7) and (matricular.nota <9);
/***otra forma de hacerlo***/
select alumnos.nombre
from alumnos, matricular
where (alumnos.numMat = matricular.codAlum) and (matricular.nota between 7 and 8.99);
 
 
/*nombre alumno y asignatura que esten matriculado en programacion y bases*/
select DISTINCT alumnos.nombre, modulos.nombre
from alumnos, modulos, matricular
where (alumnos.nummat = matricular.codalum) 
and (modulos.cod=matricular.codmod) 
and (modulos.nombre='Programación') or (modulos.nombre='Bases de datos');