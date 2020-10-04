package br.com.seguradoraGisela.seguradoraGisela.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import br.com.seguradoraGisela.seguradoraGisela.domain.Clientes;

@Repository
public interface ClientesRepository extends MongoRepository<Clientes, String> {

}
