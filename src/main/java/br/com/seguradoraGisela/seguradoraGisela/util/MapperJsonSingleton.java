package br.com.seguradoraGisela.seguradoraGisela.util;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

public enum MapperJsonSingleton {
	INSTANCE;

	private ObjectMapper mapper;

	private MapperJsonSingleton() {
		mapper = new ObjectMapper();
		mapper.configure(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY, true);
		mapper.findAndRegisterModules();
	}

	public ObjectMapper get() {
		return this.mapper;
	}
}
