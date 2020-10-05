package br.com.seguradoraGisela.seguradoraGisela.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "spring.data.mongodb")
public class MongoPropriedades {

	private String user;
	private String password;
	private String database;
	private String host;
	private Integer port;


}
