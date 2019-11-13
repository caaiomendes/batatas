package com.capgemini.batatas.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import com.capgemini.batatas.dao.ProdutoDAO;
import com.capgemini.batatas.model.Item;
import com.capgemini.batatas.repository.ClienteRepository;
import com.capgemini.batatas.repository.ImagensRepository;
import com.capgemini.batatas.repository.StockRepository;
import com.capgemini.batatas.repository.ItemRepository;

@Controller
@RequestMapping("/produtos")
public class ProdutoController {
	private static ProdutoDAO dao = new ProdutoDAO();
	
	@Autowired
	private ImagensRepository imagemRepository;
	
	@Autowired
	private StockRepository stockRepository;

	@Autowired
	private ClienteRepository clienteRepository;
	
	@Autowired
	private ItemRepository itemRepository;
	


	@RequestMapping(value = "teste", method = RequestMethod.GET)
    @ResponseBody
    public String teste() {
		itemRepository.save(dao.buscarProduto(13));
		return "sucesso!";
	}
	
    @GetMapping("")
    @ResponseBody
    public ArrayList<Item> buscarTodosItens() {
        return dao.buscar();
    }
    
    @GetMapping("/{id}")
    @ResponseBody
    public Item buscarUm(@PathVariable int id) {
    	return dao.buscarProduto(id);	
    }
    
    @GetMapping("/tipo/{tipo}")
    @ResponseBody
    public ArrayList<Item> buscarUm(@PathVariable String tipo) {
    	return dao.buscarPorTipo(tipo);	
    }
    
    @DeleteMapping("batatas/{id}")
    @ResponseBody
    public void apagarUmaBatata(@PathVariable int id) {
    	dao.excluirBatata(id);
    }
    
    @PostMapping("/{id}")
    public void inserirUmaBatata(@PathVariable int id) {
    	dao.excluirBatata(id);
    }
    
}