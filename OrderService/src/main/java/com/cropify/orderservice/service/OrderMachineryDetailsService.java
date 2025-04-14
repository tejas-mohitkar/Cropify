package com.cropify.orderservice.service;

import java.util.List;

public interface OrderMachineryDetailsService {

    Long MachineCartToOrder(Long FarmerId, Double totalPrice);

    // public List<CartMachineryDTO> getCartMachineById(Long id);
    
    
    // Order list of Machinery
    List<com.cropify.orderservice.dto.OrderMachineDetailsDTO> getTotalOrders(Long sellerId);
    
    Long deleteOrderByOID(Long oid);
    
    
} 
