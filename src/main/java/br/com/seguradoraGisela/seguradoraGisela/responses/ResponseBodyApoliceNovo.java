package br.com.seguradoraGisela.seguradoraGisela.responses;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName("informacoesApolice")
@JsonPropertyOrder(value = { "numeroApolice", "apoliceVencido", "diasVencimentoOuVencidos", "placaVeiculo",
		"valorApolice" })
public class ResponseBodyApoliceNovo {

	@JsonProperty("numeroApolice")
	private Long numeroApolice;

	@JsonProperty("placaVeiculo")
	private String placaVeiculo;

	@JsonProperty("valorApolice")
	private BigDecimal valorApolice;

	public Long getNumeroApolice() {
		return numeroApolice;
	}

	public String getPlacaVeiculo() {
		return placaVeiculo;
	}

	public BigDecimal getValorApolice() {
		return valorApolice;
	}

	public void setNumeroApolice(Long numeroApolice) {
		this.numeroApolice = numeroApolice;
	}


	public void setPlacaVeiculo(String placaVeiculo) {
		this.placaVeiculo = placaVeiculo;
	}

	public void setValorApolice(BigDecimal valorApolice) {
		this.valorApolice = valorApolice;
	}

	@JsonIgnore
	public ResponseBodyApoliceNovo addNumeroApolice(Long numeroApolice) {
		this.numeroApolice = numeroApolice;
		return this;
	}


	@JsonIgnore
	public ResponseBodyApoliceNovo addPlacaVeiculo(String placaVeiculo) {
		this.placaVeiculo = placaVeiculo;
		return this;
	}

	@JsonIgnore
	public ResponseBodyApoliceNovo addValorApolice(BigDecimal valorApolice) {
		this.valorApolice = valorApolice;
		return this;
	}

}
