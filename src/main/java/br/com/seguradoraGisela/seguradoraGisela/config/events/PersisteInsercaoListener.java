package br.com.seguradoraGisela.seguradoraGisela.config.events;

import java.util.UUID;

import org.springframework.data.mongodb.core.mapping.event.AbstractMongoEventListener;
import org.springframework.data.mongodb.core.mapping.event.BeforeSaveEvent;
import org.springframework.stereotype.Component;

import br.com.seguradoraGisela.seguradoraGisela.domain.EntidadeBase;

@Component
public class PersisteInsercaoListener extends AbstractMongoEventListener<EntidadeBase> {

	@Override
	public void onBeforeSave(BeforeSaveEvent<EntidadeBase> event) {
		if (event.getSource() instanceof EntidadeBase) {
			EntidadeBase entidade = event.getSource();
			entidade.setId(UUID.randomUUID().toString());
			super.onBeforeSave(event);
		}
	}
}
