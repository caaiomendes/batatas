package com.capgemini.batatas.repository;

import org.springframework.data.repository.CrudRepository;

import com.capgemini.batatas.model.Stock;

public interface StockRepository extends CrudRepository<Stock, Long> {
}