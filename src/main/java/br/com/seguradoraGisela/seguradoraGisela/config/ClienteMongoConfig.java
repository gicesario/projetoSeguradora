package br.com.seguradoraGisela.seguradoraGisela.config;

import java.util.Collections;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.data.mongodb.config.AbstractMongoClientConfiguration;

import com.mongodb.MongoClientSettings.Builder;
import com.mongodb.MongoCredential;
import com.mongodb.ServerAddress;

@EnableConfigurationProperties(MongoPropriedades.class)
public class ClienteMongoConfig extends AbstractMongoClientConfiguration {

	@Autowired
	@Qualifier("prop")
	private MongoPropriedades prop;

	/*
	 * @Bean public MongoClientFactoryBean mongo() { MongoClientFactoryBean mongo =
	 * new MongoClientFactoryBean();
	 * mongo.setHost(env.getProperty("spring.data.mongodb.host"));
	 * mongo.setPort(env.getProperty("spring.data.mongodb.port", Integer.class));
	 * return mongo; }
	 */

	@Override
	protected void configureClientSettings(Builder builder) {
		builder.credential(MongoCredential.createCredential("root", getDatabaseName(), "root".toCharArray()))
				.applyToClusterSettings(settings -> {
					settings.hosts(
							Collections.singletonList(new ServerAddress(prop.getHost(),
									                                    prop.getPort())));
				});
	}

	@Override
	protected String getDatabaseName() {
		return prop.getDatabase();
	}
}