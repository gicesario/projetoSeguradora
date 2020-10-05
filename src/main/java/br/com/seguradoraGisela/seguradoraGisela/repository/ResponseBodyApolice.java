package br.com.seguradoraGisela.seguradoraGisela.repository;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName("informacoesApolice")
@JsonPropertyOrder(value = { "numeroApolice", "apoliceVencido", "diasVencimentoOuVencidos", "placaVeiculo",
		"valorApolice" })
public class ResponseBodyApolice {

	@JsonProperty("numeroApolice")
	private Long numeroApolice;

	@JsonProperty("apoliceVencido")
	private Boolean apoliceVencido;

	@JsonProperty("diasVencimentoOuVencidos")
	private Integer diasVencimentoOuVencidos;

	@JsonProperty("placaVeiculo")
	private String placaVeiculo;

	@JsonProperty("valorApolice")
	private BigDecimal valorApolice;

	public Long getNumeroApolice() {
		return numeroApolice;
	}

	public Boolean getApoliceVencido() {
		return apoliceVencido;
	}

	public Integer getDiasVencimentoOuVencidos() {
		return diasVencimentoOuVencidos;
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

	public void setApoliceVencido(Boolean apoliceVencido) {
		this.apoliceVencido = apoliceVencido;
	}

	public void setDiasVencimentoOuVencidos(Integer diasVencimentoOuVencidos) {
		this.diasVencimentoOuVencidos = diasVencimentoOuVencidos;
	}

	public void setPlacaVeiculo(String placaVeiculo) {
		this.placaVeiculo = placaVeiculo;
	}

	public void setValorApolice(BigDecimal valorApolice) {
		this.valorApolice = valorApolice;
	}

	public ResponseBodyApolice addNumeroApolice(Long numeroApolice) {
		this.numeroApolice = numeroApolice;
		return this;
	}

	public ResponseBodyApolice addApoliceVencido(Boolean apoliceVencido) {
		this.apoliceVencido = apoliceVencido;
		return this;
	}

	public ResponseBodyApolice addDiasVencimentoOuVencidos(Integer diasVencimentoOuVencidos) {
		this.diasVencimentoOuVencidos = diasVencimentoOuVencidos;
		return this;
	}

	public ResponseBodyApolice addPlacaVeiculo(String placaVeiculo) {
		this.placaVeiculo = placaVeiculo;
		return this;
	}

	public ResponseBodyApolice addValorApolice(BigDecimal valorApolice) {
		this.valorApolice = valorApolice;
		return this;
	}

}
