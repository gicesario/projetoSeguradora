package br.com.seguradoraGisela.seguradoraGisela.service.facade;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import br.com.seguradoraGisela.seguradoraGisela.domain.Clientes;

/**
 * Regras de negocio de Clientes
 *
 * @author Gisela
 *
 */
@Service
public interface ClientesService {

	public void salvarClientes(List<Clientes> clientesNovos) throws Exception;

	public String salvarCliente(Clientes clienteNovo) throws Exception;

	public Optional<Clientes> buscarClienteByID(String id) throws Exception;

	public Collection<Clientes> buscarTodosClientes() throws Exception;

}
