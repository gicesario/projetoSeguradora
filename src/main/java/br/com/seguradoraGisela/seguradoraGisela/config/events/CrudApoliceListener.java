package br.com.seguradoraGisela.seguradoraGisela.config.events;

import java.util.Random;

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
		return new Random(System.currentTimeMillis()).nextLong();
	}
}
