package br.com.seguradoraGisela.seguradoraGisela.controller;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.seguradoraGisela.seguradoraGisela.domain.Clientes;
import br.com.seguradoraGisela.seguradoraGisela.service.facade.ClientesService;

@RestController
@RequestMapping(value = "/seguradora/clientes")
public class ClientesController {

	@Autowired
	ClientesService crudClientes;
	@PostMapping(path = "/insereCliente", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> insereCliente(@RequestBody @Validated Clientes novoCliente) {
		try {
			String guidCriado = crudClientes.salvarCliente(novoCliente);
			return ResponseEntity.created(new URI("seguradora/clientes/insereCliente/GUID:".concat(guidCriado))).build();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;

	}

	@GetMapping(path = "/buscaTodosClientes", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> buscaCliente() {
		try {
			List<Clientes> teste = (List<Clientes>) crudClientes.buscarTodosClientes();
			System.out.println(teste);
			return ResponseEntity.ok(crudClientes.buscarTodosClientes());
		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}

}
