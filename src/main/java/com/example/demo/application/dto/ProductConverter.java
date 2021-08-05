package com.example.demo.application.dto;

import com.example.demo.domain.Product;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class ProductConverter {

    public ProductDto convert(Product user) {
        return ProductDto.builder().name(user.getName())
                .build();
    }

    public List<ProductDto> convert(List<Product> users) {
        return users.stream().map(this::convert).collect(Collectors.toList());

    }
}
