package com.capgemini.batatas.model.enums;

public enum Tamanho {
	PEQUENO(0),MEDIO(1),GRANDE(2);
	
	private final int valor;
	
	private Tamanho(int numero) {
		valor = numero;
	}
	
	public int getTamanho() {
		return valor;
	}
}
