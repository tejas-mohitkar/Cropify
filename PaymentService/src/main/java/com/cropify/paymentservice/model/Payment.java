package com.cropify.paymentservice.model;

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
@Table(name = "PaymentsTable")
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long paymentId;

    @Column(nullable = false)
    private Long orderId;

    @Column(nullable = false)
    private Long userId;
    
    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private PaymentMode paymentMode;

    @Column(nullable = false)
    
    private PaymentStatus paymentStatus;

    private String transactionId;
    private String paymentGateway;
    
    @Column(nullable = false)
    private Double amount;

    private String currency;
    private Timestamp createdAt;
    
    
    
 // Payment Status
    public enum PaymentStatus {
        PENDING,
        PAID,
        FAILED
    }
    
 // Payment Mode
    public enum PaymentMode {
        CASH,
        CARD,
        UPI,
        NET_BANKING
    }
    
    
}
