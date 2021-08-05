package com.example.demo.application.dto;

import com.example.demo.domain.Product;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class ProductConverter {

    public ProductDto convert(Product product) {
        return ProductDto.builder().name(product.getName())
                .build();
    }

    public List<ProductDto> convert(List<Product> products) {
        return products.stream().map(this::convert).collect(Collectors.toList());

    }
}
