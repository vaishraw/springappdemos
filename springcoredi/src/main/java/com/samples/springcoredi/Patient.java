package com.samples.springcoredi;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Patient {
	
	private int id;

	public Patient() {
		System.out.println("Inside Patient Constructor");
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Patient [id=" + id + "]";
	}
	@PostConstruct
	public void method1() {
		System.out.println("Inside Method 1");
	}
	@PreDestroy
	public void method2() {
		System.out.println("Inside Method 2");
	}
	
	

}
