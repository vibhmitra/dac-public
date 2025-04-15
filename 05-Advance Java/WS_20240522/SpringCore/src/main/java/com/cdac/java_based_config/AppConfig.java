/* Configuration for Beans */
package com.cdac.java_based_config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.cdac.javaconfig")
public class AppConfig {

	@Bean
	public Address address1() {
		Address a1 = new Address();
		a1.setCity("City1");
		a1.setState("State1");
		a1.setCountry("Country1");
		return (a1);
	}

	@Bean
	public Address address2() {
		Address a2 = new Address();
		a2.setCity("City2");
		a2.setState("State2");
		a2.setCountry("Country2");
		return (a2);
	}
	
	@Bean
	public Employee employee1() {
		Employee e1 = new Employee();
		e1.setId(101);
		e1.setName("Ben");
		e1.setAddress(address1());
		return (e1);
	}
	
	@Bean
	public Employee employee2() {
		Employee e2 = new Employee();
		e2.setId(102);
		e2.setName("Zen");
		e2.setAddress(address2());
		return (e2);
	}
}
