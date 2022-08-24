package com.samples.Spel;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.samples.Spel.model.CarDealer;


public class App 
{
    public static void main( String[] args )
    {
    	ClassPathXmlApplicationContext springContainer = new ClassPathXmlApplicationContext(
				"com/samples/Spel/SpringConfig.xml");
		CarDealer dealer = (CarDealer) springContainer.getBean("carDealer");
		System.out.println(dealer);
    }
}
