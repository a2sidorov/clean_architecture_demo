package com.example.demo.domain.repository;

import com.example.demo.domain.Product;

import java.util.List;

public interface ProductRepository {

    List<Product> getProducts();

    void save(Product product);
}
