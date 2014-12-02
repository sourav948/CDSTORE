package net.cd.owen.service.customer;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.ParameterStyle;
import javax.jws.soap.SOAPBinding.Style;
import javax.jws.soap.SOAPBinding.Use;

import net.cd.owen.model.CreditCard;
import net.cd.owen.model.Customer;
import net.cd.owen.vo.AccountInfo;
@WebService
@SOAPBinding(style= Style.DOCUMENT, use = Use.LITERAL, parameterStyle = ParameterStyle.WRAPPED)
public interface CustomerService {
	@WebMethod 
	public int register( Customer customer);
	
	@WebMethod 
	public AccountInfo getAccount( Customer customer);
	
	@WebMethod 
	public boolean creditVerified( CreditCard creditCard);
}
