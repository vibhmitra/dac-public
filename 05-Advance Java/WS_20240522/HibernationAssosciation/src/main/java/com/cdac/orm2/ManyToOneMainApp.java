package com.cdac.orm2;

import java.util.Arrays;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ManyToOneMainApp {

	public static void main(String[] args) {
		Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();

		Transaction transaction = session.beginTransaction();
	
		Department d1 = new Department();
		d1.setName("Sales");
		
		Employee e1 = new Employee();
		e1.setName("Vibh");
		e1.setDepartment(d1);
		
		Employee e2 = new Employee();
		e2.setName("Ren");
		e2.setDepartment(d1);
		
		d1.setEmployeeList(Arrays.asList(e1, e2));
		
		session.save(e1);
		session.save(e2);
		session.save(d1);
		transaction.commit();
				
		
		System.out.println(d1.getId());
		Department retDep = session.get(Department.class, d1.getId());
		System.out.println(retDep);
		
		session.close();
		factory.close();

	}

}

