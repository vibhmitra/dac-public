/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cdac.hql;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Projections;

/**
 * @author Someone
 * 
 **/
public class DBOperations {
	public static void main(String args[]) {
		DBOperations db = new DBOperations();
		// db.insertItems();
		// db.fetchItems();
		// db.updateItemName();
		// db.fetchItems();
		// db.deleteItem();
		// db.fetchItems();
		// db.fetchItemsByCriteria();
		db.fetchItemsByNamedQuery();
	}

	public void insertItems() {
		Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session sess = sf.openSession();
		Transaction tx = sess.beginTransaction();

		Item i = new Item();
		i.setItemName("Fridge");
		i.setPrice(35000.0);
		sess.save(i);
		tx.commit();
		sess.close();

	}

	public void fetchItems() {
		Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session sess = sf.openSession();
		Transaction tx = sess.beginTransaction();
		Query q = sess.createQuery("from Item where id=:id");
		q.setParameter("id", 2);
		List<Item> items = q.list();
		System.out.println("----" + items.toString());
		sess.close();
	}

	public void updateItemName() {
		Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session sess = sf.openSession();
		Transaction tx = sess.beginTransaction();
		Query q = sess.createQuery("update Item set itemName=:name where id=:id");
		q.setParameter("name", "Washig Machine");
		q.setParameter("id", 1);
		int i = q.executeUpdate();
		tx.commit();
		sess.clear();
	}

	public void deleteItem() {
		Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session sess = sf.openSession();
		Transaction tx = sess.beginTransaction();
		Query q = sess.createQuery("delete from Item  where id=:id");
		q.setParameter("id", 1);
		int i = q.executeUpdate();
		tx.commit();
		sess.clear();
	}

	public void fetchItemsByCriteria() {
		Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session sess = sf.openSession();
		Transaction tx = sess.beginTransaction();

		Criteria c = sess.createCriteria(Item.class);
		/* c.add(Restrictions.eq("id", 2)); */
		c.setProjection(Projections.property("itemName"));
		List<Item> items = c.list();
		System.out.println("----" + items.toString());
		sess.close();
	}

	public void fetchItemsByNamedQuery() {
		Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session sess = sf.openSession();
		Transaction tx = sess.beginTransaction();
		Query q = sess.getNamedQuery("fetchItemsById");
		q.setParameter("id", 2);
		List<Item> items = q.list();
		System.out.println("----" + items.toString());
		sess.close();
	}
}
