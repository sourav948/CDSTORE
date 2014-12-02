package net.cd.owen.service.orderprocess;


import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.ParameterStyle;
import javax.jws.soap.SOAPBinding.Style;
import javax.jws.soap.SOAPBinding.Use;

import net.cd.owen.model.Order;
import net.cd.owen.model.OrderDetail;
@WebService
@SOAPBinding(style= Style.DOCUMENT, use = Use.LITERAL, parameterStyle = ParameterStyle.WRAPPED)
public interface OrderProcessService {
	@WebMethod 
	public long saveOrder(Order order, List<OrderDetail> orderDetails);
	//public boolean saveOrder(Order order);
	@WebMethod 
	public boolean confirmOrder(Order order);
}
