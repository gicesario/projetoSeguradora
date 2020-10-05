package br.com.seguradoraGisela.seguradoraGisela.service.impl;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.seguradoraGisela.seguradoraGisela.domain.Clientes;
import br.com.seguradoraGisela.seguradoraGisela.repository.ClientesRepository;
import br.com.seguradoraGisela.seguradoraGisela.service.facade.ClientesService;

/**
 * Regras de negocio de Clientes
 *
 * @author Gisela
 *
 */
@Service
public class ApolicesServiceImpl implements ClientesService {

	@Autowired
	ClientesRepository clientesDAO;

	@Override
	public void salvarClientes(List<Clientes> clientesNovos) throws Exception {
		clientesDAO.saveAll(clientesNovos);
	}

	@Override
	public String salvarCliente(Clientes clienteNovo) throws Exception {
		clientesDAO.saveAll(Collections.singleton(clienteNovo));
		return clienteNovo.getId();
	}

	@Override
	public Optional<Clientes> buscarClienteByID(String id) throws Exception {
		return clientesDAO.findById(id);
	}

	@Override
	public Collection<Clientes> buscarTodosClientes() throws Exception {
		return clientesDAO.findAll();
	}

}
