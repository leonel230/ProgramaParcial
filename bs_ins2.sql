CREATE DATABASE bs_ins3;
USE bs_ins3;
CREATE TABLE alumnos
(

ID int (20) auto_increment PRIMARY KEY,
CodigoCarne varchar(10)NOT NULL,
NombreEstudiante varchar(60)NOT NULL,
DirreccionEstudiante varchar(60)NOT NULL,
TelefonoEstudiante varchar(60)NOT NULL,
CorreoElectronicoEstudiante varchar(60)NOT NULL,
EstatusEstudiante varchar(1)
)ENGINE=InnoDB;
create table maestros
(
ID int (20) auto_increment PRIMARY KEY,
CodigoMaestro Varchar (10) NOT NULL,
NombreMaestro Varchar (60) NOT NULL,
DirrecionMaestro Varchar (60) NOT NULL,
TelefonoMaestro Varchar (60) NOT NULL,
CorreoEletronicoMaestro Varchar (60) NOT NULL,
EstatusMaestro Varchar (1)
) ENGINE=InnoDB;
