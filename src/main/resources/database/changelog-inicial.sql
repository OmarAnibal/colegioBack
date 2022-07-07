-- liquibase formatted sql

-- changeset Anibal:1
-- comment: Creacion de tablas para el proyecto colegio

CREATE TABLE pais(
pais_id INT PRIMARY KEY AUTO_INCREMENT,
pais_nombre VARCHAR (40) NOT NULL 
);

CREATE TABLE departamento (
dep_id INT PRIMARY KEY AUTO_INCREMENT,
dep_nombre VARCHAR (45) NOT NULL,
pais_id int NOT NULL,
FOREIGN KEY (pais_id) REFERENCES pais(pais_id)
);

CREATE TABLE municipio (
mun_id INT PRIMARY KEY AUTO_INCREMENT,
mun_nombre VARCHAR (45) NOT NULL,
dep_id INT NOT NULL,
FOREIGN KEY (dep_id) REFERENCES departamento(dep_id)
);

CREATE TABLE prestamo_biblioteca (
pres_id INT PRIMARY KEY AUTO_INCREMENT,
pres_nombre VARCHAR (45) NOT NULL,
pres_autor VARCHAR (45)
);

CREATE TABLE producto (
pro_id INT PRIMARY KEY AUTO_INCREMENT,
pro_nombre VARCHAR (45) NOT NULL,
pro_proveedor varchar(50),
pro_descripcion VARCHAR (45),
pro_precio double NOT NULL,
pro_cantidad int 
);

CREATE TABLE tipo_identificacion(
ti_id INT PRIMARY KEY AUTO_INCREMENT,
ti_nombre VARCHAR (5) NOT NULL,
ti_descripcion VARCHAR (40)
);


CREATE TABLE persona(
per_id INT AUTO_INCREMENT PRIMARY KEY,
per_nombre VARCHAR (45) NOT NULL,
per_apellido VARCHAR (45),
per_direccion VARCHAR (45) NOT NULL,
per_email VARCHAR (45) NOT NULL,
per_telefono INT NOT NULL,
numero VARCHAR(15) NOT NULL,
mun_id INT NOT NULL,
ti_id INT NOT NULL,
FOREIGN KEY (mun_id) REFERENCES municipio(mun_id),
FOREIGN KEY (ti_id) REFERENCES tipo_identificacion(ti_id)
);

CREATE TABLE producto_persona (
pro_per_id INT AUTO_INCREMENT PRIMARY KEY,
pro_id int NOT NULL,
per_id int NOT NULL,
FOREIGN KEY (pro_id) REFERENCES producto(pro_id),
FOREIGN KEY (per_id) REFERENCES persona(per_id)
);


-- changeset Anibal:2
-- comment: SE INGRESAN DATOS A LAS TABLAS


# DATOS TIPO DE INDENTIFICACION

INSERT INTO tipo_identificacion(ti_nombre, ti_descripcion) VALUES ('C.C', 'CEDULA DE CIUDADANIA');
INSERT INTO tipo_identificacion(ti_nombre, ti_descripcion) VALUES ('T.I', 'TARJETA DE IDENTIDAD');
INSERT INTO tipo_identificacion(ti_nombre, ti_descripcion) VALUES ('R.C', 'REGISTRO CIVIL');
INSERT INTO tipo_identificacion(ti_nombre, ti_descripcion) VALUES ('C.E', 'CEDULA DE EXTRANJERIA');


#DATOS PRODUCTOS

insert into producto(pro_nombre, pro_proveedor, pro_descripcion, pro_precio, pro_cantidad) values('Laptop HP','HP','Las mejores laptop',155.69,50);
insert into producto(pro_nombre, pro_proveedor, pro_descripcion, pro_precio, pro_cantidad) values('Mouse','Logitech','Las mejores mouse',20.86,30);
insert into producto(pro_nombre, pro_proveedor, pro_descripcion, pro_precio, pro_cantidad) values('Teclado','Logitech','Las mejores teclados',80.12,100);
insert into producto(pro_nombre, pro_proveedor, pro_descripcion, pro_precio, pro_cantidad) values('Laptop DELL','Dell','Las mejores laptop',200.8,15);
insert into producto(pro_nombre, pro_proveedor, pro_descripcion, pro_precio, pro_cantidad) values('Pantalla','HP','Las mejores Pantallas',155.69,50);
insert into producto(pro_nombre, pro_proveedor, pro_descripcion, pro_precio, pro_cantidad) values('Impresora','HP','Las mejores Impresoras',155,70);
insert into producto(pro_nombre, pro_proveedor, pro_descripcion, pro_precio, pro_cantidad) values('Camaras','logitech','Las mejores Camaras',500,20);
insert into producto(pro_nombre, pro_proveedor, pro_descripcion, pro_precio, pro_cantidad) values('Xbox 360','Xbox Microsoft','Las mejores Consolas',103,10);
insert into producto(pro_nombre, pro_proveedor, pro_descripcion, pro_precio, pro_cantidad) values('PlayStation 4','Sony','Las mejores play',15.69,50);
insert into producto(pro_nombre, pro_proveedor, pro_descripcion, pro_precio, pro_cantidad) values('Lenovo 310','Lenovo','Las mejores laptop',155.69,50);


