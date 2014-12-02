package net.cd.owen.vo;

import java.util.Date;

public class ShippingInfo {

	private String phoneNumber;
	private Date registerTime;
	private String receiver;
	private String email;
	private String address;
	private String city;
	private String nation;
	private String province;
	private String zip;
	private int shippingMethod;
	
	
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public Date getRegisterTime() {
		return registerTime;
	}
	public void setRegisterTime(Date registerTime) {
		this.registerTime = registerTime;
	}
	public String getCustomerName() {
		return receiver;
	}
	public void setCustomerName(String receiver) {
		this.receiver = receiver;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getNation() {
		return nation;
	}
	public void setNation(String nation) {
		this.nation = nation;
	}
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	public int getShippingMethod() {
		return shippingMethod;
	}
	public void setShippingMethod(int shippingMethod) {
		this.shippingMethod = shippingMethod;
	}
	
}
