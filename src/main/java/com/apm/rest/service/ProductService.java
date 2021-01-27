package com.apm.rest.service;

import com.apm.rest.model.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductService extends CrudRepository<Product, Integer> {
}