#PAIS

INSERT INTO pais(pais_nombre) VALUES ('COLOMBIA');
INSERT INTO pais(pais_nombre) VALUES ('VENEZUELA');
INSERT INTO pais(pais_nombre) VALUES ('MEXICO');
INSERT INTO pais(pais_nombre) VALUES ('PERU');
INSERT INTO pais(pais_nombre) VALUES ('BOLIVIA');
INSERT INTO pais(pais_nombre) VALUES ('ARGENTINA');
INSERT INTO pais(pais_nombre) VALUES ('CHILE');


#DEPARTAMENTO
INSERT INTO departamento(dep_nombre,pais_id) VALUES ('CUNDINAMARCA',1);
INSERT INTO departamento(dep_nombre,pais_id) VALUES ('HUILA',1);
INSERT INTO departamento(dep_nombre,pais_id) VALUES ('BOYACA',1);
INSERT INTO departamento(dep_nombre,pais_id) VALUES ('CARACAS',2);
INSERT INTO departamento(dep_nombre,pais_id) VALUES ('CIUDAD DE MEXICO',3);
INSERT INTO departamento(dep_nombre,pais_id) VALUES ('LIMA',4);
INSERT INTO departamento(dep_nombre,pais_id) VALUES ('SUCRE',5);
INSERT INTO departamento(dep_nombre,pais_id) VALUES ('BUENOS AIRES',6);
INSERT INTO departamento(dep_nombre,pais_id) VALUES ('SANTIAGO DE CHILE',7);




#MUNICIPIO

INSERT INTO municipio(mun_nombre,dep_id) VALUES ('BOGOTA',1);
INSERT INTO municipio(mun_nombre,dep_id) VALUES ('NEIVA',2);
INSERT INTO municipio(mun_nombre,dep_id) VALUES ('TUNJA',3);
INSERT INTO municipio(mun_nombre,dep_id) VALUES ('CARACAS',4);
INSERT INTO municipio(mun_nombre,dep_id) VALUES ('MEXICO',5);
INSERT INTO municipio(mun_nombre,dep_id) VALUES ('LIMA',6);
INSERT INTO municipio(mun_nombre,dep_id) VALUES ('SUCRE',7);
INSERT INTO municipio(mun_nombre,dep_id) VALUES ('BUENOS AIRES',8);
INSERT INTO municipio(mun_nombre,dep_id) VALUES ('METROPOLITANA',9);



-- changeset Anibal:3
-- comment: SE AGREGA CAMPO Y LLAVE FORANEA DE PERSONA A PRESTAMO_BIBLIOTECA


ALTER TABLE prestamo_biblioteca ADD per_id INT NULL ;

ALTER TABLE prestamo_biblioteca ADD CONSTRAINT fk_per_id 
FOREIGN KEY(per_id) REFERENCES persona(per_id);



-- changeset Anibal:4
-- comment: DATOS PRESTAMO BIBLIOTECA

insert into prestamo_biblioteca(pres_nombre, pres_autor) values('100 años de soledad','Gabriel Garcia Marquez');
insert into prestamo_biblioteca(pres_nombre, pres_autor) values('El coronel no tiene quien le escriba','Gabriel Garcia Marquez');
insert into prestamo_biblioteca(pres_nombre, pres_autor) values('La hojarasca','Gabriel Garcia Marquez');
insert into prestamo_biblioteca(pres_nombre, pres_autor) values('El principito','Antoine de Saint-Exupéry');
insert into prestamo_biblioteca(pres_nombre, pres_autor) values('Los renglones torcidos de Dios','Torcuato Luca de Tena Brunet');
insert into prestamo_biblioteca(pres_nombre, pres_autor) values('La milla vergde','Stephen King');
insert into prestamo_biblioteca(pres_nombre, pres_autor) values('El Umbral de la Noche"','Stephen King');
insert into prestamo_biblioteca(pres_nombre, pres_autor) values('El resplandor','Stephen King');


-- changeset Anibal:5
-- comment: SE AÑADE CAMPO ESTADO A LA BIBLIOTECA

ALTER TABLE prestamo_biblioteca ADD estado BOOLEAN NOT NULL;

