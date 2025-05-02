package com.cropify.orderservice.model;

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
@Table(name = "OrdersTable")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long orderId;

    @Column(nullable = false)
    private Long userId;

    @Column(nullable = false)
    private String orderStatus;

    @Column(nullable = false)
    private Double totalAmount;

    @Column(nullable = false)
    private String paymentMode;

    @Column(nullable = false)
    private String paymentStatus;

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

