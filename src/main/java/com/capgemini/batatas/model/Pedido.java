package com.capgemini.batatas.model;

import java.util.ArrayList;
import java.util.Date;

import com.capgemini.batatas.model.enums.Status;

public class Pedido {
	private int nPed;
	private Cliente cliente;
	private Date data;
	private ArrayList<Item> itens;
	private double frete;
	private double total;
	private String formaPagamento;
	private Status status;
	public int getnPed() {
		return nPed;
	}
	public void setnPed(int nPed) {
		this.nPed = nPed;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public double getFrete() {
		return frete;
	}
	public void setFrete(double frete) {
		this.frete = frete;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public String getFormaPagamento() {
		return formaPagamento;
	}
	public void setFormaPagamento(String formaPagamento) {
		this.formaPagamento = formaPagamento;
	}
	public Status getStatus() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}
	public ArrayList<Item> getItens() {
		return itens;
	}
	public void setItens(ArrayList<Item> itens) {
		this.itens = itens;
	}
	
	
}
