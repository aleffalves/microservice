package com.github.aleffalves.catalog.repository;

import com.github.aleffalves.catalog.model.Product;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProductRepository extends CrudRepository<Product,Integer> {
    List<Product> findByName(String name);
}
