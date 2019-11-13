package com.capgemini.batatas.model;

import java.util.ArrayList;

import javax.persistence.Entity;

@Entity
public class Comida extends Item{

	private ArrayList<Item> ingredientes;
	private ArrayList<Item> adicionais;
	
	public ArrayList<Item> getIngredientes() {
		return ingredientes;
	}
	public void setIngredientes(ArrayList<Item> ingredientes) {
		this.ingredientes = ingredientes;
	}
	public ArrayList<Item> getAdicionais() {
		return adicionais;
	}
	public void setAdicionais(ArrayList<Item> adicionais) {
		this.adicionais = adicionais;
	}
	
}
