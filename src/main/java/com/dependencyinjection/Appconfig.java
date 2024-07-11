package com.dependencyinjection;

import org.springframework.context.annotation.Bean;

public class Appconfig {
	public Appconfig() {
		
	}
	@Bean(name="engine")
	public Engine getEngine() {
		return new Engine(599,400);
		
	}
	@Bean(name="bike")
	public Bike getBike() {
		return new Bike("Black");
		
	}

}
