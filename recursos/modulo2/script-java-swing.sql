-- Creando la base de datos
DROP DATABASE IF EXISTS atm;
CREATE DATABASE atm CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;

-- Usando la base de datos
USE atm;

-- Creando las tablas necesarias
DROP TABLE IF EXISTS usuario;
CREATE TABLE usuario (
  id int(11) NOT NULL AUTO_INCREMENT,
  tarjeta varchar(5) DEFAULT NULL,
  clave varchar(5) DEFAULT NULL,
  saldo decimal(10,2) DEFAULT NULL,
  PRIMARY KEY(id)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

DROP TABLE IF EXISTS movimiento;
CREATE TABLE movimiento (
  id_usuario int(11) DEFAULT NULL,
  tipo_movimiento varchar(1) DEFAULT NULL,
  monto decimal(10,2) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Relacionando las tablas
ALTER TABLE movimiento ADD CONSTRAINT fk_movimiento_usuario FOREIGN KEY (id_usuario) REFERENCES usuario(id) ON UPDATE CASCADE ON DELETE CASCADE;

-- Insertando datos de prueba
INSERT INTO usuario (tarjeta, clave, saldo) VALUES ("12345","12345",1200);
INSERT INTO usuario (tarjeta, clave, saldo) VALUES ("54321","12345",2000);
INSERT INTO movimiento (id_usuario, tipo_movimiento, monto) VALUES (1,"D",200);
INSERT INTO movimiento (id_usuario, tipo_movimiento, monto) VALUES (1,"R",100);
INSERT INTO movimiento (id_usuario, tipo_movimiento, monto) VALUES (1,"D",1100);
INSERT INTO movimiento (id_usuario, tipo_movimiento, monto) VALUES (2,"D",2000);
INSERT INTO movimiento (id_usuario, tipo_movimiento, monto) VALUES (2,"R",1000);
INSERT INTO movimiento (id_usuario, tipo_movimiento, monto) VALUES (2,"D",1000);
