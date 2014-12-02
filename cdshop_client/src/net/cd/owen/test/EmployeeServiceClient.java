package net.cd.owen.test;

import java.util.List;

import net.cd.owen.model.Category;
import net.cd.owen.service.productcatalog.ProductCatalogService;
import net.cd.owen.service.productcatalog.ProductCatalogServiceImpService;

public class EmployeeServiceClient {

	public static void main(String[] args) {

		ProductCatalogServiceImpService service = new ProductCatalogServiceImpService();

		ProductCatalogService port = service.getProductCatalogServiceImpPort();

		System.out.println("\nAll Employees:");

		List<Category> allEmps = port.getCategoryList();

		for (Category e : allEmps) {

		}

	}
}
