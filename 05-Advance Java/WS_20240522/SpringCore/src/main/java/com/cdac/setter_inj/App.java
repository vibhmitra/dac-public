package com.cdac.setter_inj;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("ApplicationContextForSetter.xml");
		
		Employee employee1 = (Employee) ctx.getBean("e1");
		employee1.display();
		
		Employee employee2 = (Employee) ctx.getBean("e2");
		employee2.display();
		
		((ConfigurableApplicationContext) ctx).close();
		
	}
}