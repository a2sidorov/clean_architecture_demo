package com.example.demo.infrastracture.repository;

import com.example.demo.domain.Product;
import com.example.demo.infrastracture.entity.ProductEntity;

import java.util.List;
import java.util.stream.Collectors;

public class ProductEntityMapper {

    public static Product convert(ProductEntity productEntity) {
        return new Product(productEntity.getName());
    }

    public static List<Product> convert(List<ProductEntity> productEntities) {
        return productEntities.stream().map(ProductEntityMapper::convert).collect(Collectors.toList());
    }
}
