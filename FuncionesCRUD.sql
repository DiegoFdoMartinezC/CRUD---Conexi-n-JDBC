create database Tienda_Jaramillos;
use Tienda_Jaramillos;

create table Clientes(
id int not null auto_increment primary key,
Nombres varchar(40) not null,
Apellidos varchar(40) not null,
Cedula bigint(18) not null
);

/* FUNCION INSERTAR */
INSERT INTO Clientes (Nombres,Apellidos,Cedula) 
VALUES ('Diego Fernando','Martinez Carvajal','1152197050'),('Fernando Felipe','Torres Cerron','1234567890');

/* FUNCION MOSTRAR */
select * from Clientes;

/* FUNCION ACTUALIZA */ 
UPDATE Clientes SET Clientes.Nombres = 'Juan Carlos', Clientes.Apellidos = 'Gallego Ruiz', Clientes.Cedula = '49780999' WHERE Clientes.id=1;

/* FUNCION ELIMINAR */ 

DELETE FROM Clientes WHERE Clientes.id=3
