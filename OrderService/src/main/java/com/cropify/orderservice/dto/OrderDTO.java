package com.cropify.orderservice.dto;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class OrderDTO {
    public Long getOid() {
		return oid;
	}
	public void setOid(Long oid) {
		this.oid = oid;
	}
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getFarmProductName() {
		return farmProductName;
	}
	public void setFarmProductName(String farmProductName) {
		this.farmProductName = farmProductName;
	}
	public LocalDate getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(LocalDate orderDate) {
		this.orderDate = orderDate;
	}
	public LocalDate getDeliveryDate() {
		return deliveryDate;
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
//	public void setFarmOrderStatus(FarmOrderStatus farmOrderStatus) {
//		this.farmOrderStatus = farmOrderStatus;
//	}
	private Long oid;
    private String orderId;
    private String farmProductName;
    private LocalDate orderDate;
    private LocalDate deliveryDate;
    private int quantity;
    private double totalPrice;
//    private FarmOrderStatus farmOrderStatus;
}
