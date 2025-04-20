package com.cropify.orderservice.model;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "order_itemsTable")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OrderItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long orderItemId;

    @Column(name = "product_id", columnDefinition = "BIGINT")
    private Long productId;
    
    @Column(name = "prduct_name")
    private String productName;

    @Column(name = "product_price", precision = 10, scale = 2)
    private BigDecimal productPrice;

    private int quantity;

    @Column(name = "total_price")
    private BigDecimal totalPrice;

    // Many order items belong to one order
    @ManyToOne
    @JoinColumn(name = "order_id")
    private Order order;
}
