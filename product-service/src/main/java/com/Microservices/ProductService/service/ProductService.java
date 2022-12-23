package com.Microservices.ProductService.service;


import com.Microservices.ProductService.dto.ProductRequest;
import com.Microservices.ProductService.dto.ProductResponse;
import com.Microservices.ProductService.model.Product;
import com.Microservices.ProductService.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class ProductService {
    private final ProductRepository productRepository;

    public void createProduct(ProductRequest productRequest){
        Product product = Product.builder()
                .name(productRequest.getName())
                .description(productRequest.getDescription())
                .price(productRequest.getPrice())
                .build();
        productRepository.save(product);
        log.info("Product {} is saved ",product.getId());


    }

    public List<ProductResponse> getAllProducts() {
        List <Product> products =productRepository.findAll();
        return products.stream().map(product -> mapToProductReponse(product)).toList();

    }
    private ProductResponse mapToProductReponse(Product product){
        return ProductResponse.builder()
                .id(product.getId())
                .name(product.getName())
                .description(product.getDescription())
                .price(product.getPrice())
                .build();
    }
}
