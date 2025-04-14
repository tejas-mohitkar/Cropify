package com.cropify.cartservice.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;


@Entity
public class CartFarmProduct {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long cid;
	
	// Mapped with farm_products table
//	@ManyToOne
//	@JoinColumn(name = "farm_prod_id", nullable = false)
//	private FarmProducts farmProdId;
	
	// Mapped with user_details table for farmer id
//	@ManyToOne
//	@JoinColumn(name = "farmer_id", nullable = false)
//	private UserDetails farmerId;
	
	// Mapped with user_details table for seller_id
//	@ManyToOne
//	@JoinColumn(name = "customer_id", nullable = false)
//	private UserDetails customerId;
		
	@Column
	private int quantity;
	
	@Column(name = "total_amount")
	private double totalAmount;

	/**
	 * @return the cid
	 */
	public Long getCid() {
		return cid;
	}

	/**
	 * @param cid the cid to set
	 */
	public void setCid(Long cid) {
		this.cid = cid;
	}

	/**
	 * @return the farmProdId
	 */
//	public FarmProducts getFarmProdId() {
//		return farmProdId;
//	}
//
//	/**
//	 * @param farmProdId the farmProdId to set
//	 */
//	public void setFarmProdId(FarmProducts farmProdId) {
//		this.farmProdId = farmProdId;
//	}
//
//	/**
//	 * @return the farmerId
//	 */
//	public UserDetails getFarmerId() {
//		return farmerId;
//	}
//
//	/**
//	 * @param farmerId the farmerId to set
//	 */
//	public void setFarmerId(UserDetails farmerId) {
//		this.farmerId = farmerId;
//	}

	/**
	 * @return the customerId
	 */
//	public UserDetails getCustomerId() {
//		return customerId;
//	}
//
//	/**
//	 * @param customerId the customerId to set
//	 */
//	public void setCustomerId(UserDetails customerId) {
//		this.customerId = customerId;
//	}

	/**
	 * @return the quantity
	 */
	public int getQuantity() {
		return quantity;
	}

	/**
	 * @param quantity the quantity to set
	 */
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	/**
	 * @return the totalAmount
	 */
	public double getTotalAmount() {
		return totalAmount;
	}

	/**
	 * @param totalAmount the totalAmount to set
	 */
	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}
	
	
}
