package com.samples.Autowiring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.samples.Autowiring.Models.Employee;

public class App {
	public static void main(String[] args) {

		ClassPathXmlApplicationContext springContainer = new ClassPathXmlApplicationContext(
				"com/samples/Autowiring/SpringConfig.xml");
		Employee emp = (Employee) springContainer.getBean("emp");
		System.out.println(emp);
	}
}