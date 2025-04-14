package com.cropify.cartservice.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cropify.cartservice.dao.CartMachineryRepository;
import com.cropify.cartservice.dto.CartMachineryDTO;
import com.cropify.cartservice.model.CartMachinery;
import com.cropify.cartservice.service.CartMachineryService;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class CartMachineryServiceImpl implements CartMachineryService {

	@Autowired
	private CartMachineryRepository cartMachineryRepository;
//	@Autowired
//	private UserDetailsRepository userRepo;
//	@Autowired
//	private MachineryRepository machineRepo;

	@Override
	public Long deleteCartMachineById(Long cartId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<CartMachineryDTO> getAllCartMachine() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<CartMachineryDTO> getAllCartMachineByFarmerId(Long farmerId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Long addMachineryIntoCart(Long farmerId, CartMachineryDTO cartMachineryDTO) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
