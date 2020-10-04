package br.com.seguradoraGisela.seguradoraGisela.domain;

import java.math.BigDecimal;
import java.util.Date;

import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import com.mongodb.lang.NonNull;

@Document
public class Apolices extends EntidadeBase {

	@NonNull
	private Long numeroApolice;

	@NonNull
	private Date inicioVigencia;

	@NonNull
	private Date fimVigencia;

	@Indexed(unique = true)
	@NonNull
	private String placaVeiculo;

	@NonNull
	private BigDecimal valorApolice;

	@Override
	public String toString() {
		return "Apolices [numeroApolice=" + numeroApolice + ", inicioVigencia=" + inicioVigencia + ", fimVigencia="
				+ fimVigencia + ", placaVeiculo=" + placaVeiculo + ", valorApolice=" + valorApolice + "]";
	}



}
