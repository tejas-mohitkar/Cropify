package com.cropify.cartservice.dto;

import lombok.Data;

@Data
public class CartItemRequest {
    private Long userId;
    private Long productId;
    private int quantity;
}
