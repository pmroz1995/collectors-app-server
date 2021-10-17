package com.example.dietApp.services;

import com.example.dietApp.dao.entity.Product;

public interface ProductService {
    Iterable<Product> findAll();

    void save(Product product);
}
