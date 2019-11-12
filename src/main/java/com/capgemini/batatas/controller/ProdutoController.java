package com.capgemini.batatas.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import com.capgemini.batatas.dao.ProdutoDAO;
import com.capgemini.batatas.model.Item;

@Controller
public class ProdutoController {
	ProdutoDAO dao = new ProdutoDAO();
    @GetMapping("/produtos")
    @ResponseBody
    public ArrayList<Item> buscarTodosItens() {
        return dao.buscar();
    }
    
    @GetMapping("batatas/{id}")
    @ResponseBody
    public Item buscarUmaBatata(@PathVariable int id) {
    	return dao.buscarBatata(id);	
    }
    
    @DeleteMapping("batatas/{id}/{resp}")
    @ResponseBody
    public void apagarUmaBatata(@PathVariable int id, @PathVariable char resp) {
    	if(resp == 's') {
    		dao.excluirBatata(id);
    	}
    }
}