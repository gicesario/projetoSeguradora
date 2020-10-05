package br.com.seguradoraGisela.seguradoraGisela.domain;

import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import com.mongodb.lang.NonNull;

@Document
public class Clientes extends EntidadeBase {

	@NonNull
	private String nomeCompleto;

	@Indexed(unique = true)
	@NonNull
	private String cpf;

	@NonNull
	private String cidade;

	@NonNull
	private String uf;

	public String getNomeCompleto() {
		return nomeCompleto;
	}

	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	@Override
	public String toString() {
		return "Clientes [nomeCompleto=" + nomeCompleto + ", cpf=" + cpf + ", cidade=" + cidade + ", uf=" + uf + "]";
	}




}
