package net.cd.owen.util;
import javax.naming.Context;
import javax.naming.InitialContext;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
public class HibernateJNIUtil {
	private static final SessionFactory sessionFactory = buildSessionFactory();

    private static SessionFactory buildSessionFactory() {
        try {
        	Context initialCntx = new InitialContext();  
        	SessionFactory sessionFactory = (SessionFactory)initialCntx  
        	     .lookup("java:comp/env/music_zone");  
        //	Session hibernateSess = sessionFactory.getCurrentSession();
        return sessionFactory;
        }
        catch (Throwable ex) {
            // Make sure you log the exception, as it might be swallowed
            System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}
