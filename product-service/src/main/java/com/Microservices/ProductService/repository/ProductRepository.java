package com.Microservices.ProductService.repository;

import com.Microservices.ProductService.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository <Product,String>{

}
