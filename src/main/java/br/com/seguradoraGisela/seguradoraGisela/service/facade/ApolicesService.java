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

	public Optional<Apolices> buscarApolicePorNumero(String id) throws Exception;


}
