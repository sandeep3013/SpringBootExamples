package com.example.demo.components;

import org.springframework.stereotype.Component;

@Component
public class Engine {
	private String maker;
	private String power;
	private String type;
	public String getMaker() {
		return maker;
	}
	public void setMaker(String maker) {
		this.maker = maker;
	}
	public String getPower() {
		return power;
	}
	public void setPower(String power) {
		this.power = power;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "Engine [maker=" + maker + ", power=" + power + ", type=" + type + "]";
	}
	
	public void assemble () {
		System.out.println("Assembling Engine in Vehicle");
	}

}
