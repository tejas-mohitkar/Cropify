package com.cropify.cartservice.dto;

import lombok.Data;

@Data
public class UpdateCartRequest {
    private Long cartItemId;
    private int quantity;
}
