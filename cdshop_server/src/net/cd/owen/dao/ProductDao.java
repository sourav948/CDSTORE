package net.cd.owen.dao;

import java.util.List;

import net.cd.owen.model.Category;
import net.cd.owen.model.Cd;
import net.cd.owen.model.Customer;
import net.cd.owen.util.HibernateJNIUtil;
import net.cd.owen.util.HibernateUtil;
import net.cd.owen.util.Page;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

public class ProductDao {

	private static ProductDao productDao = new ProductDao();
	private Session session;

	public static ProductDao getInstance() {
		return productDao;
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

	public List<Category> getCategoryList() {
		try {
			// 4. Starting Transaction
			session = HibernateUtil.getSessionFactory().getCurrentSession();
			session.beginTransaction();
			Query q = session.createSQLQuery("select * from categories").addEntity(Category.class);
			  List<Category> list = q.list();
			// from后面是对象，不是表名
			session.getTransaction().commit();
			 //session.close();
			return list;
		} catch(Exception e){
			e.printStackTrace();
			session.getTransaction().rollback();
			return null;
		}
	}
	
	public List<Cd> getProductList (int categoryId, Page page) {
		try {
			session = HibernateUtil.getSessionFactory().getCurrentSession();
			session.beginTransaction();
			Criteria criteria = session.createCriteria(Cd.class);
			criteria.addOrder( Order.asc("categoryId") ); //排序方式
			if(categoryId!=0)
			criteria.add(Restrictions.eq("categoryId", (long)categoryId));// query products correspond to certain category
			criteria.setFirstResult(page.getCurrentIndex());
			criteria.setMaxResults(page.getPageSize());
			List<Cd> result = criteria.list();
			
			session.getTransaction().commit();
			 //session.close();
			return result;
		} catch(Exception e){
			e.printStackTrace();
			session.getTransaction().rollback();
			return null;
		}
	}
	
	public Cd getProductInfo (long cdid) {
		try {
			session = HibernateUtil.getSessionFactory().getCurrentSession();
			session.beginTransaction();
			Criteria cr = session.createCriteria(Cd.class);
			cr.add(Restrictions.eq("cdid", cdid));
			List<Cd> results = cr.list();
			session.getTransaction().commit();
			 //session.close();
			return results!=null? results.get(0): null;
		} catch(Exception e){
			e.printStackTrace();
			session.getTransaction().rollback();
			return null;
		}
	}
}
