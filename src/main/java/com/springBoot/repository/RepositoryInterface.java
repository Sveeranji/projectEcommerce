package com.springBoot.repository;

import org.springframework.data.repository.CrudRepository;

import com.springBoot.entity.Product;

public interface RepositoryInterface extends CrudRepository<Product, Integer> {
	

}
