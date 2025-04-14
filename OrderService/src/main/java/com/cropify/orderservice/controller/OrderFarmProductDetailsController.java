package com.cropify.orderservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cropify.orderservice.dto.OrderDTO;
import com.cropify.orderservice.dto.OrderFarmProductDetailsDTO;
import com.cropify.orderservice.service.OrderFarmProductDetailsService;

import jakarta.validation.constraints.NotNull;

@RestController
@RequestMapping("/api/orderfarmproductdetails")
@CrossOrigin(origins = "http://localhost:3000")
public class OrderFarmProductDetailsController {
    
    @Autowired
    private OrderFarmProductDetailsService orderFarmProductDetailsService;

    @PostMapping("/{customerId}/{totalPrice}")
    public String addCustomerProductToCart(@PathVariable("customerId") Long farmerId, @PathVariable("totalPrice") Double totalPrice){
        return orderFarmProductDetailsService.addFarmProductToCart(farmerId, totalPrice);
    }

    @GetMapping("/{customerId}")
    public ResponseEntity<List<OrderDTO>> getOrderById(@PathVariable Long customerId){
        // return orderFarmProductDetailsService.getOrder(customerId);
//        return ResponseEntity.ok(orderFarmProductDetailsService.getAllOrder(customerId));
    	return null;
    }

    @DeleteMapping("/{oid}")
    public ResponseEntity<Long> deleteOrder(@PathVariable Long oid){
        return ResponseEntity.ok(orderFarmProductDetailsService.deleteOrderById(oid));
    }
    
    // -------------
    @GetMapping("/orderlist/{userId}")
    public ResponseEntity<List<OrderFarmProductDetailsDTO>> getAllOrderById(@PathVariable @NotNull Long userId){
//    	List<OrderFarmProductDetailsDTO> detailsDTOs= orderFarmProductDetailsService.getTotalOrders(userId);
//    	return ResponseEntity.status(HttpStatus.OK).body(detailsDTOs);
    	return null;
    }
    
    @GetMapping("/orderbyfarmerid/{farmerId}")
    public ResponseEntity<List<OrderFarmProductDetailsDTO>> getOrdered(@PathVariable Long farmerId){
//    	return ResponseEntity.ok(orderFarmProductDetailsService.getTotalOrders(farmerId));
    	return null;
    }
}
