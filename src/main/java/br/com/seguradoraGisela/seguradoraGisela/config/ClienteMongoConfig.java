package br.com.seguradoraGisela.seguradoraGisela.config;

import java.util.Collections;

import org.bson.UuidRepresentation;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoClientConfiguration;

import com.mongodb.MongoClientSettings;
import com.mongodb.MongoCredential;
import com.mongodb.ServerAddress;

import br.com.seguradoraGisela.seguradoraGisela.config.events.CrudApoliceListener;
import br.com.seguradoraGisela.seguradoraGisela.config.events.PersisteInsercaoListener;

@Configuration
public class ClienteMongoConfig extends AbstractMongoClientConfiguration {


	@Override
	public void configureClientSettings(MongoClientSettings.Builder builder) {
		builder.uuidRepresentation(UuidRepresentation.STANDARD);
		builder.credential(MongoCredential.createScramSha1Credential("root", "admin", "root".toCharArray()))

				.applyToClusterSettings(settings -> {
					settings.hosts(Collections.singletonList(new ServerAddress("127.0.0.1", 27017)));
				});
	}

	@Bean
	public PersisteInsercaoListener acaoAntesSalvar() {
		return new PersisteInsercaoListener();
	}

	@Bean
	public CrudApoliceListener salvarApoliceComNumeroAleatorio() {
		return new CrudApoliceListener();
	}

	@Override
	protected String getDatabaseName() {
		return "seguradoraGisela";
	}
}