package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.components.Vehicle;

@SpringBootApplication
public class FirstProjectApplication {

	public static void main(String[] args) {
		
		//This create the context and initiate the beans.
		ConfigurableApplicationContext context = SpringApplication.run(FirstProjectApplication.class, args);
		Vehicle v1 = context.getBean(Vehicle.class);
		v1.makeVehicle();
		
		/** Following code gives the list of BEANS loaded in the Spring Container**/
				
		System.out.println("***********START*******************");
		String[] beans = context.getBeanDefinitionNames();
		for (String bean : beans) {
			System.out.println(bean.toString());
		}
		
		System.out.println("**********END*******************");

	}

}
