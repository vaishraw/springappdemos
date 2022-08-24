package com.samples.Spel.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class CarDealer {
	
	@Value("#{22+55}")
	private String id;
	
	@Value("#{T(java.lang.Math).abs(-100)}")
	private String id1;
	
	@Value("#{'Mary Anne'.toUpperCase()}")
	private String name;
	private boolean active;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	@Override
	public String toString() {
		return "CarDealer [id=" + id + ", id1=" + id1 + ", name=" + name + ", active=" + active + "]";
	}

	

}
