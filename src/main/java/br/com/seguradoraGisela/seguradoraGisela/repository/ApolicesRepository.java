package br.com.seguradoraGisela.seguradoraGisela.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import br.com.seguradoraGisela.seguradoraGisela.domain.Apolices;

@Repository
public interface ApolicesRepository extends MongoRepository<Apolices, String> {

}
