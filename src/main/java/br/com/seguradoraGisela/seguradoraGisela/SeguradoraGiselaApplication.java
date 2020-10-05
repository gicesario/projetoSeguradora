package br.com.seguradoraGisela.seguradoraGisela;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.EnableMongoAuditing;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Configuration
@EnableMongoRepositories
@EnableMongoAuditing
@SpringBootApplication

public class SeguradoraGiselaApplication {
	public static void main(String[] args) {
		SpringApplication.run(SeguradoraGiselaApplication.class, args);
	}

}
