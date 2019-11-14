package com.capgemini.batatas.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.capgemini.batatas.model.Imagem;

public interface ImagensRepository extends CrudRepository<Imagem, Long> {
	public List<Imagem>findAllByUrlIgnoreCaseContaining(String url);
}