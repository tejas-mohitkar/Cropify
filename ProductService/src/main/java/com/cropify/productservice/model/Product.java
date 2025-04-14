package com.cropify.productservice.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import com.cropify.productservice.enumlist.OwnerRole;
import com.cropify.productservice.enumlist.ProductType;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "product")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id")  // Added @Column for consistency and clear mapping
    private Long productId;

    @Column(nullable = false, length = 150) // Ensures name is not null and has max length of 150
    private String name;

    @Lob
    @Column(name = "description")  // Annotating Lob field for large object
    private String description;

    @Column(nullable = false, precision = 10, scale = 2)  // Precision and scale for decimal price
    private BigDecimal price;

    @Column(nullable = false)
    private Integer quantityAvailable;

    @Enumerated(EnumType.STRING)
    @Column(name = "product_type", nullable = false)  // Specifying enum type and column name
    private ProductType productType;

    @Column(name = "owner_id", nullable = false) // Ensuring owner ID is not null
    private Long ownerId;

    @Enumerated(EnumType.STRING)
    @Column(name = "owner_role", nullable = false)  // Specifying owner role and column name
    private OwnerRole ownerRole;

    @Column(name = "is_available")
    private Boolean isAvailable = true;

    @Column(name = "category")  // Explicitly defining category column
    private String category;

    @Column(name = "created_at", updatable = false)  // Prevent updates on creation timestamp
    private LocalDateTime createdAt;

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    @PrePersist
    protected void onCreate() {
        createdAt = updatedAt = LocalDateTime.now();  // Set timestamps on creation
    }

    @PreUpdate
    protected void onUpdate() {
        updatedAt = LocalDateTime.now();  // Update timestamp before update
    }
}
