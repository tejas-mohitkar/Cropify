package com.cropify.orderservice.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cropify.orderservice.dao.OrderFarmProductDetailsRepository;
import com.cropify.orderservice.dto.OrderDTO;
import com.cropify.orderservice.dto.OrderFarmProductDetailsDTO;
import com.cropify.orderservice.service.OrderService;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class OrderFarmProductDetailsServiceImpl implements OrderService {

//    @Autowired
    private OrderFarmProductDetailsRepository orderFarmProductDetailsRepository;
//
//    @Autowired
//    private CartFarmProductRepository cartFarmProductRepository;
//
//    @Autowired
//    private UserDetailsRepository userDetailsRepository;
//
//    @Autowired
//    private FarmProductsRepository farmProductsRepository;
//
//    @Autowired
//    private FarmerProductDetailsRepository farmerProductDetailsRepository;

    private String customGeneratedId;

    public String customeIdGenerationForFarmProductOrders() {
        int count = orderFarmProductDetailsRepository.findDistinctOrderIdForIdGeneration() + 1;
        customGeneratedId = "of" + count;
        return customGeneratedId;
    }

	@Override
	public String addFarmProductToCart(Long farmerId, Double totalPrice) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<OrderDTO> getAllOrder(Long customerId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Long deleteOrderById(Long cid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<OrderFarmProductDetailsDTO> getTotalOrders(Long farmerId) {
		// TODO Auto-generated method stub
		return null;
	}



}
