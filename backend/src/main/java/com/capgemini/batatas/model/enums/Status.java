package com.capgemini.batatas.model.enums;

public enum Status {

	PREPARANDO(0),PRONTO(1),DELIVERY(2),ENTREGUE(3),CANCELADO(4);
	
	private final int valor;
	
	private Status(int numero) {
		valor = numero;
	}
	
	public int getStatus() {
		return valor;
	}
}
