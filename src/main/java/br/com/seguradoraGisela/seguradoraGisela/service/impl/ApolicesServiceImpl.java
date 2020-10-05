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
	public Optional<Apolices> buscarApolicePorNumero(Long numeroApolice) throws Exception {
		return apolicesDAO.buscaApoliceByNumero(numeroApolice);
	}

	@Override
	public boolean verificarApoliceVencido(Optional<Apolices> apolice) throws Exception {
		return apolice.get().getFimVigencia().isAfter(LocalDate.now());
	}

	@Override
	public long calcularDiasVigencia(Optional<Apolices> apolice) throws Exception {
		return ChronoUnit.DAYS.between(apolice.get().getInicioVigencia(), apolice.get().getFimVigencia());
	}

	@Override
	public long calcularDiasVencidos(Optional<Apolices> apolice) throws Exception {
		if (verificarApoliceVencido(apolice)) {
			ChronoUnit.DAYS.between(apolice.get().getFimVigencia(), LocalDate.now());
		}
		return 0;
	}

	@Override
	public String recuperarPlaVeiculoRegex(Optional<Apolices> apolice) throws Exception {
		return apolice.get().getPlacaVeiculo();
	}

	@Override
	public long calcularDiasVencidosOuAVencer(Optional<Apolices> apolice) throws Exception {
		if (calcularDiasVencidos(apolice) > 0) {
			return calcularDiasVigencia(apolice);
		}
		return 0;
	}

}
