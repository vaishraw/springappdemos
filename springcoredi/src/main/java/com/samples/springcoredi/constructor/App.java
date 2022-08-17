package com.samples.springcoredi.constructor;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {

		ClassPathXmlApplicationContext springContainer = new ClassPathXmlApplicationContext(
				"com/samples/springcoredi/constructor/SpringConfig.xml");
		Employee emp = (Employee) springContainer.getBean("emp");
		System.out.println(emp);
		
		}
}
