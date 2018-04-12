create database clinicaprivada
use clinicaprivada

create table paciente(
	NUS int primary key,
	nombre varchar(20),
	primer_apellido varchar(20),
	segundo_apellido varchar(20),
	tlf int,
	fecha_nacimiento date,
	fecha_alta date,
	medicamentos varchar(100)
)

create table consulta(
	numConsulta int primary key
)

create table medico(
	idM int identity (1,1) primary key,
	apellido varchar(20),
	especialidad varchar(50),
	NUS int references paciente,
	numConsulta int references consulta
)

create table medicamento(
	idMe int check (idMe >= 0000 and idMe <= 9999) primary key,
	nombre varchar(50)
)

create table receta(
	idM int references medico,
	idMe int references medicamento,
	fecha_receta date
)

insert into paciente values
('123456789', 'Luisa', 'Garrido', 'Sánchez', '958412036','01/08/1985', '02/04/2014', 'Paracetamol, Amoxicilina'),
('521478963', 'Carlos', 'Diaz', 'Gutierrez', '654120369','15/01/1998', '25/12/2016', 'Butorfanol, Calcitonina'),
('362014785', 'Alfonso', 'Delgado', 'Muñoz', '758142036','20/10/1986', '04/10/2010', 'Difilina, Ecotiofato'),
('023654178', 'Rocio', 'Fernandez', 'Lopez', '698523014','24/06/2000', '24/11/2005', 'Escitalopram, Ibuprofeno'),
('985203614', 'Antonia', 'Ruiz', 'Mesa', '958741203','14/03/1999', '11/03/2008', 'Mucosan, Dalsy'),
('000254189', 'José', 'Cano', 'Pineda', '741025369','25/10/1956', '30/01/1999', 'Pectox')

insert into consulta values('001'),('002'),('003'),('004'),('005'),('006'),('007')
							,('008'),('009'),('010'),('085')

insert into medico values('Martos', 'Cirugia','123456789','004'),
('Fernandez', 'Pediatría','362014785','085'),
('Rodriguez','Traumatología','000254189','003'),
('Perez','Radiología','985203614','005'),
('Soto','Maternidad','362014785','010'),
('Mesa','Podología','521478963','009'),
('Nuñez','Cardiología','023654178','008'),
('Morales','Geriatría','985203614','010'),
('Cortes','Neurología','000254189','006')

insert into medicamento values('0000', 'Paracetamol'),('5894','Amoxicilina'),('2541','Butorfanol'),
('7895','Calcitonina'),('8541','Difilina'),('0214','Ecotiofato'),('3652','Escitalopram'),
('5210','Ibuprofeno'),('3698','Mucosan'),('3647','Dalsy'),('9412','Pectox')

