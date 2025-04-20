package com.cropify.paymentservice.model;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "paymentsTable")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long paymentId;

    @Column(name = "order_id", columnDefinition = "BIGINT")
    private Long orderId;       // Stored as String because it’s coming from Order microservice

    @Column(name = "user_id", columnDefinition = "BIGINT")
    private Long userId;        // Stored as String because it’s coming from User microservice

    @Enumerated(EnumType.STRING)
    private PaymentMode paymentMode;

    @Enumerated(EnumType.STRING)
    private PaymentStatus paymentStatus;

    @Column(name = "transaction_id")
    private String transactionId;

    @Enumerated(EnumType.STRING)
    @Column(name = "payment_gateway")
    private PaymentGateway paymentGateway;

    @Column(name = "amount", precision = 10, scale = 2)
    private BigDecimal amount;

    private String currency;

    private LocalDateTime createdAt;
    
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
    

    public enum PaymentGateway {
    	RAZORPAY,
    	STRIPE,
    	PAYTM,
    	PAYU,
    	CASH_FREE,
    	OTHER
}
}
