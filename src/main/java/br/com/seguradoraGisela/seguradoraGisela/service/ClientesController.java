package br.com.seguradoraGisela.seguradoraGisela.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.seguradoraGisela.seguradoraGisela.domain.Clientes;

@RestController
@RequestMapping(value = "/seguradora/clientes")
public class ClientesController {

	@Autowired
	ClientesService crudClientes;

	@PostMapping(path = "/insere",
	    		consumes = MediaType.APPLICATION_JSON_VALUE,
                produces = MediaType.APPLICATION_JSON_VALUE)
	public String create(@RequestBody @Validated Clientes novoCliente) {
		try {
			crudClientes.salvarCliente(novoCliente);
		} catch (Exception e) {
			// TODO
		}
		return "Clientes" + novoCliente + "criado com sucesso";
	}

}
