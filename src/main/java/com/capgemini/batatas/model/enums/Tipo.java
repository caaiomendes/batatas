package com.capgemini.batatas.model.enums;

public enum Tipo {
	INGREDIENTE(0),BATATA(1),REFRI(2),SUCO(3),AGUA(4);
	
	private final int valor;
	
	private Tipo(int numero) {
		valor = numero;
	}
	
	public int getValor() {
		return valor;
	}
}
