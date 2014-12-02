package net.cd.owen.model;

public class CreditCard {

	private long creditCardNumber;
	private String creditCardPassword;
	private String bankName;
	private String customerName;
	private double upperLimit;
	
	public long getCreditCardNumber() {
		return creditCardNumber;
	}
	public void setCreditCardNumber(long creditCardNumber) {
		this.creditCardNumber = creditCardNumber;
	}
	public String getCreditCardPassword() {
		return creditCardPassword;
	}
	public void setCreditCardPassword(String creditCardPassword) {
		this.creditCardPassword = creditCardPassword;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public double getUpperLimit() {
		return upperLimit;
	}
	public void setUpperLimit(double upperLimit) {
		this.upperLimit = upperLimit;
	}
}
