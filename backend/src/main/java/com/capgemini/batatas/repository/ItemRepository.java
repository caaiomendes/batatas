package com.capgemini.batatas.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.capgemini.batatas.model.Item;
import com.capgemini.batatas.model.enums.Tipo;

public interface ItemRepository extends CrudRepository<Item, Long> {

	public List<Item> findByTipo(Tipo tipo);
}