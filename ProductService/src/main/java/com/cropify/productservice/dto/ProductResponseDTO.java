package com.cropify.productservice.dto;

import lombok.Data;

@Data
public class ProductResponseDTO {
    private Long id;
    private String name;
    private String description;
    private Double price;
    private Double discountedPrice;
    private String category;
    private Integer stockQuantity;
    private Double rating;
}