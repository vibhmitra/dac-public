package com.cdac.constructor_inj;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("ApplicationContextForConstructor.xml");

		Employee employee1 = (Employee) ctx.getBean("em1"); // getting data from bean 'em1'
		Employee employee2 = (Employee) ctx.getBean("em2"); // getting data from bean 'em2'
		
		employee1.display();
		employee2.display();
		
		((ConfigurableApplicationContext) ctx).close();
	}
}
