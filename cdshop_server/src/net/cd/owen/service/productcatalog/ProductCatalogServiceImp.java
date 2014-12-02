package net.cd.owen.service.productcatalog;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.ParameterStyle;
import javax.jws.soap.SOAPBinding.Style;
import javax.jws.soap.SOAPBinding.Use;

import net.cd.owen.dao.ProductDao;
import net.cd.owen.model.Category;
import net.cd.owen.model.Cd;
import net.cd.owen.util.Page;

@WebService(endpointInterface = "net.cd.owen.service.productcatalog.ProductCatalogService")
public class ProductCatalogServiceImp implements ProductCatalogService{

	private ProductDao productDao = ProductDao.getInstance();
	
	private static ProductCatalogService productCatalogService = new ProductCatalogServiceImp();
	
	public static ProductCatalogService getInstance(){
		return productCatalogService;
	}
	
	public List<Category> getCategoryList(){
		return productDao.getCategoryList();
	}
	
	public List<Cd> getProductList (int categoryId, int currentPage, int pageSize){
		Page page = new Page();
		page.setPageSize(pageSize);
		page.setCurrentPage(currentPage);
		return productDao.getProductList(categoryId,page);
	}
	
	public Cd getProductInfo (long cdid){
		return productDao.getProductInfo(cdid);
	}
}
