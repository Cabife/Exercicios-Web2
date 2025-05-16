CREATE TABLE `forma_pagamento`
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `nome` varchar(100) NOT NULL,
  PRIMARY KEY (`id`)
  FOREIGN KEY (`nome`) REFERENCES cliente(`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;





CREATE TABLE `ordem_servico` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `descricao` varchar(100) NOT NULL,
  `data_emissao` date  NOT NULL,
  `dataFinalizacao` date NOT NULL,
  `valor` float(100) NOT NULL,
  `status` varchar(100) NOT NULL, 
	
  PRIMARY KEY (`id`)
  FOREIGN KEY (`id`) REFERENCES cliente(`id`)
  FOREIGN KEY (`id`) REFERENCES forma_pagamento(`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;