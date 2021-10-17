package com.example.dietApp.controllers;

import com.example.dietApp.dao.ProductRepository;
import com.example.dietApp.dao.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/product")
public class ProductController {

//    private ProductRepository productRepository;

//    @Autowired
//    public ProductController(ProductRepository productRepository) {
//        this.productRepository = productRepository;
//    }

//    @GetMapping("/products")
//    public Iterable<Product> getAllProducts(){
//        return productRepository.findAll();
//    }

}
