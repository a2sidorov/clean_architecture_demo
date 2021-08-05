package com.example.demo.infrastracture.repository;

import com.example.demo.domain.Product;
import com.example.demo.domain.repository.ProductRepository;
import com.example.demo.infrastracture.entity.ProductEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class ProductRepositoryImpl implements ProductRepository {

    private final ProductJpaRepository productJpaRepository;

    @Override
    public List<Product> getProducts() {
        List<ProductEntity> productEntities = productJpaRepository.findAll();
        return ProductEntityMapper.convert(productEntities);
    }

    @Override
    public void save(Product product) {
        // TODO here should be a mapper call
        ProductEntity productEntity = new ProductEntity(product.getName());
        productJpaRepository.save(productEntity);
    }
}
