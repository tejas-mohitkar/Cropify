package com.cropify.productservice.model;

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
@Table(name = "ProductTable")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long productId;

    @Column(nullable = false)
    private String productName;

    private String description;

    @Column(nullable = false)
    private Double price;

    @Column(nullable = false)
    private Integer quantity;

    @Enumerated(EnumType.STRING)
    private ProductCategory category;

    private String expiryDate;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private UserRole ownerRole;

    @Column(nullable = false)
    private Boolean isAvailable;

    private Timestamp createdAt;
    private Timestamp updatedAt;

    // ❌ Remove @ManyToOne
    // ✅ Store userId directly instead
    @Column(nullable = false)
    private Long userId;
    
    
    
    public enum UserRole {
        VEHICLE_OWNER,
        PESTICIDE_SELLER,
        FARMER
    }
//
    public enum ProductCategory {
        VEGETABLE,
        FRUIT,
        PESTICIDE,
        EQUIPMENT,
        SEED,
        FERTILIZER
    }
    
}
