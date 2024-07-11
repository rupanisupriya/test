package com.dependencyinjection;

import org.springframework.boot.SpringApplication;
//import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;


@SpringBootApplication
public class SpringBootProj1Application {

	public static void main(String[] args) {
		
		//SpringApplication.run(SpringBootProj1Application.class, args);
		  
		AbstractApplicationContext acc= new AnnotationConfigApplicationContext(Appconfig.class);
		  Bike b =(Bike)acc.getBean("bike");
		  System.out.println(b);

	}

}
