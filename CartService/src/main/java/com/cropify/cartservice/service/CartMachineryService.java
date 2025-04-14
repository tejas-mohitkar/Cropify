package com.cropify.cartservice.service;

import java.util.List;

import com.cropify.cartservice.dto.CartMachineryDTO;

public interface CartMachineryService {
	
	// CartMachineryDTO addMachineryIntoCart(CartMachineryDTO cartMachineryDTO);

	Long deleteCartMachineById(Long cartId);

	List<CartMachineryDTO> getAllCartMachine();

	public List<CartMachineryDTO> getAllCartMachineByFarmerId(Long farmerId);
	
	Long addMachineryIntoCart(Long farmerId, CartMachineryDTO cartMachineryDTO);
}
