package com.example.demo.domain;

import com.example.demo.application.dto.ProductConverter;
import com.example.demo.application.dto.ProductDto;
import com.example.demo.domain.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;
    private final ProductConverter productConverter;

    public List<ProductDto> getProducts() {
        return productConverter.convert(productRepository.getProducts());
    }

    public ProductDto create(ProductDto productDto) {
        Product newProduct = new Product(productDto.getName());
        productRepository.save(newProduct);
        return productConverter.convert(newProduct);
    }
}
