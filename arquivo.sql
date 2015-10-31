-- MySQL dump 10.13  Distrib 5.6.19, for Win64 (x86_64)
--
-- Host: localhost    Database: arqdesis
-- ------------------------------------------------------
-- Server version	5.6.19

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
-- Table structure for table `tb_cidade`
--

DROP TABLE IF EXISTS `tb_cidade`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tb_cidade` (
  `tb_cidade_id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `tb_cidade_uf` int(10) unsigned NOT NULL,
  `tb_cidade_descricao` varchar(100) NOT NULL,
  PRIMARY KEY (`tb_cidade_id`),
  KEY `tb_cidade_pais_fk` (`tb_cidade_uf`),
  CONSTRAINT `tb_cidade_pais_fk` FOREIGN KEY (`tb_cidade_uf`) REFERENCES `tb_uf` (`tb_uf_id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_cidade`
--

LOCK TABLES `tb_cidade` WRITE;
/*!40000 ALTER TABLE `tb_cidade` DISABLE KEYS */;
INSERT INTO `tb_cidade` VALUES (1,1,'SAO PAULO'),(2,2,'RIO DE JANEIRO'),(3,1,'CAMPINAS'),(4,1,'SANTO ANDRE');
/*!40000 ALTER TABLE `tb_cidade` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tb_cliente`
--

DROP TABLE IF EXISTS `tb_cliente`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tb_cliente` (
  `tb_cliente_id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `tb_cliente_descricao` varchar(50) NOT NULL,
  `tb_cliente_cpf` varchar(11) NOT NULL,
  `tb_cliente_rg` varchar(9) NOT NULL,
  `tb_cliente_telefone` decimal(11,0) NOT NULL,
  `tb_cliente_email` varchar(50) NOT NULL,
  `tb_cliente_dataNascimento` int(11) NOT NULL,
  `tb_cliente_sexo` char(1) NOT NULL,
  `tb_cliente_numeroRegistro` varchar(11) NOT NULL,
  `tb_cliente_estadoEmissor` int(10) unsigned NOT NULL,
  `tb_cliente_validadeCarteira` int(11) NOT NULL,
  PRIMARY KEY (`tb_cliente_id`),
  KEY `tb_cliente_estadoEmissor_fk` (`tb_cliente_estadoEmissor`),
  CONSTRAINT `tb_cliente_estadoEmissor_fk` FOREIGN KEY (`tb_cliente_estadoEmissor`) REFERENCES `tb_uf` (`tb_uf_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_cliente`
--

LOCK TABLES `tb_cliente` WRITE;
/*!40000 ALTER TABLE `tb_cliente` DISABLE KEYS */;
INSERT INTO `tb_cliente` VALUES (1,'Rafael','40390103888','472448006',67276833,'M',26101990,'M','2345678',1,0),(2,'Tiago Solci','54354212365','124568549',98745625,'tiago@teste.com',1011900,'m','7894568',3,20122098),(3,'Herick Mota','54999212365','124568578',97655625,'herick@teste.com',1011900,'m','7892168',1,20122080);
/*!40000 ALTER TABLE `tb_cliente` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tb_pais`
--

DROP TABLE IF EXISTS `tb_pais`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tb_pais` (
  `tb_pais_id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `tb_pais_descricao` varchar(100) NOT NULL,
  PRIMARY KEY (`tb_pais_id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_pais`
--

LOCK TABLES `tb_pais` WRITE;
/*!40000 ALTER TABLE `tb_pais` DISABLE KEYS */;
INSERT INTO `tb_pais` VALUES (1,'Brasil'),(2,'Estados Unidos'),(3,'China'),(4,'Japao'),(5,'Alemanha');
/*!40000 ALTER TABLE `tb_pais` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tb_uf`
--

DROP TABLE IF EXISTS `tb_uf`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tb_uf` (
  `tb_uf_id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `tb_uf_pais` int(10) unsigned NOT NULL,
  `tb_uf_descricao` varchar(100) NOT NULL,
  PRIMARY KEY (`tb_uf_id`),
  KEY `tb_uf_pais_fk` (`tb_uf_pais`),
  CONSTRAINT `tb_uf_pais_fk` FOREIGN KEY (`tb_uf_pais`) REFERENCES `tb_pais` (`tb_pais_id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_uf`
--

LOCK TABLES `tb_uf` WRITE;
/*!40000 ALTER TABLE `tb_uf` DISABLE KEYS */;
INSERT INTO `tb_uf` VALUES (1,1,'SP'),(2,1,'RJ'),(3,1,'MG'),(4,1,'BH'),(5,1,'SC'),(6,1,'AM');
/*!40000 ALTER TABLE `tb_uf` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tb_veiculo`
--

DROP TABLE IF EXISTS `tb_veiculo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tb_veiculo` (
  `tb_veiculo_id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `tb_veiculo_fabricante` varchar(50) NOT NULL,
  `tb_veiculo_modelo` varchar(35) NOT NULL,
  `tb_veiculo_chassi` varchar(25) NOT NULL,
  `tb_veiculo_placa` varchar(8) NOT NULL,
  `tb_veiculo_cidade` int(10) unsigned NOT NULL,
  `tb_veiculo_km` double(10,2) NOT NULL,
  `tb_veiculo_acessorio` varchar(35) NOT NULL,
  `tb_veiculo_grupo` varchar(1) NOT NULL,
  `tb_veiculo_kmControlada` double(5,2) NOT NULL,
  `tb_veiculo_kmLivre` double(5,2) NOT NULL,
  `tb_veiculo_locado` tinyint(1) NOT NULL,
  PRIMARY KEY (`tb_veiculo_id`),
  KEY `tb_veiculo_cidade_fk` (`tb_veiculo_cidade`),
  CONSTRAINT `tb_veiculo_cidade_fk` FOREIGN KEY (`tb_veiculo_cidade`) REFERENCES `tb_cidade` (`tb_cidade_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_veiculo`
--

LOCK TABLES `tb_veiculo` WRITE;
/*!40000 ALTER TABLE `tb_veiculo` DISABLE KEYS */;
INSERT INTO `tb_veiculo` VALUES (1,'FORD','New Fiesta','2334211235','EVV9878',4,5000.50,'','A',5.90,350.90,0),(2,'FORD','Focus','2334213335','RFD9878',1,35000.50,'','A',7.90,500.90,0),(3,'VOLKSWAGEN','Gol','345511235','ADE4321',4,75000.50,'','A',5.90,350.90,0);
/*!40000 ALTER TABLE `tb_veiculo` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2015-10-30 23:32:35
