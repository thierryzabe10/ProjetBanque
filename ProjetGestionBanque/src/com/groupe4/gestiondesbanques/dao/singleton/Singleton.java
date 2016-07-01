package com.groupe4.gestiondesbanques.dao.singleton;

import java.util.logging.Logger;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;



public class Singleton {
	
	private static SessionFactory sessionfactory;
	static Logger log = Logger.getLogger("Singleton");
	
	static{
		sessionfactory = new Configuration().configure().buildSessionFactory();
		log.info("<***************connection :) ************>"); 
	}
	private Singleton() {
		
	}
	public static SessionFactory getSessionfactory() {
		return sessionfactory;
	}
	
	
	
	
	

}
