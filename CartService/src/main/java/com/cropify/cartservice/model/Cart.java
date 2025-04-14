package com.cropify.cartservice.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "cart")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Cart {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cartId;

    @Column(name = "user_id", nullable = false)
    private Long userId; // Store userId directly

    @Column(name = "product_id", nullable = false)
    private Long productId; // Store productId directly

    @Column(nullable = false)
    private Integer quantity;

    private LocalDateTime addedAt;
    private LocalDateTime updatedAt;

    @PrePersist
    protected void onCreate() {
        addedAt = updatedAt = LocalDateTime.now();
    }

    @PreUpdate
    protected void onUpdate() {
        updatedAt = LocalDateTime.now();
    }
}
