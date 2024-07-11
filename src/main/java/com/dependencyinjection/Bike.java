package com.dependencyinjection;

import org.springframework.beans.factory.annotation.Autowired;

public class Bike {
	String color;
	@Autowired
	Engine e;//property level injection
	public Bike(String color) {
		this.color=color;
		
	}
//	@Override
//	public String toString() {
//		return "Bike [color=" + color + ",]";
//	}
	public String getColor() {
		return color;
	}
	@Override
	public String toString() {
		return "Bike [color=" + color + ", e=" + e + "]";
	}
	public void setColor(String color) {
		this.color = color;
	}

}
