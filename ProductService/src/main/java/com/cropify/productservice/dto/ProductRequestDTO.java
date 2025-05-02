package com.cropify.productservice.dto;

import lombok.Data;

@Data
public class ProductRequestDTO {
    private String name;
    private String description;
    private Double price;
    private Double discount; 
    private String category;
    private Integer stockQuantity;
    private Double rating;
}
