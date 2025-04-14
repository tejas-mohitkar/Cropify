package com.cropify.cartservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cropify.cartservice.dto.CartDTO;
import com.cropify.cartservice.dto.CartFarmProductDTO;
import com.cropify.cartservice.service.CartFarmerProductService;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/api/cartfarmproduct")
public class CartFarmProductController {

    @Autowired
    private CartFarmerProductService cartFarmerProductService;

    @PostMapping("/{customerId}")
    public ResponseEntity<Long> addFarmerProductIntoCart(@PathVariable Long customerId, @RequestBody CartFarmProductDTO cartFarmProductDTO){
        System.out.println(cartFarmProductDTO.getCid() + " " + cartFarmProductDTO.getFarmProdId() + " " + cartFarmProductDTO.getCustomerId());
        Long cartId = cartFarmerProductService.addFarmerProductToCart(customerId, cartFarmProductDTO);
        return ResponseEntity.ok(cartId);
    }

    @GetMapping("/{customerId}")
    public ResponseEntity<List<CartDTO>> getAllCartById(@PathVariable Long customerId){
        return ResponseEntity.ok(cartFarmerProductService.getAllCartById(customerId));
    }

    @DeleteMapping("/{cid}")
    public ResponseEntity<Long> deleteCart(@PathVariable Long cid){
        return ResponseEntity.ok(cartFarmerProductService.deleteCartById(cid));
    }

}
