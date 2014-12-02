package net.cd.owen.interceptor;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.cd.owen.controller.CustomerController;
import net.cd.owen.controller.OrderController;
import net.cd.owen.controller.ProductController;

//@WebServlet(description = "The Main Servlet acting as the main controller of the project.", urlPatterns = { "/" })
public class InterceptorServlet extends HttpServlet {

	

	/**
	 * Servlet implementation class MainServlet
	 */
		private static final long serialVersionUID = 1L;

		/**
		 * @see HttpServlet#HttpServlet()
		 */

		/**
		 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
		 *      response)
		 */
		protected void doGet(HttpServletRequest request,
				HttpServletResponse response) throws ServletException, IOException 
		{
			String actionPath = request.getServletPath();
			if (actionPath.equals("/categories")||
					 actionPath.equals("/products") ||
					 actionPath.equals("/productdetails")||
					 actionPath.equals("/view_shoppingcart"))
			{
				ProductController productController = new ProductController();
				productController.disputeRequests(actionPath, request, response);
			}
			else if (
					actionPath.equals("/login") ||
					actionPath.equals("/logout")
					) 
			{
				// Account related processing.
				/*AccountManager accountMgr = new AccountManager() ; 
				accountMgr.processActionRequests(actionPath, request, response);*/
				CustomerController customerController = new CustomerController();
				customerController.disputeRequests(actionPath, request, response);
			}
			else if (
					actionPath.equals("/orderStatus")
					)
			{
				/*OrderManager orderMgr = new OrderManager() ;
				orderMgr.processActionRequests(actionPath, request, response);*/
			}else if(actionPath.equals("/confirm_order")||
					actionPath.equals("/check_out")
					||actionPath.equals("/create_order")){
				OrderController orderController = new OrderController();
				orderController.disputeRequests(actionPath, request, response);
			}
		}

		/**
		 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
		 *      response)
		 */
		protected void doPost(
				HttpServletRequest request,
				HttpServletResponse response) 
				throws ServletException, IOException 
		{

			String actionPath = request.getServletPath();


			if (actionPath.equals("/submitLogin") ||
				actionPath.equals("/register")) 
			{
				// Account related processing
				/*AccountManager accountMgr = new AccountManager() ; 
				accountMgr.processActionRequests(actionPath, request, response);*/
				CustomerController customerController = new CustomerController();
				customerController.disputeRequests(actionPath, request, response);
			}
			else if (actionPath.equals("/addToCart") ||
					 actionPath.equals("/viewCart") ||
					 actionPath.equals("/removeFromCart") ||
					 actionPath.equals("/orderCheckout") ||
					 actionPath.equals("/paymentManager") )
			{
				// Order Processing
				/*OrderManager orderMgr = new OrderManager() ;
				System.err.println("ActionPath: " + actionPath);
				orderMgr.processActionRequests(actionPath, request, response);*/
			}else if(actionPath.equals("/confirm_order")||
					actionPath.equals("/create_order")||
					actionPath.equals("/check_out")){
				OrderController orderController = new OrderController();
				orderController.disputeRequests(actionPath, request, response);
			}
		}
	}



