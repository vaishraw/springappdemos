package com.samples.InterfaceInjection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.samples.InterfaceInjection.Service.OrderService;

public class App 
{
    public static void main( String[] args )
    {
    	ClassPathXmlApplicationContext springContainer = new ClassPathXmlApplicationContext(
				"com/samples/InterfaceInjection/SpringConfig.xml");

		OrderService service = (OrderService) springContainer.getBean("orderservice");
		System.out.println(service);
		service.placeOrder();
    }
}
