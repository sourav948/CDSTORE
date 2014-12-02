package net.cd.owen.dao;

import java.util.List;

import net.cd.owen.model.CreditCard;
import net.cd.owen.model.Customer;
import net.cd.owen.util.HibernateJNIUtil;
import net.cd.owen.util.HibernateUtil;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

public class CustomerDao {

	private static CustomerDao customerDao = new CustomerDao();
	private Transaction transaction;
	private Session session;

	public static CustomerDao getInstance() {
		return customerDao;
	}

	/*
	 * public CustomerDao(){ // 1. configuring hibernate Configuration
	 * configuration = new Configuration().configure();
	 * 
	 * // 2. create sessionfactory this.sessionFactory =
	 * configuration.buildSessionFactory();
	 * 
	 * // 3. Get Session object this.sessionFactory = new
	 * Configuration().configure().buildSessionFactory( new
	 * StandardServiceRegistryBuilder().build() ); }
	 */

	public int addNewCustomer(Customer customer) {
		try {
			// 4. Starting Transaction
			Session session = HibernateUtil.getSessionFactory()
					.getCurrentSession();
			transaction = session.beginTransaction();
			Criteria c = session.createCriteria(Customer.class);
			c.add(Restrictions.eq("customerName", customer.getCustomerName().trim()));// eq是等于，gt是大于，lt是小于,or是或
			List<Customer> list = (List<Customer>) c.list();
			if(list!=null&&!list.isEmpty()){
				return 1;
			}
			session.save(customer);
			transaction.commit();
			System.out.println("\n\n Details Added \n");
		} catch (HibernateException e) {
			System.out.println(e.getMessage());
			System.out.println("error");
			transaction.rollback();
			//session.close();
			return 2;
		} 
		return 0;
	}

	public List<Customer> customerLogin(Customer customer) {
		try {
			// 4. Starting Transaction
			if(customer==null)
				return null;
			session = HibernateUtil.getSessionFactory().getCurrentSession();
			session.beginTransaction();
		/*	Query q = session.createSQLQuery("select * from customers").addEntity(Customer.class);
			  List<Customer> list = q.list();
			 */
			
			// from后面是对象，不是表名
			Criteria c = session.createCriteria(Customer.class);
			c.add(Restrictions.eq("customerName", customer.getCustomerName().trim()));// eq是等于，gt是大于，lt是小于,or是或
			c.add(Restrictions.eq("password", customer.getPassword().trim()));
			List<Customer> list = (List<Customer>) c.list();
			session.getTransaction().commit();
			 //session.close();
			return list;
		} catch(Exception e){
			e.printStackTrace();
			session.getTransaction().rollback();
			return null;
		}
	}
	
	public List<CreditCard> creditQuery(CreditCard creditCard) {
		try {
			// 4. Starting Transaction
			if(creditCard==null)
				return null;
			session = HibernateUtil.getSessionFactory().getCurrentSession();
			session.beginTransaction();
			Criteria c = session.createCriteria(CreditCard.class);
			c.add(Restrictions.eq("creditCardNumber", creditCard.getCreditCardNumber()));// eq是等于，gt是大于，lt是小于,or是或
			c.add(Restrictions.eq("creditCardPassword", creditCard.getCreditCardPassword()));// eq是等于，gt是大于，lt是小于,or是或
			
			List<CreditCard> list = (List<CreditCard>) c.list();
			session.getTransaction().commit();
			return list;
		} catch(Exception e){
			e.printStackTrace();
			session.getTransaction().rollback();
			return null;
		}
	}
	
	
	public List<Customer> queryCustomer(Customer customer) {
		try {
			// 4. Starting Transaction
			if(customer==null)
				return null;
			session = HibernateUtil.getSessionFactory().getCurrentSession();
			session.beginTransaction();
		/*	Query q = session.createSQLQuery("select * from customers").addEntity(Customer.class);
			  List<Customer> list = q.list();
			 */
			
			// from后面是对象，不是表名
			Criteria c = session.createCriteria(Customer.class);
			c.add(Restrictions.eq("customerName", customer.getCustomerName().trim()));// eq是等于，gt是大于，lt是小于,or是或
			List<Customer> list = (List<Customer>) c.list();
			session.getTransaction().commit();
			return list;
		} catch(Exception e){
			e.printStackTrace();
			session.getTransaction().rollback();
			return null;
		}
	}
}
