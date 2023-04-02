package com.example.ShoppingApp.repository;

import com.example.ShoppingApp.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
