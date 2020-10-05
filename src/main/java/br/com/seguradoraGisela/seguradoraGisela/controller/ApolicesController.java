package br.com.seguradoraGisela.seguradoraGisela.controller;

import java.net.URI;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.seguradoraGisela.seguradoraGisela.domain.Apolices;
import br.com.seguradoraGisela.seguradoraGisela.responses.ResponseBodyApolice;
import br.com.seguradoraGisela.seguradoraGisela.responses.ResponseBodyApoliceNovo;
import br.com.seguradoraGisela.seguradoraGisela.service.facade.ApolicesService;

@RestController
@RequestMapping(value = "/seguradora/apolices")
public class ApolicesController {

	@Autowired
	ApolicesService crudApolices;

	@PostMapping(path = "/insereApolice",
			     consumes = MediaType.APPLICATION_JSON_VALUE,
			     produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> insereApolice(@RequestBody @Validated Apolices novoApolice) {
		try {
			Long numeroGerado = crudApolices.salvarApolice(novoApolice);
			ResponseBodyApoliceNovo respApolice = new ResponseBodyApoliceNovo()
													  .addNumeroApolice(numeroGerado)
													  .addPlacaVeiculo(novoApolice.getPlacaVeiculo())
													  .addValorApolice(novoApolice.getValorApolice());

			return ResponseEntity.created(new URI("seguradora/apolices/insereApolice/numero:".concat(numeroGerado.toString())))
					.body(respApolice);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;

	}

	@GetMapping(path = "/buscaApolicePorNumero", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> buscaApolicePorNumero(Long numeroApolice) {
		try {
			Optional<Apolices> apolice = crudApolices.buscarApolicePorNumero(numeroApolice);
			ResponseBodyApolice respApolice = new ResponseBodyApolice()
											      .addNumeroApolice(apolice.get().getNumeroApolice())
											      .addPlacaVeiculo(apolice.get().getPlacaVeiculo())
											      .addValorApolice(apolice.get().getValorApolice())
											      .addApoliceVencido(crudApolices.verificarApoliceVencido(apolice))
											      .addDiasVencimentoOuVencidos(crudApolices.calcularDiasVencidosOuAVencer(apolice));

			return ResponseEntity.ok(respApolice);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}

}
