CREATE DATABASE  IF NOT EXISTS `workshop` /*!40100 DEFAULT CHARACTER SET gbk */;
USE `workshop`;
-- MySQL dump 10.13  Distrib 5.6.13, for osx10.6 (i386)
--
-- Host: 127.0.0.1    Database: workshop
-- ------------------------------------------------------
-- Server version	5.6.16

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
-- Table structure for table `active_machine_historydata`
--

DROP TABLE IF EXISTS `active_machine_historydata`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `active_machine_historydata` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `machineID` char(20) DEFAULT NULL,
  `workshopID` char(20) DEFAULT NULL,
  `time` datetime DEFAULT NULL,
  `moveTime` int(11) DEFAULT NULL,
  `restTime` int(11) DEFAULT NULL,
  `displacement` int(11) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `active_machine_tool_information`
--

DROP TABLE IF EXISTS `active_machine_tool_information`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `active_machine_tool_information` (
  `ID` char(50) NOT NULL DEFAULT '',
  `time` datetime NOT NULL,
  `moveTime` int(11) DEFAULT NULL,
  `restTime` int(11) DEFAULT NULL,
  `displacement` float NOT NULL,
  `sTime` int(11) DEFAULT NULL,
  `machine` char(40) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `dynamic_workshop_historydata`
--

DROP TABLE IF EXISTS `dynamic_workshop_historydata`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `dynamic_workshop_historydata` (
  `ID` char(15) NOT NULL DEFAULT '',
  `workshopID` char(5) DEFAULT NULL,
  `temperature` int(11) NOT NULL,
  `humidity` int(11) DEFAULT NULL,
  `noise` int(11) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `dynamic_workshop_information`
--

DROP TABLE IF EXISTS `dynamic_workshop_information`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `dynamic_workshop_information` (
  `ID` char(15) NOT NULL DEFAULT '',
  `workshopID` char(5) DEFAULT NULL,
  `temperature` int(11) NOT NULL,
  `humidity` int(11) DEFAULT NULL,
  `noise` int(11) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `machine_condition`
--

DROP TABLE IF EXISTS `machine_condition`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `machine_condition` (
  `machineID` char(50) NOT NULL,
  `time` datetime DEFAULT NULL,
  `moveTime` int(11) DEFAULT NULL,
  `restTime` int(11) DEFAULT NULL,
  `displacement` float DEFAULT NULL,
  `sTime` int(11) DEFAULT NULL,
  `machine_condition` char(20) DEFAULT NULL,
  PRIMARY KEY (`machineID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `machine_tool_information`
--

DROP TABLE IF EXISTS `machine_tool_information`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `machine_tool_information` (
  `ID` char(40) NOT NULL DEFAULT '',
  `type` char(20) DEFAULT NULL,
  `mNumber` char(10) DEFAULT NULL,
  `sNumber` char(30) DEFAULT NULL,
  `workshop` char(5) DEFAULT NULL,
  `manufacture` char(50) DEFAULT NULL,
  `pDate` datetime DEFAULT NULL,
  `workerID` char(10) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `manufacturer`
--

DROP TABLE IF EXISTS `manufacturer`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `manufacturer` (
  `ID` char(30) NOT NULL DEFAULT '',
  `name` char(50) DEFAULT NULL,
  `pancipal` char(10) DEFAULT NULL,
  `phone` char(20) DEFAULT NULL,
  `address` char(60) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `profession`
--

DROP TABLE IF EXISTS `profession`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `profession` (
  `ID` char(20) NOT NULL DEFAULT '',
  `name` char(40) NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `worker`
--

DROP TABLE IF EXISTS `worker`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `worker` (
  `ID` char(10) NOT NULL DEFAULT '',
  `name` char(50) NOT NULL,
  `Authority` char(1) NOT NULL,
  `IDCard` char(18) NOT NULL,
  `profession` char(20) DEFAULT NULL,
  `pNumber` decimal(10,0) DEFAULT NULL,
  `sex` char(2) DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  `address` varchar(30) DEFAULT NULL,
  `email` char(50) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  UNIQUE KEY `IDCard` (`IDCard`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `workshop`
--

DROP TABLE IF EXISTS `workshop`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `workshop` (
  `ID` char(5) NOT NULL DEFAULT '',
  `type` char(10) DEFAULT NULL,
  `bTime` datetime DEFAULT NULL,
  `manufacture` char(30) DEFAULT NULL,
  `principal` char(10) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2014-06-21 10:26:49
