package org.hibernate.tutorial.exercices.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class HibernateUtil {
	
	private static final SessionFactory sessionFactory = buildSessionFactory();
	private static ServiceRegistry serviceRegistry;
	
	private static SessionFactory buildSessionFactory(){
		 Configuration configuration = new Configuration();
		 configuration.configure();
		 serviceRegistry = new ServiceRegistryBuilder().applySettings(configuration.getProperties()).buildServiceRegistry();
		 return configuration.buildSessionFactory(serviceRegistry);
	}
	
	public static SessionFactory getSession(){
		return sessionFactory;
	}

}
