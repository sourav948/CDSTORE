package net.cd.owen.service.orderprocess;

import java.util.List;

import javax.jws.WebService;

import net.cd.owen.dao.OrderDao;
import net.cd.owen.model.Order;
import net.cd.owen.model.OrderDetail;
@WebService(endpointInterface = "net.cd.owen.service.orderprocess.OrderProcessService")
public class OrderProcessServiceImp implements OrderProcessService{

	private OrderDao orderDao = OrderDao.getInstance();
	private static OrderProcessService orderProcessService = new OrderProcessServiceImp();
	
	public static OrderProcessService getInstance(){
		return orderProcessService;
	}
	
	public long saveOrder(Order order, List<OrderDetail> orderDetails){
		return orderDao.save(order,orderDetails);
	}
	
	public boolean confirmOrder(Order order){
		return orderDao.updateOrder(order);
	}
	
}
