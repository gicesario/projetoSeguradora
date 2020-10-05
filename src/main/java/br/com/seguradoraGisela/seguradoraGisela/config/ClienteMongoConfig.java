package br.com.seguradoraGisela.seguradoraGisela.config;

import java.util.Collections;

import org.bson.UuidRepresentation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.mongo.MongoProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoClientConfiguration;

import com.mongodb.MongoClientSettings;
import com.mongodb.MongoCredential;
import com.mongodb.ServerAddress;

import br.com.seguradoraGisela.seguradoraGisela.config.events.CrudApoliceListener;
import br.com.seguradoraGisela.seguradoraGisela.config.events.PersisteInsercaoListener;

@Configuration
@EnableAutoConfiguration
public class ClienteMongoConfig extends AbstractMongoClientConfiguration {

	@Autowired
	private MongoProperties prop;
	@Override
	public void configureClientSettings(MongoClientSettings.Builder builder) {
		builder.uuidRepresentation(UuidRepresentation.STANDARD);
		builder.credential(MongoCredential.createScramSha1Credential(prop.getUsername(), prop.getAuthenticationDatabase(), prop.getPassword()))

				.applyToClusterSettings(settings -> {
					settings.hosts(Collections.singletonList(new ServerAddress(prop.getHost(), prop.getPort())));
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
		return prop.getDatabase();
	}
}