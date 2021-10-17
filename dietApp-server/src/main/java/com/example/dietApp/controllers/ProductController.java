package com.example.dietApp.controllers;

import com.example.dietApp.dao.entity.Product;
import com.example.dietApp.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/product")
public class ProductController {

    private ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/products")
    public Iterable<Product> getAllProducts(){
        return productService.findAll();
    }

    @PostMapping("/product")
    public void product(@RequestBody Product product){
        productService.save(product);
    }

}
