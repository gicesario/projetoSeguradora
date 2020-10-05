package br.com.seguradoraGisela.seguradoraGisela.config.events;

import org.springframework.data.mongodb.core.mapping.event.AbstractMongoEventListener;
import org.springframework.data.mongodb.core.mapping.event.BeforeSaveEvent;
import org.springframework.stereotype.Component;

import br.com.seguradoraGisela.seguradoraGisela.domain.Apolices;

@Component
public class CrudApoliceListener extends AbstractMongoEventListener<Apolices> {

	@Override
	public void onBeforeSave(BeforeSaveEvent<Apolices> event) {
		if (event.getSource() instanceof Apolices) {
			Apolices entidade = event.getSource();
			entidade.setNumeroApolice(valorAleatorioGerado());
			super.onBeforeSave(event);
		}
	}

	private Long valorAleatorioGerado() {
		return new java.util.Random().nextLong() % (Long.MAX_VALUE - 1) + 1;
	}
}
