package net.cd.owen.service.customer;

import java.util.List;

import javax.jws.WebService;

import net.cd.owen.dao.CustomerDao;
import net.cd.owen.dao.OrderDao;
import net.cd.owen.model.CreditCard;
import net.cd.owen.model.Customer;
import net.cd.owen.vo.AccountInfo;
@WebService(endpointInterface = "net.cd.owen.service.customer.CustomerService")
public class CustomerServiceImp implements CustomerService{

	private CustomerDao customerDao = CustomerDao.getInstance();
	private OrderDao orderDao = OrderDao.getInstance();
	private static CustomerServiceImp customerService = new CustomerServiceImp(); 
	
	public static CustomerServiceImp getInstance(){
		return customerService;
	}
	
	public int register( Customer customer){
		return customerDao.addNewCustomer(customer);
	}
	
	public AccountInfo getAccount( Customer customer){
		
		AccountInfo accountInfo = new AccountInfo();
		List<Customer> customerList = customerDao.customerLogin(customer);
		if(customerList!=null&&customerList.size()!=0)
		{
			accountInfo.setCustomer(customerList.get(0));
			accountInfo.setOrders(orderDao.queryOrder(customerList.get(0).getCustomerName()));
			
			return accountInfo;
		}
		return null;
	}
	
		public boolean creditVerified( CreditCard creditCard){
		
		List<CreditCard> creditCardList = customerDao.creditQuery(creditCard);
		if(creditCardList!=null && creditCardList.size()!=0)
		{
			return true;
		}
		return false;
	}
	
}
