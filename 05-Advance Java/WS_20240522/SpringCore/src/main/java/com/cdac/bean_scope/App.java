package com.cdac.bean_scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("ApplicationContextForBeanScope.xml");

		Employee e1 = (Employee) ctx.getBean("obj");

		e1.setCity("Coimbatore");
		e1.display();

		Employee e2 = (Employee) ctx.getBean("obj");
//		e2.setCity("Kolkata");
		e2.display();
		
		((ConfigurableApplicationContext) ctx).close();

	}

}
