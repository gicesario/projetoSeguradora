# Dillinger

[![N|Solid](https://cldup.com/dTxpPi9lDf.thumb.png)](https://nodesource.com/products/nsolid)

[![Build Status](https://travis-ci.org/joemccann/dillinger.svg?branch=master)](https://travis-ci.org/joemccann/dillinger)

Projeto de um CRUD para uma seguradora de veículos utilizando: MongoDB, Spring e Gradle

  - Spring boot
  - MongoDB
  - Grade
  - application.yml

### Installation

 - Atualizar o application.yml com a informações:
 - Servidor: endereço e porta
 - MongoDB: database, host, porta, usuário e senha  
 
O arquivo appycation.yml se encontra no diretório ..\seguradoraGisela\build\resources\main

* Atualizar informações do Servidor
```sh
server:
  address: #endereço IP
  port: #porta padrão do servidor de aplicação
```
* Atualizar informações do MongoDB
```sh
spring:
  data.mongodb:
    authentication-database: #admin
    password: #senha
    username: #usuario
    host: endereço IP onde o MongoDB estará hospedado
    port: porta 
    uri: #uri
    database: seguradoraGisela
```
### Executar aplicação
* Execute o arquivo runApp.bat. Este bat deve apontar para a JRE da máquina
```sh
$ cmd runApp
```

### URIs
* Inserir cliente <ip>:<porta>/seguradora/clientes/insereCliente
  * Request-Body:
  {
    "nomeCompleto": "Gisela",
    "cpf": "LGPD informação",
    "cidade": "Curitiba",
    "uf": "PR"
}
* Inserir Apolice <ip>:<porta>/seguradora/apolices/insereApolice
  * Request-Body:
  {
	"inicioVigencia": "2020-09-05",
	"fimVigencia": "2020-09-10",
	"placaVeiculo": "LGPD informação",
	"valorApolice": 100.0
}
* Buscar Apolice <ip>:<porta><ip>:<porta>seguradora/apolices/buscaApolicePorNumero?numeroApolice=?

  
 



