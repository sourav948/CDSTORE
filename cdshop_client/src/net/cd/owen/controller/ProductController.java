package net.cd.owen.controller;

import java.io.IOException;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.cd.owen.model.Category;
import net.cd.owen.model.Cd;
import net.cd.owen.service.productcatalog.ProductCatalogService;
import net.cd.owen.service.productcatalog.ProductCatalogServiceImpService;
import net.cd.owen.vo.ShoppingCartInfo;

public class ProductController {

	private static ProductCatalogServiceImpService productCatalogService = new ProductCatalogServiceImpService();

	ProductCatalogService port = productCatalogService
			.getProductCatalogServiceImpPort();

	// private Customer customer;

	public void disputeRequests(String actionPath, HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		if (actionPath.equals("/categories")) {
			getCategories(request, response);
		} else if (actionPath.equals("/products")) {
			getProducts(request, response);
		} else if (actionPath.equals("/productdetails")) {
			getProductDetail(request, response);
		} else if (actionPath.equals("/view_shoppingcart")) {
			viewShoppingCart(request, response);
		}
	}

	public void getCategories(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		List<Category> categoryList = port.getCategoryList();
		request.setAttribute("categories", categoryList);
		request.getRequestDispatcher("/index.jsp").forward(request, response);
	}

	public void getProducts(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		int categoryId = request.getParameter("categoryId") == null ? 0
				: Integer.valueOf(request.getParameter("categoryId"));
		int currentPage = request.getParameter("currentPage") == null ? 0
				: Integer.valueOf(request.getParameter("currentPage"));
		int pageSize = request.getParameter("pageSize") == null ? 0 : Integer
				.valueOf(request.getParameter("pageSize"));
		List<Cd> cdlist = port
				.getProductList(categoryId, currentPage, pageSize);
		request.setAttribute("cdlist", cdlist);
		List<Category> categoryList = port.getCategoryList();
		request.setAttribute("categories", categoryList);
		request.getRequestDispatcher("/featured.jsp")
				.forward(request, response);
	}

	public void getProductDetail(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		if (request.getParameter("cdid") == null)// the cd exists.
		{
			request.getRequestDispatcher("/single.jsp").forward(request,
					response);
		} else {// no results
			long cdid = Long.valueOf(request.getParameter("cdid"));
			Cd cd = port.getProductInfo(cdid);
			request.setAttribute("cd", cd);
			request.getRequestDispatcher("/single.jsp").forward(request,
					response);
		}
	}

	public void viewShoppingCart(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		Cookie[] cookies = request.getCookies();
		List<ShoppingCartInfo> shoppingCartList = new ArrayList<ShoppingCartInfo>();
		for (Cookie c : cookies) {
			if (c != null && c.getName().startsWith("cdid")) {
				// request.setAttribute("customerName",c.getValue());
				if (c.getValue() != null&&!"".equals(c.getValue())) {
					if(c.getValue().equals("0"))
						continue;
					String cookieName = URLDecoder.decode(c.getName(),"UTF-8");
					String[] name = cookieName.split("_");
					// String cdids = name.substring(name.indexOf("_")+1,
					// name.indexOf("_", name.indexOf("_")+1));
					ShoppingCartInfo shoppingCartInfo = new ShoppingCartInfo();
					if (name[1].equals(""))
						continue;
					shoppingCartInfo.setCdid(Long.valueOf(name[1] == null ? "0"
							: name[1]));
					shoppingCartInfo.setCategoryId(Long
							.valueOf(name[2] == null ? "0" : name[2]));
					
					shoppingCartInfo
							.setQuantity(Integer.valueOf(c.getValue() == null ? "0"
									: c.getValue()));
					shoppingCartInfo.setPrice(Double
							.valueOf(name[3] == null ? "0" : name[3]));
					shoppingCartInfo.setTitle(URLDecoder.decode(name[4],
							"UTF-8"));
					shoppingCartInfo.setPicUrl(URLDecoder.decode(name[5],
							"UTF-8"));
					shoppingCartList.add(shoppingCartInfo);
					request.setAttribute("shoppingCartList", shoppingCartList);
				}
			}
		}
		request.getRequestDispatcher("/cart.jsp").forward(request, response);
	}

}
