package br.com.seguradoraGisela.seguradoraGisela.responses;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName("informacoesCliente")
@JsonPropertyOrder(value = {"guid", "cpf"})
public class ResponseBodyCliente {

	@JsonProperty("guid")
	private String guid;

	@JsonProperty("cpf")
	private String cpf;

	public String getGuid() {
		return guid;
	}

	public String getCpf() {
		return cpf;
	}

	public void setGuid(String guid) {
		this.guid = guid;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	@JsonIgnore
	public ResponseBodyCliente addGuid(String guid) {
		this.guid = guid;
		return this;
	}

	@JsonIgnore
	public ResponseBodyCliente addCpf(String cpf) {
		this.cpf = cpf;
		return this;
	}
}
