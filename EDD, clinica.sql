DROP DATABASE IF EXISTS clinicaprivada;
CREATE DATABASE clinicaprivada;
USE clinicaprivada;

CREATE TABLE `consulta` (
  `numConsulta` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `consulta`
--

INSERT INTO `consulta` (`numConsulta`) VALUES
(1),
(2),
(3),
(4),
(5),
(6),
(7),
(8),
(9),
(10),
(85);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `medicamento`
--

CREATE TABLE `medicamento` (
  `idMe` int(11) NOT NULL,
  `nombre` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `medicamento`
--

INSERT INTO `medicamento` (`idMe`, `nombre`) VALUES
(0, 'Paracetamol'),
(214, 'Ecotiofato'),
(2541, 'Butorfanol'),
(3647, 'Dalsy'),
(3652, 'Escitalopram'),
(3698, 'Mucosan'),
(5210, 'Ibuprofeno'),
(5894, 'Amoxicilina'),
(7895, 'Calcitonina'),
(8541, 'Difilina'),
(9412, 'Pectox');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `medico`
--

CREATE TABLE `medico` (
  `idM` int(11) NOT NULL,
  `apellido` varchar(20) DEFAULT NULL,
  `especialidad` varchar(50) DEFAULT NULL,
  `NUS` int(11) DEFAULT NULL,
  `numConsulta` int(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `medico`
--

INSERT INTO `medico` (`idM`, `apellido`, `especialidad`, `NUS`, `numConsulta`) VALUES
(1122, 'Soto', 'Maternidad', 362014785, 10),
(2030, 'Martos', 'Cirugia', 123456789, 4),
(3040, 'Fernandez', 'Pediatría', 362014785, 85),
(3322, 'Morales', 'Geriatría', 985203614, 10),
(4455, 'Nuñez', 'Cardiología', 23654178, 8),
(5060, 'Rodriguez', 'Traumatología', 254189, 3),
(5891, 'Perez', 'Radiología', 985203614, 5),
(6985, 'Mesa', 'Podología', 521478963, 9),
(9900, 'Cortes', 'Neurología', 254189, 6);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `paciente`
--

CREATE TABLE `paciente` (
  `NUS` int(11) NOT NULL,
  `nombre` varchar(20) DEFAULT NULL,
  `primer_apellido` varchar(20) DEFAULT NULL,
  `segundo_apellido` varchar(20) DEFAULT NULL,
  `tlf` int(11) DEFAULT NULL,
  `fecha_nacimiento` date DEFAULT NULL,
  `fecha_alta` date DEFAULT NULL,
  `medicamentos` int(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `paciente`
--

INSERT INTO `paciente` (`NUS`, `nombre`, `primer_apellido`, `segundo_apellido`, `tlf`, `fecha_nacimiento`, `fecha_alta`, `medicamentos`) VALUES
(12345678, 'Luisa', 'Garrido', 'Sanchez', 958412036, '1980-02-03', '2000-01-01', 2541),
(23654178, 'Rocio', 'Fernandez', 'Lopez', 698523014, '1993-01-20', '2002-06-06', 214),
(25418944, 'Jose', 'Cano', 'Pineda', 741025369, '1970-05-31', '1980-03-04', 0),
(36201478, 'Alfonso', 'Delgado', 'Muñoz', 758142036, '1964-03-24', '1984-06-05', 9412),
(52147896, 'Carlos', 'Diaz', 'Gutierrez', 654120369, '1999-03-01', '2000-03-01', 7895),
(98520361, 'Antonia', 'Ruiz', 'Mesa', 958741203, '2000-01-01', '2018-04-12', 5210);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `receta`
--

CREATE TABLE `receta` (
  `idMedicamento` int(10) DEFAULT NULL,
  `idMedico` int(11) DEFAULT NULL,
  `Paciente` int(11) NOT NULL,
  `fecha_receta` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `receta`
--

INSERT INTO `receta` (`idMedicamento`, `idMedico`, `Paciente`, `fecha_receta`) VALUES
(0, 3040, 52147896, '2002-02-08'),
(214, 3040, 25418944, '2000-04-17'),
(3698, 5060, 12345678, '2012-09-17'),
(5894, 1122, 12345678, '2003-03-12'),
(5894, 4455, 98520361, '2015-11-23'),
(7895, 5891, 36201478, '2014-01-13');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `consulta`
--
ALTER TABLE `consulta`
  ADD PRIMARY KEY (`numConsulta`);

--
-- Indices de la tabla `medicamento`
--
ALTER TABLE `medicamento`
  ADD PRIMARY KEY (`idMe`);

--
-- Indices de la tabla `medico`
--
ALTER TABLE `medico`
  ADD PRIMARY KEY (`idM`),
  ADD KEY `medicoConsulta` (`numConsulta`);

--
-- Indices de la tabla `paciente`
--
ALTER TABLE `paciente`
  ADD PRIMARY KEY (`NUS`),
  ADD KEY `pacienteMedicamentos` (`medicamentos`);

--
-- Indices de la tabla `receta`
--
ALTER TABLE `receta`
  ADD KEY `idM` (`idMedicamento`),
  ADD KEY `idMe` (`idMedico`),
  ADD KEY `Paciente` (`Paciente`),
  ADD KEY `idMedicamento` (`idMedicamento`,`idMedico`,`Paciente`,`fecha_receta`),
  ADD KEY `idMedicamento_2` (`idMedicamento`,`idMedico`,`Paciente`,`fecha_receta`);

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `medico`
--
ALTER TABLE `medico`
  ADD CONSTRAINT `medicoConsulta` FOREIGN KEY (`numConsulta`) REFERENCES `consulta` (`numConsulta`) ON DELETE SET NULL ON UPDATE SET NULL;

--
-- Filtros para la tabla `paciente`
--
ALTER TABLE `paciente`
  ADD CONSTRAINT `pacienteMedicamentos` FOREIGN KEY (`medicamentos`) REFERENCES `medicamento` (`idMe`) ON DELETE SET NULL ON UPDATE SET NULL;

--
-- Filtros para la tabla `receta`
--
ALTER TABLE `receta`
  ADD CONSTRAINT `recetaMedicamento` FOREIGN KEY (`idMedicamento`) REFERENCES `medicamento` (`idMe`) ON DELETE SET NULL ON UPDATE SET NULL,
  ADD CONSTRAINT `recetaMedico` FOREIGN KEY (`idMedico`) REFERENCES `medico` (`idM`) ON DELETE SET NULL ON UPDATE SET NULL,
  ADD CONSTRAINT `recetaPaciente` FOREIGN KEY (`Paciente`) REFERENCES `paciente` (`NUS`) ON DELETE CASCADE ON UPDATE CASCADE;
