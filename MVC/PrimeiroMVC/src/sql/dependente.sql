CREATE TABLE `dependente` (
  `id_dependente` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(45) DEFAULT NULL,
  `grau` varchar(45) DEFAULT NULL,
  `id_candidato` int(11) DEFAULT NULL,
  PRIMARY KEY (`id_dependente`),
  KEY `id_candidato_idx` (`id_candidato`),
  CONSTRAINT `id_candidato` FOREIGN KEY (`id_candidato`) REFERENCES `candidato` (`idcandidato`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8