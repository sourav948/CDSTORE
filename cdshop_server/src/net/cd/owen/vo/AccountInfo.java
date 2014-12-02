package net.cd.owen.vo;

import java.util.ArrayList;
import java.util.List;

import net.cd.owen.model.Customer;
import net.cd.owen.model.Order;

public class AccountInfo {

	Customer customer;
	List<Order> orders = new ArrayList<Order>();
	
	public Customer getCustomer() {
		return customer;
	}


	public void setCustomer(Customer customer) {
		this.customer = customer;
	}


	public List<Order> getOrders() {
		return orders;
	}

	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}
	
}
