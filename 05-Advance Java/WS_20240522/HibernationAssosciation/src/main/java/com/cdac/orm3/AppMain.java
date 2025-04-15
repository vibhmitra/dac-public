package com.cdac.orm3;

import java.util.HashSet;
import java.util.Set;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class AppMain {

	public static void main(String[] args) {
		System.out.println(".......Hibernate One To Many Mapping Example.......\n");
		Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();

		Transaction transaction = session.beginTransaction();

		Set<MarksDetails> s = new HashSet<MarksDetails>();

		Student studentObj = new Student("Abhishek", "Kumar", "ab@gmail.com", "9999999999");
		// sessionObj.save(studentObj);

		MarksDetails marksObj1 = new MarksDetails("English", "100", "80", "Pass");
		marksObj1.setStudent(studentObj);

		// sessionObj.save(marksObj1);

		MarksDetails marksObj2 = new MarksDetails("Maths", "100", "88", "Pass");
		marksObj2.setStudent(studentObj);
		// sessionObj.save(marksObj2);

		MarksDetails marksObj3 = new MarksDetails("Science", "100", "88", "Pass");
		marksObj3.setStudent(studentObj);

		// sessionObj.save(marksObj3);
		s.add(marksObj3);
		s.add(marksObj2);
		s.add(marksObj1);

		studentObj.setMarksDetails(s);

		session.save(studentObj);

		// Committing The Transactions To The Database
		session.getTransaction().commit();

		System.out.println("\n.......Records Saved Successfully To The Database.......");
	}
}