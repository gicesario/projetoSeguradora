package br.com.seguradoraGisela.seguradoraGisela.service.facade;

import java.util.Optional;

import org.springframework.stereotype.Service;

import br.com.seguradoraGisela.seguradoraGisela.domain.Apolices;

/**
 * Regras de negocio de Clientes
 *
 * @author Gisela
 *
 */
@Service
public interface ApolicesService {

	public Long salvarApolice(Apolices apoliceNovo) throws Exception;

	public Optional<Apolices> buscarApolicePorNumero(Long numeroApolice) throws Exception;

	public boolean verificarApoliceVencido(Optional<Apolices> apolice) throws Exception;

	public long calcularDiasVigencia(Optional<Apolices> apolice) throws Exception;

	public long calcularDiasVencidos(Optional<Apolices> apolice) throws Exception;

	public long calcularDiasVencidosOuAVencer(Optional<Apolices> apolice) throws Exception;

	public String recuperarPlaVeiculoRegex(Optional<Apolices> apolice) throws Exception;


}
