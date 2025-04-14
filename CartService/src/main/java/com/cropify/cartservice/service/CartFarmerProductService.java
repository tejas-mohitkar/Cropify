package com.cropify.cartservice.service;

import java.util.List;

import com.cropify.cartservice.dto.CartDTO;
import com.cropify.cartservice.dto.CartFarmProductDTO;

public interface CartFarmerProductService {

    Long addFarmerProductToCart(Long farmerId, CartFarmProductDTO cartFarmProductDTO);

    List<CartDTO> getAllCartById(Long customerId);

    Long deleteCartById(Long cartId);
 
}
