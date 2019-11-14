package com.capgemini.batatas.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import com.capgemini.batatas.dao.ProdutoDAO;
import com.capgemini.batatas.model.Item;
import com.capgemini.batatas.model.enums.Tipo;
import com.capgemini.batatas.repository.ClienteRepository;
import com.capgemini.batatas.repository.ImagensRepository;
import com.capgemini.batatas.repository.StockRepository;
import com.capgemini.batatas.repository.ItemRepository;

@Controller
@RequestMapping("/produtos")
public class ProdutoController{
	
	private static ProdutoDAO dao = new ProdutoDAO();
	
	@Autowired
	private ImagensRepository imagemRepository;
	
	@Autowired
	private StockRepository stockRepository;

	@Autowired
	private ClienteRepository clienteRepository;
	
	@Autowired
	private ItemRepository itemRepository;
	
    @GetMapping("")
    @ResponseBody
    public List<Item> buscarTodosItens() {
        List<Item> todos = (List<Item>) itemRepository.findAll();
        return todos;
    }
    
    @RequestMapping(value = "teste", method = RequestMethod.GET)
    @ResponseBody
    public String teste() {
		itemRepository.save(dao.buscarProduto(12l));
		itemRepository.save(dao.buscarProduto(15l));
		return "sucesso!";
	}
    
    @GetMapping("/{id}")
    @ResponseBody
    Optional<Item> buscarUmProduto(@PathVariable int id) {
    	Optional<Item> item = itemRepository.findById((long) id);
		return item;
    }
    
    @GetMapping("/tipo/{tipo}")
    @ResponseBody
    public List<Item> buscarUm(@PathVariable String tipo) {
    	tipo = tipo.toUpperCase();
    	List<Item> itens =  itemRepository.findByTipo(Tipo.valueOf(tipo));
    	return itens;
    }
    
    @DeleteMapping("{id}")
    @ResponseBody
    public void apagarUmItem(@PathVariable Long id) {
    	itemRepository.deleteById(id);
    }
    
    @RequestMapping(value = "" , method = RequestMethod.POST)
    @ResponseBody
    Item inserirProduto(@RequestBody Item item) {
    	return itemRepository.save(item);
    }
    
    @RequestMapping(value = "{id}" , method = RequestMethod.PUT)
    @ResponseBody
    Item atualizarProduto(@PathVariable Long id,@RequestParam(value="nome") String nome, @RequestBody Item item) {
    	Tipo teste = itemRepository.
    	item.setNome(nome);
    	return itemRepository.save(item);
    }
    
}