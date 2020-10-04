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
	private String CPF;

	@NonNull
	private String cidade;

	@NonNull
	private String UF;

	public String getNomeCompleto() {
		return nomeCompleto;
	}

	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String cPF) {
		CPF = cPF;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getUF() {
		return UF;
	}

	public void setUF(String uF) {
		UF = uF;
	}

	@Override
	public String toString() {
		return "Clientes [nomeCompleto=" + nomeCompleto + ", CPF=" + CPF + ", cidade=" + cidade + ", UF=" + UF + "]";
	}


}
