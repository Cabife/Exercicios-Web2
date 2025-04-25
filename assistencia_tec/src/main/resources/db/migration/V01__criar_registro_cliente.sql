CREATE TABLE `cliente` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) NOT NULL,
  `email` varchar(50) NOT NULL,
  `cpf` varchar(150) NOT NULL,
  `ativo` tinyint(1) NOT NULL,
  `logradouro` varchar(50) NOT NULL, 
  `numero` varchar(50) NOT NULL, 
  `complemento` varchar(50) NOT NULL, 
  `bairro`varchar(50) NOT NULL,
  `cidade`varchar(50) NOT NULL,
  `estado`varchar(50) NOT NULL,
  `CEP`varchar(10) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;






 





