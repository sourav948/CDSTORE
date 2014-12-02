package net.cd.owen.dao;

import java.util.List;

import net.cd.owen.model.Order;
import net.cd.owen.model.OrderDetail;
import net.cd.owen.util.HibernateUtil;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

public class OrderDao {

	private static OrderDao orderDao = new OrderDao();

	public static OrderDao getInstance() {
		return orderDao;
	}

	public long save(Order order, List<OrderDetail> orderDetails) {
		Transaction transaction = null;
		long id = 0;
		try {
			Session session = HibernateUtil.getSessionFactory()
					.getCurrentSession();
			transaction = session.beginTransaction();
			session.save(order);
			id = order.getOrderId();
			for (int i = 0; i < orderDetails.size(); i++) {
				OrderDetail orderDetail = orderDetails.get(i);
				orderDetail.setOrderId(id);
				session.save(orderDetail);
				if (i % 20 == 0) { // 20, same as the JDBC batch size
					// flush a batch of inserts and release memory:
					session.flush();
					session.clear();
				}
			}
			transaction.commit();
			// session.close();
		} catch (HibernateException e) {
			System.out.println(e.getMessage());
			System.out.println("error");
			transaction.rollback();
		}
		return id;
	}

	/*public boolean save(List<OrderDetail> orderDetails, long id) {
		Transaction transaction = null;
		try {
			Session session = HibernateUtil.getSessionFactory()
					.getCurrentSession();
			transaction = session.beginTransaction();
			for (int i = 0; i < orderDetails.size(); i++) {
				OrderDetail orderDetail = orderDetails.get(i);
				orderDetail.setOrderId(id);
				session.save(orderDetail);
				if (i % 20 == 0) { // 20, same as the JDBC batch size
					// flush a batch of inserts and release memory:
					session.flush();
					session.clear();
				}
			}
			// transaction.commit();
			// session.close();
		} catch (HibernateException e) {
			System.out.println(e.getMessage());
			System.out.println("error");
			transaction.rollback();
			return false;
		}
		return true;
	}*/
	public boolean updateOrder(Order order) {
		Transaction transaction = null;
		try {
			Session session = HibernateUtil.getSessionFactory()
					.getCurrentSession();
			transaction = session.beginTransaction();
			Order t = (Order) session.get(Order.class, order.getOrderId()); 
			t.setOrderStatus(1);
			session.update(t);
			transaction.commit();
		} catch (HibernateException e) {
			System.out.println(e.getMessage());
			System.out.println("error");
			transaction.rollback();
			return false;
		}
		return true;
	}
	

	public List<Order> queryOrder(String customerName) {
		Session session = null;
		try {
			if (customerName == null)
				return null;
			session = HibernateUtil.getSessionFactory().getCurrentSession();
			session.beginTransaction();
			Criteria c = session.createCriteria(Order.class);
			c.add(Restrictions.eq("customerName", customerName.trim()));// eq是等于，gt是大于，lt是小于,or是或
			List<Order> list = (List<Order>) c.list();
			session.getTransaction().commit();
			return list;
		} catch (Exception e) {
			e.printStackTrace();
			session.getTransaction().rollback();
			return null;
		}
	}

}
