create database proyecto_happiness;
use proyecto_happiness;

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

insert into usuarios (nombre, email, password) values
('jefe perez', 'jefe@gmail.com', '1234'),
('maria lopez', 'maria@gmail.com', '1234'),
('carlos sanchez', 'carlos@gmail.com', '1234');

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