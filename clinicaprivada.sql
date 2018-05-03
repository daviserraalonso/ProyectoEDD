-- phpMyAdmin SQL Dump
-- version 4.6.5.2
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 04-05-2018 a las 00:01:02
-- Versión del servidor: 10.1.21-MariaDB
-- Versión de PHP: 5.6.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `clinicaprivada`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `consulta`
--

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
  `idMedicamento` int(11) NOT NULL,
  `NombreMedicamento` varchar(20) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Volcado de datos para la tabla `medicamento`
--

INSERT INTO `medicamento` (`idMedicamento`, `NombreMedicamento`) VALUES
(0, 'Paracetamol'),
(2, 'Dalsy'),
(14, 'Priamida'),
(15, 'Bromcom'),
(214, 'Gelocatil'),
(3698, 'Foscom'),
(5894, 'Dalsy'),
(7895, 'Levetiracetam');

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
  `DNI` varchar(9) COLLATE utf8_unicode_ci NOT NULL,
  `nombre` varchar(20) CHARACTER SET latin1 DEFAULT NULL,
  `primer_apellido` varchar(20) CHARACTER SET latin1 DEFAULT NULL,
  `segundo_apellido` varchar(20) CHARACTER SET latin1 DEFAULT NULL,
  `tlf` int(11) DEFAULT NULL,
  `Calle` varchar(20) COLLATE utf8_unicode_ci NOT NULL,
  `Localidad` varchar(20) COLLATE utf8_unicode_ci NOT NULL,
  `fecha_nacimiento` date DEFAULT NULL,
  `fecha_alta` date DEFAULT NULL,
  `Medico` int(11) NOT NULL,
  `Historial` varchar(400) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Volcado de datos para la tabla `paciente`
--

INSERT INTO `paciente` (`NUS`, `DNI`, `nombre`, `primer_apellido`, `segundo_apellido`, `tlf`, `Calle`, `Localidad`, `fecha_nacimiento`, `fecha_alta`, `Medico`, `Historial`) VALUES
(12345678, '45921676z', 'Luisa', 'Garrido', 'Sanchez', 958412036, 'C\\ Aurora', 'Granada', '1980-02-03', '2000-01-01', 1122, 'Fiebre'),
(23654178, '12345678j', 'Rocio', 'Fernandez', 'Lopez', 698523014, 'Avda. andalucia', 'Guadix', '1993-01-20', '2002-06-06', 2030, 'Catarro'),
(25418944, '14785235h', 'Jose', 'Cano', 'Pineda', 741025369, 'C\\ El colmenar', 'El padul', '1970-05-31', '1980-03-04', 3040, 'Tumor'),
(36201478, '78945615f', 'Alfonso', 'Delgado', 'Muñoz', 758142036, 'Barriada la cuna', 'Córdoba', '1964-03-24', '1984-06-05', 3322, 'Apendicitis'),
(52147896, '83469752b', 'Carlos', 'Diaz', 'Gutierrez', 654120369, 'C\\ Buenos Aires', 'Purullena', '1999-03-01', '2000-03-01', 3322, 'Lumbalgia'),
(98520361, '34741522e', 'Antonia', 'Ruiz', 'Mesa', 958741203, 'C\\ Las viñas', 'Benalúa', '2000-01-01', '2018-04-12', 4455, 'Gastroenteritis');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `receta`
--

CREATE TABLE `receta` (
  `idMedicamento` int(10) DEFAULT NULL,
  `idMedico` int(11) DEFAULT NULL,
  `Paciente` int(11) NOT NULL,
  `fecha_receta` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci ROW_FORMAT=COMPACT;

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
  ADD PRIMARY KEY (`idMedicamento`);

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
  ADD KEY `fkPacienteMedico` (`Medico`);

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
  ADD CONSTRAINT `fkPacienteMedico` FOREIGN KEY (`Medico`) REFERENCES `medico` (`idM`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `receta`
--
ALTER TABLE `receta`
  ADD CONSTRAINT `recetaMedicamento` FOREIGN KEY (`idMedicamento`) REFERENCES `medicamento` (`idMedicamento`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `recetaMedico` FOREIGN KEY (`idMedico`) REFERENCES `medico` (`idM`) ON DELETE SET NULL ON UPDATE SET NULL,
  ADD CONSTRAINT `recetaPaciente` FOREIGN KEY (`Paciente`) REFERENCES `paciente` (`NUS`) ON DELETE NO ACTION ON UPDATE NO ACTION;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
