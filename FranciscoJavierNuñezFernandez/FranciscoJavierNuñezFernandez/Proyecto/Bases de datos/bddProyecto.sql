/*CREACION BASE DE DATOS*/
create database proyecto_happiness;
use proyecto_happiness;

/*CREACION DE TABLAS*/

create table usuarios (
	id int auto_increment primary key,
    nombre varchar(50),
    email varchar(100) unique,
    password varchar(100)
);

create table eventos (
	id int auto_increment primary key,
	fecha date,
    titulo varchar(100),
    ubicacion varchar(100),
    tipo varchar(50),
    descripcion text
);

create table galerias (
    id int auto_increment primary key,
    titulo varchar(100),
    id_evento int,
    foreign key (id_evento) references eventos(id)
);

create table imagenes (
    id int auto_increment primary key,
    titulo varchar(100),
    imagen varchar(255),
    id_galeria int,
    foreign key (id_galeria) references galerias(id)
);

create table favoritos (
    id_usuario int,
    id_evento int,
    primary key (id_usuario, id_evento),
    foreign key (id_usuario) references usuarios(id),
    foreign key (id_evento) references eventos(id)
);

/*INSERT USUARIOS*/

insert into usuarios (nombre, email, password) values
('jefe perez', 'jefe@gmail.com', '1234'),
('maria lopez', 'maria@gmail.com', '1234'),
('carlos sanchez', 'carlos@gmail.com', '1234');

/*INSERT EVENTOS*/

insert into eventos (fecha, titulo, ubicacion, tipo, descripcion) values
('2026-01-01', 'evento historico 1', 'madrid', 'musica', 'evento pasado'),
('2026-01-12', 'evento historico 2', 'barcelona', 'motor', 'evento pasado'),
('2026-01-24', 'evento historico 3', 'valencia', 'skate', 'evento pasado'),
('2026-06-05', 'drift spain 2026', 'circuito aspar', 'motor', 'evento de drift profesional'),
('2026-06-15', 'eurocrew navarra 2026', 'navarra', 'motor', 'evento de coches modificados'),
('2026-06-25', 'secret battle 2026', 'ubicacion secreta', 'motor', 'competicion de motor'),
('2026-09-26', 'lanna festival 2026', 'gijon', 'musica', 'festival de musica electronica'),
('2026-08-30', 'clausura festival 2026', 'españa', 'musica', 'festival musical'),
('2026-09-16', 'gochu skate contest 2026', 'noreña', 'skate', 'evento de skate'),
('2026-11-25', 'save the macba contest', 'barcelona', 'skate', 'competicion de skate');

/*INSERT GALERIAS*/

insert into galerias (titulo, id_evento) values
('galeria evento 1', 1),
('galeria evento 2', 2),
('galeria evento 3', 3);

/*INSERT IMAGENES*/

insert into imagenes (titulo, imagen, id_galeria) values
('secretbattle1', 'assets/img/eventos/eventospasados/secretbattle/galeriasecretbattle (1).jpg', 1),
('secretbattle2', 'assets/img/eventos/eventospasados/secretbattle/galeriasecretbattle (2).jpg', 1),
('secretbattle3', 'assets/img/eventos/eventospasados/secretbattle/galeriasecretbattle (3).jpg', 1),
('secretbattle4', 'assets/img/eventos/eventospasados/secretbattle/galeriasecretbattle (4).jpg', 1),
('secretbattle5', 'assets/img/eventos/eventospasados/secretbattle/galeriasecretbattle (5).jpg', 1);

insert into imagenes (titulo, imagen, id_galeria) values
('eurocrew1', 'assets/img/eventos/eventospasados/eurocrew/13s.png', 2),
('eurocrew2', 'assets/img/eventos/eventospasados/eurocrew/940.png', 2),
('eurocrew3', 'assets/img/eventos/eventospasados/eurocrew/ambiente.png', 2),
('eurocrew4', 'assets/img/eventos/eventospasados/eurocrew/escarabajo.png', 2),
('eurocrew5', 'assets/img/eventos/eventospasados/eurocrew/HW.png', 2);

insert into imagenes (titulo, imagen, id_galeria) values
('gochu1', 'assets/img/eventos/eventospasados/elgochu/galeriagochu (1).jpg', 3),
('gochu2', 'assets/img/eventos/eventospasados/elgochu/galeriagochu (2).jpg', 3),
('gochu3', 'assets/img/eventos/eventospasados/elgochu/galeriagochu (3).jpg', 3),
('gochu4', 'assets/img/eventos/eventospasados/elgochu/galeriagochu (4).jpg', 3),
('gochu5', 'assets/img/eventos/eventospasados/elgochu/galeriagochu (5).jpg', 3);

/*INSERT FAVORITOS*/

insert into favoritos (id_usuario, id_evento) values
(1,1),(1,2),(1,4),
(2,2),(2,3),(2,5),
(3,1),(3,3),(3,6);

/*CREACION DE VISTAS*/

/*galerias antes del 28-02-2026*/
create view galerias_pasadas as
select g.*
from galerias g
join eventos e on g.id_evento = e.id
where e.fecha < '2026-02-28';

/*favoritos del usuario 1*/
create view favoritos_usuario1 as
select *
from favoritos
where id_usuario = 1;

/*imagenes del evento con id 2*/
create view imagenes_evento2 as
select i.*
from imagenes i
join galerias g on i.id_galeria = g.id
where g.id_evento = 2;

/*favoritos del usuario 2 futuros*/
create view favoritos_usuario2_futuros as
select f.*
from favoritos f
join eventos e on f.id_evento = e.id
where f.id_usuario = 2
and e.fecha > '2026-02-28';