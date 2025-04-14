package com.cropify.cartservice.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cropify.cartservice.dto.CartDTO;
import com.cropify.cartservice.dto.CartFarmProductDTO;
import com.cropify.cartservice.service.CartService;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class CartFarmerProductServiceImpl implements CartService{

	@Override
	public Long addFarmerProductToCart(Long farmerId, CartFarmProductDTO cartFarmProductDTO) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<CartDTO> getAllCartById(Long customerId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Long deleteCartById(Long cartId) {
		// TODO Auto-generated method stub
		return null;
	}
    
//    @Autowired
//    private FarmProductsRepository farmProductsRepository;
//
//    @Autowired
//    private CartFarmProductRepository cartFarmProductRepository;
//
//    @Autowired
//    private UserDetailsRepository userDetailsRepository;
//
//    @Autowired
//    private FarmerProductDetailsRepository farmerProductDetailsRepository;

//    @Autowired
//    private ModelMapper mapper;

}
