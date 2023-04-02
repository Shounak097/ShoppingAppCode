package com.example.ShoppingApp.service;

import com.example.ShoppingApp.model.Category;
import com.example.ShoppingApp.model.Product;
import com.example.ShoppingApp.repository.CategoryRepository;
import com.example.ShoppingApp.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductService {
    @Autowired
    ProductRepository productRepository;
    public List<Product> getAllProduct(){
        return productRepository.findAll();
    }
}