package com.cropify.cartservice.model;

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

@Entity
@Table(name = "CartTable")
public class Cart {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cartId;

    @Column(name = "user_id", columnDefinition = "BIGINT")
    private Long userId;

    @Column(name = "product_id", columnDefinition = "BIGINT")
    private Long productId;

    private int quantity;

    @Column(name = "price_at_time", precision = 10, scale = 2)
    private BigDecimal priceAtTime;

    private LocalDateTime createdAt;
    
    private LocalDateTime updatedAt;

    @Enumerated(EnumType.STRING)
    private CartStatus status;
    

public enum CartStatus {
    PENDING,    // Cart is created but not yet processed
    COMPLETED,  // Cart is confirmed and order is placed
    CANCELLED,  // Cart is cancelled
    ABANDONED,  // Cart is abandoned by the user
    FAILED;     // Cart checkout failed (e.g., payment failure)
}
    
    
    // Getters and Setters

    public Long getCartId() {
        return cartId;
    }

    public void setCartId(Long cartId) {
        this.cartId = cartId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getPriceAtTime() {
        return priceAtTime;
    }

    public void setPriceAtTime(BigDecimal priceAtTime) {
        this.priceAtTime = priceAtTime;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public CartStatus getStatus() {
        return status;
    }

    public void setStatus(CartStatus status) {
        this.status = status;
    }
}
