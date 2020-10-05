package br.com.seguradoraGisela.seguradoraGisela.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import br.com.seguradoraGisela.seguradoraGisela.domain.Apolices;

@Repository
public interface ApolicesRepository extends MongoRepository<Apolices, String> {

	@Query("{'numeroApolice' : ?0}")
	Optional<Apolices> buscaApoliceByNumero(Long numeroApolice);

}
