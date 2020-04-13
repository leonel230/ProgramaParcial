create database covid;
use covid;

create table empleados(
codigoNombre varchar(50) primary key,
codigoTelefono varchar(10) not null,
codigoDireccion varchar(20) not null
)engine =  InnoDB;

create table departamento(
codigoDepartamento varchar(30) primary key,
codigoPuesto varchar(20) not null
)engine = InnoDB;

