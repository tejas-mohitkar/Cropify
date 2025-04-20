package com.cropify.orderservice.service;

import java.util.List;

import com.cropify.orderservice.dto.OrderDTO;
import com.cropify.orderservice.dto.OrderFarmProductDetailsDTO;

public interface OrderService {
    String addFarmProductToCart(Long farmerId, Double totalPrice);

    List<OrderDTO> getAllOrder(Long customerId);

    Long deleteOrderById(Long cid);
    
    // ------------
    List<OrderFarmProductDetailsDTO> getTotalOrders(Long farmerId);

}
