package co.edureka.config;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtils {
	
	public static SessionFactory getSessionFactory() {
		
		
		Configuration cfg=new Configuration();
		cfg.configure("co/edureka/config/hibernate.cfg.xml"); //xml parsing
		
		SessionFactory sFactory = cfg.buildSessionFactory();
		
		return sFactory;
		
	}

}
