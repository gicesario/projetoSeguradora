package br.com.seguradoraGisela.seguradoraGisela.service.impl;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Collections;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.seguradoraGisela.seguradoraGisela.domain.Apolices;
import br.com.seguradoraGisela.seguradoraGisela.repository.ApolicesRepository;
import br.com.seguradoraGisela.seguradoraGisela.service.facade.ApolicesService;

/**
 * Regras de negocio de Apolices
 *
 * @author Gisela
 *
 */
@Service
public class ApolicesServiceImpl implements ApolicesService {

	@Autowired
	ApolicesRepository apolicesDAO;

	@Override
	public Long salvarApolice(Apolices apoliceNovo) throws Exception {
		apolicesDAO.saveAll(Collections.singleton(apoliceNovo));
		return apoliceNovo.getNumeroApolice();
	}

	@Override
	public Apolices buscarApolicePorNumero(Long numeroApolice) throws Exception {
		Optional<Apolices> apolice = apolicesDAO.buscaApoliceByNumero(numeroApolice);
		if (apolice.isPresent()) {

		}

		return apolice.get();
	}

	@Override
	public boolean verificarApoliceVencido(Apolices apolice) throws Exception {
		return apolice.getFimVigencia().isAfter(LocalDate.now());
	}

	@Override
	public long calcularDiasVigencia(Apolices apolice) throws Exception {
		return ChronoUnit.DAYS.between(apolice.getInicioVigencia(), apolice.getFimVigencia());
	}

	@Override
	public long calcularDiasVencidos(Apolices apolice) throws Exception {
		if (verificarApoliceVencido(apolice)) {
			ChronoUnit.DAYS.between(apolice.getFimVigencia(), LocalDate.now());
		}
		return 0;
	}

	@Override
	public String recuperarPlaVeiculoRegex(Apolices apolice) throws Exception {
		return apolice.getPlacaVeiculo();
	}

}
