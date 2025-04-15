package com.cdac.java_based_config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

	public static void main(String[] args) {
		// giving context of configuration class.
		ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		
		// getting bean from class.
		Employee e1 = ctx.getBean("employee1", Employee.class);
		Employee e2 = ctx.getBean("employee2", Employee.class);
		
		// displaying data
		e1.display();
		e2.display();
		
		((ConfigurableApplicationContext) ctx).close();
	}
}
