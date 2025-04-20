package com.cropify.orderservice.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "ordersTable")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long orderId;

    @Column(name = "user_id", columnDefinition = "BIGINT")
    private Long userId;
    
    @Enumerated(EnumType.STRING)
    private OrderStatus orderStatus;

    @Column(name = "total_amount", precision = 10, scale = 2)
    private BigDecimal totalAmount;

    @Enumerated(EnumType.STRING)
    private PaymentMode paymentMode;
    
    @Enumerated(EnumType.STRING)
    private PaymentStatus paymentStatus;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;

    // One order can have many order items
    @OneToMany(mappedBy = "order", cascade = CascadeType.ALL)
    private List<OrderItem> orderItems;
    
    

    public enum OrderStatus {
    	PENDING,      // Order has been placed but not yet processed
    	CONFIRMED,    // Order has been confirmed
    	SHIPPED,      // Order has been shipped
    	DELIVERED,    // Order has been delivered
    	CANCELLED,    // Order has been cancelled
    	RETURNED,     // Order has been returned by the user
    	FAILED;       // Order failed (payment failed or other issues)
	}
    
    public enum PaymentMode {
        CREDIT_CARD,  // Payment made using a credit card
        DEBIT_CARD,   // Payment made using a debit card
        NET_BANKING,  // Payment made through internet banking
        UPI,          // Payment made via UPI
        WALLET,       // Payment made using digital wallets (e.g., Paytm, Google Pay)
        CASH_ON_DELIVERY; // Payment made at the time of delivery
    }
    

    public enum PaymentStatus {
    	PENDING,   // Payment is pending and not yet completed
    	SUCCESS,   // Payment was successful
    	FAILED,    // Payment failed
    	CANCELLED, // Payment was cancelled
    	REFUNDED;  // Payment was refunded
    }

}
