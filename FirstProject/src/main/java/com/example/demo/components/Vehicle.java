package com.example.demo.components;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope(value = "prototype") /* By Default Scope is singletone if you dont want to create object during the container load 
public class Vehicle {
	@Autowired
	private Engine engine;

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getMaker() {
		return maker;
	}

	public void setMaker(String maker) {
		this.maker = maker;
	}

	public String getSegment() {
		return segment;
	}

	public void setSegment(String segment) {
		this.segment = segment;
	}

	public Vehicle() {
		super();
		System.out.println("Vehicle Object Created");
	}

	String type;
	String maker;
	String segment;

	public void makeVehicle() {
		engine.assemble();
		System.out.println(" Vehicle is Ready");

	}
}
