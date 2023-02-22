package com.example.ShoppingApp.repository;

import com.example.ShoppingApp.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Integer> {
}
