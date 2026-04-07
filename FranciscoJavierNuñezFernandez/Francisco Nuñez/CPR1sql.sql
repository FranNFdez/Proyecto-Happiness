drop schema cpr1 ;

create schema cpr1;

use cpr1;
 
/* CREACION DE TABLAS */

create table alumnos(

	codMat char(7), 

    nom varchar(20) not null, 

    apel varchar (40) not null,

    dire varchar (40),
    
    constraint pk_alumnos primary key (codMat)

);
 
create table modulos(

	codMod char(5),

    nom nvarchar(20),

    ciclo varchar(10) default'DAW',

    curso int,

    famProf varchar(20),

     constraint pk_modulos primary key (codMod)

);
 
create table matricular (

    idMat char(7),

    idMod char(5),

    nota decimal (5,2),

	constraint pk_matricular primary key(idMat,idMod),

    constraint fk_matrAlumn foreign key (idMat) references alumnos (codMat),

	constraint fk_matrMod foreign key  (idMod) references modulos (codMod)

    );
 
/* INSERTAR DATOS EN LAS TABLAS */

insert into modulos values ('BADAT','Bases de datos','DAM',1,'Inf.comunicaciones');

insert into alumnos values ('2025001','Juan','Pérez Arias','C/Lope de Vega');

insert into matricular values ('2025001','BADAT',6.5);
 
 insert into alumnos values('2025002', 'Jorge', 'Diaz Sanz', 'C/ Donoso','623456789','33204', 'Gijón')
 
 insert into matricular values('2025002','BADAT',8,now());
 
/*CONFIGURACIONES SOBRE EL ASPECTO DE LAS TABLAS*/

rename table modulos to asignaturas;
/*AÑADIR COLUMNAS*/

alter table alumnos add telef char(14);

alter table  alumnos add movil char(9);

alter table alumnos add cp int(5);

alter table alumnos add ciudad varchar(25);

alter table matricular add fechamatricula date;
/*ELIMINAR COLUMNAS*/
alter table alumnos drop column telef;

/*MODIFICAR TABLAS/COLUMNAS*/
alter table alumnos change column ciudad poblacion varchar(25)

alter table alumnos modify cp char(5);

/* CONSULTAS */

select*
from matricular;

 