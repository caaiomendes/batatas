package com.capgemini.batatas.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;

@Entity
public class Comida extends Item{

	@ManyToMany(cascade = CascadeType.ALL)
	private List<Item> ingredientes;
	@ManyToMany(cascade = CascadeType.ALL)
	private List<Item> adicionais;
	
	public List<Item> getIngredientes() {
		return ingredientes;
	}
	public void setIngredientes(List<Item> ingredientes) {
		this.ingredientes = ingredientes;
	}
	public List<Item> getAdicionais() {
		return adicionais;
	}
	public void setAdicionais(List<Item> adicionais) {
		this.adicionais = adicionais;
	}
	
}
