package com.cropify.orderservice.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cropify.orderservice.dao.OrderMachineDetailsRepository;
import com.cropify.orderservice.service.OrderMachineryDetailsService;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class OrderMachineDetailsServiceImpl implements OrderMachineryDetailsService{

    @Autowired
    private OrderMachineDetailsRepository orderMachineDetailsRepository;
//    
//    @Autowired
//    private SellerMachineryDetailsRepository sellerMachineryDetailsRepository;
//
//    @Autowired
//    private CartMachineryService cartMachineryService;
//
//    @Autowired
//    private UserDetailsRepository userDetailsRepository;
//
//    @Autowired
//    private MachineryRepository machineryRepository;
//
//    @Autowired
//    private SellerMachineryDetailsService sellerMachineryDetailsService;
//
//    @Autowired
//    private CartMachineryRepository cartMachineryRepository;
    
    @Autowired
    private OrderMachineDetailsRepository machineDetails;

    private String generatedId;

    public String customeIdGenerationForMachineOrders(){
        int count = orderMachineDetailsRepository.findDistinctOrderIdForIdGeneration() + 1;
        generatedId = "om"+count;
        return generatedId;
    }

	@Override
	public Long MachineCartToOrder(Long FarmerId, Double totalPrice) {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public Long deleteOrderByOID(Long oid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<com.cropify.orderservice.dto.OrderMachineDetailsDTO> getTotalOrders(Long sellerId) {
		// TODO Auto-generated method stub
		return null;
	}
}
