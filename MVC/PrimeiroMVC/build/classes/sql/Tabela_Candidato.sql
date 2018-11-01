/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  aluno
 * Created: 09/10/2018
 */

CREATE TABLE `candidato` (
  `idcandidato` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(45) NOT NULL,
  `lavajato` tinyint(4) DEFAULT NULL,
  `cpf` varchar(45) DEFAULT NULL,
  `partido` varchar(45) DEFAULT NULL,
  `numero` int(10) NOT NULL,
  PRIMARY KEY (`idcandidato`),
  UNIQUE KEY `numero_UNIQUE` (`numero`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8

insert into dependente (nome, grau, id_candidato) values("teste","teste",1)