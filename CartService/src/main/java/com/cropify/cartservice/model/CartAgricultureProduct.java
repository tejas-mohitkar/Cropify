package com.cropify.cartservice.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;

@Entity
public class CartAgricultureProduct {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long cid;
	// Mapped with agriculture_product table
//	@ManyToOne
	@JoinColumn(name = "agri_prod_id", nullable = false)
//	private AgricultureProducts agriProdId;
	
	// Mapped with user_details table for farmer id
//	@ManyToOne
	@JoinColumn(name = "farmer_id", nullable = false)
//	private UserDetails farmerId;
	
	// Mapped with user_details table for seller_id
//	@ManyToOne
//	@JoinColumn(name = "seller_id", nullable = false)
//	private UserDetails sellerId;
		
	@Column
	private int quantity;
	
	@Column(name = "total_amount")
	private double totalAmount;

	/**
	 * @return the cid
	 */
//	public Long getCid() {
//		return cid;
//	}

	/**
	 * @param cid the cid to set
	 */
//	public void setCid(Long cid) {
//		this.cid = cid;
//	}

	/**
	 * @return the agriProdId
	 */
//	public AgricultureProducts getAgriProdId() {
//		return agriProdId;
//	}

	/**
	 * @param agriProdId the agriProdId to set
	 */
//	public void setAgriProdId(AgricultureProducts agriProdId) {
//		this.agriProdId = agriProdId;
//	}

	/**
	 * @return the farmerId
	 */
//	public UserDetails getFarmerId() {
//		return farmerId;
//	}

	/**
	 * @param farmerId the farmerId to set
	 */
//	public void setFarmerId(UserDetails farmerId) {
//		this.farmerId = farmerId;
//	}

	/**
	 * @return the sellerId
	 */
//	public UserDetails getSellerId() {
//		return sellerId;
//	}

	/**
	 * @param sellerId the sellerId to set
	 */
//	public void setSellerId(UserDetails sellerId) {
//		this.sellerId = sellerId;
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
