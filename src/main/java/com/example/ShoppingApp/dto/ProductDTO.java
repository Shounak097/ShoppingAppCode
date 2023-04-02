package com.example.ShoppingApp.dto;


import com.example.ShoppingApp.model.Category;
import lombok.Data;

@Data
public class ProductDTO {
    private Long id;
    private String name;
    private Category category;
    private double price;
    private double weight;
    private String description;
    private String imageName;
}
