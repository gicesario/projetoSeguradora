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

	public Long getNumeroApolice() {
		return numeroApolice;
	}

	public void setNumeroApolice(Long numeroApolice) {
		this.numeroApolice = numeroApolice;
	}

	public Date getInicioVigencia() {
		return inicioVigencia;
	}

	public void setInicioVigencia(Date inicioVigencia) {
		this.inicioVigencia = inicioVigencia;
	}

	public Date getFimVigencia() {
		return fimVigencia;
	}

	public void setFimVigencia(Date fimVigencia) {
		this.fimVigencia = fimVigencia;
	}

	public String getPlacaVeiculo() {
		return placaVeiculo;
	}

	public void setPlacaVeiculo(String placaVeiculo) {
		this.placaVeiculo = placaVeiculo;
	}

	public BigDecimal getValorApolice() {
		return valorApolice;
	}

	public void setValorApolice(BigDecimal valorApolice) {
		this.valorApolice = valorApolice;
	}

	@Override
	public String toString() {
		return "Apolices [numeroApolice=" + numeroApolice + ", inicioVigencia=" + inicioVigencia + ", fimVigencia="
				+ fimVigencia + ", placaVeiculo=" + placaVeiculo + ", valorApolice=" + valorApolice + "]";
	}

}
