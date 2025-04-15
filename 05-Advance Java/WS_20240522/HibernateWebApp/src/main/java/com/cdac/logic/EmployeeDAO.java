package com.cdac.logic;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmployeeDAO {
	Configuration cfg = new Configuration().configure("hibernet.cfg.xml");
	SessionFactory factory = cfg.buildSessionFactory();
	
	public void insertProduct(Employee employee) {
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(employee);
		transaction.commit();
	}
}
