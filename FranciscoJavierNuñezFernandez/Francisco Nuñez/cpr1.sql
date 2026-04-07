drop schema cpr1; /*SE PONE AL FINAL,SIRVE PARA BORRAR TODO SI SOLO PONES ESTA LINE SELECCIONADA*/
create schema cpr1; /*CREACION DEL ESQUEMA*/
use cpr1; /*PARA PONER QUE SE ENFOQUE EN ESA CARPETA*/
/*CREACION DE TABLAS*/
create table alumnos(
	codMat char(7),
    nom varchar(20) not null, /*OBLIGADA INSERCION*/
    apel varchar(40) not null, /*OBLIGADA INSERCION*/
    dir varchar(40),
    constraint pk_alumnos primary key(codMat) /*ESTABLECER UNA RESTRICCION TIPO PK*/
);
create table modulos(
	codMod char(5),
    nom varchar(20),
    ciclo varchar(10) default 'DAW', /*PONER ALGO POR DEFECTO*/
    curso int,
    fampro varchar(20),
	constraint pk_modulos primary key(codMod)
); 
create table matricular(
	idMat char(7),
    idMod char(5),
    nota decimal(5,2) comment'Acta Junio',
    constraint pk_matricular primary key(idMat, idMod),/*CLAVE COMPUESTA*/
    constraint fk_matAlum foreign key(idMat) references alumnos (codMat), /*HAY QUE PONER EL NOMBRE LITERAL DE LA TABLA QUE LLAMAMOS Y CON ESPACIO*/
    constraint fk_matMod foreign key(idMod) references modulos (codMod)
);
/*INSERTAR DATOS EN LAS TABLAS*/
insert into modulos values ('BADAT','Bases de datos','DAM',1,'Inf. comunicaciones');
insert into alumnos values ('2025001','Juan','Pérez Arias','C/Lope de Vega');
insert into matricular values (idMat,idMod,nota)('2025001','BADAT',6.5);
insert into alumnos values ('2025002','Jorge','Díaz Sanz','C/Donoso','33204','Gijón','623456789');
insert into matricular values ('2025002','BADAT',8,'2026/01/26');
insert into alumnos values ('2025003','Sonia','García García','C/Uria','723456789','24630','León');
insert into asignaturas values ('PROGR','Programación','DAW',1,'Inf. comunicaciones');
insert into matricular values ('2025001','PROGR',10,now());
insert into matricular values ('2025003','PROGR',7,now());
insert into alumnos(codMat, nom, apel, poblacion) values ('2025004','Manuel','Hernán Gómez','Gijón');
 
/*CONFIGURACIONES SOBRE LAS TABLAS*/
rename table modulos to asignaturas; /*PARA CAMBIAR NOMBRE DE LA TABLA, YA QUE NO SE PUEDE CAMBIAR ARRIBA UNA VEZ HECHA*/
alter table alumnos add tlf char(14);/*PARA AÑADIR CAMPOS DE INFO*/
alter table alumnos add movil char(9);
alter table alumnos add CP int(5);   /*AÑADIR CODIGO POSTAL*/
alter table alumnos add ciudad varchar(25);
alter table matricular add fechaMat date;
 
/*ELIMINAR COLUMNA*/
alter table alumnos drop column tlf;
alter table alumnos modify CP char(5); /*PARA CAMBIAR TIPO DE DATO*/
alter table alumnos change column ciudad poblacion varchar(25); /*PARA CAMBIAR NOMBRE*/
alter table matricular add constraint fk_matMod foreign key (idMod) references asignaturas(codMod); /*PARA AÑADIR OTRA VEZ LA FK*/

/*RESTRICCIONE DE VALIDEZ*/
/*alter table matricular add constraint ck_nota check(nota >= 1 and nota <= 10);*/
alter table matricular add constraint ck_nota check(nota between 1 and 10); /*OTRA OPCION HACER LO DE ENCIMA*/
alter table asignaturas add constraint ck_mod check(codMod in ('BADAT','PROGR','SISIN','ENDES','LMSGI'));
alter table alumnos add constraint ck_poblacion check(poblacion= upper(poblacion));

/*PARA MOSTRAR UNA VISTA DE LO QUE QUIERA QUE CUMPLA*/
create view listado as /*NOMBRE DE LA NUEVA TABLA*/
select alumnos.nom  /*DATO QUE SE VA A MOSTRAR*/
from alumnos, matricular /*COLUMNAS QUE QUERAMOS*/
where (matricular.idMod = 'PROGR') and (alumnos.codMat = matricular.idMat);/*SELECCIONA FILAS QUE CUMPLAN LA CONDICION*/

/*BORAR TABLA*/
drop table asignaturas; /*PIERMERO HAY QUE QUITAR LA CONCEXION*/
alter table matricular drop foreign key fk_matMod; /*BORRANDO CONEXION DONDE ESTA LA FK*/

truncate matricular; /*BORRA LOS DATOS*/


/*CONSULTA BASICA PARA VER QUE TODO ESTA BIEN, NO ES DE ESTE TEMA PERO LO VEREMOS PARA ENTENDER*/
select * /*EL ASTERISCO ES PARA PONER TODOS LOS CAMPOS DE LA TABLA*/
from matricular; /*DE QUE TABLA QUIERO HACER LA CONSULTA*/
 
select *
from alumnos;
 
select *
from asignaturas;

select *
from listado;