package net.cd.owen.service.productcatalog;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.ParameterStyle;
import javax.jws.soap.SOAPBinding.Style;
import javax.jws.soap.SOAPBinding.Use;

import net.cd.owen.model.Category;
import net.cd.owen.model.Cd;

@WebService
@SOAPBinding(style= Style.DOCUMENT, use = Use.LITERAL, parameterStyle = ParameterStyle.WRAPPED)

public interface ProductCatalogService {
	
	@WebMethod 
	public List<Category> getCategoryList();
	
	@WebMethod
	public List<Cd> getProductList (int categoryId, int currentPage, int pageSize);
	
	@WebMethod
	public Cd getProductInfo(long cdid);
	
}
