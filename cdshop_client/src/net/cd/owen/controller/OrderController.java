package net.cd.owen.controller;

import java.io.IOException;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import net.cd.owen.model.CreditCard;
import net.cd.owen.model.Customer;
import net.cd.owen.model.OrderDetail;
import net.cd.owen.service.customer.CustomerService;
import net.cd.owen.service.customer.CustomerServiceImpService;
import net.cd.owen.service.orderprocess.Order;
import net.cd.owen.service.orderprocess.OrderProcessService;
import net.cd.owen.service.orderprocess.OrderProcessServiceImpService;
import net.cd.owen.vo.AccountInfo;

public class OrderController {
	private static OrderProcessServiceImpService orderProcessService = new OrderProcessServiceImpService();
	CustomerServiceImpService customerServiceImpService = new CustomerServiceImpService();
	private static OrderProcessService orderPort = orderProcessService
			.getOrderProcessServiceImpPort();

	CustomerService customerPort = customerServiceImpService
			.getCustomerServiceImpPort();

	static int count = 1;

	// private static OrderProcessService orderProcessService = new
	// OrderProcessServiceImp();

	// private Customer customer;

	public void disputeRequests(String actionPath, HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		if (actionPath.equals("/shopping_cart")) {

		} else if (actionPath.equals("/shopping_info")) {
			// getProducts(request, response);
		} else if (actionPath.equals("/check_out")) {
			check_out(request, response);
		} else if (actionPath.equals("/confirm_order")) {
			confirm_order(request, response);
		} else if (actionPath.equals("/create_order")) {
			create_order(request, response);
		} else if (actionPath.equals("/credit_confirm")) {
			creditCard_Verify(request, response);
		}
	}

	public void creditCard_Verify(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		Customer customer = new Customer();

		for (Cookie cookie : request.getCookies()) {
			if (cookie.getName().equals("cd_username"))
				customer.setCustomerName(cookie.getValue());
			else if (cookie.getName().equals("cd_password"))
				customer.setPassword(cookie.getValue());
		}
		AccountInfo accountInfo = customerPort.getAccount(customer);
		Customer customerBackend = accountInfo.getCustomer();
		/*
		 * if(customerBackend.getCreditCardNumber()==
		 * Long.valueOf(request.getParameter("creditCardNumber"))
		 * &&customerBackend
		 * .getCreditCardPassword().equals(request.getParameter(
		 * "creditCardPassword"))
		 */

	}

	public void create_order(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		Order order = new Order();
		GregorianCalendar cc = new GregorianCalendar();
		cc.setTime(new Date());
		XMLGregorianCalendar date2 = null;
		try {
			date2 = DatatypeFactory.newInstance().newXMLGregorianCalendar(cc);
		} catch (Exception e) {
			System.out.print(e);
		}
		order.setUpdateTime(date2);
		order.setOrderTime(date2);
		order.setCustomerName(request.getParameter("customer_name"));
		order.setAddress(request.getParameter("customer_address") + ","
				+ request.getParameter("customer_city") + ","
				+ request.getParameter("province") + ","
				+ request.getParameter("customer_country"));
		order.setPhoneNumber(request.getParameter("country_code")
				+ request.getParameter("customer_phoneNumber"));
		List<OrderDetail> orderDetailList = new ArrayList<OrderDetail>();
		Cookie[] cookies = request.getCookies();
		double totalMoney = 0;
		boolean flag = false;//
		for (Cookie c : cookies) {
			if (c != null && c.getName().startsWith("cdid")) {
				if ("".equals(c.getValue()) || c.getValue().equals("0"))
					continue;
				String[] name = c.getName().split("_");
				// $("#categoryId").html()+"_"+$("#price").html()+"_"+$("#title").html()+"_"+$("#picUrl").attr("src")
				if ("".equals(name[1]))
					break;
				OrderDetail orderdetail = new OrderDetail();
				orderdetail.setCdid(Long.valueOf(name[1]));
				orderdetail.setCategoryId(Long.valueOf(name[2]));
				orderdetail.setPrice(Double.valueOf(name[3]));
				orderdetail.setNumber(Integer.valueOf(c.getValue()));
				totalMoney += Double.valueOf(name[3]);
				orderDetailList.add(orderdetail);
				flag = true;
			}
		}
		order.setTotalPrice(totalMoney);
		if (flag) {
			long orderId = orderPort.saveOrder(order, orderDetailList);
			request.getSession().setAttribute("orderId", orderId);
		}
		request.getRequestDispatcher("/credit.jsp").forward(request, response);
	}

	public Order testPrepareOrder(Order order) {

		order.setAddress("Southgate,ON,Ca,1f2 3d5");
		order.setCustomerName("WWW");
		// order.setOrderId(12312);
		order.setOrderStatus(2);
		GregorianCalendar c = new GregorianCalendar();
		c.setTime(new Date());
		XMLGregorianCalendar date2 = null;
		try {
			date2 = DatatypeFactory.newInstance().newXMLGregorianCalendar(c);
		} catch (Exception e) {
			System.out.print(e);
		}
		order.setUpdateTime(date2);
		order.setOrderTime(date2);
		order.setPaymentType(2);
		order.setPhoneNumber("2135465");
		order.setTotalPrice(33);
		order.setUpdateTime(date2);
		order.setTaxes(22);
		// order.setOrderDetails(testPrepareOrderDetails());
		return order;
	}

