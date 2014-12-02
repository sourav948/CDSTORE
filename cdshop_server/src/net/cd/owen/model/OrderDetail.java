package net.cd.owen.model;


public class OrderDetail {
	
	private long orderDetailId;
	//private Order order;
	private int number;
	private long cdid;
	private long categoryId;// gift or ...
	private double price;
	private long orderId;
	public long getOrderDetailId() {
		return orderDetailId;
	}
	public void setOrderDetailId(long orderDetailId) {
		this.orderDetailId = orderDetailId;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public long getCdid() {
		return cdid;
	}
	public void setCdid(long cdid) {
		this.cdid = cdid;
	}
	public long getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(long categoryId) {
		this.categoryId = categoryId;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public long getOrderId() {
		return orderId;
	}
	public void setOrderId(long orderId) {
		this.orderId = orderId;
	}
	
	/*public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}*/
	
	
}
