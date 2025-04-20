package com.cropify.productservice.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "ProductTable")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long productId;

    @Column(name = "prduct_name")
    private String productName;

    @Column(columnDefinition = "TEXT")
    private String description;

    @Column(name = "price", precision = 10, scale = 2)
    private BigDecimal price;

    private int quantity;

    @Enumerated(EnumType.STRING)
    private ProductCategory category;

    @Column(name = "user_id", columnDefinition = "BIGINT")
    private Long userId;

    @Enumerated(EnumType.STRING)
    private UserRole ownerRole;

    @Column(name = "is_available")
    private Boolean isAvailable;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;

    
    public enum UserRole {
        VEHICLE_OWNER,
        PESTICIDE_SELLER,
        FARMER
    }

    public enum ProductCategory {
        VEGETABLE,
        FRUIT,
        PESTICIDE,
        EQUIPMENT,
        SEED,
        FERTILIZER
    }

}
