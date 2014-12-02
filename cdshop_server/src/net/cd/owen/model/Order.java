package net.cd.owen.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Order {

	private long orderId;
	private Date orderTime;
	private Date updateTime;
	private int orderStatus;// 0 processing, 1 paid, 2 cancelled, 3 complete
	private double totalPrice;
	private int paymentType;//0 credit, 1 ...
	private double taxes;
	private String phoneNumber;
	private String customerName;
	private String address;
	//private Set<OrderDetail> orderDetails;
	public long getOrderId() {
		return orderId;
	}
	public void setOrderId(long orderId) {
		this.orderId = orderId;
	}
	public Date getOrderTime() {
		return orderTime;
	}
	public void setOrderTime(Date orderTime) {
		this.orderTime = orderTime;
	}
	public Date getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	public int getOrderStatus() {
		return orderStatus;
	}
	public void setOrderStatus(int orderStatus) {
		this.orderStatus = orderStatus;
	}
	public double getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}
	public int getPaymentType() {
		return paymentType;
	}
	public void setPaymentType(int paymentType) {
		this.paymentType = paymentType;
	}
	public double getTaxes() {
		return taxes;
	}
	public void setTaxes(double taxes) {
		this.taxes = taxes;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
	
	/*public Set<OrderDetail> getOrderDetails() {
		return orderDetails;
	}
	public void setOrderDetails(Set<OrderDetail> orderDetails) {
		this.orderDetails = orderDetails;
	}*/
	
	


}
