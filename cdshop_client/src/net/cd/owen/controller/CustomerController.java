package net.cd.owen.controller;

import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import net.cd.owen.model.Customer;
import net.cd.owen.service.customer.CustomerService;
import net.cd.owen.service.customer.CustomerServiceImpService;

public class CustomerController {

	private static CustomerServiceImpService customerServiceImpService = new CustomerServiceImpService();

	CustomerService customerPort = customerServiceImpService
			.getCustomerServiceImpPort();

	public void disputeRequests(String actionPath, HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		if (actionPath.equals("/register")) {
			customerRegister(request, response);
		} else if (actionPath.equals("/logout")) {
			processLogout(request, response);
		} else if (actionPath.equals("/login")) {
			login(request, response);
		} else if (actionPath.equals("/submitLogin")) {
			submitlogin(request, response);
		}
	}

	public void customerRegister(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		Customer customer = new Customer();

		customer.setCustomerName((String) request.getParameter("customer_name"));
		customer.setPassword((String) request.getParameter("customer_password"));
		customer.setZip((String) request.getParameter("customer_zip") == null ? new String(
				"0") : (String) request.getParameter("customer_zip"));
		customer.setPhoneNumber((String) request
				.getParameter("customer_phoneNumber") == null ? new String("0")
				: (String) request.getParameter("customer_phoneNumber"));
		customer.setEmail((String) request.getParameter("customer_email") == null ? "0"
				: (String) request.getParameter("customer_email"));
		customer.setCity((String) request.getParameter("customer_city") == null ? new String(
				"0") : (String) request.getParameter("customer_city"));
		customer.setNation((String) request.getParameter("customer_country") == null ? "0"
				: (String) request.getParameter("customer_country"));
		customer.setProvince((String) request.getParameter("province") == null ? "0"
				: (String) request.getParameter("province"));
		customer.setAddress((String) request.getParameter("customer_address") == null ? "0"
				: (String) request.getParameter("customer_address"));
		customer.setPaymentType((String) request
				.getParameter("customer_paymentType") == null ? 0 : Integer
				.valueOf((String) request.getParameter("customer_paymentType")));
		GregorianCalendar c = new GregorianCalendar();
		c.setTime(new Date());
		XMLGregorianCalendar date2 = null;
		try {
			date2 = DatatypeFactory.newInstance().newXMLGregorianCalendar(c);
		} catch (Exception e) {
			System.out.print(e);
		}
		customer.setRegisterTime(date2);
		customer.setAccount(0);
		// customerService = new CustomerServiceImp();
		int responseCode = customerPort.register(customer);
		if (responseCode == 0) {// successfull
			System.out.print("successfull");
			
			request.getSession().setAttribute("customerPassword",
					customer.getPassword());
			request.getSession().setAttribute("customerName",
					customer.getCustomerName());
			
			if (request.getSession().getAttribute("from") != null)
				request.getRequestDispatcher("/checkout.jsp").forward(request,
						response);
			else
				request.getRequestDispatcher("/index.jsp").forward(request,
						response);
		} else if (responseCode == 1) {// the customer name already exist
			request.setAttribute("error", "1");
			request.getRequestDispatcher("/login.jsp").forward(request,
					response);
		} else {// insert fail
			request.setAttribute("error", "2");
			request.getRequestDispatcher("/login.jsp").forward(request,
					response);
		}
	}

	public void submitlogin(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		Customer customer = new Customer();

		customer.setCustomerName((String) request.getParameter("customerName"));
		customer.setPassword((String) request.getParameter("customerPassword"));
		net.cd.owen.vo.AccountInfo accountInfo = customerPort
				.getAccount(customer);
		if (accountInfo != null) {
			System.out.print("successfull");
			
			request.setAttribute("customerName", customer.getCustomerName());
			request.getSession().setAttribute("customerPassword",
					customer.getPassword());
			request.getSession().setAttribute("customerName",
					customer.getCustomerName());
			request.setAttribute("accountInfo", accountInfo);
			
			
			
			/*Cookie c1 = new Cookie("cd_username", customer.getCustomerName());
			response.addCookie(c1);
			c1.setMaxAge(3600);
			Cookie c2 = new Cookie("cd_userpassword", customer.getPassword());
			
			c2.setMaxAge(3600);
			response.addCookie(c2);*/
			
			if (request.getSession().getAttribute("from") != null)
				request.getRequestDispatcher("/checkout.jsp").forward(request,
						response);
			else
				request.getRequestDispatcher("/" + "index.jsp").forward(
						request, response);
		} else {
			request.setAttribute("password", "wrong");
			request.getRequestDispatcher("/" + "login.jsp").forward(request,
					response);
		}
	}

	public void login(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Cookie[] cookies = request.getCookies();
		for (Cookie c : cookies) {
			if (c != null && c.getName().equals("cd_username"))
				request.setAttribute("customerName", c.getValue());
		}
		request.getRequestDispatcher("/login.jsp").forward(request, response);
	}

	private void processLogout(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		request.getSession().invalidate();
		response.sendRedirect(request.getContextPath() + "/Logout.jsp");
	}
}
