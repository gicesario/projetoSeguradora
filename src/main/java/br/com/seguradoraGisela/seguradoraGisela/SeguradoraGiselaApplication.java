package br.com.seguradoraGisela.seguradoraGisela;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.EnableMongoAuditing;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import br.com.seguradoraGisela.seguradoraGisela.config.MongoPropriedades;

@Configuration
@EnableMongoRepositories
@EnableMongoAuditing
@SpringBootApplication
@EnableConfigurationProperties(MongoPropriedades.class)
public class SeguradoraGiselaApplication {

	@Autowired
	private static MongoPropriedades teste;

	public static void main(String[] args) {
		SpringApplication.run(SeguradoraGiselaApplication.class, args);
		System.out.println(teste);
	}

}
