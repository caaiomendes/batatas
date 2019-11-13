package com.capgemini.batatas.repository;

import org.springframework.data.repository.CrudRepository;

import com.capgemini.batatas.model.Item;

public interface ItemRepository extends CrudRepository<Item, Long> {

}