	public List<OrderDetail> testPrepareOrderDetails() {
		OrderDetail orderDetail1 = new OrderDetail();
		OrderDetail orderDetail2 = new OrderDetail();
		orderDetail1.setCategoryId(3);
		orderDetail1.setCdid(2131);
		orderDetail1.setNumber(3);
		orderDetail1.setPrice(22);
		// orderDetail1.setOrder(order);
		// orderDetail1.setOrderDetailId(12312);

		orderDetail2.setCategoryId(2);
		orderDetail2.setCdid(2131);
		orderDetail2.setNumber(4);
		orderDetail2.setPrice(55.6);
		// orderDetail2.setOrder(order);

		List<OrderDetail> orderDetails = new ArrayList<OrderDetail>();
		orderDetails.add(orderDetail1);
		orderDetails.add(orderDetail2);
		return orderDetails;
	}

	/*
	 * public Order testPrepare(Order order) { OrderDetail orderDetail1 = new
	 * OrderDetail(); OrderDetail orderDetail2 = new OrderDetail();
	 * order.setAddress("Southgate,ON,Ca,1f2 3d5");
	 * order.setCustomerName("WWW"); order.setOrderId(222222);
	 * order.setOrderStatus(2); GregorianCalendar c = new GregorianCalendar();
	 * c.setTime(new Date()); XMLGregorianCalendar date2=null; try{ date2 =
	 * DatatypeFactory.newInstance().newXMLGregorianCalendar(c);
	 * }catch(Exception e){ System.out.print(e); } order.setUpdateTime(date2);
	 * 
	 * order.setOrderTime(date2); order.setPaymentType(2);
	 * order.setPhoneNumber("2135465"); order.setTotalPrice(33);
	 * 
	 * orderDetail1.setCategoryId(3); orderDetail1.setCdid(2131);
	 * orderDetail1.setNumber(3); orderDetail1.setOrder(order);
	 * //orderDetail1.setOrderDetailId(12312); orderDetail1.setPrice(22);
	 * orderDetail2.setCategoryId(2); orderDetail2.setCdid(2131);
	 * orderDetail2.setNumber(4); orderDetail2.setOrder(order);
	 * orderDetail2.setPrice(55.6); order.getOrderDetails().add(orderDetail1);
	 * order.getOrderDetails().add(orderDetail2); return order; }
	 */

	public void check_out(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// Order order = new Order();
		// int add_quantity = 0;
		int total_quantity = 0;
		Cookie[] cookies = request.getCookies();
		for (Cookie cookie : cookies) {
			if (cookie.getName().startsWith("cdid")
					&& cookie.getValue() != null
					&& !"".equals(cookie.getValue())) {
				if (cookie.getValue().equals("0"))
					continue;
				String cookieName = URLDecoder
						.decode(cookie.getName(), "UTF-8");
				String[] title = cookieName.split("_");
				// int origin_quantity = Integer.valueOf(cookie.getValue());
				cookie.setValue((String) request.getParameter(title[1]));
				response.addCookie(cookie);
				int current_quantity = Integer.valueOf((String) request
						.getParameter(title[1]));
				total_quantity += current_quantity;
			}
		}
		for (Cookie cookie : cookies) {
			if (cookie.getName().equals("product_quantity")) {
				cookie.setValue(String.valueOf(total_quantity));
				response.addCookie(cookie);
				break;
			}
		}

		if (request.getSession().getAttribute("customerName") != null) {

			Customer customer = new Customer();
			customer.setCustomerName((String) request.getSession()
					.getAttribute("customerName"));
			customer.setPassword((String) request.getSession().getAttribute(
					"customerPassword"));
			/*
			 * for (Cookie cookie : request.getCookies()) { if
			 * (cookie.getName().equals("cd_username"))
			 * customer.setCustomerName(cookie.getValue()); else if
			 * (cookie.getName().equals("cd_userpassword"))
			 * customer.setPassword(cookie.getValue()); }
			 */

			AccountInfo accountInfo = customerPort.getAccount(customer);
			request.setAttribute("accountInfo", accountInfo);

			request.getRequestDispatcher("/checkout.jsp").forward(request,
					response);
		} else {
			request.getSession().setAttribute("from", "checkout");
			request.getRequestDispatcher("/login.jsp").forward(request,
					response);
		}
	}

	public void confirm_order(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException { 
		// the order is confirmed after adding credit info.
		count++;
		if(count%6==0)
		{
			request.getRequestDispatcher("/404.jsp").forward(request, response);

		}else
		{
			if (request.getSession().getAttribute("orderId") != null) {
				Order order = new Order();
				order.setOrderId((Long) request.getSession()
						.getAttribute("orderId"));
				orderPort.confirmOrder(order);
				Cookie[] cookies = request.getCookies();
				for( Cookie cookie :cookies)
				{
					if(cookie.getName().equals("product_quantity"))
					{

						cookie.setValue("0");
						cookie.setMaxAge(2);
						response.addCookie(cookie);
						break;
					}
				}

				request.getRequestDispatcher("/order_success.jsp").forward(request,
						response);
			} else
				request.getRequestDispatcher("/404.jsp").forward(request, response);
		}
	}
}