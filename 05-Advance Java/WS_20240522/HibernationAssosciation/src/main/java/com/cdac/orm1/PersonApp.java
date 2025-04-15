package com.cdac.orm1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class PersonApp {
   public static void main(String[] args) {
      Configuration cfg = (new Configuration()).configure("hibernate.cfg.xml");
      SessionFactory factory = cfg.buildSessionFactory();
      Session session = factory.openSession();
      
      // starting transaction
      Transaction transaction = session.beginTransaction();
      
      // adding data to address object
      Address address = new Address();
      address.setStreet("Local Street");
      address.setCity("Never City");
      
      // adding data to person object
      Person person = new Person();
      person.setName("Ren");
      person.setAddress(address);
      
      // saving to the Database
      session.save(address);
      session.save(person);
      
      // commit
      transaction.commit();
   }
}
