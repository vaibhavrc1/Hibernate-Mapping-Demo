package com.companyname.hibernatedemo.config;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateConfig {
	
	private static SessionFactory sessionFactory=null;
	
	private HibernateConfig(){
		
	}

	public static Session getSession() {
		if(sessionFactory==null) {
			Configuration cfg=new Configuration().configure();
		    sessionFactory=cfg.buildSessionFactory();
		}
		return sessionFactory.openSession();
	}
	
	public static void close() {
		sessionFactory.close();
	}
    
}
