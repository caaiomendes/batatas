package com.capgemini.batatas.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.capgemini.batatas.model.enums.Tamanho;
import com.capgemini.batatas.model.enums.Tipo;

@Entity
public class Item {
	@Id
	private int codProd;
	private String nome;
	private double preco;
	private String descricao;
	private String observacao;
	private Tipo tipo;
	private Tamanho tamanho;
	
	public int getCodProd() {
		return codProd;
	}
	public void setCodProd(int codProd) {
		this.codProd = codProd;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getObservacao() {
		return observacao;
	}
	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}
	public Tipo getTipo() {
		return tipo;
	}
	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}
	public Tamanho getTamanho() {
		return tamanho;
	}
	public void setTamanho(Tamanho tamanho) {
		this.tamanho = tamanho;
	}
	
	
}
