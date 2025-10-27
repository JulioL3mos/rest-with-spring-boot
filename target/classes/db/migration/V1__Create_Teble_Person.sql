CREATE DATABASE IF NOT EXISTS `rest_with_spring_boot` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `rest_with_spring_boot`;

-- Copiando estrutura para tabela rest_with_spring_boot.person
CREATE TABLE IF NOT EXISTS `person` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `firs_name` varchar(80) NOT NULL,
  `last_name` varchar(80) NOT NULL,
  `address` varchar(100) NOT NULL,
  `gender` varchar(6) NOT NULL,
  PRIMARY KEY (`id`)
);
