package com.cdac.orm2;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmployeeCRUD {

	// Step 1: Getting Config File
	static Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
	// Step 2: Building a Factory
	static SessionFactory factory = cfg.buildSessionFactory();
	// Step 3: Running Factory
	static Session session = factory.openSession();
	

	private static void insertMethod() {
		Transaction insert = session.beginTransaction();
		Employee e = new Employee(); 
		e.setId(101);
		e.setFirstName("Vibh");
		e.setLastName("M");
		session.save(e);
		insert.commit();
		System.out.println("Hopefully Data Got Inserted");
	}

	private static void updateMethod() {
		Transaction update = session.beginTransaction();
		Employee e = session.get(Employee.class, 101);
		e.setFirstName("Vibhanshu");
		e.setLastName("Mitra");
		session.save(e);
		update.commit();
		System.out.println("Hopefully Data Got Updated");
	}

	private static void deleteMethod() {
		Transaction delete = session.beginTransaction();
		Employee e = session.get(Employee.class, 101);
		session.delete(e);
		delete.commit();
	}

	private static void selectEmployeeByID() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter ID : ");
		int id = sc.nextInt();
		
		Employee e = session.get(Employee.class, id);
		System.out.println("Employee First Name: " + e.getFirstName());
		System.out.println("Employee Last Name: " + e.getLastName());
	}

	public static void main(String[] args) {
		int choice = -1;
		Scanner sc = new Scanner(System.in);
		while(choice != 0) {
			System.out
					.println("1. Insert Employee \n2. Update Employee. \n3. Delete Employee. \n4. Show Employee By ID");

			choice = sc.nextInt();

			switch (choice) {
			case 1:
				insertMethod();
				break;
			case 2:
				updateMethod();
				break;
			case 3:
				deleteMethod();
				break;
			case 4:
				selectEmployeeByID();
				break;
			default:
				break;
			}
		};
		sc.close();
	}
}
