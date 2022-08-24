package com.samples.Autowiring.Models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;


public class Employee {
	private int id;
	private String name;
	
	@Autowired
	@Qualifier("addressCal")
	private Address address;
	
//	public Address getAddress() {
//		return address;
//	}
//	public void setAddress(Address address) {
//		this.address = address;
//	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
     
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", address=" + address + "]";
	}

}
