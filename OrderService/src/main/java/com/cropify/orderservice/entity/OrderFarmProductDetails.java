package com.cropify.orderservice.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class OrderFarmProductDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long oid;

	@Column(name = "order_id", nullable = false)
	private String orderId;

	// Mapped with user_details for customer
//	@ManyToOne
//	@JoinColumn(name = "customer_id", nullable = false)
//	private UserDetails customerId;
//
//	// Mapped with user_details for farmer
//	@ManyToOne
//	@JoinColumn(name = "farmer_id", nullable = false)
//	private UserDetails farmerId;
//	
//	// Mapped with farm_product
//	@ManyToOne
//	@JoinColumn(name = "farm_prod_id", nullable = false)
//	private FarmProducts farmProdId;

	@Column(name = "order_date", nullable = false)
	private LocalDate orderDate;

	@Column(name = "delivery_date", nullable = false)
	private LocalDate deliveryDate;

	@Column
	private int quantity;

	@Column(name = "total_amount", nullable = false)
	private double totalPrice;

//	@Column(name = "farm_order_status", nullable = false)
//	@Enumerated(EnumType.STRING)
//	private FarmOrderStatus farmOrderStatus;

	// -------------------- Constructors ---------------------------------
	public OrderFarmProductDetails() {
		super();
	}
	
//	public OrderFarmProductDetails(UserDetails customerId, UserDetails farmerId, FarmProducts farmProdId,
//			LocalDate orderDate, LocalDate deliveryDate, int quantity, double totalPrice,
//			FarmOrderStatus farmOrderStatus, String orderId) {
//		super();
//		this.customerId = customerId;
//		this.farmerId = farmerId;
//		this.farmProdId = farmProdId;
//		this.orderDate = orderDate;
//		this.deliveryDate = deliveryDate;
//		this.quantity = quantity;
//		this.totalPrice = totalPrice;
//		this.farmOrderStatus = farmOrderStatus;
//		this.orderId = orderId;
//	}

	// -----------------------------Getter and Setters--------------------
//	public UserDetails getCustomerId() {
//		return customerId;
//	}

//	public void setCustomerId(UserDetails customerId) {
//		this.customerId = customerId;
//	}

	public LocalDate getOrderDate() {
		return orderDate;
	}

	public Long getOid() {
		return oid;
	}

	public void setId(Long oid) {
		this.oid = oid;
	}

	public void setOrderDate(LocalDate orderDate) {
		this.orderDate = orderDate;
	}

	public LocalDate getDeliveryDate() {
		return deliveryDate;
	}

	public void setOrderId(String orderId){
		this.orderId = orderId;
	}
	
	public String getOrderId(){
		return orderId;
	}

	public void setDeliveryDate(LocalDate deliveryDate) {
		this.deliveryDate = deliveryDate;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

//	public FarmOrderStatus getFarmOrderStatus() {
//		return farmOrderStatus;
//	}
//
//	public void setFarmOrderStatus(FarmOrderStatus farmOrderStatus) {
//		this.farmOrderStatus = farmOrderStatus;
//	}
//
//	public UserDetails getFarmerId() {
//		return farmerId;
//	}
//
//	public void setFarmerId(UserDetails farmerId) {
//		this.farmerId = farmerId;
//	}
//
//	public FarmProducts getFarmProdId() {
//		return farmProdId;
//	}
//
//	public void setFarmProdId(FarmProducts farmProdId) {
//		this.farmProdId = farmProdId;
//	}

//	public FarmerProductDetails getFarmerProductDetails() {
//		return farmerProductDetails;
//	}
//
//	public void setFarmerProductDetails(FarmerProductDetails farmerProductDetails) {
//		this.farmerProductDetails = farmerProductDetails;
//	}

}
