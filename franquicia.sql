-- MySQL dump 10.13  Distrib 5.7.29, for Linux (x86_64)
--
-- Host: localhost    Database: FRANQUICIA
-- ------------------------------------------------------
-- Server version	5.7.29-0ubuntu0.18.04.1

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `CLIENTES`
--

DROP TABLE IF EXISTS `CLIENTES`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `CLIENTES` (
  `ID_CLIENTE` bigint(20) NOT NULL AUTO_INCREMENT,
  `APELIDOS` varchar(255) DEFAULT NULL,
  `EMAIL` varchar(255) DEFAULT NULL,
  `NOME` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ID_CLIENTE`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `CLIENTES`
--

LOCK TABLES `CLIENTES` WRITE;
/*!40000 ALTER TABLE `CLIENTES` DISABLE KEYS */;
/*!40000 ALTER TABLE `CLIENTES` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `EMPREGADOS`
--

DROP TABLE IF EXISTS `EMPREGADOS`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `EMPREGADOS` (
  `ID_EMPREGADO` bigint(20) NOT NULL AUTO_INCREMENT,
  `APELIDOS` varchar(255) DEFAULT NULL,
  `NOME` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ID_EMPREGADO`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `EMPREGADOS`
--

LOCK TABLES `EMPREGADOS` WRITE;
/*!40000 ALTER TABLE `EMPREGADOS` DISABLE KEYS */;
/*!40000 ALTER TABLE `EMPREGADOS` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `PRODUCTOS`
--

DROP TABLE IF EXISTS `PRODUCTOS`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `PRODUCTOS` (
  `ID_PRODUCTO` bigint(20) NOT NULL AUTO_INCREMENT,
  `DESCRIPCION` varchar(255) DEFAULT NULL,
  `NOME` varchar(255) DEFAULT NULL,
  `PREZO` double DEFAULT NULL,
  PRIMARY KEY (`ID_PRODUCTO`)
) ENGINE=MyISAM AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `PRODUCTOS`
--

LOCK TABLES `PRODUCTOS` WRITE;
/*!40000 ALTER TABLE `PRODUCTOS` DISABLE KEYS */;
INSERT INTO `PRODUCTOS` VALUES (1,'fdsf','fdsf',50);
/*!40000 ALTER TABLE `PRODUCTOS` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `TENDAS`
--

DROP TABLE IF EXISTS `TENDAS`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `TENDAS` (
  `ID_TENDAS` bigint(20) NOT NULL AUTO_INCREMENT,
  `CIDADE` varchar(255) DEFAULT NULL,
  `NOME` varchar(255) DEFAULT NULL,
  `PROVINCIA` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`ID_TENDAS`)
) ENGINE=MyISAM AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `TENDAS`
--

LOCK TABLES `TENDAS` WRITE;
/*!40000 ALTER TABLE `TENDAS` DISABLE KEYS */;
INSERT INTO `TENDAS` VALUES (1,'fdsf','fdsf',4);
/*!40000 ALTER TABLE `TENDAS` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `TENDAS_EMPLEADOS`
--

DROP TABLE IF EXISTS `TENDAS_EMPLEADOS`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `TENDAS_EMPLEADOS` (
  `ID` bigint(20) NOT NULL AUTO_INCREMENT,
  `NUMERO_HORAS_SEMANA` int(11) DEFAULT NULL,
  `EMPREGADO_ID` bigint(20) DEFAULT NULL,
  `TENDA_ID` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `FKl8i6pim6si5cx37odn49cbtlf` (`EMPREGADO_ID`),
  KEY `FK4xl5ymco5bq00dlpem3q8p368` (`TENDA_ID`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `TENDAS_EMPLEADOS`
--

LOCK TABLES `TENDAS_EMPLEADOS` WRITE;
/*!40000 ALTER TABLE `TENDAS_EMPLEADOS` DISABLE KEYS */;
/*!40000 ALTER TABLE `TENDAS_EMPLEADOS` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `TENDAS_EMPREGADOS`
--

DROP TABLE IF EXISTS `TENDAS_EMPREGADOS`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `TENDAS_EMPREGADOS` (
  `ID` bigint(20) NOT NULL AUTO_INCREMENT,
  `NUMERO_HORAS_SEMANA` int(11) DEFAULT NULL,
  `EMPREGADO_ID` bigint(20) NOT NULL,
  `TENDA_ID` bigint(20) NOT NULL,
  PRIMARY KEY (`ID`),
  KEY `FK60lohtn23rfmskriyqifs42ik` (`EMPREGADO_ID`),
  KEY `FK57ow7ogl494jkhq4ytdqymy7y` (`TENDA_ID`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `TENDAS_EMPREGADOS`
--

LOCK TABLES `TENDAS_EMPREGADOS` WRITE;
/*!40000 ALTER TABLE `TENDAS_EMPREGADOS` DISABLE KEYS */;
/*!40000 ALTER TABLE `TENDAS_EMPREGADOS` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `TENDAS_PRODUCTOS`
--

DROP TABLE IF EXISTS `TENDAS_PRODUCTOS`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `TENDAS_PRODUCTOS` (
  `ID` bigint(20) NOT NULL AUTO_INCREMENT,
  `STOCK` int(11) DEFAULT NULL,
  `PRODUCTO_ID` bigint(20) DEFAULT NULL,
  `TENDA_ID` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `FKesvbajk2oe029nt6yyyes70l6` (`PRODUCTO_ID`),
  KEY `FKsykxfqc5n8k4fbd0m5pb6vs33` (`TENDA_ID`)
) ENGINE=MyISAM AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `TENDAS_PRODUCTOS`
--

LOCK TABLES `TENDAS_PRODUCTOS` WRITE;
/*!40000 ALTER TABLE `TENDAS_PRODUCTOS` DISABLE KEYS */;
INSERT INTO `TENDAS_PRODUCTOS` VALUES (1,60,1,1);
/*!40000 ALTER TABLE `TENDAS_PRODUCTOS` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `hibernate_sequence`
--

DROP TABLE IF EXISTS `hibernate_sequence`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `hibernate_sequence` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `hibernate_sequence`
--

LOCK TABLES `hibernate_sequence` WRITE;
/*!40000 ALTER TABLE `hibernate_sequence` DISABLE KEYS */;
INSERT INTO `hibernate_sequence` VALUES (2);
/*!40000 ALTER TABLE `hibernate_sequence` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-02-21 23:28:56
