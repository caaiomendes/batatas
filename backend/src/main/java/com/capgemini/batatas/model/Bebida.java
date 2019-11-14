package com.capgemini.batatas.model;

import javax.persistence.Entity;

@Entity
public class Bebida extends Item{

	private String sabor;
	private boolean gelo;
	public String getSabor() {
		return sabor;
	}
	public void setSabor(String sabor) {
		this.sabor = sabor;
	} 
	public boolean isGelo() {
		return gelo;
	}
	public void setGelo(boolean gelo) {
		this.gelo = gelo;
	}
}
