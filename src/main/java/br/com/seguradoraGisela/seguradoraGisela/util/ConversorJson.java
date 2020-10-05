package br.com.seguradoraGisela.seguradoraGisela.util;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonProcessingException;

public class ConversorJson {

	public static String toJson(Object obj) {
		try {
			return MapperJsonSingleton.INSTANCE.get().writeValueAsString(obj);
		} catch (JsonProcessingException E) {
			throw new RuntimeException(E);
		}
	}

	public static <T> T fromJson(String jsonStringEntrada, Class<T> classeSaida) {
		try {
			return MapperJsonSingleton.INSTANCE.get().readValue(jsonStringEntrada, classeSaida);
		} catch (IOException E) {
			throw new RuntimeException(E);
		}
	}

}
