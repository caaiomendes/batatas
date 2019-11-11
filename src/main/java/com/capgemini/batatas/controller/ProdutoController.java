package com.capgemini.batatas.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import com.capgemini.batatas.dao.ProdutoDAO;
import com.capgemini.batatas.model.Item;

@Controller
public class ProdutoController {
	ProdutoDAO dao = new ProdutoDAO();
    @GetMapping("/batatas")
    @ResponseBody
    public ArrayList<Item> buscarTodosItens() {
    	ArrayList<Item> itens = dao.buscar();
        return itens;
    }
    
    @GetMapping("batatas/{id}")
    @ResponseBody
    public Item buscarUmaBatata(@PathVariable int id) {
    	return dao.buscarBatata(id);	
    }
}