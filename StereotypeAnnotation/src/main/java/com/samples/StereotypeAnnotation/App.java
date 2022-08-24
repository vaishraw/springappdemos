package com.samples.StereotypeAnnotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.samples.StereotypeAnnotation.Model.Instructor;


public class App 
{
    public static void main( String[] args )
    {
    	ClassPathXmlApplicationContext springContainer = new ClassPathXmlApplicationContext(
				"com/samples/StereotypeAnnotation/SpringConfig.xml");
		Instructor inst = (Instructor) springContainer.getBean("inst");
		System.out.println(inst);
    }
}
