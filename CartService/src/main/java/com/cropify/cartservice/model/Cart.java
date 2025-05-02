package com.cropify.cartservice.model;

import java.sql.Timestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "CartTable")
public class Cart {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cartId;

    @Column(nullable = false)
    private Long userId;

    @Column(nullable = false)
    private Long productId;

    @Column(nullable = false)
    private Integer quantity;

    @Column(nullable = false)
    private Double priceAtTime;

    @Column(nullable = false)
    private String status;

    private Timestamp createdAt;
    private Timestamp updatedAt;
    
    
    @Enumerated(EnumType.STRING)
    private ProductCategory category;
    
    
    public enum ProductCategory {
        VEGETABLE,
        FRUIT,
        PESTICIDE,
        EQUIPMENT,
        SEED,
        FERTILIZER
    }
}
