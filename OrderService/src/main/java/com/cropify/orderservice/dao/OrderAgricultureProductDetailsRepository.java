package com.cropify.orderservice.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cropify.orderservice.entity.OrderAgricultureProductDetails;

public interface OrderAgricultureProductDetailsRepository extends JpaRepository<OrderAgricultureProductDetails, Long> {

//	public Optional<OrderAgricultureProductDetails> findByOrderId(Long orderId);
//
//	public List<OrderAgricultureProductDetails> findAll();
//
////	@Query // used to specify a custom SQL or HQL query that should be executed by the
//			// associated method.
//	public void deleteByOrderId(Long orderId);

}
