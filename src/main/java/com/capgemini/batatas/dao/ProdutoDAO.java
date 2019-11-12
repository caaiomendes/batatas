package com.capgemini.batatas.dao;

import java.util.ArrayList;

import com.capgemini.batatas.model.Comida;
import com.capgemini.batatas.model.Item;
import com.capgemini.batatas.model.enums.Tamanho;
import com.capgemini.batatas.model.enums.Tipo;


public class ProdutoDAO {
	ArrayList<Item> itens = new ArrayList<Item>();
	ArrayList<Item> adicionais = new ArrayList<Item>();
	
	Comida batata1 = new Comida();
	Comida batata2 = new Comida();

	public ArrayList<Item> buscar() {
		return itens;
	}
	
	public ProdutoDAO() {
    	batata1.setCodProd(12);
    	batata1.setNome("Batata Catupiry");
    	batata1.setDescricao("Batata recheada com catupiry");
    	batata1.setPreco(20.00);
    	batata1.setTipo(Tipo.BATATA);
    	batata1.setTamanho(Tamanho.MEDIO);
    	batata1.setObservacao("Completa");
    	
    	Item adicional1 = new Item();
    	adicional1.setCodProd(2222);
    	adicional1.setNome("Bacon");
    	adicionais.add(adicional1);
    	
    	Item adicional2 = new Item();
    	adicional2.setCodProd(2222);
    	adicional2.setNome("Cheddar");
    	adicionais.add(adicional2);
    	batata1.setAdicionais(adicionais);

    	batata2.setCodProd(13);
    	batata2.setNome("Batata Calabresa");
    	batata2.setDescricao("Batata recheada com calabresa");
    	batata2.setPreco(25.00);
    	batata2.setTipo(Tipo.BATATA);
    	batata2.setTamanho(Tamanho.GRANDE);
    	batata2.setObservacao("Sem cebola");
    	
    	itens.add(batata1);
    	itens.add(batata2);
	}

	public void excluirBatata(int id) {
		for (Item batata : itens) {
			if(batata.getCodProd() == id) {
				itens.remove(batata);
				break;
			}
				
		}
	}
	public Item buscarProduto(int id) {
		for (Item item : itens) {
			if(item.getCodProd() == id) {
				return item;
			}
		}
		return null;
	}
	public ArrayList<Item> buscarPorTipo(String tipo) {
		ArrayList<Item> prodTipo = new ArrayList<Item>();
		tipo = tipo.toUpperCase();
		for (Item item : itens) {
			if(item.getTipo().toString().equals(tipo)) {
				prodTipo.add(item);
			}
		}
		return prodTipo;
	}

}
