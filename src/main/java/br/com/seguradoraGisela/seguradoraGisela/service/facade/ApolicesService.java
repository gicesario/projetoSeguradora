package br.com.seguradoraGisela.seguradoraGisela.service.facade;

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

	public Apolices buscarApolicePorNumero(Long numeroApolice) throws Exception;

	public boolean verificarApoliceVencido(Apolices apolice) throws Exception;

	public long calcularDiasVigencia(Apolices apolice) throws Exception;

	public long calcularDiasVencidos(Apolices apolice) throws Exception;

	public String recuperarPlaVeiculoRegex(Apolices apolice) throws Exception;


}
