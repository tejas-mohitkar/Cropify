package com.cropify.cartservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CartItemResponse {
    private Long cartItemId;
    private String productName;
    private int quantity;
    private double price;
}
