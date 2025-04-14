package com.cropify.productservice.repository;

import org.springframework.data.repository.CrudRepository;

import com.cropify.productservice.model.Product;

public interface ProductServiceRepository extends CrudRepository<Product, Long>{

}
